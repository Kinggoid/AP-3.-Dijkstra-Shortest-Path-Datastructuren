package ShortestPathOpdracht;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    void testAddNodes() {
        node rit = new node("Java Mobiel");
        Graph graph = new Graph();
        graph.addNode(rit);

        List<node> list = new ArrayList<>(graph.getNodes());

        assertTrue(list.contains(rit));
    }
}