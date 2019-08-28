
package scholar;


public class Scholar {


    public static void main(String[] args) {
      Empleado empleado1=new Empleado();
      empleado1.nombre= " Juan";
      empleado1.apellido= " Rodriguez";
        System.out.println("el empeado se llama " + empleado1.nombre + empleado1.apellido);
        
      Estudiante estudiante1=new Estudiante();
      estudiante1.nombre= " Juan";
      estudiante1.apellido= " Rodriguez";
      estudiante1.genero= " Masculino";
        System.out.println("el estudiante se llama " + estudiante1.nombre + estudiante1.apellido + estudiante1.genero);   
       
    }
    
}
