import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco beligas");
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();
        
        char x;

        do{
            System.out.println("\nQual operação você deseja fazer\n'S' sacar\n'D' depositar\n'V' visualizar\n'Q' sair");
            x = scanner.next().toUpperCase().charAt(0);
            switch (x) {
                case 'S':
                    System.out.println("Digite o valor que deseja sacar:");
                    banco.sacar(scanner.nextDouble());
                    break;
                case 'D':
                    System.out.println("Digite o valor que você deseja depositar");
                    banco.depositar(scanner.nextDouble());
                    break;
                case 'V':
                    System.out.println("\nO saldo no seu banco é de " + banco.getSaldo() + " reais");
                    break;
                default:
                    System.out.println("Você escolheu sair\nO banco UNA agradece por usar nossos serviços");
                    break;
            }

        }while(x!='Q');


        scanner.close();
    }
}