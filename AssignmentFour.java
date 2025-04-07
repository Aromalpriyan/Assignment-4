import java.util.Scanner;
public class AssignmentFour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = sc.nextDouble();
        System.out.println("Enter annual interest rate (in percentage):");
        double rate = sc.nextDouble();
        System.out.println("Enter time period (in years):");
        double time = sc.nextDouble();
        double interest = (principal * rate * time)/100;

        System.out.println("simpleInterest : $" + interest);


        sc.close();




    }
}