package ShortestPathOpdracht;

public class Vlucht extends Stap {
    private int duurVanDeVlucht; // De waarde om naar deze node te gaan.
    private node Node; // Deze node
    private double kansOpBagageVerlies; // De kans om je bagage te verliezen


    public Vlucht(int prijs, double kansOpBagageVerlies, node bestemming) {
        duurVanDeVlucht = prijs;
        Node = bestemming;
        this.kansOpBagageVerlies = kansOpBagageVerlies;
    }

    public node returnNode() {
        return Node;
    }

    public double returnAfstand() { // Hier geven we als waarde de prijs met de kans op bagageverlies meegerekent.
        // Als er een hogere kans op bagageverlies is zal de verbinding hoger zijn en zal daardoor minder snel genomen worden.
        return duurVanDeVlucht * (1 + (kansOpBagageVerlies / 100));
    }

}
