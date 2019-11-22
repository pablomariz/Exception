
public class testaproduto {
    public static void main(String[] args){
        
        try{   
            
            Produto x1 = new Produto(2);
            
        }catch(ParametroInvalidoException ex){
            System.out.println(ex.getMessage());
        }
        
        
    }
}
