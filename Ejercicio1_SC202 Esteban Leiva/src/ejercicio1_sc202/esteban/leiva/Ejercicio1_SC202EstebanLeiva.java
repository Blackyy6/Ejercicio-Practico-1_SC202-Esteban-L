/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1_sc202.esteban.leiva;
import javax.swing.JOptionPane;
/**
 *
 * @author LABORATORIO 04
 */
public class Ejercicio1_SC202EstebanLeiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Ejercicio1");
    int empleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados"));
    
    double montobruto = 0;
    for (int i = 1; i <= empleados; i++){
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));
        double menossalario = reducirsalario(salario);        
        montobruto += monto(salario);
      }
     JOptionPane.showMessageDialog(null, "El salario que debe pagar cada persona es de" + montobruto);    
    }
    public static double reducirsalario(double salario){
    double seguro1 = salario * 0.0925;
    double seguro2 = salario * 0.0508;
    return salario - seguro1 - seguro2;
    }
    public static double monto(double menossalario){
    
        return menossalario * 0.1;
    }
}

