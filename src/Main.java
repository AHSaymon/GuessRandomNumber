import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myNumber=(int) (Math.random()*100);
        int userNumber=0;
        do {
            System.out.println("Please Guess the number");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("You are correct");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("number is too large");

            } else {
                System.out.println("number is too small");
            }
        }while(userNumber >= 0) ;
        System.out.println("My number is:");
        System.out.println(myNumber);

    }
}