/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author valeriaz
 */
public class Curso {
   private int nrc;
   private Profesor profesor;
   
    public Curso (int nrc){
        this.nrc = nrc;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if(this.profesor == null){
           this.profesor = profesor;
        }
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
