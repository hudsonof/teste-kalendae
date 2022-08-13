import java.util.Scanner;

public class StringInverter {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digite um texto para inverter: ");
        String text = sn.nextLine();
        System.out.println("texto invertido: " + new StringBuilder(text).reverse().toString());
        sn.close();
    }
}