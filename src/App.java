import java.util.ArrayList;
import java.util.Scanner;

import entity.PlanoAssinatura;
import entity.PlanoBasico;
import entity.PlanoEnterprise;
import entity.PlanoPremium;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean tenteNovamente = false;

        double precoBasico = 50;
        double precoPremium = 100;
        double precoEnterprise = 150;

        ArrayList<PlanoAssinatura> assinaturas = new ArrayList<>();

        
        do {
            System.out.println("""
                    -------------------------- Gerenciamento de Assinaturas ---------------------------
                    1 - Novos planos
                    2 - Meus Planos
                    """);
            String gerenciamento = scan.next();
            String limpaCache = scan.nextLine();

            if (gerenciamento.equals("1")) {
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

                String newPlano = scan.next();
                scan.nextLine();

                System.out.println("Digite seu nome: ");
                String nomeUsuario = scan.nextLine();

                if (newPlano.equals("1")) {
                    PlanoBasico plano = new PlanoBasico();

                    
                    plano.setNome(nomeUsuario);
                    plano.setPrecoMensal(precoBasico);

                    System.out.println("""
                            Escolha o método de pagamento:
                            1 - Pix
                            2 - Débito (á vista)
                            3 - Crédito
                            """);

                    int pagamento = scan.nextInt();
                    scan.nextLine();

                    if (pagamento == 1) {
                        plano.setMetodoPagamento("PiX");
                    } else if (pagamento == 2) {
                        plano.setMetodoPagamento("Débito");
                    } else {
                        plano.setMetodoPagamento("Crédito");
                    }

                    assinaturas.add(plano);
                    for (PlanoAssinatura pano : assinaturas) {
                System.out.println("----------------------------------------");
                System.out.println("Cliente: " + pano.getNome());
                System.out.println("Tipo de pano: " + pano.getClass().getSimpleName()); // Mostra o nome da classe (Basico, Premium...)
                System.out.printf("Preço Mensal: R$ %.2f\n", pano.getPrecoMensal());
                System.out.println("Método de Pagamento: " + pano.getMetodoPagamento());
                
                // Usando polimorfismo para listar os benefícios específicos de cada pano
                System.out.println("Benefícios:");
                System.out.println(((PlanoBasico) pano).listarBeneficios());
            }
                }else if (newPlano.equals("2")) {
                    PlanoEnterprise plano = new PlanoEnterprise();

                    
                    plano.setNome(nomeUsuario);
                    plano.setPrecoMensal(precoBasico);

                    System.out.println("""
                            Escolha o método de pagamento:
                            1 - Pix
                            2 - Débito (á vista)
                            3 - Crédito
                            """);

                    int pagamento = scan.nextInt();
                    scan.nextLine();

                    if (pagamento == 1) {
                        plano.setMetodoPagamento("PiX");
                    } else if (pagamento == 2) {
                        plano.setMetodoPagamento("Débito");
                    } else {
                        plano.setMetodoPagamento("Crédito");
                    }

                    assinaturas.add(plano);


                    for (PlanoAssinatura pano : assinaturas) {
                System.out.println("----------------------------------------");
                System.out.println("Cliente: " + pano.getNome());
                System.out.println("Tipo de pano: " + pano.getClass().getSimpleName()); // Mostra o nome da classe (Basico, Premium...)
                System.out.printf("Preço Mensal: R$ %.2f\n", pano.getPrecoMensal());
                System.out.println("Método de Pagamento: " + pano.getMetodoPagamento());
                
                // Usando polimorfismo para listar os benefícios específicos de cada pano
                System.out.println("Benefícios:");
                System.out.println(((PlanoPremium) pano).listarBeneficios());
            }
                }else if (newPlano.equals("3")) {
                    PlanoEnterprise plano = new PlanoEnterprise();

                    
                    plano.setNome(nomeUsuario);
                    plano.setPrecoMensal(precoBasico);

                    System.out.println("""
                            Escolha o método de pagamento:
                            1 - Pix
                            2 - Débito (á vista)
                            3 - Crédito
                            """);

                    int pagamento = scan.nextInt();
                    scan.nextLine();

                    if (pagamento == 1) {
                        plano.setMetodoPagamento("PiX");
                    } else if (pagamento == 2) {
                        plano.setMetodoPagamento("Débito");
                    } else {
                        plano.setMetodoPagamento("Crédito");
                    }

                    assinaturas.add(plano);

                    for (PlanoAssinatura pano : assinaturas) {
                System.out.println("----------------------------------------");
                System.out.println("Cliente: " + pano.getNome());
                System.out.println("Tipo de pano: " + pano.getClass().getSimpleName()); // Mostra o nome da classe (Basico, Premium...)
                System.out.printf("Preço Mensal: R$ %.2f\n", pano.getPrecoMensal());
                System.out.println("Método de Pagamento: " + pano.getMetodoPagamento());
                
                // Usando polimorfismo para listar os benefícios específicos de cada pano
                System.out.println("Benefícios:");
                System.out.println(((PlanoEnterprise) pano).listarBeneficios());
            }
                }

                tenteNovamente = false;
            } else if (gerenciamento.equals("2")) {
                System.out.println("teste 2");
                tenteNovamente = false;
            } else {
                System.out.println("Caracter inválido, tente novamente");
                tenteNovamente = true;
            }

        } while (tenteNovamente);
    }
}
