/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Especialidad {
    private String genero;
    private float remuneracion;
    private String categoria;

    //Metodo de clase
    public Especialidad() {
        this.genero = "";
        this.categoria = "";
        this.remuneracion = 0;
    
    };
    
    //Getters y Setters
    public String getGenero(){
        return genero;
    }
    
    public float getRemuneracion() {
        return remuneracion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setRemuneracion(float remuneracion) {
        this.remuneracion = remuneracion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        // Fin de clase
    
}
