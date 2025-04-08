package org.example;

import java.util.Set;

public class Inscripcion {

    private Alumno alumno;
    private Set<Materia> materiasAInscribirse;


    public Alumno getAlumno() {
        return alumno;
    }

    public Set<Materia> getMateriasAInscribirse() {
        return this.materiasAInscribirse;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateriasAInscribirse(Set<Materia> materiasAInscribirse) {
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public boolean aprobada(){

        return materiasAInscribirse.stream().allMatch(
                materia -> materia.getMateriasCorrelativas().stream()
                        .allMatch(mat -> alumno.aproboMateria(mat))
        );

    }
    
    
}
