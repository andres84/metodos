/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosInstanciaClase;

/**
 *
 * @author sara
 */
public class app {
    
    public static void main(String... andres){
        
        Persona per = new Persona();
        per.setNombre("andres");
        per.setEdad(32);
        //invocacion metodo de instancia
        per.mostrarDeInstancia();
        //invocacion metodo de clase
        Persona.mostrarDeClase();
        
    }
    
}
