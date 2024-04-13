
public class Veiculo {
    public String marca;
    public String modelo;
    private double valor;
    private  int ano;
    
    
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
    public double calcularDesconto(){
        
        if(this.ano <= 2 ){
          double desconto = this.valor*10/100;
            double descontoAplicado = this.valor - desconto;
            return descontoAplicado;
        }else{
            if(this.ano > 2 && this.ano <= 10){
            double desconto = this.valor*20/100;
            double descontoAplicado = this.valor - desconto;
            return descontoAplicado;
            }else{
            double desconto = this.valor*30/100;
            double descontoAplicado = this.valor - desconto;
            return descontoAplicado;
            }
        }
    }
}
