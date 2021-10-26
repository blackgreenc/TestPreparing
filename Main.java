//클래스 - 객체를 정의해 놓은 것, 객체의 설계도, 틀
//객체  -  실제로 존재하는 것
//인스터스 - 클래스로 부터 만들어진 객체
//-> 객체를 사용하기 위해서(인스터스화 : 클래스로부터 객체를 만드는 과정)가 진행되어야 함

//객체의 구성요소 - 속성과 기능
//-멤버변수(필드) : 객체의 속성을 표현
//-메서드 : 객체의 기능(동작)을 표현
//->멤버변수(필드)와 메서드를 합쳐서 멤버라고 함

/*
class Car{
    String name;
    String color;
    int seat;
    float gas_mileage;

    void carPrint(){
        System.out.println("차량번호 : " + name);
        System.out.println("색상 : " + color);
        System.out.println("좌석 : " + seat +"인승");
        System.out.println("연비 : " + gas_mileage);
        System.out.println();
    }
}
*/



//클래스 선언과 파일
//-보통 소스 파일마다 하나의 클래스를 선언하지만, 2개 이상의 클래스를 하나의 파일로 선언가능
//-하나의 파일에 클래스가 둘 이상 있다면 하나만 public으로 선언할 수 있고, 해당 클래스 이름은 소스 파일 이름과 동일해야 함
/*
public class Ball{ }
class Cylinder{ }
*/

 
//인스턴스 생성과 사용
//1, 인스턴스 선언 방법
/*
클래스이름 변수;
변수 = new클래스이름()

따로 선언
Car car1;
car1 = new Car();

한 번에 선언
Car car1 = new Car();

-멤버변수(필드)는 따로 
*/

//조건 연산자
/*
조건식 ? 결과1 : 결과2
조건식이 참이면 결과1, 아니면 결과2
*/



class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
/*
*/

class Person{
    String name;
    int height;
    double weight;
    char gender;
    boolean married;
}