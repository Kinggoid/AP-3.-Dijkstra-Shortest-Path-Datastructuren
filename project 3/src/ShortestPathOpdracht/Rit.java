package ShortestPathOpdracht;

public class Rit extends Stap {
    private int afstandNaarDeVolgendeBestemming; // De waarde om naar deze node te gaan.
    private node Node; // Deze node

    public Rit(int afstand, node bestemming) {
        afstandNaarDeVolgendeBestemming = afstand;
        Node = bestemming;
    }

    public node returnNode() {
        return Node;
    }

    public double returnAfstand() {
        return afstandNaarDeVolgendeBestemming;
    }


}
