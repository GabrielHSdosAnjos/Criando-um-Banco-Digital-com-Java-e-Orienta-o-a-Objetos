public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String agencia, Cliente titular, double limiteChequeEspecial) {
        super(numeroConta, agencia, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    protected Object getNumeroConta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumeroConta'");
    }

    // Getters e Setters para limiteChequeEspecial
}
