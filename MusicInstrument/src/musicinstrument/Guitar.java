/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicinstrument;

/**
 *
 * @author USER
 */
public class Guitar extends Instrument implements Playable {

    public Guitar(int idSuffix) {
        super(idSuffix);
    }

    @Override
    public void tune() {
        System.out.println("Tuning the guitar...");
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing...");
    }

    public void showType() {
        System.out.println("This is a string instrument.");
    }
}