class Main {
    public static void main(String[] args) {
        printGreeting("선의");
        add(2, 3);
    }

    public static int add(int n1, int n2){
        int result;
        result = n1 + n2;
        System.out.println(result);
        return result;
    }
    public static void printGreeting(String name){
        System.out.println(name +"님 안녕하세요");
        return;
    }
}
//함수 
/*
int add(int num1, int num2){
    int result;
    return result;
}

int = 함수 반환형
add = 함수 이름
(int num1, int num2) = 매개변수
return = return 예약어
*/