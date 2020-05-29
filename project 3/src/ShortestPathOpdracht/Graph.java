package ShortestPathOpdracht;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    private Queue<node> nodes = new LinkedList<>();

    public void addNode(node Node) {
        nodes.add(Node);
    }
}
