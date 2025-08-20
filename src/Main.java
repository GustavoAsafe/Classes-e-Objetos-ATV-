import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Gustavo", 5000));
        funcionarios.add(new Gerente("José", 2000));
        funcionarios.add(new Vendedor("Jorge", 1500));

        for (Funcionario f : funcionarios) {
            System.out.println(f.getInfo());
        }
    }
}
