/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteIII;

/**
 *
 * @author Ronald Jefrey Moreno Mora - 301 - Programacion II
 */
public class ClaseIII {
    //Variable de las clases.
    public int variable1;
    public String variable2;
    public double variable3;
    public float variable4;
    public double variable5;
    
    /**
     * Metodo publico de tipo entero.
     * @return variable entera.
     */
    public int metodo1(){
        return variable1;
       
    }
    /**
     * Metodo publico de tipo String.
     * @return variable tipo String.
     */
    public String metodo2(){
        return variable2;
    }
    /**
     * Metodo publico de tipo vacio.
     *
     */
    public void metodo3(){
        System.out.println("Este metodo no retorna valor.");
    }
    /**
     * Metodo publico de tipo flotante.
     * @return variable de tipo flotante.
     */
    public float metodo4(){
        return variable4;
    }
    
    /**
     * Metodo publico de tipo double.
     * @return variable de tipo double.
     */
    public double metodo5(){
        return variable5;
    }
    
    @Override
    public String toString(){
        return "Datos del objeto 3: int= "+variable1+" String= "+variable2+" double="+variable3+" float="+variable4+" double="+variable5;
    };
}
