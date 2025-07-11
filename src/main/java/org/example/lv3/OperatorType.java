package org.example.lv3;

// Enum 타입(열거형)을 이용한 연산자 타입 정보
public enum OperatorType {
    ADD('+'), SUBTRACT('-'), MULTIPLY('*'), DIVIDE('/');

    private final char operation;

    OperatorType(char operation) {
        this.operation = operation;
    }

    // 입력된 oper와 일치하는 enum 상수 찾아서 반환
    public static OperatorType of(char oper) {
        for (OperatorType type : OperatorType.values()) {
            if (type.operation == oper) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다. +, -, *, / 중 하나를 입력하세요.\n");
    }
}