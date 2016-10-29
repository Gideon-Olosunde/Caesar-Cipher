
/**
 * Write a description of class CaesarCihper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;
public class CaesarCihper
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList Alphabet = new ArrayList();
        Alphabet.add("A");
        Alphabet.add("B");
        Alphabet.add("C");
        Alphabet.add("D");
        Alphabet.add("E");
        Alphabet.add("F");
        Alphabet.add("G");
        Alphabet.add("H");
        Alphabet.add("I");
        Alphabet.add("J");
        Alphabet.add("K");
        Alphabet.add("L");
        Alphabet.add("M");
        Alphabet.add("N");
        Alphabet.add("O");
        Alphabet.add("P");
        Alphabet.add("Q");
        Alphabet.add("R");
        Alphabet.add("S");
        Alphabet.add("T");
        Alphabet.add("U");
        Alphabet.add("V");
        Alphabet.add("W");
        Alphabet.add("X");
        Alphabet.add("Y");
        Alphabet.add("Z");
        int count = 0;
        System.out.println("Enter a number of steps");
        int steps = input.nextInt();
        int add = steps;
        for(int i=steps;i<26;i++){
            System.out.println(Alphabet.get(count)+"-"+Alphabet.get(i));
            count++;
        }
        for(int i=0; i<steps;i++){
            System.out.println(Alphabet.get(count)+"-"+Alphabet.get(i));
            count++;
        }
    }
}
