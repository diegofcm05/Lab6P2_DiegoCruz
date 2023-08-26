/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegocruz;

import java.util.Date;

/**
 *
 * @author dfcm9
 */
public class Juego {
    
    String nom, desc;
    Date fechalan;
    double precio;
    boolean nuevo, rentable, agregado;
    int cant;

    public Juego() {
    }
    
    

    public Juego(String nom, String desc, Date fechalan, double precio, boolean nuevo, boolean rentable, boolean agregado, int cant) {
        this.nom = nom;
        this.desc = desc;
        this.fechalan = fechalan;
        this.precio = precio;
        this.nuevo = nuevo;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cant = cant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getFechalan() {
        return fechalan;
    }

    public void setFechalan(Date fechalan) {
        this.fechalan = fechalan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Juego{" + "nom=" + nom + ", fechalan=" + fechalan + ", precio=" + precio + ", nuevo=" + nuevo + ", rentable=" + rentable + ", agregado=" + agregado + ", cant=" + cant + '}';
    }
    
    
    
    
}
