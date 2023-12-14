public final class ContaBlack extends ContaCorrente {

    public Double pontuacao;
    public Double milhas;

    public ContaBlack(String titular, String numeroConta, Integer saldo, String numeroCartao, Double saldoChequeEspecial, Double pontuacao, Double milhas) {
        super(titular, numeroConta, saldo, numeroCartao, saldoChequeEspecial);
        this.pontuacao = pontuacao;
        this.milhas = milhas;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Double getMilhas() {
        return milhas;
    }

    public void setMilhas(Double milhas) {
        this.milhas = milhas;
    }


    @Override
    public void mostraInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo conta: " + this.saldo);
        System.out.println("Saldo cheque especial: " + this.saldoChequeEspecial);
        System.out.println("Pontuação: " + this.pontuacao);
        System.out.println("Milhas: " + this.milhas);

    }

    public void transferencia(String chavePix, Double valorTransferido){
        this.saldo -= valorTransferido;
        this.milhas += valorTransferido/50;
    }

    public void transferencia(Conta contaDestino, Double valorTransferido) {
        this.saldo -= valorTransferido;
        this.pontuacao += valorTransferido/10;
    }
}
