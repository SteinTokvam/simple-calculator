import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;

public class Kalkulator{
  private double tall1;
  private double tall2;
  private double res;
  private ArrayList<String> linje = new ArrayList<String>();

  public void skrivInnTall(){
    Scanner in = new Scanner(System.in);
    System.out.println("Skriv inn det forste tallet");
    tall1= Double.parseDouble(in.nextLine());
    System.out.println("Skriv inn det andre tallet");
    tall2= Double.parseDouble(in.nextLine());
  }

  public void lagre() throws Exception{
    File fil = new File ("fil.txt");
    PrintWriter printWriter = new PrintWriter (fil);
    for(String loop : linje){
      printWriter.println(loop);
    }
    printWriter.close();
  }

  public double addere(){
    skrivInnTall();
    res = tall1 + tall2;
    linje.add(tall1 + "+" + tall2 + "=" + res);
    return tall1 + tall2;
  }

  public double subtrahere(){
    skrivInnTall();
    res = tall1 - tall2;
    linje.add(tall1 + "-" + tall2 + "=" + res);
    return res;
  }

  public double multiplisere(){
    skrivInnTall();
    res = tall1 * tall2;
    linje.add(tall1 + "*" + tall2 + "=" + res);
    return res;
  }

  public double dividere(){
    skrivInnTall();
    res = tall1 / tall2;
    linje.add(tall1 + "/" + tall2 + "=" + res);
    return res;
  }
}
