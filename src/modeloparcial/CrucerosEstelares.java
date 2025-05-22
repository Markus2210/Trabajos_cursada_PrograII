/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloparcial;

/**
 *
 * @author marco
 */
public class CrucerosEstelares extends Nave {
    private int cantidadPasajeros;

    public CrucerosEstelares(int cantidadPasajeros, String nombre, int capacidadTripulacion, int anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    @Override 
    public void mostrarNaves(){
        System.out.println("Crucero - " + getNombre() + ", Tripulación: " + getCapacidadTripulacion() + ", Año: " + getAnioLanzamiento() + ", Pasajeros: " + cantidadPasajeros); 
    }

    @Override
    public String toString() {
        return "CrucerosEstelares{" + "cantidadPasajeros=" + cantidadPasajeros + '}';
    }
     
}
