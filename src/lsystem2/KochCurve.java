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
public class KochCurve implements LSystem{

   
    private String startWord;
    private Character symbol;
    private String word;
    
    @Override
    public void setStart(String start) {        
         this.startWord = start;    
    }
    
    @Override
    public void addRule(Character symbol, String word) {
        
        this.symbol = symbol;
        this.word = word;
        
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
    
    @Override
    public String iter(int n) {
        for (int i=1;i<=n;i++){
            addRule(this.symbol,this.word);
        }
        return this.startWord;
    }
    
    
    
}
