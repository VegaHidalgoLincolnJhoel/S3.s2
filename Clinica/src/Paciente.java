/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Paciente {
    private char genero;
    private String nombre;
    private int dni;
    //Atributo de Clase relacionado
    private Medico algunMedico;
    
    //Implementacion de Metodos
    public Paciente(){
        this.dni = 0;
        this.genero = 0;
        this.nombre = "";
    }
    
    //Getters y Setters
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
}
//Fin Proceso
