public class Calculadora {
     
    public double calculadora(double num1, double num2, String operacao) {
        switch (operacao) {
         case "+":
            return num1 + num2;

         case "-":
             return num1 - num2;

         case "*":
             return num1 * num2;

        case "/":
                if (num2 == 0) {
                    System.out.println("mpossível realizar uma divisão por zero");
                }
                return num1 / num2;

        case "^":
                        if (num2 ==0) {
                System.out.println("Todo número elevado a zero será igual a 1.");
            }
        return Math.pow(num1, num2);

        case "sqrt":
        if (num1 < 0) {
            throw new IllegalArgumentException("Não existe raiz de número negativo.");
        }
        return Math.sqrt(num1); 

        case "Q":
                System.exit(0);

        default:
            throw new IllegalArgumentException("Operação inválida.");
        }
    }
}
