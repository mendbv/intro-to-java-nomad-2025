void main() {
    double a = 3.4;
    double b = 50.2;
    double e = 44.5;
    double c = 2.1;
    double d = 0.55;
    double f = 5.9;

    double denominator = a * d - b * c;

    if (denominator == 0) {
        System.out.println("The system has no unique solution.");
    } else {
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;

        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}