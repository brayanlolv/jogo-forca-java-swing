/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.brayanlolv.jogoforca;
import com.brayanlolv.jogoforca.templates.MainDisplay;
import java.lang.Math;
import com.brayanlolv.jogoforca.*;

public class Jogoforca {

    public static void main(String[] args) {
 
        Jogo jogo = new Jogo();
         
         //display
         System.out.println(jogo.targetWord);
         MainDisplay.main(args);
         
    
        // jogo.enterChar('o');
        // jogo.view();
      
    }
}
