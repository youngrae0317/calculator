package org.example.lv2;

import java.util.ArrayList;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성
    // 속성
    private ArrayList<Integer> list;

    // 생성자
    public Calculator() {
        this.list = new ArrayList<>();
    }

    // 기능
    public int calculate(int num1, int num2, char operation) {
        int result = 0;

        switch (operation) {
            case '+': // 더하기 연산
                result = num1 + num2;
                break;
            case '-': // 빼기 연산
                result = num1 - num2;
                break;
            case '*': // 곱셈 연산
                result = num1 * num2;
                break;
            case '/': // 나눗셈 연산
                if (num2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.");
        }

        this.list.add(result);
        return result;
    }

    // Getter 메서드
    public ArrayList<Integer> getList() {
        return this.list;
    }

    // Setter 메서드
    public void setList(ArrayList<Integer> newList) {
        this.list = newList;
    }

    public void removeResult() {
        if (!this.list.isEmpty()) {
            this.list.remove(0);
        } else {
            System.out.println("삭제할 결과가 없습니다!");
        }
    }
}
