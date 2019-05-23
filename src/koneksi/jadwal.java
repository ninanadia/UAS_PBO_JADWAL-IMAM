/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
/**
 *
 * @author ninandia
 */
public class jadwal extends dataimam{
    private String hari;
    private String solat;
    private int waktu;
   
    
    public jadwal(String hari,String solat,int waktu, String imam, String muadzin){
    super(imam,muadzin);
    this.hari = hari;
    this.solat = solat;
    this.waktu = waktu;
    }
    
    public String getHari(){
        return hari;
    }
    public String getSolat(){
        return solat;
    }
    public int getWaktu(){
        return waktu;
    }
    
    @Override
    public String toString(){
        return getHari() + " " + getSolat() + " " + getWaktu() + " " + getImam() + " " + getMuadzin();
    }
    
    
}
