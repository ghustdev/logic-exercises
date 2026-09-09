package exercism

class Darts {
    static private final double PI = 3.14

    static int score(double x, double y) {
        double areaInner = PI * (1 ** 2)
        double areaMiddle = PI * (5 ** 2)
        double areaOuter = PI * (10 ** 2)

        double areaTest = PI * (hipotenuse(x, y) ** 2)

        if (areaOuter >= areaTest && areaMiddle < areaTest) return 1
        else if (areaMiddle >= areaTest && areaInner < areaTest) return 5
        else if (areaInner >= areaTest) return 10
        else if (areaOuter < areaTest) return 0

        return areaMiddle
    }

    static double hipotenuse(double a, double b) {
        return Math.sqrt(a ** 2 + b ** 2)
    }
}
