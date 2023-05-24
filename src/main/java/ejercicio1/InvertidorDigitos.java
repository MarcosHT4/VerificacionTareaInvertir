package ejercicio1;

public class InvertidorDigitos {
    public String invertir(int number) {
        String inverted = "";
        if (number < 0) {
            inverted += "-";
            number = -number;
        }

        String numberString = String.valueOf(number);
        for (int i = numberString.length() - 1; i >= 0; i--) {
            inverted += numberString.charAt(i);
        }

        return inverted;
    }
}
