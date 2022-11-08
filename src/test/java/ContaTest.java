
public class ContaTest {
    public static void main(String[] args) throws Exception {
        Conta teste = new Conta();
        teste.setEmail("testando@gmail.com");
        teste.setSaldo(4000);
        teste.setSenha("123321");
        if (teste.getEmail() != "testando@gmail.com"){
            throw new Exception("Erro no email");
        }
        if (teste.getSaldo() != 4000){
            throw new Exception("Erro no saldo");
        }
        if (teste.getSenha() != "123321") {
            throw new Exception("Erro na senha");
        }
    }
}
