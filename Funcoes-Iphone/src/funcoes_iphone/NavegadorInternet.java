package funcoes_iphone;

public class NavegadorInternet extends ServicosInternet{
    public void exibirPagina(){
        verificarInternet();
        System.out.println("Exibindo página...");
    }
    public void addNovaAba(){
        verificarInternet();
        System.out.println("Nova aba adicionada.");
    }
    public void atualizarPagina(){
        verificarInternet();
        System.out.println("Página atualizada.");
    }
}
