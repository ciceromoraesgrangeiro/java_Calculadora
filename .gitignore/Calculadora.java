package calculadora;
public class Calculadora{
    
    public void somaDoisNumeros(){
      System.out.println(5+5);
    }
    
    public void subraiDoisNumeros(){
      System.out.println(5-5);
    }
    
    public void multiplicaDoisNumeros(double num1, int num2){
      System.out.println(num1*num2);
    }
    
    public void imprimeDoisNumerosDivididos(double num1, double num2){
    // System.out.println(num1/num2);
        if(num2 !=0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Nao e possivel dividir por 0");
    }
    
}
