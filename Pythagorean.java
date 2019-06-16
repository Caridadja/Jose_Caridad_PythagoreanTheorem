public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double h = (legA * legA) + (legB * legB);
        double c = Math.sqrt(h);
        return c;
    }
}
