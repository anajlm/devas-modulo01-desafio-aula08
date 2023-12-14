public abstract class Conta {
    public String titular;
    public String numeroConta;
    public Double saldo;

    public Conta(String titular, String numeroConta, Double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numero) {
        this.numeroConta = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public abstract void mostraInformacoes();

    public abstract void transferencia(Conta contaDestino, Double valorTransferido);

}
