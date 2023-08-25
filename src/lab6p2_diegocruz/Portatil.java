/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Portatil extends Consola {
    
    private String tam;
    private int bateria;
    private boolean estuche;

    public Portatil() {
        super();
    }
    
    

    public Portatil(String tam, int bateria, boolean estuche, String id, String fab, String modelo, int aniosuso, double precio) {
        super(id, fab, modelo, aniosuso, precio);
        this.tam = tam;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        return "Portatil{" + "tam=" + tam + ", bateria=" + bateria + ", estuche=" + estuche + '}';
    }
    
    
    
    

    
}
