<img src="https://github.com/jihwanprogramer/calulators/blob/main/img/calculator.jpg?raw=true" alt="배너" width="80%"/>

<br/>
<br/>

# 1. Project Overview (프로젝트 개요)
- 프로젝트 이름: 계산기 만들기
- 프로젝트 설명: 클래스를 이용하여 간단한 계산기를 만듬.



# 2. Key Features (주요 기능)
- **연산 기능**:
    - ➕ ➖ ➗ ✖️ 를 이용하여 두 숫자의 연산이 가능

- **리스트 저장 기능**:
    - 연산 시에 출력되는 결과 값은 리스트에 저장

- **리스트 출력 기능**:
    - 결과 값이 저장된 리스트를 불러옴

- **조건부 결과값 출력 기능**:
    - 입력값보다 높은 결과값만 출력

- **결과 값 삭제기능**:
    - 리스트에 있는 결과값 삭제


# 3. Technology Stack (기술 스택)
##  Language
|      |                                                                                                                  |
|------|------------------------------------------------------------------------------------------------------------------|
| Java | <img src="https://github.com/jihwanprogramer/calulators/blob/main/img/Java.jpg?raw=true" alt="Java" width="200"> | 
|

<br/>

# 4. Project Structure (프로젝트 구조)
```
caclulatorProject
src/
├── calculate  
│        ├── Calculate            # 연산메서드 생성자 메서드 클래스
│        ├── OperatorType.enum    # 계산기 주요 기능 구현
│
│── calculatorApp               
│        ├── CalculatorApp        # 메인 클래스
│
│── operations           
│        ├──Addition              # 덧셈 클래스
│        ├──Division              # 뺄셈 클래스
│        ├──Multiplication        # 곱셈 클래스
│        ├──Subtraction           # 나눗셈 클래스
├── .gitignore                    # Git 무시 파일 목록
└── README.md                     # 프로젝트 개요 및 사용법
```

<br/>

# 5. Development Workflow (개발 워크플로우)
## 브랜치 전략 (Branch Strategy)
개인 프로젝트 이지만 정확한 병합과 수정을 위해 브랜치 사용

- Main Branch
    - 배포 가능한 상태의 코드를 유지합니다.
    - 모든 배포는 이 브랜치에서 이루어집니다.

- Dev Branch
    - 수정한 코드를 저장하고 병합 시도합니다.
    - 모든 기능 개발은 이 브랜치에서 이루어집니다.





## 블록 구문
```
// 한 줄짜리 블록일 경우라도 {}를 생략하지 않고, 명확히 줄 바꿈 하여 사용한다
if (UpResultInput == 1) {
       operatorType.UpResult(firstNumber, secondNumber);
       }
else if (UpResultInput == 3) {
       operatorType.ViewAllResult();
       } 
else if (UpResultInput == 4) {
       break;
}
```



<br/>

## 메소드 네이밍
메소드 작성 시 아래 네이밍 규칙을 준수하여 의미 전달을 명확하게 한다.<br/>
메소드명이 길어지더라도 의미 전달의 명확성에 목적을 두어 작성한다.<br/>
```
public void UpResult(int FirstNum, int SecondNum)

public void ViewAllResult()
```

<br/>

# 6. 수행 결과
<img width="100%" alt="코드 컨벤션" src="https://github.com/jihwanprogramer/calulators/blob/main/img/%EC%88%98%ED%96%89%EA%B2%B0%EA%B3%BC.jpg?raw=true">