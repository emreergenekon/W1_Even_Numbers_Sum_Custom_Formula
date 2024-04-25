import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Sayı Giriniz: ");
            number = input.nextInt();
            //formula accepting all even numbers below.
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
                //till the user text odd numbers.
            } else if (number % 2 != 0) {
                break;
            }
        } while (number != -1);
//The sum of even numbers and multiples of 4 entered.
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı:" + sum);
        input.close();
    }
}