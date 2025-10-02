package entity;

public class PlanoAssinatura {
    private String nome;
    private Double precoMensal;
    private String metodoPagamento;

    


    public PlanoAssinatura(String nome, String metodoPagamento) {
        this.nome = nome;
        this.precoMensal = 50.0;
        this.metodoPagamento = metodoPagamento;
    }

    public double calcularPrecoAnual(){
        if(metodoPagamento.equals("pix") || metodoPagamento.equals("debito")){
            return (this.precoMensal * 12) * 0.9;
        }
        return this.precoMensal * 12;
    }

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
    
}
