public class Conta extends Contas{
    private String senha = "";
    private double saldo = 0;
    private String email = "";

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void criaConta() {
        // integracao com o servlet para input no html
    }
}
