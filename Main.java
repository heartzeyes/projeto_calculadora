import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Bem-vindo a calculadora Java.");
        System.out.println("\nSelecione a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        System.out.print("\nInforme o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = scanner.nextDouble();

        try {
            double resultado = 0;
            switch (opcao) {
                case 1 -> {
                    resultado = calc.somar(num1, num2);
                    System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + resultado);
                }
                case 2 -> {
                    resultado = calc.subtrair(num1, num2);
                    System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + resultado);
                }
                case 3 -> {
                    resultado = calc.multiplicar(num1, num2);
                    System.out.println("\nResultado: " + num1 + " * " + num2 + " = " + resultado);
                }
                case 4 -> {
                    resultado = calc.dividir(num1, num2);
                    System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + resultado);
                }
                default -> System.out.println("\nOpção inválida!");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
