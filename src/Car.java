public class Car {
    private String name;
    private int hp;
    private int weight;
    private Wheel wheel;
    private Engine engine;
    private CarType carType;

    public Car(String name, int hp, int weight) {
        this.name = name;
        this.hp = hp;
        this.weight = weight;
        this.wheel = new Wheel();
        this.engine = new Engine();
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
