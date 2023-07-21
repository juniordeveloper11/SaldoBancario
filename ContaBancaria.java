
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo restante: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(saldoInicial);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        System.out.print("Informe o valor do saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        System.out.print("Informe o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        scanner.close();
    }
}
