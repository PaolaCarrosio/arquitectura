/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatiorio.entidad;

/**
 *
 * @author Jimena
 */
public class Postulante extends Usuario{
    
    private Integer edad;
    private char sexo;
    public enum estadoCivil{SOLTERO, CASADO, DIVORCIADO, VIUDO};
    
    public Postulante(){
        
    }
    
    public Postulante(Integer edad, char sexo, enum estadoCivil){
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the edad
     */
    public Integer getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
        
}
