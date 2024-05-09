/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utpl
 */
import java.util.Scanner;
public class testTerreno {
    public static void main(String[]args){
        /*Terreno t1 = new Terreno (40, 10, 2);
        Terreno t2 = new Terreno (21, 12, 2);
        Terreno t3 = new Terreno (10, 10, 2);
        /*t2.calcualarArea();
        t2.calcularCostof();//manera primitiva larga  
        t1.calcualarArea();
        t1.calcularCostof();
        System.out.println(t1);
        System.out.println(t2);
        t3.calcualarArea();
        t3.calcularCostof();
        System.out.println(t3);
        Terreno arrayTerreno[] = new Terreno[3];  // iniciamos nuestro arrglos  
        arrayTerreno[0]= t1;
        arrayTerreno[1]= t2;
        arrayTerreno[2]= t3;
        for (int i = 0; i <arrayTerreno.length; i++) {  // metodo no tan eficiente
            arrayTerreno[i].calcualarArea();
            arrayTerreno[i].calcularCostof();
            System.out.println(arrayTerreno[i]);

        }
        for (Terreno terreno : arrayTerreno ){    //2 nivel de optemisacion for mejorado 
            terreno.calcualarArea();
            terreno.calcularCostof();
            System.out.println(terreno);
        }*/
        /*Terreno arrayTerrenos[] = {new Terreno(10, 3, 2),new Terreno(20, 10, 1),new Terreno(40,10, 2)}; // metodo mas corto
        for (Terreno terreno : arrayTerrenos){
            terreno.calcualarArea();
            terreno.calcularCostof();
            System.out.println(terreno);
        }*/
        Scanner ac =new Scanner(System.in);
        Terreno arrayTerrenos[] = new Terreno[2];
        int i = 0;
        String opc;
        while (true){
            System.out.println("dame el alto, ancho y valor del metro cuadradro:");
            arrayTerrenos[i]= new Terreno(ac.nextDouble(), ac.nextDouble(), ac.nextDouble());
            arrayTerrenos[i].calcualarArea();
            arrayTerrenos[i].calcularCostof();
            System.out.println(arrayTerrenos[i]);
            i++;
            System.out.println("desea mas terrenos (S/N)");
            opc = ac.next();
            if (opc.equals("N")|| (i>=arrayTerrenos.length))break;
            
        }
        System.out.println("los terrenos ingresados y calculados son : ");
        for(Terreno terreno : arrayTerrenos){
            terreno.calcualarArea();
            terreno.calcularCostof();
            System.out.println(terreno);
        }
    }
    
}
