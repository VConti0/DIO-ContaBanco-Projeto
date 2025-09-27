import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número de sua conta: ");
        int numeroConto = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da conta :");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá + " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é"
                + numeroAgencia + "e seu saldo " + saldoConta + " já está disponível para saque.");
        scanner.close();
    }
}
