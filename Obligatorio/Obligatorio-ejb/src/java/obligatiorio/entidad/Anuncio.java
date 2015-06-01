/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatiorio.entidad;

import java.util.Date;

/**
 *
 * @author Jimena
 */
public class Anuncio {
    
    private Integer id;
    private String cargo;
    private String descripcion;
    private Date fechaDesde;
    private Date fechaHasta;
    private Integer hrsSemana;
    private Integer salarioNominal;
    private Integer cantPuestos;
    
    public Anuncio(){
        
    }
    
    public Anuncio(Integer id, String cargo, String descripcion, Date fechaDesde, Date fechaHasta, Integer hrsSemana, Integer salarioNominal, Integer cantPuestos){
        this.id = id;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.hrsSemana = hrsSemana;
        this.salarioNominal = salarioNominal;
        this.cantPuestos = cantPuestos;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaDesde
     */
    public Date getFechaDesde() {
        return fechaDesde;
    }

    /**
     * @param fechaDesde the fechaDesde to set
     */
    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    /**
     * @return the fechaHasta
     */
    public Date getFechaHasta() {
        return fechaHasta;
    }

    /**
     * @param fechaHasta the fechaHasta to set
     */
    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    /**
     * @return the hrsSemana
     */
    public Integer getHrsSemana() {
        return hrsSemana;
    }

    /**
     * @param hrsSemana the hrsSemana to set
     */
    public void setHrsSemana(Integer hrsSemana) {
        this.hrsSemana = hrsSemana;
    }

    /**
     * @return the salarioNominal
     */
    public Integer getSalarioNominal() {
        return salarioNominal;
    }

    /**
     * @param salarioNominal the salarioNominal to set
     */
    public void setSalarioNominal(Integer salarioNominal) {
        this.salarioNominal = salarioNominal;
    }

    /**
     * @return the cantPuestos
     */
    public Integer getCantPuestos() {
        return cantPuestos;
    }

    /**
     * @param cantPuestos the cantPuestos to set
     */
    public void setCantPuestos(Integer cantPuestos) {
        this.cantPuestos = cantPuestos;
    }
}
