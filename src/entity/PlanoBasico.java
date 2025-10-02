package entity;

public class PlanoBasico extends PlanoAssinatura{
    //attributes
    private Integer limiteUsuarios;
    private Integer armazenamento;

    //constructors
    public PlanoBasico(String nome, String metodoPagamento) {
        super(nome, metodoPagamento);
        this.limiteUsuarios = 3;
        this.armazenamento = 1;
    }

    //getters and setters
    public Integer getLimiteUsuarios() {
        return limiteUsuarios;
    }

    public void setLimiteUsuarios(Integer limiteUsuarios) {
        this.limiteUsuarios = limiteUsuarios;
    }

    public Integer getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(Integer armazenamento) {
        this.armazenamento = armazenamento;
    }
    

    //methods 
    public String listarBeneficios(){
        return "Beneficios plano Basico: \n" +
               "- Limite de usuarios: " + this.limiteUsuarios + "\n" +
               "- Armazenamento: " + this.armazenamento + " GB";
    }

}
