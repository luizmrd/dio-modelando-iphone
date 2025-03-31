import java.util.Scanner;
import java.util.Locale;


public class Sistema {

    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Escolha um aplicativo do iPhone ===");
            System.out.println("1 - Fazer uma ligação");
            System.out.println("2 - Enviar correio de voz");
            System.out.println("0 - Sair");
            
            System.out.print("Opção: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1 -> ligar();
                case 2 -> correioDeVoz();
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    return;
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public static void ligar() {
        System.out.println("Informe o número para fazer uma ligação:");
        String numero = scanner.nextLine();
        System.out.println("Ligando para o número... " + numero);
    }

    public static void correioDeVoz() {
        System.out.println("Iniciar correio de voz... Digite sua mensagem:");
        String mensagem = scanner.nextLine();
        System.out.println("Mensagem gravada: " + mensagem);
    }
}
