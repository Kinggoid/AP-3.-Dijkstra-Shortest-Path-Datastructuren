package ShortestPathOpdracht;

public class Vlucht extends Stap {
    private int duurVanDeVlucht;
    private node Node;
    private double kansOpBagageVerlies;


    public Vlucht(int prijs, double kansOpBagageVerlies, node bestemming) {
        duurVanDeVlucht = prijs;
        Node = bestemming;
        this.kansOpBagageVerlies = kansOpBagageVerlies;
    }

    public node returnNode() {
        return Node;
    }

    public int returnAfstand() {
        return duurVanDeVlucht;
    }

    public double returnBagageVerlies() {
        return kansOpBagageVerlies * (1 + (kansOpBagageVerlies / 100));
    }
}
