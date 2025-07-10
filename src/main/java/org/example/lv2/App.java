package org.example.lv2;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println("============ 계산기 Lv2 ============");
        System.out.println("Made By. 내일배움캠프 Spring 8기 이영래");
        System.out.println("===================================\n");

        /* Calculator 인스턴스 생성 */
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);

        /* 반복문 시작 */
        while (true) {
            try {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt();

                // 양의 정수인지 확인
                if (num1 < 0) {
                    System.out.println("양의 정수(0 포함)을 입력해주세요!\n");
                    continue;
                }

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt();

                // 양의 정수인지 확인
                if (num2 < 0) {
                    System.out.println("양의 정수(0 포함)을 입력해주세요!\n");
                    continue;
                }

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operation = sc.next().charAt(0);

                // 계산기 클래스의 calculate 메소드 호출하여 결과값 반환
                int result = calculator.calculate(num1, num2, operation);

                System.out.println("결과 : " + result);

                // Getter 활용하여 조회
                ArrayList<Integer> storedList = calculator.getList();
                System.out.println("계산기 누적 결과 : " + storedList);

                /** 먼저 저장된 데이터 삭제 기능 (Setter 도 활용) **/
                System.out.println("누적 결과 중 가장 오래된 데이터를 삭제하시겠습니까? (삭제 시 remove 입력, 초기화 시 clear 입력, 삭제 불필요 시 아무키 입력) : ");
                String remove = sc.next();
                if (remove.equals("remove")) {
                    calculator.removeResult();
                } else if (remove.equals("clear")) {
                    calculator.setList(new ArrayList<>());
                    System.out.println("누적 결과가 초기화되었습니다.");
                }

                storedList = calculator.getList();
                System.out.println("계산기 누적 결과 : " + storedList);


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
