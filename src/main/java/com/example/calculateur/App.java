import com.example.calculateur.*;

public class App
{
   public static void main( String[] args )
{
  if (args.length != 3) {
    System.out.println("Opération non supportée.");
    System.exit(1);
  }
  String operation = args[1];
  Calc calc = new Calc();
  int resultat = -1;
  if (operation.equalsIgnoreCase("+")) {
    resultat = calc.somme(args[0], args[2]);
  } else if (operation.equalsIgnoreCase("x")) {
    resultat = calc.multiplication(args[0], args[2]);
  }
  if (resulat >= 0) {
    System.out.println("Résultat: " + resultat);
  } else System.out.println("Opération non supportée");
}
}


