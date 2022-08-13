import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);
        System.out.println("Digete um numero maior que 0 para encontrar o fibonacci: ");
        Integer value = sn.nextInt();
        Long tempoInicial = System.currentTimeMillis();
        System.out.printf("O fibonacci da %sª posição é %s%n", value, fibonacci(value));
        System.out.printf("O cálculo demorou: %s ms%n", System.currentTimeMillis() - tempoInicial);
        sn.close();
    }

    private static Integer fibonacci(Integer numero) {
        if (numero <= 0) return 0;
        if (numero <= 2) return --numero;
        return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
}
