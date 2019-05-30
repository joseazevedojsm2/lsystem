/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsystem2;

/**
 *
 * @author JSM
 */
public class DragonCurve implements LSystem{
    
    private String startWord;
    private Character symbol;
    private String word;
    
    private Character symbol2;
    private String word2;
   
   
     @Override
    public void setStart(String start) {        
         this.startWord = start;    
    }
    
     @Override
    public void addRule(Character symbol, String word) {
        
        if (symbol=='X'){
         } else {
            this.symbol = symbol;
            this.word = word;
        }   
        
         if (symbol=='Y'){
            this.symbol2 = symbol;
            this.word2 = word;
         } 
        
    }
     
    
     @Override
    public String iter(int n) {
        
        for (int i=0;i<n;i++){
            StringBuilder builder = new StringBuilder();
            for (char c : startWord.toCharArray()) {
                if (c == symbol) {
                    builder.append(word);
                } else {
                    builder.append(c);
                }
            }
           this.startWord = builder.toString();
        }
        
        for (int j=0;j<n;j++){
            StringBuilder builder = new StringBuilder();   
           for (char h : startWord.toCharArray()) {
                if (h == symbol2) {
                    builder.append(word2);
                } else {
                    builder.append(h);
                }
            }
           this.startWord = builder.toString();
       }
        return this.startWord;
    }
    
}
