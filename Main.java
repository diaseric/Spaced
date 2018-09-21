public class Main {

    public static void main(String[] args) {
	double x1 = 5;
	double x2 = 4;
	double x3 = -3;

	double y1 = 2;
	double y2 = 9;
	double y3 = 2;

	double z1 = -5;
	double z2 = 2;
	double z3 = 6;

    double distanceAB = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2) );

    double distanceBC = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2) + Math.pow(z2 - z3, 2) );

    double distanceCA = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2) + Math.pow(z3 - z1, 2) );

    double min1 = Math.min(distanceAB, distanceBC);

    double minimum = Math.min(min1, distanceCA);

    double max1 = Math.max(distanceAB, distanceBC);

    double maximum = Math.max(max1, distanceCA);

    System.out.println("shortest is distance between drones 1 and 2: "+ minimum + ", longest is distance between drones 1 and 3: " + maximum);


    }
}
