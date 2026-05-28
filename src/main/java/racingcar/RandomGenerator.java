package racingcar;

public class RandomGenerator {
    java.util.Random random;

    public int generateRandomZeroToThree(){
        return random.nextInt(0, 3);
    }
    public int generateRandomFourToNine(){
        return random.nextInt(4, 9);

    }
}
