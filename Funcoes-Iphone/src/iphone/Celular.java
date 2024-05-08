package iphone;
import funcoes_iphone.AparelhoTelefonico;
import funcoes_iphone.NavegadorInternet;
import funcoes_iphone.ReprodutorMusical;

public class Celular {
    public static void main(String[] args) {
        System.out.println("Aparelho Telefônico");
        AparelhoTelefonico apt = new AparelhoTelefonico();
        apt.ligar();
        apt.atender();
        apt.iniciarCorreioVoz();

        System.out.println("Navegador de Internet");
        NavegadorInternet nvi = new NavegadorInternet();
        nvi.addNovaAba();
        nvi.atualizarPagina();
        nvi.exibirPagina();

        System.out.println("Reprodutor de Música");
        ReprodutorMusical rpm = new ReprodutorMusical();
        rpm.selecionarMusica();
        rpm.tocarMusica();
        rpm.pausarMusica();
    }
}
