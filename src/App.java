import java.util.ArrayList;
import java.util.Scanner;

import entity.PlanoAssinatura;
import entity.PlanoBasico;
import entity.PlanoEnterprise;
import entity.PlanoPremium;

public class App {
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<PlanoAssinatura> planos = new ArrayList<>();
    private static Double precoB = 50.0;
    private static Double precoP = 100.0;
    private static Double precoE = 150.0;

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("""
                    -------------------------- Gerenciamento de Assinaturas ---------------------------
                    1 - Novos planos
                    2 - Meus Planos
                    -----------------------------------------------------------------------------------
                    """);
            String opcao = scan.next();
            scan.nextLine();

            if (opcao.equals("1")) {
                instanciarPlano();
            }else if (opcao.equals("2")) {
                listarPlanos();
            }else{
                System.out.println("Opção Invalida! Tente novamente!");
                continue;
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


                if(newPlano.equals("1")){ PlanoBasico plano = new PlanoBasico(nomeUsuario, pag, precoB); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                if(newPlano.equals("2")){ PlanoPremium plano = new PlanoPremium(nomeUsuario, pag, precoP); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                if(newPlano.equals("3")){ PlanoEnterprise plano = new PlanoEnterprise(nomeUsuario, pag, precoE); planos.add(plano); System.out.println("Plano Criado Com sucesso!");}
                break;
                
            }else{ System.out.println("Caracter Invalido! Tente Novamente");}

        }

    }

   public static void listarPlanos() {

    if (planos.isEmpty()) {
        System.out.println("Você ainda não possui nenhum plano cadastrado!");
        return;
    }

    while (true) {
        System.out.println("=========================================");
        System.out.println("           SEUS PLANOS CADASTRADOS       ");
        System.out.println("=========================================");

        for (int i = 0; i < planos.size(); i++) {
            PlanoAssinatura plano = planos.get(i);
            System.out.println((i + 1) + " - Cliente: " + plano.getNome() +
                    " | Tipo de Plano: " + plano.getClass().getSimpleName());
        }
        System.out.println("0 - Voltar");
        System.out.println("-----------------------------------------");
        System.out.print("Selecione um plano para gerenciar: ");

        String opcao = scan.next();
        scan.nextLine();

        if (opcao.equals("0")) {
            break;
        }

        if (!opcao.matches("\\d+")) {
            System.out.println("Opção inválida! Tente novamente.");
            continue;
        }

        int indicePlano = Integer.parseInt(opcao) - 1;

        if (indicePlano < 0 || indicePlano >= planos.size()) {
            System.out.println("Opção inválida! Tente novamente.");
            continue;
        }

        PlanoAssinatura planoSelecionado = planos.get(indicePlano);

        while (true) {
            System.out.println("=========================================");
            System.out.println("      GERENCIAR PLANO DE " + planoSelecionado.getNome());
            System.out.println("=========================================");
            System.out.println("1 - Upgrade de Plano");
            System.out.println("2 - Downgrade de Plano");
            System.out.println("3 - Listar Benefícios");
            System.out.println("4 - Editar Nome");
            System.out.println("5 - Editar Forma de Pagamento");
            System.out.println("6 - Preço Anual");
            System.out.println("0 - Voltar");
            System.out.println("-----------------------------------------");
            System.out.print("Escolha uma opção: ");

            String escolha = scan.next();
            scan.nextLine();

            if (escolha.equals("0")) {
                break;
            } else if (escolha.equals("1")) {
                if (planoSelecionado instanceof PlanoEnterprise) {
                    System.out.println("Este plano já é Enterprise. Não é possível fazer upgrade.");
                }
                else if (planoSelecionado instanceof PlanoPremium) {
                    PlanoEnterprise plano = new PlanoEnterprise(planoSelecionado.getNome(), planoSelecionado.getMetodoPagamento(), precoE);
                    System.out.println("Upgrade realizado: Premium => Enterprise");
                    if (plano != null) {
                    planos.remove(indicePlano);
                    planos.add(indicePlano, plano);
                    planoSelecionado = plano;
                    }
                }
                else if (planoSelecionado instanceof PlanoBasico) {
                    PlanoPremium plano = new PlanoPremium(planoSelecionado.getNome(), planoSelecionado.getMetodoPagamento(), precoP);
                    System.out.println("Upgrade realizado: Básico => Premium");
                    if (plano != null) {
                    planos.remove(indicePlano);
                    planos.add(indicePlano, plano);
                    planoSelecionado = plano;
                    }
                } 
            }
        

            else if (escolha.equals("2")) {

                if (planoSelecionado instanceof PlanoEnterprise) {
                    PlanoPremium plano = new PlanoPremium(planoSelecionado.getNome(), planoSelecionado.getMetodoPagamento(), precoP);
                    System.out.println("Downgrade realizado: Enterprise => Premium");
                    if (plano != null) {
                    planos.remove(indicePlano);
                    planos.add(indicePlano, plano);
                    planoSelecionado = plano;
                }
                } else if (planoSelecionado instanceof PlanoPremium) {
                    PlanoBasico plano = new PlanoBasico(planoSelecionado.getNome(), planoSelecionado.getMetodoPagamento(), precoB);
                    System.out.println("Downgrade realizado: Premium => Básico");
                    if (plano != null) {
                    planos.remove(indicePlano);
                    planos.add(indicePlano, plano);
                    planoSelecionado = plano;
                }
                } else if (planoSelecionado instanceof PlanoBasico) {
                    System.out.println("Este plano já é Básico. Não é possível fazer downgrade.");
                }
            }
            else if (escolha.equals("3")) {
                System.out.println("----------------------------------------");
                System.out.println("Cliente: " + planoSelecionado.getNome());
                System.out.println("Tipo de pano: " + planoSelecionado.getClass().getSimpleName()); 
                System.out.printf("Preço Mensal: R$ %.2f\n", planoSelecionado.getPrecoMensal());
                System.out.println("Método de Pagamento: " + planoSelecionado.getMetodoPagamento());
                System.out.println("Benefícios:");
                System.out.println(planoSelecionado.listarBeneficios());
        
            } else if (escolha.equals("4")) {
                System.out.print("Digite o novo nome: ");
                String novoNome = scan.nextLine();
                planoSelecionado.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso!");
                
            } else if (escolha.equals("5")) {
                System.out.println("""
                        Escolha a nova forma de pagamento:
                        1 - Pix
                        2 - Débito
                        3 - Crédito
                        """);
                String novaPag = scan.next();
                scan.nextLine();

                if (novaPag.equals("1")) {
                    planoSelecionado.setMetodoPagamento("Pix");
                } else if (novaPag.equals("2")) {
                    planoSelecionado.setMetodoPagamento("Débito");
                } else if (novaPag.equals("3")) {
                    planoSelecionado.setMetodoPagamento("Crédito");
                } else {
                    System.out.println("Opção inválida! Tente novamente.");
                    continue;
                }
                System.out.println("Forma de pagamento atualizada com sucesso!");
            }else if (escolha.equals("6"))
            System.out.println("Preço anual do plano: "+ planoSelecionado.calcularPrecoAnual());
            
            
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}

        
        
        

        
}
