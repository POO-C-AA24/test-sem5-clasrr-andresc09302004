/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utpl
 */
public class testTerreno {
    public static void main(String[]args){
        Terreno t1 = new Terreno (40, 10, 2);
        Terreno t2 = new Terreno (21, 12, 2);
        Terreno t3 = new Terreno (10, 10, 2);
        
        t2.calcualarArea();
        t2.calcularCostof();
        t1.calcualarArea();
        t1.calcularCostof();
        System.out.println(t1);
        System.out.println(t2);
        t3.calcualarArea();
        t3.calcularCostof();
        System.out.println(t3);
    }
    
}
