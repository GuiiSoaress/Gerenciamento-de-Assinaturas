package entity;

public class PlanoAssinatura {
    //attributes
    private String nome;
    private Double precoMensal;
    private String metodoPagamento;

    //constructors
    public PlanoAssinatura(String nome, String metodoPagamento, Double precoMensal) {
        this.nome = nome;
        this.precoMensal = precoMensal;
        this.metodoPagamento = metodoPagamento;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPrecoMensal() {
        return precoMensal;
    }
    public void setPrecoMensal(Double precoMensal) {
        this.precoMensal = precoMensal;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String listarBeneficios() {
       return "";
    }

    //methods
    public double calcularPrecoAnual(){
        if(metodoPagamento.equals("pix") || metodoPagamento.equals("debito")){
            return (this.precoMensal * 12) * 0.9;
        }
        return this.precoMensal * 12;
    }
    
}
