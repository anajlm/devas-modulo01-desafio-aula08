public class ContaInvestimento extends Conta {

    public Double lucroInvestimento;
    public Double taxaRendimento;

    public ContaInvestimento(String titular, String numeroConta, Double saldo, Double lucroInvestimento, Double taxaJuros) {
        super(titular, numeroConta, saldo);
        this.lucroInvestimento = lucroInvestimento;
        this.taxaRendimento = taxaJuros;
    }

    public Double getLucroInvestimento() {
        return lucroInvestimento;
    }

    public void setLucroInvestimento(Double lucroInvestimento) {
        this.lucroInvestimento = lucroInvestimento;
    }

    public Double getTaxaJuros() {
        return taxaRendimento;
    }

    public void setTaxaJuros(Double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void mostraInformacoes() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo conta: " + this.saldo);
        System.out.println("Lucro investimento: " + this.lucroInvestimento);
    }

    @Override
    public void transferencia(Conta contaDestino, Double valorTransferido) {

    }

    public final void investir(Double valor){
        this.saldo += valor * taxaRendimento;
    }
}
