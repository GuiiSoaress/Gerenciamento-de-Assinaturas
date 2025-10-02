import java.util.ArrayList;
import java.util.Scanner;

import entity.PlanoAssinatura;
import entity.PlanoBasico;
import entity.PlanoEnterprise;
import entity.PlanoPremium;

public class App {
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<PlanoAssinatura> planos = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        boolean tenteNovamente = false;

        ArrayList<PlanoAssinatura> assinaturas = new ArrayList<>();

        while (true) {
            System.out.println("""
                    -------------------------- Gerenciamento de Assinaturas ---------------------------
                    1 - Novos planos
                    2 - Meus Planos
                    """);
            String opcao = scan.next();
            scan.nextLine();

            if (opcao.equals("1")) {
                instanciarPlano();
            }else if (opcao.equals("2")) {
                listarPlanos();
            }

        }
    }

    public static void instanciarPlano(){

        String newPlano;
        String nomeUsuario;
        String pag;

        while (true){
            System.out.println("=========================================");
            System.out.println("   ESCOLHA O SEU PLANO DE ASSINATURA     ");
            System.out.println("=========================================");
            System.out.println();

            // PLANO BÁSICO
            System.out.println("OPÇÃO 1: PLANO BÁSICO");
            System.out.println("  - Benefício: Limite de 3 usuários ");
            System.out.println("  - Benefício: Armazenamento padrão de 1TB");
            System.out.println();

            // PLANO PREMIUM
            System.out.println("OPÇÃO 2: PLANO PREMIUM");
            System.out.println("  - Todos os benefícios anteriores +");
            System.out.println("  - Benefício: Suporte prioritário");
            System.out.println("  - Benefício: Segurança aprimorada");
            System.out.println();

            // PLANO ENTERPRISE
            System.out.println("OPÇÃO 3: PLANO ENTERPRISE");
            System.out.println("  - Todos os benefícios anteriores +");
            System.out.println("  - Benefício: Suporte 24h");
            System.out.println("  - Benefício: Personalização da plataforma");
            System.out.println();

            System.out.println("-----------------------------------------");
            System.out.print("Digite o número do plano desejado: ");

            newPlano = scan.next();
            scan.nextLine();

            if(newPlano.equals("1") || newPlano.equals("2") || newPlano.equals("3")){

                System.out.println("Digite seu nome: ");
                nomeUsuario = scan.nextLine();
                       
                while (true){
                    System.out.println("""
                                    Escolha o método de pagamento:
                                    1 - Pix
                                    2 - Débito (á vista)
                                    3 - Crédito
                                    """);

                    String pagamento = scan.next();
                    scan.nextLine();

                    if(pagamento.equals("1")){pag = "Pix"; break;} 
                    else if(pagamento.equals("2")){pag = "Débito";break;}
                    else if(pagamento.equals("3")){pag = "Crédito";break;}
                    else{System.out.println("Caracter Invalido! Tente Novamente!");}
                }


                if(newPlano.equals("1")){ PlanoBasico plano = new PlanoBasico(nomeUsuario, pag); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                if(newPlano.equals("2")){ PlanoPremium plano = new PlanoPremium(nomeUsuario, pag); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                if(newPlano.equals("3")){ PlanoEnterprise plano = new PlanoEnterprise(nomeUsuario, pag); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                break;
                
            }else{ System.out.println("Caracter Invalido! Tente Novamente");}

        }

    }

    public static void listarPlanos(){
        for (int i = 0; i < planos.size(); i++) {
            PlanoAssinatura plano = planos.get(i);
            System.out.println("----------------------------------------");
            System.out.println((i + 1) + " -- Cliente: " + plano.getNome() +" | Tipo de Plano: " + plano.getClass().getSimpleName());
        }

    }
        
        
        

        
}
