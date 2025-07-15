# **자바 계산기 만들기 과제 (Lv1 ~ Lv3)**

내일배움캠프 Spring 8기 과정에서 진행한 자바 계산기 만들기 과제입니다.

## 📖 프로젝트 소개

이 과제는 간단한 콘솔 기반의 계산기를 Lv1의 기본적인 사칙연산부터 시작하여, Lv3에서는 제네릭, 람다, 스트림 등 Java의 고급 문법을 적용하였습니다.

## ✨ 주요 기능

* **실수 기반 사칙연산**
* **계산 결과 누적 저장** (ArrayList 활용)
* **저장된 결과 조회, 초기화, 삭제 기능**
    * 가장 오래된 결과 삭제 (remove 기능)
    * 전체 결과 초기화 (clear 기능)
    * 특정 값보다 큰 결과만 조회 (up 기능)
* **예외 처리**
    * 숫자가 아닌 값 입력, 0으로 나누기, 잘못된 연산자 입력 등 예외 처리 구현

## 🚀 개발 과정 (Lv1 ~ Lv3)

### ### Lv1: 기본적인 사칙연산 계산기

* `Scanner`를 이용한 사용자 입출력 구현
* 두 개의 정수와 하나의 연산자를 입력받아 계산
* `switch` 문을 활용하여 조건문 구현
* `while` 문과 "exit" 입력을 통한 반복 제어

### ### Lv2: 객체 지향 및 예외 처리

* **클래스 분리**: `Calculator` 클래스를 분리
* **캡슐화**: `private` 필드와 `Getter`/`Setter` 메서드를 사용하여 데이터 보호
* **결과 저장**: `ArrayList`를 도입하여 연산 결과를 순차적으로 저장
* **예외 처리**: `try-catch` 도입하여 `ArithmeticException`(0으로 나누기), `InputMismatchException`(타입 불일치) 등 예외를 처리

### ### Lv3: Enum, 제네릭, 람다 & 스트림

* **`Enum` 활용**: 연산자(`+`, `-`, `*`, `/`)를 `OperatorType` Enum으로 사용
* **제네릭**: `<T extends Number>`를 사용하여 `Integer` 뿐만 아니라 `Double` 등  실수 타입의 숫자를 연산할 수 있도록 `ArithmeticCalculator` 확장.
* **람다 & 스트림**: 저장된 결과 목록에서 **"특정 값보다 큰 결과 조회"** 기능을 스트림 연산을 활용하여 구현

## 🏃‍♀️ 실행 방법

1.  프로젝트를 IDE(IntelliJ, Eclipse 등)에서 엽니다.
2.  Lv1: `src/main/java/org/example/lv3/Main.java` / Lv2: `src/main/java/org/example/lv2/App.java` / Lv3: `src/main/java/org/example/lv3/App.java` 각 단계 별로 파일을 찾는다.
3.  `main` 메서드를 실행합니다.

## 🛠️ 적용 기술

* **Language**: Java
* **Core Concepts**:
    * Encapsulation
    * Generics
    * Enums
    * Exception
* **API**:
    * Collections Framework (`ArrayList`, `List`)
    * Lambda & Stream
* **Tools**:
    * Git & GitHub
