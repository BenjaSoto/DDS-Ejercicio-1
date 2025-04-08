package org.example;
import java.util.HashSet;
import java.util.Set;

public class Alumno {

    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas = new HashSet<>();



    public boolean aproboMateria(Materia materia){
        return this.materiasAprobadas.contains(materia);
    }
    public void addMateriaAprobada(Materia materia){
        this.materiasAprobadas.add(materia);
    }


    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Set<Materia> materias){
        this.materiasAprobadas = materias;
    }


}
