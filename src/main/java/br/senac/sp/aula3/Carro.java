
package br.senac.sp.aula3;


public class Carro {
    private String fabricante;
    private String rodas[];
    private String cor;
    private String modelo;
    private int velocidadeAtual;
    private int gasolina;
    private int max_gasolina;
    
    public Carro(){
        
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String[] getRodas() {
        return rodas;
    }

    public void setRodas(String[] rodas) {
        this.rodas = rodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public String descreve(){
        
     
        if(this.modelo == null)
           return "Um carro";
        if(this.cor == null)
            return "Um " + this.modelo;
          return "Um " +this.modelo + " na cor " + this.cor;
       
         /*if(this.modelo == null && this.cor == null)
        return "Um carro";
       if(this.modelo!= null && this.cor !=null)
          return "Um " + this.modelo;
          return "Um " +this.modelo + " na cor " + this.cor;
        */
    }

    public int getGasolina() {
        Carro meuCarro = new Carro();
        gasolina = gasolina+20;
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }

    public int getMax_gasolina() {
        this.max_gasolina=40;  
        return max_gasolina;
    }

    public void setMax_gasolina(int max_gasolina) {  
        this.max_gasolina = max_gasolina;
    }
    
    public int abastecer(int gasolina){
        if(max_gasolina<40&&gasolina>=20)
          max_gasolina=max_gasolina+20;
          return 20;
       
    
    
    }
    
    
    
}
