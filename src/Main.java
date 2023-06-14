import java.util.Scanner;

public class Main {

    public static double add (double num1, double num2){
        return num1 + num2;
    }
    public static double sub (double num1, double num2){
        return (double)num1 - (double)num2;
    }

    public static double div (double num1, double num2){
        return (double)num1 / (double)num2;

    }

    public static double mul (double num1, double num2){
        return (double)num1 * (double)num2;

    }



    public static void main(String[] args) { //Einstiegsmethode zum ausführen. Compiler sucht nach ihr//
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        double sum = add (num1, num2);
      double sub = sub (num1, num2);
      double mul = mul (num1, num2);
      double div = div (num1, num2);

        System.out.println("sum" +sum);
        System.out.println("sub" +sub);
        System.out.println("mul" +mul);
        System.out.println("div" +div);
    }
}