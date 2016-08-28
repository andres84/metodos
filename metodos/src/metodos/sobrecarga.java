package metodos;

public class sobrecarga {

    
    
    public void saludo(String nombre){
        
        System.out.println("Hola " + nombre);
        
    }
    
    public String saludo(String comentario1, int edad, String comentario2){
        
        return comentario1 + edad + comentario2;
        
    }
    
    public static void main(String... andres){
        
        sobrecarga s = new sobrecarga();
        
        s.saludo("Andres");
        System.out.println(s.saludo("Tienes ", 32, " años, estas viejo!!!"));
        
    }
    

}
