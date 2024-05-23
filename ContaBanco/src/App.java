import java.math.BigDecimal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Conta Bancária - Desafio DIO!");
        ContaTerminal conta = new ContaTerminal();
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scan.nextInt();
        scan.nextLine();  // Consumir o restante da linha
        conta.setNumero(numero);

        System.out.println("Por favor, digite o número da agência: \n");
        String agencia = scan.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Por favor, digite o nome do cliente: \n");
        String nomeCliente = scan.nextLine();
        conta.setNomeCliente(nomeCliente);

        System.out.println("Por favor, digite o saldo da conta: ");
        BigDecimal saldo = scan.nextBigDecimal();
        scan.nextLine();  // Consumir o restante da linha
        conta.setSaldo(saldo);

        scan.close();

        System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");

    }
}
