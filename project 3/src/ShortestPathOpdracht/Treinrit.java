package ShortestPathOpdracht;

public class Treinrit extends Stap {
    private int metersPerSeconde; // De waarde om naar deze node te gaan.
    private node Node; // Deze node

    public Treinrit(int afstand, node bestemming) {
        metersPerSeconde = afstand;
        Node = bestemming;
    }

    public node returnNode() {
        return Node;
    }

    public double returnAfstand() {
        return metersPerSeconde;
    }
}