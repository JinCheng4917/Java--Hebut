public class Truck extends Car{

    private int payload;

    public Truck(int wheels, int weight, int loader, int payload) {
        super(wheels, weight, loader);
        this.payload = payload;
        System.out.print("汽车载重量为：");
        System.out.println(this.payload);
    }
}
