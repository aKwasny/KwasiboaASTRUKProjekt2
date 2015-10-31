/**
 * Created by Andrzej on 2015-10-17.
 */
public class ONP {

    String napis;
    String [] podzielonyNapis;
    Stack stack = new Stack();

    public ONP (String napis) {
        this.napis = napis;
    }

    public ONP () {

    }

    public void setNapis (String napis) {
        this.napis = napis;
    }

    public void Oblicz () {

        double liczba = 0;
        double finalnaLiczba = 0;
        double a, b;

        this.podzielonyNapis = napis.split(" "); //dzielenie po spacjach i zapisanie do tablicy

        for (int i = 0; i < podzielonyNapis.length; i++) {
            String n = podzielonyNapis[i];
            try {
                if (n.equals("+")) {
                    a = stack.get().getV();
                    b = stack.get().getV();
                    finalnaLiczba = a + b;
                    stack.put(finalnaLiczba);
                } else if (n.equals("-")) {
                    a = stack.get().getV();
                    b = stack.get().getV();
                    finalnaLiczba = b - a;
                    stack.put(finalnaLiczba);
                } else if (n.equals("*") || n.equals(("x"))) {
                    a = stack.get().getV();
                    b = stack.get().getV();
                    finalnaLiczba = a * b;
                    stack.put(finalnaLiczba);
                } else if (n.equals(":") || n.equals("/")) {
                    a = stack.get().getV();
                    b = stack.get().getV();
                    finalnaLiczba = b / a;
                    stack.put(finalnaLiczba);
                } else {
                    try {
                        liczba = Double.parseDouble(n);
                        stack.put(liczba);
                    } catch (NumberFormatException zlyznak) {
                        System.out.println(liczba + "   =   " + "Wpisano niedozwolony znak - istnieje mo¿liwoœæ wpisania tylko liczb i znaków operacji (+, -, *, x, /, :)");
                    }
                }
            } catch (WyjatekPustegoStosu w) {
                System.out.println(napis + "   -   " + "ZLA SKLADNIA ZA MAO LICZB ZA DUZO OPERACJI");
            }
        }
        try {
            System.out.println(napis = " = " + stack.get().getV());
        } catch (WyjatekPustegoStosu ww) {
            System.out.println("Stos pusty");
        }
    }

    public void Oblicz (String napis) {
        this.napis = napis;
        this.stack = new Stack();
        Oblicz();
    }
}