package ShortestPathOpdracht;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class node {
    private String plaatsNaam;
    private Queue<String> bestPath = new LinkedList<>();
    private Integer waarde = Integer.MAX_VALUE; // Dit is voor het algoritme. Het geeft aan hoe ver weg deze node is van de beginNode.
    private Map<node, Double> branchesNaarAndereNodes = new HashMap<>();

    public node(String naam) {
        plaatsNaam = naam;
    }

    public void branch(Stap naar) { // Dit is om te laten zien welke Node naar welke andere leidt en hoeveel waarde deze connectie heeft.
        branchesNaarAndereNodes.put(naar.returnNode(), naar.returnAfstand());
    }

    public String getPlaatsNaam() {
        return plaatsNaam;
    }

    public void setWaarde(Integer worth) {
         waarde = worth;
    }

    public void setBestPath(LinkedList<String> bestPath) {
        this.bestPath = bestPath;
    }

    public Integer getWaarde() {
        return waarde;
    }

    public LinkedList<String> getBestPath() {
        return (LinkedList<String>) bestPath;
    }

    public Map<node, Double> getReis() {
        return branchesNaarAndereNodes;
    }

    public void addPath(String deelVanDeRoute) { // Dit is er om het gehele pad van begin tot eind in "shortestPath" te krijgen.
        bestPath.add(deelVanDeRoute);
    }
}

