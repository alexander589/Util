package fhf;

public class Main {

    public static class Util{

        static double getDistance(double x1, double y1, double x2, double y2) {
            return Math.sqrt(((x2 - x1)*(x2 - x1))+((y2 - y1)*(y2 - y1)));

        }
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(1,1,3,2));
    }
}
