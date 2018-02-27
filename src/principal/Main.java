/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Importacion de los paquetes y las clases.
 */
package principal;
import paqueteI.ClaseI;
import paqueteII.ClaseII;
import paqueteIII.ClaseIII;
/**
 *
 * @author Ronald Jefrey Moreno Mora - 301 - Programacion II
 */
public class Main {

    /**
     * metodo de la clase Main.
     */
    public static void main(String[] args) {
        //objetos de cada una de las clases.
       ClaseI objeto1 = new ClaseI();
       ClaseII objeto2 = new ClaseII();
       ClaseIII objeto3 = new ClaseIII();
       
       //Impresion de cada uno de los atributos de cada objeto de las clases correspondientes.
       System.out.println("Objeto 1 Atributo int: "+objeto1.variable1);
       System.out.println("Objeto 1 Atributo String: "+objeto1.variable2);
       System.out.println("Objeto 1 Atributo double: "+objeto1.variable3);
       System.out.println("Objeto 1 Atributo float: "+objeto1.variable4);
       System.out.println("Objeto 1 Atributo double: "+objeto1.variable5);
       System.out.println("Objeto 2 Atributo int: "+objeto2.variable1);
       System.out.println("Objeto 2 Atributo String: "+objeto2.variable2);
       System.out.println("Objeto 2 Atributo double: "+objeto2.variable3);
       System.out.println("Objeto 2 Atributo float: "+objeto2.variable4);
       System.out.println("Objeto 2 Atributo double: "+objeto2.variable5);
       System.out.println("Objeto 3 Atributo int: "+objeto3.variable1);
       System.out.println("Objeto 3 Atributo String: "+objeto3.variable2);
       System.out.println("Objeto 3 Atributo double: "+objeto3.variable3);
       System.out.println("Objeto 3 Atributo float: "+objeto3.variable4);
       System.out.println("Objeto 3 Atributo double: "+objeto3.variable5);
       
       //Cambio de dato en las variables de cada objeto de las clases.
       objeto1.variable1=20;
       objeto1.variable2="Veinte";
       objeto1.variable3=32.3;
       objeto1.variable4=70.8F;
       objeto1.variable5=20.7;
       objeto2.variable1=10;
       objeto2.variable2="Quince";
       objeto2.variable3=56.45;
       objeto2.variable4=29.4F;
       objeto2.variable5=334.4;
       objeto3.variable1=56;
       objeto3.variable2="Cincuenta y Cinco";
       objeto3.variable3=56.657;
       objeto3.variable4=23.456F;
       objeto3.variable5=62.74;
       
       //Llamado de cada uno de los metodos de los objetos de las clases.
       System.out.println("Retorno Metodo int Objeto 1: "+objeto1.metodo1());
       System.out.println("Retorno Metodo String Objeto 1: "+objeto1.metodo2());
       System.out.print("Retorno Metodo void Objeto 1: ");
       objeto1.metodo3();
       System.out.println("Retorno Metodo float Objeto 1: "+objeto1.metodo4());
       System.out.println("Retorno Metodo double Objeto 1: "+objeto1.metodo5());
       System.out.println("Retorno Metodo int Objeto 2: "+objeto2.metodo1());
       System.out.println("Retorno Metodo String Objeto 2: "+objeto2.metodo2());
       System.out.print("Retorno Metodo void Objeto 2: ");
       objeto2.metodo3();
       System.out.println("Retorno Metodo float Objeto 2: "+objeto2.metodo4());
       System.out.println("Retorno Metodo double Objeto 2: "+objeto2.metodo5());
       System.out.println("Retorno Metodo int Objeto 3: "+objeto3.metodo1());
       System.out.println("Retorno Metodo String Objeto 3: "+objeto3.metodo2());
       System.out.print("Retorno Metodo void Objeto 3: ");
       objeto3.metodo3();
       System.out.println("Retorno Metodo float Objeto 3: "+objeto3.metodo4());
       System.out.println("Retorno Metodo double Objeto 3: "+objeto3.metodo5());
       
       //Llamado del metodo toString de cada objeto de sus clases.
       System.out.println(objeto1.toString());
       System.out.println(objeto2.toString());
       System.out.println(objeto3.toString());
    }
    
}
