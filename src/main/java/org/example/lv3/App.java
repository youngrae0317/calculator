package org.example.lv3;

import java.util.*;

public class App {
    private static void selectCommands(Scanner sc, ArithmeticCalculator<Double> calculator) {
        System.out.println("저장된 결과 중 특정 값보다 큰 값을 보시려면 'up', 가장 오래된 데이터를 삭제하려면 'remove', 전체 삭제는 'clear'를 입력하세요 (이 외는 아무키 입력): ");
        String command = sc.next();

        if (command.equals("up")) {
            System.out.print("조회할 기준 값을 입력하세요: ");
            double criteria = sc.nextDouble();
            System.out.print(criteria + "보다 큰 결과들: ");
            calculator.comparison(criteria);
        } else if (command.equals("remove")) {
            calculator.removeResult();
            System.out.println("가장 오래된 결과 1개가 삭제되었습니다.");
        } else if (command.equals("clear")) {
            calculator.setList(new ArrayList<>());
            System.out.println("모든 결과가 초기화되었습니다.");
        }

        System.out.println("계산기 누적 결과 : " + calculator.getList());
    }

    public static void main(String[] args) {

        System.out.println("============ 계산기 Lv3 ============");
        System.out.println("Made By. 내일배움캠프 Spring 8기 이영래");
        System.out.println("===================================\n");

        /* Calculator 인스턴스 생성 */
        ArithmeticCalculator<Double> calculator = new ArithmeticCalculator<>();

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();

                System.out.print("사칙연산 기호를 입력하세요: ");

                // 사용자에게 char 기호를 받고, OperatorType 열거형을 이용하여 OperatorType으로 변환
                char operatorType = sc.next().charAt(0);
                OperatorType operator = OperatorType.of(operatorType);

                // 계산기 클래스의 calculate 메소드에 OperatorType 전달
                double result = calculator.calculate(num1, num2, operator);

                System.out.println("결과 : " + result);

                // Getter 활용하여 조회
                ArrayList<Double> storedList = calculator.getList();
                System.out.println("계산기 누적 결과 : " + storedList);


                selectCommands(sc, calculator);


                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) :: ");
                String end = sc.next();
                if (end.equals("exit")) {
                    break;
                }
                System.out.println();
            } catch (ArithmeticException e) { // 잘못된 인수 예외 처리 (나눗셈 연산에서 분모가 0이 되는 경우)
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) { // 두 숫자 입력 시 숫자가 아닐 경우 예외 처리
                System.out.println("숫자만 입력해주세요 !!\n");
                sc.next(); // 스캐너 버퍼가 안비워져있어 무한 루프가 발생하므로 남아있는 입력 제거!
            } catch (IllegalArgumentException e) { // 사칙연산 중 잘못된 연산자 입력 시 예외 처리
                System.out.println(e.getMessage());
            }
            /* 반복문 종료 */
        }
        System.out.println("계산기를 종료합니다!");
        sc.close();
    }
}
