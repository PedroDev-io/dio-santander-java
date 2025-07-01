import java.util.List;

public class Banco {

    private String name;
    private List<Conta> conta;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Conta> getConta() {
        return conta;
    }

    public void setConta(List<Conta> conta) {
        this.conta = conta;
    }
}
