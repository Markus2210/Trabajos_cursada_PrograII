/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloparcial;

/**
 *
 * @author marco
 */
public class Cargueros extends Nave implements Explorable {
    private int capacidadCarga;

    public Cargueros(String nombre, int capacidadTripulacion, int anioLanzamiento, int carga) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
         if (carga < 100) carga = 100;
        else if (carga > 500) carga = 500;
        this.capacidadCarga = carga;
    }
    
    @ Override 
    public void mostrarNaves(){
        System.out.println("Carguero - " + getNombre() + ", Tripulación: " + getCapacidadTripulacion() + ", Año: " + getAnioLanzamiento() + ", Carga: " + capacidadCarga + " Tn");
    }
    
 @Override
    public void explorar(){
        System.out.println("Inicicando Exploracion");
    }

    
}
