
package metodosGetySet;


public class app {


    public static void main(String... andres){
        
        Celular celular = new Celular();
        celular.setNombre("iPhone");
        celular.setColor("Dorado");
        celular.setSerie("1234");
        
        System.out.println(celular.getNombre() + " " + celular.getColor() + " " + celular.getSerie());
        
    }
    
    
}
