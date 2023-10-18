import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Construa um algoritmo capaz de imprimir a sequência decrescente a partir de um número informado. Limite-zero.
    int numero;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o número: ");
    numero=entrada.nextInt();
    if(numero>0){
      for(int i = numero; i>=0; i--){
        System.out.println(i);
    }
      }
    else{
      System.out.println("Número informado inválido");
    }
  }
}
