import java.util.*;

/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    String napis;
    String[] podzielNapis;
    Stack stack = new Stack();

    public ONP (String napis) {
        this.napis = napis;
        this.podzielNapis = napis.split(" ");
    }

    public double Oblicz () throws WyjatekPustegoStosu{

        double finalnaLiczba = 0;
        Pair a, b;

        for (int i = 0; i < podzielNapis.length; i++) {
            String n = podzielNapis[i];
            try {
                a = stack.get();
                b = stack.get();
                if (n.equals('+')) {
                    finalnaLiczba = a.getV() + b.getV();
                    stack.put(finalnaLiczba);
                } else if (n.equals('-')) {
                    finalnaLiczba = a.getV() - b.getV();
                    stack.put(finalnaLiczba);
                } else if (n.equals('*') || n.equals(('x'))) {
                    finalnaLiczba = a.getV() * b.getV();
                    stack.put(finalnaLiczba);
                } else if (n.equals(':') || n.equals('/')) {
                    finalnaLiczba = a.getV() / b.getV();
                    stack.put(finalnaLiczba);
                } else {
                    double liczba = Double.parseDouble(napis);
                    stack.put(liczba);
                }
            } catch (WyjatekPustegoStosu w) {
                System.out.println("Jest znak, ale brak liczb.");
            }
        }
        try {
            return stack.get().getV();
        } catch (WyjatekPustegoStosu ww) {
            System.out.println("Brak wyniku.");
        }
        return -1;
    }
}