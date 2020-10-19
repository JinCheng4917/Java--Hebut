public class Vehicle {
    private int wheels;
    private int weight;

    public Vehicle(int wheels, int weight){
        this.wheels = wheels;
        this.weight = weight;
        System.out.print("汽车车轮数为：");
        System.out.println(this.wheels);
        System.out.print("汽车车重数为：");
        System.out.println(this.weight);
    }
}
