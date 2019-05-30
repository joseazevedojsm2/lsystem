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
public interface LSystem {    
    void setStart(String start);
    void addRule(Character symbol, String word);
    String iter(int n);
}



