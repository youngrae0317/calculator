package org.example.lv3;

import java.util.ArrayList;


public class ArithmeticCalculator<T extends Number> {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성
    // 속성
    private ArrayList<Double> list;

    // 생성자
    public ArithmeticCalculator() {
        this.list = new ArrayList<>();
    }

    // 기능
    public double calculate(T num1, T num2, OperatorType operation) {
        double number1 = num1.doubleValue();
        double number2 = num2.doubleValue();

        double result = 0.0;

        switch (operation) {
            case ADD: // 더하기 연산
                result = number1 + number2;
                break;
            case SUBTRACT: // 빼기 연산
                result = number1 - number2;
                break;
            case MULTIPLY: // 곱셈 연산
                result = number1 * number2;
                break;
            case DIVIDE: // 나눗셈 연산
                if (number2 == 0) {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.\n");
                }
                result = number1 / number2;
                break;
        }

        this.list.add(result);
        return result;
    }

    // Getter 메서드
    public ArrayList<Double> getList() {
        return this.list;
    }

    // Setter 메서드
    public void setList(ArrayList<Double> newList) {
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
