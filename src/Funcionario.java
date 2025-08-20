public class Funcionario {
    public String nome;
    public double salario;
    //Metodo funcionario
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getInfo(){
        return nome + " | Salário: " + salario + " | Bônus: " + getBonus();
    }

    public double getBonus(){
        return salario * 0.1;
    }

}




