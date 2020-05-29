package ShortestPathOpdracht;

public class Main {
    public static void main(String[] args) {
        node Zw = new node("Zwolle");
        node Ut = new node("Utrecht");
        node Am = new node("Amsterdam");
        node Gr = new node("Groningen");
        node Hu = new node("Huizen");
        node Br = new node("Breda");

        Zw.naar(new Rit(90, Ut));
        Zw.naar(new Rit(113, Am));
        Ut.naar(new Rit(186, Gr));
        Ut.naar(new Rit(15, Br));
        Am.naar(new Rit(10, Hu));
        Gr.naar(new Rit(2, Hu));
        Gr.naar(new Rit(1, Br));
        Br.naar(new Rit(5, Hu));

        Graph graph = new Graph();

        graph.addNode(Zw);
        graph.addNode(Ut);
        graph.addNode(Am);
        graph.addNode(Gr);
        graph.addNode(Hu);
        graph.addNode(Br);

        graph = Reis.getShortestPath(graph, Zw);
        System.out.println(graph);

        System.out.println(Zw.getShortestPath());
        System.out.println(Ut.getShortestPath());
        System.out.println(Am.getShortestPath());
        System.out.println(Gr.getShortestPath());
        System.out.println(Hu.getShortestPath());
        System.out.println(Br.getShortestPath());

        node Amst = new node("Amsterdam");
        node Rott = new node("Rotterdam");
        node Bruss = new node("Brussel");
        node Munc = new node("München");
        node Berl = new node("Berlijn");
        node Hamb = new node("Hamburg");

        Amst.naar(new Treinrit(20, Rott));
        Rott.naar(new Treinrit(16, Berl));
        Rott.naar(new Treinrit(22, Bruss));
        Bruss.naar(new Treinrit(15, Munc));
        Munc.naar(new Treinrit(19, Hamb));
        Munc.naar(new Treinrit(24, Berl));
        Berl.naar(new Treinrit(21, Hamb));

        Graph graph2 = new Graph();

        graph2.addNode(Amst);
        graph2.addNode(Rott);
        graph2.addNode(Bruss);
        graph2.addNode(Munc);
        graph2.addNode(Berl);
        graph2.addNode(Hamb);

        graph2 = Reis.getShortestPath(graph2, Amst);

        System.out.println(Amst.getShortestPath());
        System.out.println(Rott.getShortestPath());
        System.out.println(Bruss.getShortestPath());
        System.out.println(Munc.getShortestPath());
        System.out.println(Berl.getShortestPath());
        System.out.println(Hamb.getShortestPath());

        node Schiphol = new node("Schiphol");
        node Dubai = new node("Dubai International Airport");
        node LA = new node("Los Angeles International Airport");
        node Tokyo = new node("Tokyo International Airport");
        node London = new node("London Heathrow");
        node Parijs = new node("Parijs Charles de Gaulle");

        Schiphol.naar(new Vlucht(100, 20, London));
        Dubai.naar(new Vlucht(550, 15, Parijs));
        Dubai.naar(new Vlucht(400, 45, Tokyo));
        LA.naar(new Vlucht(300, 30, Tokyo));
        London.naar(new Vlucht(450, 23, Dubai));
        Parijs.naar(new Vlucht(300, 10, LA));
        Parijs.naar(new Vlucht(450, 80, Dubai));

        Graph graph3 = new Graph();

        graph3.addNode(Schiphol);
        graph3.addNode(Dubai);
        graph3.addNode(LA);
        graph3.addNode(Tokyo);
        graph3.addNode(London);
        graph3.addNode(Parijs);

        graph3 = Reis.getShortestPath(graph3, Schiphol);

        System.out.println(Schiphol.getShortestPath());
        System.out.println(Dubai.getShortestPath());
        System.out.println(LA.getShortestPath());
        System.out.println(Tokyo.getShortestPath());
        System.out.println(London.getShortestPath());
        System.out.println(Parijs.getShortestPath());
    }
}
