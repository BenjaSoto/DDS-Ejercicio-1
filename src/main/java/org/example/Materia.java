package org.example;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas = new HashSet<>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre, Set<Materia> materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Set<Materia> getMateriasCorrelativas() {
        return this.materiasCorrelativas;
    }
    public void setMateriasCorrelativas(Set<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    
}
