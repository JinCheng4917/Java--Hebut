public class ThreadExample {
    public static void main(String[] args) {
        Rabit rabit;
        rabit = new Rabit("rabit", 500, 20);
        Tortoise tortoise = new Tortoise("tortoise", 500, 20);
        tortoise.start();
        rabit.start();
    }
}
