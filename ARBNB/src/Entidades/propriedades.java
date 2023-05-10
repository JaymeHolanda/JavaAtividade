package Entidades;

public abstract class propriedades {

    // métodos endereço, número de quartos, preço, etc

    private String endereço;
    private int numerosDeQuartos;
    private double preço;

    public propriedades(String endereco, int numeroQuartos, double preco) {

        this.endereço = endereco;
        this.numerosDeQuartos = numeroQuartos;
        this.preço = preco;
    }
    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumerosDeQuartos() {
        return numerosDeQuartos;
    }

    public void setNumerosDeQuartos(int numerosDeQuartos) {
        this.numerosDeQuartos = numerosDeQuartos;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    // método abstrato para cálcular o valor de uma propriedade
    public abstract double calcularValorPropriedade();
}

