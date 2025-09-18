package entity;

public class PlanoEnterprise extends PlanoPremium {
    // Atributos privados (encapsulamento)
    private boolean suporte24h; 
    private boolean personalizacao;

    // Construtor padrão
    public PlanoEnterprise() {
        super();
        this.suporte24h = true;
        this.personalizacao = true;
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
    @Override
    public String listarBeneficios() {
        return super.listarBeneficios() + "\n" +
               "- Suporte 24h: " + (this.suporte24h ? "Disponível" : "Não disponível") + "\n" +
               "- Personalização: " + (this.personalizacao ? "Disponível" : "Não disponível");
    }
}

