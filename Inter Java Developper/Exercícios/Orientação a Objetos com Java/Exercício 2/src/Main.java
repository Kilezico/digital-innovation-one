public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Doblô", 2016);

        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("Modelo do carro: " + meuCarro.getModelo());
        System.out.println("Ano do carro: " + meuCarro.getAno());
        System.out.println("Variante (antes): " + meuCarro.getVariante());

        meuCarro.setVariante("Adventure");

        System.out.println("Variante (depois): " + meuCarro.getVariante());
        
    }
}

class Carro {
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    private String marca, modelo, variante;
    private int ano;

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public String getMarca() { return marca; }

    public String getModelo() { return modelo; }

    public int getAno() { return ano; }

    public String getVariante() { return variante; }
}