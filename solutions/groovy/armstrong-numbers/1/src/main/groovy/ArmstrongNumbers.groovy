
class ArmstrongNumber {

    static boolean isArmstrongNumber(number) {
        if (number == 0) return true

        List<BigInteger> digits = []
        extractDigits(number as BigInteger, digits)

        int power = digits.size()
        BigInteger sum = digits.collect { it ** power }.sum()

        return (number as BigInteger) == sum
    }

    private static void extractDigits(BigInteger n, List<BigInteger> digits) {
        if (n == 0) return
        digits << (n % 10)
        extractDigits(n.intdiv(10), digits)
    }

//    static boolean isArmstrongNumber(number) {
//        if (number == 0) return true
//
//        digits.add(number%10)
//
//        recursion(number.intdiv(10))
//
//        for (int x : digits) {
//            sum += Math.pow(x, digits.size())
//        }
//
//        return number == sum
//    }
//
//    static void recursion(number) {
//        if (number == 0) return
//
//        digits.add(number%10)
//        recursion(number.intdiv(10))
//    }
}
