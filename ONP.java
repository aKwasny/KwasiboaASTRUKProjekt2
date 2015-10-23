/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    String napis;
    String [] podzielonyNapis;
    Stack stack = new Stack();

    public ONP (String napis) {
        this.napis = napis;
        this.podzielonyNapis = napis.split(" ");
    }

    public double Oblicz () throws WyjatekPustegoStosu{

        double liczba = 0;
        double finalnaLiczba = 0;
        Pair a, b;

        for (int i = 0; i < podzielonyNapis.length; i++) {
            String n = podzielonyNapis[i];
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
                    liczba = Double.parseDouble(n);
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