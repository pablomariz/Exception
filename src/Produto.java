public class Produto {
    private double preco;

    public Produto(double p) throws ParametroInvalidoException{ //CONSTRUTOR
        this.setPreco(p);
    }
    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws ParametroInvalidoException {
        
        if (preco <2){
            
            throw new ParametroInvalidoException ("BURRO");
        }
        this.preco = preco;
    }
    
}
