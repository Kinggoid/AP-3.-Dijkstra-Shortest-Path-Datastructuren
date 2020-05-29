package ShortestPathOpdracht;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class nodeTest {

    @Test
    void naar() {
        node A = new node("A");
        node B = new node("B");

        A.branch(new Rit(20, B));

        Graph graph = new Graph();

        graph.addNode(A);
        graph.addNode(B);

        graph = Reis.getShortestPath(graph, A);
        List<String> listNodes = new ArrayList<>();
        listNodes.add("A");
        listNodes.add("B");

        assertEquals(listNodes, B.getShortestPath());
    }

    @Test
    void addPath() {
        node A = new node("A");
        A.addPath("B");

        List<String> shortestPath = new ArrayList<>();
        shortestPath.add("B");

        assertEquals(shortestPath, A.getShortestPath());
    }
}