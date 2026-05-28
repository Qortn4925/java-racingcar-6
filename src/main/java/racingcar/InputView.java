package racingcar;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);


    public String inputCarName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");
        return  sc.next();
    }

    public  int inputTry(){
        System.out.println("시도할 횟수는 몇 회인가요");
        return sc.nextInt();
    }

    //실행 값과, 객체 리스트를 넘겨받아 출력
    public void printResult(List<RacingCar> racingCars, int tryCount) {
        // 각 카마다  , 증감 확인 >   ,자기 포지션 만큼 출력,

        for (int i = 0; i < tryCount; i++) {
            for (RacingCar racingCar : racingCars) {
                // radomGenerator 한테 하고
                racingCar.improvePosition();
                int position = racingCar.getPosition();
                for(int j =0; i<position; i++){
                    System.out.print("-");
                }
            }

        }

    }
}
