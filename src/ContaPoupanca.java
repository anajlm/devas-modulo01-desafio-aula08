public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, String numeroConta, Double saldo) {
        super(titular, numeroConta, saldo);
    }

    @Override
    public void mostraInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo conta: " + this.saldo);
    }


    public void transferencia(Conta contaDestino, Double valorTransferido) {
        this.saldo -= valorTransferido;
    }
}
