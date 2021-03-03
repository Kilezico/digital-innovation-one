public class Main {

    public static void main(String[] args) {
        System.out.println("Supondo que todos ganham R$10000.00 ...\n");

        Gerente gerente = new Gerente();
        gerente.setSalario(10000);
        System.out.printf("Imposto pago pelo gerente: R$%.2f\n", gerente.calculaImposto());

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(10000);
        System.out.printf("Imposto pago pelo gerente: R$%.2f\n", supervisor.calculaImposto());

        Atendente atendente = new Atendente();
        atendente.setSalario(10000);
        System.out.printf("Imposto pago pelo gerente: R$%.2f\n", atendente.calculaImposto());

    }
}
