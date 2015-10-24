/**
 * Created by Andrzej on 2015-10-17.
 */
public class Main {
    public static void main(String[] args) throws WyjatekPustegoStosu {

        ONP licz = new ONP();
        licz.Oblicz("2 7 + 3 / 14 3 - 4 * + 2 /");
        System.out.println(".......................");
        licz.Oblicz("6 14 * 56 + 23 4 * 78 : - 97 /");
        System.out.println(".......................");
    }
}