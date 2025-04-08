package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void obtenerAlumno(){

        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        assertEquals("Elvis Soto", inscripcion.getAlumno().getNombre());

    }

    @Test
    public void obtenerAlumnoDiferente(){

        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        assertNotEquals("Benjamin Soto", inscripcion.getAlumno().getNombre());

    }


    @Test
    public void obtenerMateriasAInscribirse() {
        Materia materia_1 = new Materia("Disenio de Sistemas");
        Set<Materia> materiasAInscribirse = new HashSet<>();
        materiasAInscribirse.add(materia_1);
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateriasAInscribirse(materiasAInscribirse);
        assertEquals(materiasAInscribirse, inscripcion.getMateriasAInscribirse());

    }

    @Test
    public void inscripcionAprobada() {

        Materia materia_1 = new Materia("Disenio de Sistemas");
        Set<Materia> materiasCorrelativas1 = new HashSet<>();
        Materia materia_1a = new Materia("Paradigmas de Programacion");
        Materia materia_1b= new Materia("Algoritmos y Estructuras de Datos");
        materiasCorrelativas1.add(materia_1a);
        materiasCorrelativas1.add(materia_1b);
        materia_1.setMateriasCorrelativas(materiasCorrelativas1);



        Materia materia_2 = new Materia("AMII");
        Set<Materia> materiasCorrelativas2 = new HashSet<>();
        Materia materia_2a = new Materia("AMI");
        Materia materia_2b= new Materia("Fisca I");
        materiasCorrelativas2.add(materia_2a);
        materiasCorrelativas2.add(materia_2b);
        materia_2.setMateriasCorrelativas(materiasCorrelativas2);



        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        alumno.addMateriaAprobada(materia_1a);
        alumno.addMateriaAprobada(materia_1b);
        alumno.addMateriaAprobada(materia_2a);
        alumno.addMateriaAprobada(materia_2b);


        Set<Materia> materiasAInscribirse = new HashSet<>();
        materiasAInscribirse.add(materia_1);
        materiasAInscribirse.add(materia_2);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateriasAInscribirse(materiasAInscribirse);
        inscripcion.setAlumno(alumno);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void inscripcionDesapadada() {

        Materia materia_1 = new Materia("Disenio de Sistemas");
        Set<Materia> materiasCorrelativas1 = new HashSet<>();
        Materia materia_1a = new Materia("Paradigmas de Programacion");
        Materia materia_1b= new Materia("Algoritmos y Estructuras de Datos");
        materiasCorrelativas1.add(materia_1a);
        materiasCorrelativas1.add(materia_1b);
        materia_1.setMateriasCorrelativas(materiasCorrelativas1);



        Materia materia_2 = new Materia("AMII");
        Set<Materia> materiasCorrelativas2 = new HashSet<>();
        Materia materia_2a = new Materia("AMI");
        Materia materia_2b= new Materia("Fisca I");
        materiasCorrelativas2.add(materia_2a);
        materiasCorrelativas2.add(materia_2b);
        materia_2.setMateriasCorrelativas(materiasCorrelativas2);



        Alumno alumno = new Alumno();
        alumno.setNombre("Elvis Soto");
        alumno.addMateriaAprobada(materia_2);
        alumno.addMateriaAprobada(materia_2a);
        alumno.addMateriaAprobada(materia_2b);


        Set<Materia> materiasAInscribirse = new HashSet<>();
        materiasAInscribirse.add(materia_1);


        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setMateriasAInscribirse(materiasAInscribirse);
        inscripcion.setAlumno(alumno);

        assertFalse(inscripcion.aprobada());


}
}