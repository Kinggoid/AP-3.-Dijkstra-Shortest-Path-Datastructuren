package ShortestPathOpdracht;

public class Rit extends Stap {
    private int afstandNaarDeVolgendeBestemming;
    private node Node;

    public Rit(int afstand, node bestemming) {
        afstandNaarDeVolgendeBestemming = afstand;
        Node = bestemming;
    }

    public node returnNode() {
        return Node;
    }

    public int returnAfstand() {
        return afstandNaarDeVolgendeBestemming;
    }
}
