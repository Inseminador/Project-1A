import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Crie um algoritmo capaz de imprimir o tamanho do quadrado definido por quem utiliza; limite 10x10.
    int lado;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o valor do lado do quadrado: ");
    lado=entrada.nextInt();
    if(lado>0&&lado<=10){
    for(int i=lado; i>0; i--){
      for(int j=lado; j>0; j--){
      System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
    for(int i=lado; i>0; i--){
      for(int j=i; j>0; j--){
      System.out.print("* ");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
    for(int i=lado; i>0; i--){
      for(int j=((lado-i)+1); j>0; j--){
      System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
    else{
      System.out.println("Valor do lado inválido. Limite de 1 a 10.");
    }
}
}
