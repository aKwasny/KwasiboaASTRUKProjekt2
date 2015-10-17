import java.util.*;

/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    public void Oblicz () throws WyjatekPustegoStosu{

        Stack stack = new Stack();
        double suma = 0;
        char bierz¹cyZnak;
        String napis = "";
        Pair a, b;

        System.out.println("Proszê podaj ci¹g.");
        Scanner input = new Scanner(System.in);
        napis = input.nextLine();
        napis = napis.replaceAll(" ", "");

        for (int i = 0; i < napis.length(); i++) {
            if (napis.charAt(i) == '+' || napis.charAt(i) == '-' || napis.charAt(i) == '*') {
                if (stack.isEmpty()) {
                    throw new WyjatekPustegoStosu("Stos jest pusty. Z³a sk³adania, za ma³o liczb, za du¿o operacji.");
                } else {
                    a = stack.get();
                    b = stack.get();
                    if (napis.charAt(i) == '+') {
                        suma = a.getV() + b.getV();
                    } else if (napis.charAt(i) == '-') {
                        suma = a.getV() - b.getV();
                    } else {
                        suma = a.getV() * b.getV();
                    }
                    stack.put(suma);
                    suma = 0;
                }
            } else {
                double liczba = Double.valueOf(napis.charAt(i));
                stack.put(liczba);
            }
        }

    }
}