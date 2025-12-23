import java.util.Scanner;

public class Multiplication {
        Scanner scan = new Scanner(System.in);

        public void method1(){
            System.out.println("WELCOME TO MULTIPLICATION");
            int number = scan.nextInt();
            for(int i=0; i <= 10; i++){
            int total = number * i;
            System.out.println(number +" * "+ i + " = " + total);
            }
        }
}
