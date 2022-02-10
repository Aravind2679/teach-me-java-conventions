package powerpackage;

public class powerfinder
{
    public static int power(int base, int exponent) {
        int answerTobeTested = 1;
        for (int currentPower = 0; currentPower<exponent; currentPower++) {
            answerTobeTested *= base;
        }
        return answerTobeTested;
    }


}
