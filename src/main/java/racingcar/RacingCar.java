package racingcar;

public class RacingCar {
    private int position;
    private String name;

    public RacingCar(String name) {
        this.name = name;
    }

    public RacingCar() {
    }

    public void improvePosition(int number) {
        if(number>=4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}
