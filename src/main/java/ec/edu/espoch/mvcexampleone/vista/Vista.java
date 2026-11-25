
package ec.edu.espoch.mvcexampleone.vista;

import ec.edu.espoch.mvcexampleone.controlador.ControladorOperaciones;


public class Vista {
    ControladorOperaciones controlador = new ControladorOperaciones ();
    
    public String getNumOne(){
        
        return "a";
    }
    public String getNumTwo (){
        return " b";
    }
    public void mostrar (float respuesta){
        System.out.println("La respuesta es :" + respuesta);
    }
    
    public void mostrarError(){
        System.out.println("Error...");
    }
    public void enviar (){
        controlador.controlarOperaciones();
    }
}
