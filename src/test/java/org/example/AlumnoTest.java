package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    public void obtenerNombre() {
        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        assertEquals("Elvis Soto", alumno.getNombre());
    }

    @Test
    public void obtenerMateriasAprobadas() {

        Materia materia = new Materia("AMI");
        Materia materia2 = new Materia("AMII");
        Set<Materia> materiasAprobadas = new HashSet<Materia>();
        materiasAprobadas.add(materia);
        materiasAprobadas.add(materia2);

        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        alumno.setMateriasAprobadas(materiasAprobadas);

        assertEquals("Elvis Soto", alumno.getNombre());
        assertEquals(materiasAprobadas, alumno.getMateriasAprobadas());
    }


    @Test
    public void aproboMateria() {

        Materia materia = new Materia("AMI");
        Materia materia2 = new Materia("AMII");
        Materia materia3 = new Materia("Algebra");
        Set<Materia> materiasAprobadas = new HashSet<Materia>();
        materiasAprobadas.add(materia);
        materiasAprobadas.add(materia2);

        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        alumno.setMateriasAprobadas(materiasAprobadas);
        assertTrue(alumno.aproboMateria(materia));

    }

    @Test
    public void desaproboMateria() {

        Materia materia = new Materia("AMI");
        Materia materia2 = new Materia("AMII");
        Materia materia3 = new Materia("Algebra");
        Set<Materia> materiasAprobadas = new HashSet<Materia>();
        materiasAprobadas.add(materia);
        materiasAprobadas.add(materia2);

        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        alumno.setMateriasAprobadas(materiasAprobadas);
        assertFalse(alumno.aproboMateria(materia3));
    }
}