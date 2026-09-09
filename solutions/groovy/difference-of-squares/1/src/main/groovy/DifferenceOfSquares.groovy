class DifferenceOfSquares {
    BigInteger num

    DifferenceOfSquares(num) {
        this.num = num
    }

    BigInteger squareOfSum() {
        return (((num + 1)*num)/2) ** 2
    }

    BigInteger sumOfSquares() {
        BigInteger sum = 0;
        for (int i=1; i<=num; i++) {
            sum += (i ** 2)
        }
        return sum
    }

    BigInteger difference() {
        return squareOfSum() - sumOfSquares()
    }
}
