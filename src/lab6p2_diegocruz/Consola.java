/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegocruz;

import java.util.ArrayList;

/**
 *
 * @author dfcm9
 */
public class Consola {
    
    private String id, fab, modelo;
    private int aniosuso;
    private double precio;
    private ArrayList<Juego> juegos = new ArrayList();

    public Consola() {
    }
    
    

    public Consola(String id, String fab, String modelo, int aniosuso, double precio) {
        this.id = id;
        this.fab = fab;
        this.modelo = modelo;
        this.aniosuso = aniosuso;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFab() {
        return fab;
    }

    public void setFab(String fab) {
        this.fab = fab;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAniosuso() {
        return aniosuso;
    }

    public void setAniosuso(int aniosuso) {
        this.aniosuso = aniosuso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    @Override
    public String toString() {
        return "Consola{" + "id=" + id + ", fab=" + fab + ", modelo=" + modelo + ", aniosuso=" + aniosuso + ", precio=" + precio + ", juegos=" + juegos + '}';
    }
    
    
    
    
    
}
