import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /, ^, sqrt ou Q para sair): ");
            String operacao = scanner.next();

            if (operacao.equalsIgnoreCase("Q")) {
                break;
            }

            double resultado;
            try {
                resultado = calculadora.calculadora(num1, num2, operacao);
                System.out.println("Resultado: " + resultado);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}
