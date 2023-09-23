import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu CPF");
        String cpf = scanner.next();

        System.out.println("Digite seu endereco:");

        System.out.println("Rua:");
        String rua = scanner.next();

        System.out.println("Número:");
        int numerocasa = scanner.nextInt();

        System.out.println("Bairro:");
        String bairro = scanner.next();

        System.out.println("Cidade:");
        String cidade = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua data de nascimento");
        String nascimento = scanner.next();

        System.out.println("Digite seu estado civil");
        String estadocivil = scanner.next();

        System.out.println("Qual sua ocupação?");
        String profissao = scanner.next();

        System.out.println("Qual sua renda?");
        double renda = scanner.nextDouble();

        System.out.println("Conta criada com sucesso!");

    }
}