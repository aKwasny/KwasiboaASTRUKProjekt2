/**
 * Created by Andrzej on 2015-10-17.
 */
public class Main {
    public static void main(String[] args) throws WyjatekPustegoStosu {

        ONP licz = new ONP();
        licz.Oblicz("5 10 + 10 - 10 *");
        System.out.println("-----------------------------");
        licz.Oblicz("10 90 + 110 - 6 * 900 +");
        System.out.println("-----------------------------");
        licz.Oblicz("+ + 10 10");//celowy b³¹d
        System.out.println("-----------------------------");
        licz.Oblicz("10 10 + +");//celowy b³¹d
        System.out.println("-----------------------------");
        licz.Oblicz("a a ab");//celowy b³¹d
    }
}