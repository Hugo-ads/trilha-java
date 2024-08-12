
    import java.util.Locale;
    import java.util.Scanner;
    
    public class ContaTerminal {
        @SuppressWarnings("resource")
        public static void main(String[] args) throws Exception {
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            //solicitando os dados do usuário
            System.out.println("Digite seu nome:");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();
        
            System.out.println("Digite sua agência:");
            String agencia = scanner.next();
    
            System.out.println("Digite o n° de sua conta (somente números):");
            int conta = scanner.nextInt();
            
            //dados sobre o saldo atual
            double saldo = (237.48);
    
            //imprimindo os dados obtidos pelo usuário
            System.out.println("");
            System.out.println("Olá, " + nome + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua Agência é: " + agencia + " / Conta: " + conta);
            System.out.println("Seu saldo é de: R$" + saldo + ", e já está disponível para saque.");
       
        }
    }
    
