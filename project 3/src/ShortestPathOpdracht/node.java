package ShortestPathOpdracht;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class node {
    private String plaatsNaam;
    private LinkedList<String> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    private Map<node, Integer> reis = new HashMap<>();

    public node(String naam) {
        plaatsNaam = naam;
    }

    public void naar(Stap naar) {
        reis.put(naar.returnNode(), naar.returnAfstand());
    }

    public String getPlaatsNaam() {
        return plaatsNaam;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setShortestPath(LinkedList<String> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public LinkedList<String> getShortestPath() {
        return shortestPath;
    }

    public Map<node, Integer> getReis() {
        return reis;
    }
}

