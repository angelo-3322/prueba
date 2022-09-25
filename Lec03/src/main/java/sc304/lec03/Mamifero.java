
package sc304.lec03;

import examen_cliente_servidor.OperacionesBasicas;
import javax.swing.JOptionPane;


public class Mamifero implements Animal,OperacionesBasicas {

    private String continente;

    public Mamifero(String continente) {
        this.continente = continente;
    }
    
    public Mamifero() {
        this.continente = "";
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }
   
    
    @Override
    public void nombreEspecie(String nombre) {
        
        JOptionPane.showMessageDialog(null, "La especie del animal es:" + nombre);
        
    }

    @Override
    public void continente() {
        
        JOptionPane.showMessageDialog(null, "El nombre del continente es:" + this.continente);
        
    }
    
    public void pedir_datos (){
        
        this.continente = JOptionPane.showInputDialog(null, "Digite el nombre del continente");
    }

    @Override
    public void mostrar_datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
