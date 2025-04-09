/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Medico {
    private String Cod_med;
    private String Espec_med;
    private int anios_Esp;
    //Atributos de Clase relacionado
    private Especialidad algunaEspecialidad;
    private Paciente algunPaciente;

    public Medico(){    
    }
    
    public Medico(String Cod_med, String Espec_med, int anios_Esp) {
        this.Cod_med = Cod_med;
        this.Espec_med = Espec_med;
        this.anios_Esp = anios_Esp;
    }

    public atender (Paciente algunPaciente) {
        this.algunPaciente = algunPaciente;
    }
    
    public atender (String fecha, Especialidad esp){
        this.Espec_med = esp;
        
    }
    

    
    
}
   //Fin Proceso
