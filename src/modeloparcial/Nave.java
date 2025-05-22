/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloparcial;


import java.util.Objects;

/**
 *
 * @author marco
 */
public abstract class Nave implements Comparable<Nave> {


    private String nombre;
    private int capacidadTripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public int getCapacidadTripulacion() {
        return capacidadTripulacion;
    }

    public abstract void mostrarNaves();



    
    
    @Override 
    public int compareTo(Nave otro){
        return Integer.compare(getAnioLanzamiento(), otro.getAnioLanzamiento());
    }
  

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Nave other = (Nave) obj;

        return getNombre().equals(other.getNombre())
                && getAnioLanzamiento() == other.getAnioLanzamiento();
    }

}
