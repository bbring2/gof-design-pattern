## Template Method pattern
> 알고리즘의 구조를 메서드에 정의하고 하위 클래스에서 알고리즘 구조의 변경 없이 알고리즘을 재정의 하는 패턴. 
- 알고리즘 여러 단계로 나누기
- 나눠진 알고리즘의 단계를 메서드로 선언하기
- 알고리즘을 수행할 템플릿 메서드를 만들기
- 하위 클래스에서 나눠진 메서드들을 구현하기

### 요구사항
![img.png](img.png)

### 패턴 특징
- 구현하려는 알고리즘이 일정한 프로세스가 있다.
- 구현하려는 알고리즘이 변경 가능성이 있다.