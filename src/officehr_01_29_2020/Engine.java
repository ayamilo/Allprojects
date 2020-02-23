package officehr_01_29_2020;

public class Engine {
    String Power;
    int horsePower;

    public Engine(String power, int horsePower) {
        Power = power;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Power='" + Power + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
