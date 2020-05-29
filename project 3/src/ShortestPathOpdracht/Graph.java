package ShortestPathOpdracht;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private Queue<node> nodes = new LinkedList<>(); // De queue met alle nodes waartussen we gaan werken

    public void addNode(node Node) {
        nodes.add(Node);
    }

    public Queue<node> getNodes() {
        return nodes;
    }
}
