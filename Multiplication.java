import java.util.Scanner;

public class Multiplication {
        Scanner scan = new Scanner(System.in);

        public void method1(){
            System.out.println("WELCOME TO MULTIPLICATION FOR");
            int number = scan.nextInt();
            for(int i=0; i <= 10; i++){
            int total = number * i;
            System.out.println(number +" * "+ i + " = " + total);
            }
        }
        public void method2(){
            System.out.println("WELCOME TO MUTIPLICATION WHILE");
            int i = 0;
            int number = scan.nextInt();
            while (i <= 10) {
            i++;
            int total = number * i;
            System.out.println(number +" * "+ i + " = " + total);
            }
        }
        public void method3(){
            System.out.println("WELCOME TO MUTIPLICATION WHILE");
            int i = 0;
            int number = scan.nextInt();
            do{
            i++;
            int total = number * i;
            System.out.println(number +" * "+ i + " = " + total);
            }while( i <= 10);
        
        }
}
