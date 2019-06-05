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
public class Compiler { 
    //vector<Character> charac 
    
    public void addRule(Character letter,TurtleStatement statement) { 
       
    
    }
    protected TurtleStatement compile(Character c) { 
        
        return null;
    
    }
    
  
    protected Vector<TurtleStatement> compile(String word) {
        
        Vector<TurtleStatement> result = new Vector<>();
        for (int i = 0; i < word.length(); i++) {
            result.add(compile(word.charAt(i)));
    }
    return result;
    }
}

