package com.example.calculateur;

public class Calculator
{
  private int getInt(String s) {
    int resultat = -1;
    try {
      resultat = Integer.parseInt(s);
    }
    catch (NumberFormatException e) {
      resultat = -1;
    }
    finally {
      return resultat;
    }
  }
  public int somme(String s1, String s2)
  {
    int i1 = getInt(s1);
    int i2 = getInt(s2);
    int resultat = i1 + i2;
    return resultat;
  }
  public int multiplication(String m1, String m2)
  {
    int i1 = getInt(m1);
    int i2 = getInt(m2);
    int resultat = i1 * i2;
    return resultat;
  }
}
