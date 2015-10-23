import java.util.*;

/**
 * Created by Andrzej on 2015-10-17.
 */
public class Main {
    public static void main(String[] args) throws WyjatekPustegoStosu {

        System.out.println("Proszê podaj ci¹g.");
        Scanner input = new Scanner(System.in);
        String napis = input.nextLine();
        ONP licz = new ONP(napis);
        System.out.println(licz.Oblicz());
    }
}
