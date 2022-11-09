public class Geratriz {
    protected String eleGen[] = {"Celular","Carregador","Notebook","Monitor","Desktop","Processador","Placa de Video","Fonte"
    ,"Fone de ouvido","Microfone"};
    protected String movGen[] = {"Sofa","Mesa","Cadeira","Escrivaninha","Cama","Quadro","Mesa de centro"};
    protected String veiGen[] = {"Chevrolet Celta", "Volkswagen Gol", "Ford Ka", "Chevrolet Agile", "Renault Kwid","Chevrolet Classic","Ford Ecosport","BMW i30","Renault Duster","Ford Focus"};
    // funcao que ira gerar ao menos uns 30 anuncios para uso no site de forma completamente aleatoria
    public void criaAnuncios(int num) {
        for (int i = 0; i < num; i++) {
            Anuncio novo = new Anuncio();
            int a = (int)(Math.random() * 10);


        }
    }
}
