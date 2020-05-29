package ShortestPathOpdracht;

import java.util.*;

public class Reis implements Comparable {
    public static Graph getShortestPath(Graph graph, node beginNode) { // Hier beginnen we
        Set<node> settledNodes = new HashSet<>();
        Set<node> unsettledNodes = new HashSet<>();

        beginNode.setDistance(0); // De beginNode heeft een afstand van 0
        unsettledNodes.add(beginNode);

        while (unsettledNodes.size() != 0) { // Pas wanneer alle nodes afgegaan zijn en er geen nodes in "unsettledNodes" zitten, zijn we pas klaar.
            node currentNode = compareTo(unsettledNodes); // Pakt van de unsettledNodes de node met de laagste afstand.
            unsettledNodes.remove(currentNode); // En dan verwijderen we deze node uit currentNodes
            for (Map.Entry<node, Double> adjacencyPair: currentNode.getReis().entrySet()) { // Voor alle nodes waaraan de currentNode geconnect is.
                node adjacentNode = adjacencyPair.getKey(); // Een nodes waarmee hij geconnect is
                Double edgeWeight = adjacencyPair.getValue(); // De waarde om naar deze node te gaan.
                if (!settledNodes.contains(adjacentNode)) { // Als deze node al in settledNodes zit dan gaan we verder.
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode); // Het kortste pad naar deze node.
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode); // Als we klaar zijn stoppen we deze node in settledNodes en dan zijn we daar klaar mee.
        }
        for (node i: settledNodes) { // Dit is om de begin en eindNode in "shortestPath" van de node class te krijgen.
            i.addPath(i.getPlaatsNaam());
        }
        return graph;
    }

    private static node compareTo(Set<node> unsettledNodes) { // Je krijgt een paar nodes binnen en je kijkt welke de kleinste waarde daarnaartoe heeft dusver
        node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (node Node : unsettledNodes) { // Voor alle nodes die je binnenkrijgt.
            if (Node.getDistance() < lowestDistance) { // Als de waarde naar deze node lager is dan de vorige nodes, dan slaan we deze node op als laagste waarde
                lowestDistance = Node.getDistance();
                lowestDistanceNode = Node;
            }
        }
        return lowestDistanceNode; // Vervolgens geef je de node met de laagste waarde terug.
    }

    private static void calculateMinimumDistance(node evaluationNode, Double edgeWeigh, node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance(); // Hoe ver het is om naar deze node te gaan
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance((int) (sourceDistance + edgeWeigh));
            LinkedList<String> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode.getPlaatsNaam());
            evaluationNode.setShortestPath(shortestPath);
        }
    }

}
