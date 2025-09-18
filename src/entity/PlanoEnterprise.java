package entity;
import java.util.ArrayList;

public class PlanoEnterprise {
// Atributos privados (encapsulamento)
    private boolean suporte24h; 
    private boolean personalizacao;

    // Construtor padrão
    public PlanoEnterprise() {
        this.suporte24h = false;
        this.personalizacao = false;
    }

    // Construtor com parâmetros
    public PlanoEnterprise(boolean suporte24h, boolean personalizacao) {
        this.suporte24h = suporte24h;
        this.personalizacao = personalizacao;
    }

    // Getters e Setters
    public boolean isSuporte24h() {
        return suporte24h;
    }

    public void setSuporte24h(boolean suporte24h) {
        this.suporte24h = suporte24h;
    }

    public boolean isPersonalizacao() {
        return personalizacao;
    }

    public void setPersonalizacao(boolean personalizacao) {
        this.personalizacao = personalizacao;
    }

    // Método sobrescrito 
    public String listarBeneficios() {
        ArrayList<String> beneficios = new ArrayList<>();

        beneficios.add("Acesso ilimitado à plataforma");
        if (suporte24h) {
            beneficios.add("Suporte técnico 24h");
        }
        if (personalizacao) {
            beneficios.add("Personalização avançada de relatórios");
        }

        // Junta os benefícios em uma String formatada
        return String.join(", ", beneficios);
    }

    // Método main para teste rápido
    public static void main(String[] args) {
        PlanoEnterprise plano = new PlanoEnterprise(true, true);

        System.out.println("Suporte 24h: " + plano.isSuporte24h());
        System.out.println("Personalização: " + plano.isPersonalizacao());
        System.out.println("Benefícios: " + plano.listarBeneficios());
    }
}

