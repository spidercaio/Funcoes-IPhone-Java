package funcoes_iphone;

public class ReprodutorMusical extends ServicosInternet{
    public void tocarMusica(){
        verificarInternet();
        System.out.println("Tocando música.");
    }
    public void pausarMusica(){
        System.out.println("Música pausada.");
    }
    public void selecionarMusica(){
        verificarInternet();
        System.out.println("Música selecionada");
    }
}
