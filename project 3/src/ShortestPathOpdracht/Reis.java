package ShortestPathOpdracht;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Reis {
    private static node compareTo(Set < node > unsettledNodes) {
        node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (node Node: unsettledNodes) {
            int nodeDistance = Node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = Node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(node evaluationNode, Integer edgeWeigh, node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<String> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode.getPlaatsNaam());
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public static Graph getShortestPath(Graph graph, node beginNode) {
        beginNode.setDistance(0);

        Set<node> settledNodes = new HashSet<>();
        Set<node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(beginNode);
        while (unsettledNodes.size() != 0) {
            node currentNode = compareTo(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<node, Integer> adjacencyPair: currentNode.getReis().entrySet()) {
                node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }
}
