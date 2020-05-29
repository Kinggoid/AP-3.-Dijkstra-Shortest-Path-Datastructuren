package ShortestPathOpdracht;

public class Main {
    public static void main(String[] args) {

        // Dit stuk is voor de "Rit" class.
        node Zw = new node("Zwolle");
        node Ut = new node("Utrecht");
        node Am = new node("Amsterdam");
        node Gr = new node("Groningen");
        node Hu = new node("Huizen");
        node Br = new node("Breda");

        Zw.branch(new Rit(90, Ut));
        Zw.branch(new Rit(113, Am));
        Ut.branch(new Rit(186, Gr));
        Ut.branch(new Rit(15, Br));
        Am.branch(new Rit(10, Hu));
        Gr.branch(new Rit(2, Hu));
        Gr.branch(new Rit(1, Br));
        Br.branch(new Rit(5, Hu));

        Graph graph = new Graph();

        graph.addNode(Zw);
        graph.addNode(Ut);
        graph.addNode(Am);
        graph.addNode(Gr);
        graph.addNode(Hu);
        graph.addNode(Br);

        Reis.getShortestPath(graph, Zw);
        System.out.println(graph);

        System.out.println(Zw.getShortestPath());
        System.out.println(Ut.getShortestPath());
        System.out.println(Am.getShortestPath());
        System.out.println(Gr.getShortestPath());
        System.out.println(Hu.getShortestPath());
        System.out.println(Br.getShortestPath());


        // Dit stuk is voor de "Treinrit" class
        node Amst = new node("Amsterdam");
        node Rott = new node("Rotterdam");
        node Bruss = new node("Brussel");
        node Munc = new node("München");
        node Berl = new node("Berlijn");
        node Hamb = new node("Hamburg");

        Amst.branch(new Treinrit(20, Rott));
        Rott.branch(new Treinrit(16, Berl));
        Rott.branch(new Treinrit(22, Bruss));
        Bruss.branch(new Treinrit(15, Munc));
        Munc.branch(new Treinrit(19, Hamb));
        Munc.branch(new Treinrit(24, Berl));
        Berl.branch(new Treinrit(21, Hamb));

        Graph graph2 = new Graph();

        graph2.addNode(Amst);
        graph2.addNode(Rott);
        graph2.addNode(Bruss);
        graph2.addNode(Munc);
        graph2.addNode(Berl);
        graph2.addNode(Hamb);

        Reis.getShortestPath(graph2, Amst);

        System.out.println(Amst.getShortestPath());
        System.out.println(Rott.getShortestPath());
        System.out.println(Bruss.getShortestPath());
        System.out.println(Munc.getShortestPath());
        System.out.println(Berl.getShortestPath());
        System.out.println(Hamb.getShortestPath());


        // Dit stuk is voor de "Vlucht" class
        node Schiphol = new node("Schiphol");
        node Dubai = new node("Dubai International Airport");
        node LA = new node("Los Angeles International Airport");
        node Tokyo = new node("Tokyo International Airport");
        node London = new node("London Heathrow");
        node Parijs = new node("Parijs Charles de Gaulle");

        Schiphol.branch(new Vlucht(100, 20, London));
        Dubai.branch(new Vlucht(550, 15, Parijs));
        Dubai.branch(new Vlucht(400, 45, Tokyo));
        LA.branch(new Vlucht(300, 30, Tokyo));
        London.branch(new Vlucht(450, 23, Dubai));
        Parijs.branch(new Vlucht(300, 10, LA));
        Parijs.branch(new Vlucht(450, 80, Dubai));

        Graph graph3 = new Graph();

        graph3.addNode(Schiphol);
        graph3.addNode(Dubai);
        graph3.addNode(LA);
        graph3.addNode(Tokyo);
        graph3.addNode(London);
        graph3.addNode(Parijs);

        Reis.getShortestPath(graph3, Schiphol);

        System.out.println(Schiphol.getShortestPath());
        System.out.println(Dubai.getShortestPath());
        System.out.println(LA.getShortestPath());
        System.out.println(Tokyo.getShortestPath());
        System.out.println(London.getShortestPath());
        System.out.println(Parijs.getShortestPath());
    }
}
