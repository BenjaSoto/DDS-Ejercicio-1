package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {


    @Test
    void obtenerNombre() {
        Materia materia_1 = new Materia("Disenio de Sistemas");
        assertEquals("Disenio de Sistemas", materia_1.getNombre());
    }


    @Test
    public void obtenerCorrelativa(){
        Materia materia_1 = new Materia("Disenio de Sistemas");
        Materia materia_2 = new Materia("Paradigmas de Programacion");
        Materia materia_3 = new Materia("Algoritmos y Estructuras de Datos");


        Set<Materia> materiasCorrelativas = new HashSet<>();
        materiasCorrelativas.add(materia_2);
        materiasCorrelativas.add(materia_3);

        materia_1.setMateriasCorrelativas(materiasCorrelativas);
        assertEquals(materiasCorrelativas, materia_1.getMateriasCorrelativas());

    }


}