/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author a21cristinaaf
 */
public class Persona {
    
    private int id;
    private boolean borrado;
    private String nombre;
    private String dni;
    private int edad;
    private float salario;
    

    public Persona() {
    }

    public Persona(int id, boolean borrado, String nombre, String dni, int edad, float salario) {
        this.id = id;
        this.borrado = borrado;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

 

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", borrado=" + borrado + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", salario=" + salario + '}';
    }

  
     
    
}
