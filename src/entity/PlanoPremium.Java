package entity;

public class PlanoPremium extends PlanoBasico {
    // attributes
    private Boolean suportePrioritario;
    private Boolean acessoOffline;

    // constructors
    public PlanoPremium(String nome, String metodoPagamento) {
        super(nome, metodoPagamento); 
        this.suportePrioritario = true;
        this.acessoOffline = true;
    }

    // getters and setters
    public Boolean getSuportePrioritario() {
        return suportePrioritario;
    }

    public void setSuportePrioritario(Boolean suportePrioritario) {
        this.suportePrioritario = suportePrioritario;
    }

    public Boolean getAcessoOffline() {
        return acessoOffline;
    }

    public void setAcessoOffline(Boolean acessoOffline) {
        this.acessoOffline = acessoOffline;
    }

    // methods
    @Override
    public String listarBeneficios() {
        return super.listarBeneficios() + "\n" +
               "- Suporte prioritário: " + (this.suportePrioritario ? "Disponível" : "Não disponível") + "\n" +
               "- Acesso offline: " + (this.acessoOffline ? "Disponível" : "Não disponível");
    }
}
