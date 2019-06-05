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
public class Forward extends TurtleStatement {
    double distance;
    public Forward(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance; 
    }
    @Override
    public void run(Interpreter interpreter) {
        interpreter.runForward(this);
    }
}

