public class AnuncioTest{
    public static void main(String[] args) throws Exception{
        Anuncio teste = new Anuncio();
        teste.setPrice(4000);
        teste.setDesc("Pedro");
        teste.setTitulo("Pedro");
        teste.setId(1);
        teste.setNomeAnunciante("Pedro");
        teste.setUF("PA");
        teste.setTipo(1);
        if (teste.getPrice() != 4000) {
            throw new Exception("Erro na definicao do preco");
        }
        if (teste.getDesc() != "Pedro") {
            throw new Exception("Erro na definicao da descricao");
        }
        if (teste.getTitulo() != "Pedro") {
            throw new Exception("Erro na definicao titulo");
        }
        if (teste.getId() != 1) {
            throw new Exception("Erro na definicao do id? redundante nao?");
        }
        if (teste.getNomeAnunciante() != "Pedro") {
            throw new Exception("Erro na definicao do nome do anunciante");
        }
        if (teste.getUF() != "PA") {
            throw new Exception("Erro na definicao da unidade federativa");
        }
        if (teste.getTipo() != 1) {
            throw new Exception("Erro na definicao do tipo no filtro");
        }
    }
}
