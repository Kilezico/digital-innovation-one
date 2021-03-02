public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        System.out.println("Máximo de pessoas: " + meuCarro.getMax());
        System.out.println("Pessoas no carro: " + meuCarro.getPessoas());
        meuCarro.adiciona();
        // 1
        meuCarro.adiciona();
        // 2
        meuCarro.adiciona();
        // 3
        System.out.println("Pessoas no carro: " + meuCarro.getPessoas());
        meuCarro.adiciona();
        // 4
        meuCarro.adiciona();
        // 5
        meuCarro.adiciona();
        // Erro
        System.out.println("Pessoas no carro: " + meuCarro.getPessoas());

        // Acontece mesma coisa acima ao tentar remover pessoas do carro vazio

        meuCarro.anda();
        meuCarro.buzina();
    }
}

class Carro {
    private int pessoas = 0;
    private final int max = 5;

    public int getPessoas() { return pessoas; }
    public int getMax() { return max; }

    public void adiciona() {
        if (pessoas < max) {
            pessoas++;
            System.out.println("Adicionada uma pessoa");
        } else {
            System.out.println("Erro! Carro lotado!");
        }
    }

    public void remove() {
        if (pessoas > 0) {
            pessoas--;
            System.out.println("Removida uma pessoa");
        } else {
            System.out.println("Erro! Carro já está vazio!");
        }
    }

    public void buzina() {
        System.out.println("Fon! Fon!");
    }

    public void anda() {
        System.out.println("Vrum! Vrum!");
    }
}