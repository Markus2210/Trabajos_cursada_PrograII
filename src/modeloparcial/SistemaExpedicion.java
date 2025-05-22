/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloparcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import modeloparcial.Nave;

/**
 *
 * @author marco
 */
public class SistemaExpedicion {

    List<Nave> naves = new ArrayList();

    public boolean naveExiste(Nave nave) {
        for (Nave n : naves) {
            if (n.getNombre().equals(nave.getNombre())
                    && n.getAnioLanzamiento() == nave.getAnioLanzamiento()) {
                return true;
            }
        }
        return false;
    }

    public void agregarNave(Nave nave) {
        if (naveExiste(nave)) {
            System.out.println(nave.getNombre() + " ya se encuentra registrada");
        } else {
            naves.add(nave);
            System.out.println(nave.getNombre() + " Nave registrada con exito");
        }
    }

    public void mostrar() {
        for (Nave n : naves) {
            n.mostrarNaves();
        }
    }

    public void iniciarExploracion() {
        System.out.println("Iniciando Exploracion");
        for (Nave nave : naves) {
            if (nave instanceof Explorable) {
                ((Explorable) nave).explorar();
            } else {
                System.out.println(nave.getNombre() + " no participa ya que es un crucero");
            }
        }
    }

    public void ordenarPorNombre() {
        naves.sort(Comparator.comparing(Nave::getNombre));
    }

    public void ordenarPorAnioLanzamiento() {
        Collections.sort(naves);
    }

    public void ordenarPorCapacidadTripulacion() {
        naves.sort((a, b) -> Integer.compare(b.getCapacidadTripulacion(), a.getCapacidadTripulacion()));
    }

}
