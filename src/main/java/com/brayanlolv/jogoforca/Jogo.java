package com.brayanlolv.jogoforca;
import com.brayanlolv.jogoforca.Palavras;
import java.util.*;
import java.lang.StringBuilder;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author braya
 */
public class Jogo {
    
    public Palavras  palavras = new Palavras();
    
    public String targetWord;
    public ArrayList<Integer> rightChars; //letras de pista, as letras que a pessoa acertou
    public List<Character> targetWordChars ; // 
    public boolean victory = false;

    public int tries = 5;
    
   public  ArrayList<Character> enteredChars;
    
    public Jogo(){
        
        targetWord = palavras.getPalavra();
        targetWordChars = new ArrayList<>(targetWord.length());
        //converter targetWord para um array the Chars
        for (int i = 0;i < targetWord.length();i++){
            targetWordChars.add(targetWord.charAt(i));
        }
        
//targetWordChars = targetWord.chars();
        rightChars = new ArrayList<>(targetWord.length());
        enteredChars = new ArrayList(25);
    }
    public Jogo(int seed ){
       targetWord = palavras.getPalavra(seed);
       targetWordChars = new ArrayList<>(targetWord.length());
        for (int i = 0;i < targetWord.length();i++){
            targetWordChars.add(targetWord.charAt(i));
        }
       rightChars = new ArrayList<>(targetWord.length());
       enteredChars = new ArrayList(25);
    }
    
    
    public boolean tryWord(String word){
        if(word.equalsIgnoreCase(targetWord)){
            victory = true;
            return true;//vencou
        }
        return false;
    }
    //posso por para retornar um int
    //0 nao entrou a letra, 1 entrou a letra, 2 nao pode mais tentar entrar letra e tem que tentar a palavra
    public int enterChar (char letter){
        
        if(tries < 1){    //chamar funcao de tentar a palavra
            return 2;
        }
        if(enteredChars.contains(letter)){
            System.out.println("caractere ja tentado");
            return 0;
        }
        
        enteredChars.add(letter);
        
        if( targetWordChars.contains(letter)){
    
           for(int i = 0;i < targetWordChars.size();i++){
               if(targetWordChars.get(i)== letter){
                   //problema com os indexes
                   //rightChars.add(i,i);
               }
           }
    
        }else{
            tries--;
        }
        
        return 1;
    }
    
   
    public void view(){
        System.out.println("palavra alvo "+ targetWord);
        System.out.println("tentativas" + tries);
        System.out.println("letras Tentadas" + enteredChars);
        System.out.println("venceu" + victory);
    
 
    }
    

    
    public String getWord(){
      StringBuilder str = new StringBuilder();
        targetWordChars.forEach((n)->{
            if(enteredChars.contains(n)){
                str.append(n);
            }else{
                str.append("-");
            }
        });
      
      return str.toString();  
        
    }
        
    
}
