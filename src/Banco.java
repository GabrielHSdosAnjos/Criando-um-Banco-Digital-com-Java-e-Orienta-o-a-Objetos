import java.util.ArrayList;
import java.util.List;

public class Banco {
    @SuppressWarnings("unused")
    private String nome;
    private List<ContaBancaria> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void removerConta(ContaBancaria conta) {
        contas.remove(conta);
    }

    public ContaBancaria buscarConta(String numeroConta) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        return null;
    }

    // Getters e Setters
}
