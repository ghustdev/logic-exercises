package exercism

import spock.lang.Specification

class ArmstrongNumberTest extends Specification {
    ArmstrongNumber exe

    void setup() {
        exe = new ArmstrongNumber()
    }

    void "Teste inicial TDD - determinar se um número é de Armstrong"() {
        given: "Get a number"
        int entrada1 = 154
        boolean resposta1 = false

        when: "Verifying result"
        boolean resultado1 = ArmstrongNumber.isArmstrongNumber(entrada1)

        then: "Comparison"
        resposta1 == resultado1
    }

    def "Zero is an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        0      || true
    }

    def "Single digit numbers are Armstrong numbers"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        5      || true
    }

    def "There are no 2 digit Armstrong numbers"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        10     || false
    }

    def "Three digit number that is an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        153    || true
    }

    def "Three digit number that is not an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        100    || false
    }

    def "Four digit number that is an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        9474   || true
    }

    def "Four digit number that is not an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number || expected
        9475   || false
    }

    def "Seven digit number that is an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number  || expected
        9926315 || true
    }

    def "Seven digit number that is not an Armstrong number"() {
        expect:
        ArmstrongNumber.isArmstrongNumber(number) == expected
        where:
        number  || expected
        9926314 || false
    }
}
