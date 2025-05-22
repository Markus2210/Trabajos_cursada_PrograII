/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloparcial;

/**
 *
 * @author marco
 */
public class Exploracion extends Nave implements Explorable{
    private String tipoMision;

    public Exploracion(String tipoMision, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    public String getTipoMision() {
        return tipoMision;
    }

   
    
    @Override
    public void mostrarNaves(){
        System.out.println("Exploración - " + getNombre() + ", Tripulación: " + getCapacidadTripulacion() + ", Año: " + getAnioLanzamiento() + ", Misión: " + tipoMision);
    }
    
    @Override
    public void explorar(){
        System.out.println("Inicicando Exploracion");
    }

    @Override
    public String toString() {
        return "Exploracion{" + "tipoMision=" + tipoMision + '}';
    }
    
    
    
}
