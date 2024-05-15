package Java.TarefaCalculoMedia;
import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    recebendoNotas();
  }
  
  
  public static void recebendoNotas () {

    Scanner ler = new Scanner (System.in);
    byte nota1, nota2, nota3, nota4;

    System.out.printf("Digite a 1º nota: ");
    nota1 = ler.nextByte(); 
    System.out.printf("Digite a 2º nota: ");
    nota2 = ler.nextByte();
    System.out.printf("Digite a 3º nota: ");
    nota3 = ler.nextByte();
    System.out.printf("Digite a 4º nota: ");
    nota4 = ler.nextByte();
    ler.close();

    int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

    if(resultado <= 5){
      System.out.println("A média final é " + resultado + " e está reprovado");
    }else if (resultado > 5 && resultado <= 7){
      System.out.println("A média final é " + resultado + " e está em recuperação");
    }else{
      System.out.println("A média final é " + resultado + " e está aprovado");
    }
  }
}