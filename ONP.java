import java.util.*;

/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    static Stack stack = new Stack();

    public double suma = 0;
    public char bierz¹cyZnak;

    public static void main(String[] args) {

        String napis = "";
        String dzia³anie = "";
        boolean znak = true; //czy znak jest liczb¹

        System.out.println("Proszê podaj ci¹g.");
        Scanner input = new Scanner(System.in);
        napis = input.nextLine();
        napis = napis.replaceAll(" ", "");

        for (int i = 0; i < napis.length(); i++) {
            if (napis.charAt(i) == '+') {
                dzia³anie = String.valueOf('+');
                znak = false;
            } else if (napis.charAt(i) == '-') {
                dzia³anie = String.valueOf('-');
                znak = false;
            } else if (napis.charAt(i) == '*') {
                dzia³anie = String.valueOf('*');
                znak = false;
            }
        }

    }
}