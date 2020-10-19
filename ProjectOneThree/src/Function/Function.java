package Function;

public class Function {

    public int isPrimeNumber(int number) {
        for (int i = 2; i < number; ++i) {
            if (number % i == 0)
            {
                return -1;
            }
        }
            return 1;
    }
}