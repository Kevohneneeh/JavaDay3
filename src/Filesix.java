import java.util.Scanner;

public class Filesix {
    public static void main(String[] args) {
        Double r,answer;
        Scanner chukua;
        chukua = new Scanner(System.in);
        System.out.println("Enter the radius");
        r = chukua.nextDouble();
        answer = Math.PI* Math.pow(r,2);
        if (answer<160){
            System.out.println(answer+"is less than 160");
        }else {
            System.out.println(answer+"is greater than 160");
        }
    }
}
