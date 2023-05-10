package Entidades;


public class hotel extends propriedades {

    private int numeroDeQuartos;
    private boolean cafeDaManha;
    private boolean arCondicionado;


    public hotel(String endereco, int numeroQuartos, double preco, int numeroDeQuartos, boolean cafeDaManha, boolean arCondicionado) {
        super(endereco, numeroQuartos, preco);
        this.numeroDeQuartos = numeroDeQuartos;
        this.cafeDaManha = cafeDaManha;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public void setNumeroDeQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public boolean isCafeDaManha() {
        return cafeDaManha;
    }

    public void setCafeDaManha(boolean cafeDaManha) {
        this.cafeDaManha = cafeDaManha;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }


    public double calcularValorPropriedade() {
        // Lógica para calcular o valor do aluguel ou venda do hotel
        double valor = getPreço() * 0.8; // Exemplo: valor é 80% do preço da propriedade
        if (isCafeDaManha()) {
            valor += 10; // Exemplo: adiciona R$ 10 por pessoa para o café da manhã
        }
        if (isArCondicionado()) {
            valor += 20; // Exemplo: adiciona R$ 20 por dia para o ar condicionado
        }
        return valor;
    }

}
