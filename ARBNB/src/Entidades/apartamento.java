package Entidades;
public class apartamento extends propriedades {
    private int numeroAndar;
    private boolean possuiVaranda;

    private boolean possuiArCondicionado;


    public apartamento(boolean possuiArCondicionado,String endereco, int numeroQuartos, double preco, int numeroAndar, boolean possuiVaranda) {
        super(endereco, numeroQuartos, preco);
        this.numeroAndar = numeroAndar;
        this.possuiVaranda = possuiVaranda;
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public int getNumeroAndar() {
        return numeroAndar;
    }

    public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public boolean isPossuiVaranda() {
        return possuiVaranda;
    }

    public void setPossuiVaranda(boolean possuiVaranda) {
        this.possuiVaranda = possuiVaranda;
    }

    @Override
    public double calcularValorPropriedade() {
        // implementar cálculo do valor do apartamento
        return 0.0;
    }
}