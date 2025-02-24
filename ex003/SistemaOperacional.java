public class SistemaOperacional {
    public static void main(String[] args) {
        String sistemaOperacional = System.getProperty("os.name");
        String versao = System.getProperty("os.version");
        String arquitetura = System.getProperty("os.arch");

        System.out.println("Sistema Operacional: " + sistemaOperacional);
        System.out.println("Versao: " + versao);
        System.out.println("Arquitetura: " + arquitetura);
    }
}
