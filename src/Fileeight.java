import java.util.Scanner;

public class Fileeight {
    public static void main(String[] args) {
            Double Amount,Answer;
            int a,b,c,d;

            a = 250;
            b = 300;
            c = 400;
            d = 500;

            Scanner chukua;
            chukua = new Scanner(System.in);
        System.out.println("Enter the amount of goods bought between 1-10000");
        Amount = chukua.nextDouble();

        if ((Amount>0) && (Amount<=1000)){
            System.out.println("Your total is "+(Amount+a));
        }else if ((Amount>1000) && (Amount<=5000)){
            System.out.println("Your total is "+(Amount+b));
        }else if ((Amount>5000) && (Amount<=7000)){
            System.out.println("Your total is "+(Amount+c));
        }else if ((Amount>7000) &&(Amount<=10000)){
            System.out.println("Your amount is "+(Amount+d));
        }
    }
}
