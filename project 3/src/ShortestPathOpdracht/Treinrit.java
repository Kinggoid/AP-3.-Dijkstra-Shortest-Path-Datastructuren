package ShortestPathOpdracht;

public class Treinrit extends Stap {
    private int metersPerSeconde;
    private node Node;

    public Treinrit(int afstand, node bestemming) {
        metersPerSeconde = afstand;
        Node = bestemming;
    }

    public node returnNode() {
        return Node;
    }

    public int returnAfstand() {
        return metersPerSeconde;
    }
}