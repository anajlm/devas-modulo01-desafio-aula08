public class ContaCorrente extends Conta{

    public Double saldoChequeEspecial;


    public ContaCorrente(String titular, String numeroConta, Double saldo, String numeroCartao, Double saldoChequeEspecial) {
        super(titular, numeroConta, saldo);
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    public Double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(Double saldoChequeEspecial) {
        // adiciona logica
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    @Override
    public void mostraInformacoes() {
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Saldo cheque especial: " + this.saldo);
        System.out.println("Saldo cheque especial: " + this.saldoChequeEspecial);
    }


    public void transferencia(Conta contaDestino, Double valorTransferido){
        this.saldo -= valorTransferido;
    }
}
