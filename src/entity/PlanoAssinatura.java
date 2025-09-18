package entity;

public class PlanoAssinatura {
    private String nome;
    private Double precoMensal;
    private String metodoPagamento;


    public double calcularPrecoAnual(double preco){
        return preco * 12;
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
