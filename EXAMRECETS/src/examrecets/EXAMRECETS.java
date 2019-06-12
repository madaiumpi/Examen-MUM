/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examrecets;
import javax.swing.JOptionPane;
/**
 *
 * @author Madai
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
                case 1: ÁreaCuadrado(); break;
                case 2: Árearectangulo(); break;
                case 3: Áreacirculo(); break;
                case 4: ÁreaTriangulo(); break;
                default: JOptionPane.showMessageDialog(null,"Elige una opcion valida");
        }   
        }
 private static void ÁreaCuadrado() {
        int alturaCuadrado=0;
        double areaCuadrado;
        JOptionPane.showMessageDialog(null,"Área Cuadrado");
        areaCuadrado =alturaCuadrado*2;

       JOptionPane.showMessageDialog(null,"Area cuadrado = "+areaCuadrado);
   }
 
  private static void Árearectangulo() {
        double baseRectangulo=0;
        double alturaRectangulo=0;
        double areaRectangulo;
        JOptionPane.showMessageDialog(null,"Área Rectangulo");
        areaRectangulo =alturaRectangulo*baseRectangulo;

       JOptionPane.showMessageDialog(null,"Área Rectangulo = "+areaRectangulo);
   }
    private static void Áreacirculo() {
        double radioCirculo=0;
        double Pi=3.14;
        double areaCirculo;
        JOptionPane.showMessageDialog(null,"Área Circulo");
        areaCirculo =Pi *(radioCirculo*2);

       JOptionPane.showMessageDialog(null,"Área Circulo = "+areaCirculo);
   }
    private static void ÁreaTriangulo() {
        double baseTriangulo=0;
        double alturaTriangulo=0;
        double areaTriangulo;
        JOptionPane.showMessageDialog(null,"Área Triángulo");
        areaTriangulo =(baseTriangulo*alturaTriangulo)/2;

       JOptionPane.showMessageDialog(null,"Área Triángulo = "+areaTriangulo);
   }  
    }
        // TODO code application logic here
        // Todo en una sola clase
        /* Resultados calculadoos
        Cálculo del Área Cuadrado
        Cálculo del¨Área rectangulo
        Cálculo del áreacirculo
        Cálculo del Área del Triangulo
        */