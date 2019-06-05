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
public class Turn extends TurtleStatement {
    private double degrees;
    public Turn(double degrees) {
        this.degrees = degrees;
    }
    public double getDegrees() {
        return degrees; 
    }
    @Override
    public void run(Interpreter interpreter) {
        interpreter.runTurn(this);
    }
}

