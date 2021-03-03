public class Supervisor extends Funcionario {
    public double calculaImposto() {
        return getSalario() * (0.05 / 100);
    }
}