/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Estacionaria extends Consola{
    
    private int controles, storage;
    private String tipocon;

    public Estacionaria() {
    }

    public Estacionaria(String id, String fab, String modelo, int aniosuso, double precio) {
        super(id, fab, modelo, aniosuso, precio);
    }

    public Estacionaria(int controles, int storage, String tipocon, String id, String fab, String modelo, int aniosuso, double precio) {
        super(id, fab, modelo, aniosuso, precio);
        this.controles = controles;
        this.storage = storage;
        this.tipocon = tipocon;
    }
    
    
    

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getTipocon() {
        return tipocon;
    }

    public void setTipocon(String tipocon) {
        this.tipocon = tipocon;
    }
    
    

    @Override
    public String toString() {
        return "Estacionaria{" + "controles=" + controles + ", storage=" + storage + ", tipocon=" + tipocon + '}';
    }
    
    
    
    
}
