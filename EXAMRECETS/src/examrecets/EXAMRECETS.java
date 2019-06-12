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
            +"1 para Suma\n"
            +"2 para Resta\n"
            +"3 para Multiplicacion\n"
            +"4 para Division\n");
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
        JOptionPane.showMessageDialog(null,"Área Cuadrado");
        areaRectangulo =alturaRectangulo*baseRectangulo;

       JOptionPane.showMessageDialog(null,"Área rectángulo = "+areaRectangulo);
   }
    private static void Áreacirculo() {
        double radioCirculo=0;
        double Pi=3.14;
        double areaCirculo;
        JOptionPane.showMessageDialog(null,"Área Cuadrado");
        areaCirculo =Pi *(radioCirculo*2);

       JOptionPane.showMessageDialog(null,"Área rectángulo = "+areaCirculo);
   }
    private static void ÁreaTriangulo() {
        double radioCirculo=0;
        double Pi=3.14;
        double areaCirculo;
        JOptionPane.showMessageDialog(null,"Área Cuadrado");
        areaCirculo =Pi *(radioCirculo*2);

       JOptionPane.showMessageDialog(null,"Área rectángulo = "+areaCirculo);
   }
    
    
    
        int baseTriangulo=0;
        int alturaTriangulo=0;
        int areaTriangulo=((baseTriangulo*alturaTriangulo)/2);
        System.out.println(areaCuadrado);
        System.out.println(areaRectangulo);
        System.out.println(areaCirculo);
        System.out.println(areaTriangulo);  
    }
        // TODO code application logic here
        // Todo en una sola clase
        /* Resultados calculadoos
        Cálculo del Área Cuadrado
        Cálculo del¨Área rectangulo
        Cálculo del áreacirculo
        Cálculo del Área del Triangulo
        */