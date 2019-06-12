/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examrecets;
import javax.swing.JOptionPane;
/**
 *
 * @author Madai Umpiérrez Marrero
 */
public class EXAMRECETS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0; String op="";

        op=JOptionPane.showInputDialog("Seleciona una operacion: \n"
            +"1 para ÁreaCuadrado\n"
            +"2 para Árearectangulo\n"
            +"3 para Áreacirculo\n"
            +"4 para ÁreaTriangulo\n");
        opcion=Integer.parseInt(op);
        switch(opcion){
                case 1: AreadelCuadrado(); break;
                case 2: AreaDelRectangulo(); break;
                case 3: ÁreadelCirculo(); break;
                case 4: ÁreaDelTriangulo(); break;
                default: JOptionPane.showMessageDialog(null,"Elige una opcion valida");
        }   
        }
 private static void AreadelCuadrado() {
        double alturaCuadrado;
        double areaCuadrado;
        alturaCuadrado=Integer.parseInt(JOptionPane.showInputDialog(null,"Altura del cuadrado: "));
        areaCuadrado =alturaCuadrado*2;
        
       JOptionPane.showMessageDialog(null,"Area cuadrado = "+areaCuadrado);
   }
 
  private static void AreaDelRectangulo() {
        double baseRectangulo;
        double alturaRectangulo;
        double areaRectangulo;
        baseRectangulo=Integer.parseInt(JOptionPane.showInputDialog(null,"Base del Rectangulo: "));
        alturaRectangulo=Integer.parseInt(JOptionPane.showInputDialog(null,"Altura del Rectangulo: "));
        areaRectangulo =alturaRectangulo*baseRectangulo;
        
       JOptionPane.showMessageDialog(null,"Área Rectangulo = "+areaRectangulo);
   }
  
    private static void ÁreadelCirculo() {
        double radioCirculo;
        double Pi=3.14;
        double areaCirculo;
        radioCirculo=Integer.parseInt(JOptionPane.showInputDialog(null,"Radio del circulo: "));
        areaCirculo =Pi *(radioCirculo*2);
        
       JOptionPane.showMessageDialog(null,"Área Circulo = "+areaCirculo);
   }
    
    private static void ÁreaDelTriangulo() {
        double baseTriangulo;
        double alturaTriangulo=0;
        double areaTriangulo;
        baseTriangulo=Integer.parseInt(JOptionPane.showInputDialog(null,"Base Triangulo: "));
        alturaTriangulo=Integer.parseInt(JOptionPane.showInputDialog(null,"Altura Triangulo: "));
        areaTriangulo =(baseTriangulo*alturaTriangulo)/2;

       JOptionPane.showMessageDialog(null,"Área Triángulo = "+areaTriangulo);
   }  
    }