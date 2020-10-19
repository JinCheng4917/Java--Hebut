public class Car extends Vehicle{

    private int loader;

    public Car(int wheels, int weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
        System.out.print("汽车承载人数为：");
        System.out.println(this.loader);
    }
}
