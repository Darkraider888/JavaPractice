/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicinstrument;

/**
 *
 * @author USER
 */
public class Instrument {
    
    private int idSuffix;
    public Instrument(int idSuffix) {
        this.idSuffix = idSuffix;
        System.out.println("Instrument is created");
    }
    public void tune() {
        System.out.println("Tuning the instrument...");
    }
    public void showID() {
        System.out.println("Instrument ID suffix: " + idSuffix);
    }
}