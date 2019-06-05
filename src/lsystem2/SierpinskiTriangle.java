/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsystem2;

import java.util.Vector;

/**
 *
 * @author JSM
 */
public class SierpinskiTriangle {
    
    private String startWord;
    private  Vector<Character> symbol = new Vector<>();
    private Vector<String> word = new Vector<>();;
   
   
    public void setStart(String start) {        
         this.startWord = start;    
    }
    
    public void addRule(Character symbol, String word) {
        
        this.symbol.add(symbol);
        this.word.add(word); 
        
        
    }
     
    
    public String iter(int n) {
        for (int t=0;t<symbol.size();t++){

            for (int i=0;i<n;i++){

                StringBuilder builder = new StringBuilder();
                for (char c : startWord.toCharArray()) {
                    if (c == symbol.get(t)) {
                        builder.append(word.get(t));
                    } else {
                        builder.append(c);
                    }
                }
               this.startWord = builder.toString();
            }
        }
        return this.startWord;
    }
    
}
