/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicinstrument;

/**
 *0
 * @author USER
 */
import java.util.Scanner;

public class MusicInstrument {

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the last 3 digits of your student ID: ");
        int idSuffix = scanner.nextInt();
       
        Guitar guitar = new Guitar(idSuffix);
        
        guitar.tune();
        guitar.play();
        guitar.showType();
        guitar.showID();
  
        System.out.println();
        Instrument instrumentRef = guitar;  
        instrumentRef.tune();                
      
        System.out.println();
        Playable playableRef = guitar;       
        playableRef.play();                  
        scanner.close();
    }
}