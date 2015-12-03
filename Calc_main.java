import java.util.Scanner;

public class Calc_main{
  public static void main(String[] args) throws Exception{
    Kalkulator kalkulator = new Kalkulator();
    Scanner in = new Scanner(System.in);
    String kommando="";
    while(!kommando.equals("5")){
      System.out.println("\nVelkommen til denne kalkulatoren!");
      System.out.println("_________________________________");
      System.out.println("1. Adder tall");
      System.out.println("2. Subtraher tall");
      System.out.println("3. Multipliser tall");
      System.out.println("4. Divider tall");
      System.out.println("5. Avslutt");
      kommando = in.nextLine();
      switch (kommando){
        case "1":
        System.out.println(kalkulator.addere() + "\n");
          break;
        case "2":
        System.out.println(kalkulator.subtrahere() + "\n");
          break;
        case "3":
        System.out.println(kalkulator.multiplisere() + "\n");
          break;
        case "4":
        System.out.println(kalkulator.dividere() + "\n");
          break;
        case "5":
        kalkulator.lagre();
        System.out.println("\n programmet avsluttes");
          break;
        default: System.out.println("Ugyldig kommando \n");
          break;
        }
      }
    }

}
