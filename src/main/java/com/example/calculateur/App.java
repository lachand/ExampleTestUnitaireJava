package com.example.calculateur;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
{
  if (args.length != 3) {
    System.out.println("Opération non supportée.");
    System.exit(1);
  }
  String operation = args[1];
  Calculator calc = new Calculator();
  int resultat = -1;
  if (operation.equalsIgnoreCase("+")) {
    resultat = calc.somme(args[0], args[2]);
  } else if (operation.equalsIgnoreCase("x")) {
    resultat = calc.multiplication(args[0], args[2]);
  }
    System.out.println("Résultat: " + resultat);

}
}
