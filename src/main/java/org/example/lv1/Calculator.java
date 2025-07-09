package org.example.lv1;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============ 계산기 ============");
        System.out.println("Made By. 내일배움캠프 Spring 8기 이영래");
        System.out.println("===============================\n");
        while (true) {
            /** 2개의 숫자(양의 정수) 입력 받기 **/
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            // 양의 정수인지 확인
            if (a < 0) {
                System.out.println("양의 정수(0 포함)을 입력해주세요!\n");
                continue;
            }
            System.out.print("두 번째 숫자를 입력하세요: ");

            int b = sc.nextInt();
            // 양의 정수인지 확인
            if (b < 0) {
                System.out.println("양의 정수(0 포함)을 입력해주세요!\n");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            String operation = sc.next();

            int result = 0; // 연산 결과 변수

            // switch 제어문을 통해 연산 종류 식별
            switch (operation) {
                case "+": // 더하기 연산
                    result = a + b;
                    break;
                case "-": // 빼기 연산
                    result = a - b;
                    break;
                case "*": // 곱셈 연산
                    result = a * b;
                    break;
                case "/": // 나눗셈 연산
                    if (b == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n");
                        continue;
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("잘못된 연산자입니다!!\n");
                    continue;
            }

            System.out.println("결과 : " + result);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료) :: ");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }
            System.out.println();
        }
        System.out.println("계산기를 종료합니다!");
        sc.close();
    }
}
