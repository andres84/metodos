
package metodos;


public class Metodos {

    private String nombre;
    private int edad;
    
    
    public void saludar(){
        
        nombre = "andres";
        edad = 32;
        System.out.println("hola " + nombre);
        System.out.println("edad " + edad);
    }
    
    
    public static void main(String[] args) {

        Metodos m = new Metodos();
        m.saludar();
        
        
    }
    
}
