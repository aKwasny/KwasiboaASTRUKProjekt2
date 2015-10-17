import java.util.*;

/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    public void Oblicz () throws WyjatekPustegoStosu{

        Stack stack = new Stack();
        double finalnaLiczba = 0;
        String bierzacyZnak;
        String napis = "";
        Pair a, b;

        System.out.println("Proszê podaj ci¹g.");
        Scanner input = new Scanner(System.in);
        napis = input.nextLine();

        for (int i = 0; i < napis.length(); i++) {
            if ((napis.equals('+')) || (napis.equals('-')) || (napis.equals('*')) || (napis.equals(':'))) {
                if (stack.isEmpty()) {
                    throw new WyjatekPustegoStosu("Stos jest pusty. Z³a sk³adania, za ma³o liczb, za du¿o operacji.");
                } else {
                    a = stack.get();
                    b = stack.get();
                    if (napis.equals('+')) {
                        finalnaLiczba = a.getV() + b.getV();
                    } else if (napis.equals('-')) {
                        finalnaLiczba = a.getV() - b.getV();
                    } else if (napis.equals('*')){
                        finalnaLiczba = a.getV() * b.getV();
                    } else {
                        finalnaLiczba = a.getV()/b.getV();
                    }
                }
            } else {
                double liczba = Double.valueOf(napis.charAt(i));
                stack.put(liczba);
            }
        }
        System.out.println("Wynik dzia³ania wynosi " + finalnaLiczba + ".");
    }
}