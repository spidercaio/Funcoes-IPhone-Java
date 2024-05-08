package funcoes_iphone;

public class AparelhoTelefonico extends ServicosInternet{
    public void ligar(){
        verificarInternet();
        System.out.println("Lingando para contato...");
    }
    public void atender(){
        verificarInternet();
        System.out.println("Atendendo contato...");
    }
    public void iniciarCorreioVoz(){
        verificarInternet();
        System.out.println("Iniciando correio de voz...");
    }
}
