/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author ninanadia
 */
public class dataimam {
    private String imam;
    private String muadzin;
    
    public dataimam(){
        imam = "Empty";
        muadzin = "Empty";
    }
    public dataimam(String imam){
        this.imam = imam;
        muadzin = "Empty";
    }
    public dataimam(String imam, String muadzin){
        this.imam = imam;
        this.muadzin = muadzin;
    }
    public String getImam(){
        return imam;
    }
    public void setImam(String imam){
        this.imam = imam;
    }
    public String getMuadzin(){
        return muadzin;
    }
    public void setMuadzin(){
        this.muadzin = muadzin;
    }
    @Override
    public String toString() {
        return imam + " " + muadzin;
    }
}
