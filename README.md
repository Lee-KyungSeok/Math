# Math
Math 관련 기본 문법

## Math 함수
자주 쓰이는 Math 함수
1. __abs__
</br>- 절댓값
```java
int a = Math.abs(-123);
```

2. __round__
</br>- 반올림
```java
long b = Math.round(123.5);
```

3. __ceil__
</br>- 올림
```java
double c = Math.ceil(343.12345);
```

4. __floor__
</br>- 내림
```java
double d = Math.floor(3213.123);
```

5. __random__
</br>- 임의의 숫자 반환
```java
// 0보다 크거나 같고 1보다 작은 실수를 임의로 return
Math.random();
// 0~99 사이의 임의 값 return
double ab =Math.random() * 100;
```

## Random 함수
Random 함수 따로 만들어짐

```java
// Random 함수를 이용 하여 랜덤값 추출
Random random = new Random();

// 1부터 100사이의 랜덤한 숫자 가져오기
random.nextInt(100); // 0~99 사이의 정수 리턴
int r = random.nextInt(100)+1;
```

## 참고 문제
1. 로또문제
