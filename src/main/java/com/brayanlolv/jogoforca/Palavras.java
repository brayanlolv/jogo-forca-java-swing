/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brayanlolv.jogoforca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.io.*;

public class Palavras {

    private List<String> wordsList ;
    
    public   Palavras(){
               try {
            //System.out.print(Paths.get("palavras.txt"));
            
            //worked
           // File file = new File("C:\\Users\\braya\\Documents\\NetBeansProjects\\jogoforca\\src\\main\\java\\com\\brayanlolv\\jogoforca\\palavras.txt");
            File file = new File("src\\main\\java\\com\\brayanlolv\\jogoforca\\palavras.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Stream<String> words =   br.lines();
            this.wordsList =  words.toList();
              
           
           }catch(IOException e){
       
                      e.printStackTrace();
            
             }
               
    }

    public  String getPalavra() {
        
  
        int choicedIndex = (int)(Math.random() * this.wordsList.size());

        return this.wordsList.get(choicedIndex);

    }

    public String getPalavra(int i) {
        
        return this.wordsList.get(i);
    }

}
