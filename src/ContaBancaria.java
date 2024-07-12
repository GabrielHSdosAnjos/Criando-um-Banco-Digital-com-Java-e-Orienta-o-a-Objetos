public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String agencia;
    protected Cliente titular;

    public ContaBancaria(String numeroConta, String agencia, Cliente titular) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, ContaBancaria contaDestino) {
        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }
        return false;
    }

    protected abstract Object getNumeroConta();

    // Getters e Setters
}
