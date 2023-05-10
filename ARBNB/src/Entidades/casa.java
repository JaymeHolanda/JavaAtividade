package Entidades;
public class casa extends propriedades {
    private int numeroPisos;
    private double areaTerreno;

    public casa(String endereco, int numeroQuartos, double preco, int numeroPisos, double areaTerreno) {
        super(endereco, numeroQuartos, preco);
        this.numeroPisos = numeroPisos;
        this.areaTerreno = areaTerreno;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calcularValorPropriedade() {
        // implementar cálculo do valor da casa
        return 0.0;
    }
}