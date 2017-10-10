package calculadora;
public class CalculadoraTest{
    public static void main(String[] args){
      Calculadora calc = new Calculadora();
      calc.somaDoisNumeros();
      calc.subtraiDoisNumeros();
      calc.multiplicaDoisNumeros(55.5,5);
      System.out.println("divisão de dois numeros");
      double result = calc.divideDoisNumeros(21,2);
      System.out.println(result);
      calc.imprimeDoisNumerosDivididos(20,2);
   }
}
