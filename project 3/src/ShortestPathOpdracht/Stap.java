package ShortestPathOpdracht;

abstract class Stap { // Deze class is bestaan alleen maar als tussenverbinding tussen de super en de sub classen.
    public abstract node returnNode();
    public abstract double returnAfstand();
}