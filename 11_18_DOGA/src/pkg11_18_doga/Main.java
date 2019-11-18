/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_18_doga;
import java.util.*;
import java.io.*;

/**
 *
 * @author csabavk
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> orszagnev = new ArrayList<>();
        ArrayList<String> allamforma = new ArrayList<>();
        ArrayList<Integer> terulet = new ArrayList<>();
        ArrayList<Integer> lakosok = new ArrayList<>();
        ArrayList<String> foldresz = new ArrayList<>();
        
        Scanner be = new Scanner(System.in);
        try {
            FileReader file = new FileReader("orszagok.txt");
            BufferedReader  br = new BufferedReader(file);
            String sor = null;
            while ((sor = br.readLine())!=null) {                
                String[]d = sor.split(";");
                orszagnev.add(d[0]);
                allamforma.add(d[1]);
                terulet.add(Integer.parseInt(d[2]));
                lakosok.add(Integer.parseInt(d[3]));
                foldresz.add(d[4]);
            }
            br.close();
        } catch (Exception hiba) {
            System.out.println("nincs meg a fájl");
        }
        
        for (int i = 0; i < foldresz.size(); i++) {
            System.out.println(orszagnev.get(i) + ", " + allamforma.get(i) + ", " + terulet.get(i) + ", " + lakosok.get(i) + ", " + foldresz.get(i));
        }
        
        System.out.println("");
        /*for (int i = 0; i < foldresz.size(); i++) {
            System.out.println(allamforma.get(i));
        }*/
        
        //?? C --
        System.out.println("FELADAT D");
        for (int i = 0; i < foldresz.size(); i++) {
            if (allamforma.get(i).equals("köztársaság")) {
                
                System.out.println(orszagnev.get(i) + " -- " + allamforma.get(i));
            }
        }
        
        //D
        System.out.println("    ");
        System.out.println("FELADAT E");
        int counter = 0;
        
        for (int i = 0; i < foldresz.size(); i++) {
            if (allamforma.get(i).equals("köztársaság"))  {
                counter++;
            }
        }
        System.out.println(counter + " Köztársaság van!");
        
        //E
        System.out.println("");
        System.out.println("FELADAT F");
        int term2 = 0;
        int laksz = 0;
        for (int i = 0; i < foldresz.size(); i++) {
            term2 += terulet.get(i).lakosok;
        }
        
        
        
            
            
        
    }
    
}
