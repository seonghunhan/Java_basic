import java.util.Scanner;

public class ifgogo {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        if(num1 < num2){
            System.out.println("num1은 num2보다 작다");
        }

        if(num1 > num2){
            System.out.println("num1은 num2보다 작다");
        } else {
            System.out.println("num1은 num2보다 크지않다");
        }

        if(num1 > num2){
            System.out.println("num1은 num2보다 작다");
        } else if (num1 < num2){
            System.out.println("num1은 num2보다 크지않다");
        } else if (num1 == num2){
            System.out.println("num1은 num2보다 크지않다");
        } else {
            System.out.println("num1은 num2와 크지도 작지도 같지도 않다");
        }

        if(true){
            System.out.println("무조건 실행");
        }

        System.out.println("점수를 입력하세요");

        Scanner inputNum = new Scanner(System.in);
        int score = inputNum.nextInt();

        switch (score) {
            case 90:
                System.out.println(("score is 90"));
                break; //switch문을 빠져나간다
            case 80:
                System.out.println(("score is 80"));
                break;
            case 70:
                System.out.println(("score is 70"));
                break;
            case 60:
                System.out.println(("score is 60"));
                break;
            default :
                System.out.println("socre?");
                break;
        }

    }
}
