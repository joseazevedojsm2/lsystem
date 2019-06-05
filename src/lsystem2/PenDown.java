/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsystem2;
import galapagos.*;

/**
 *
 * @author JSM
 */
public class PenDown extends TurtleStatement {
    Turtle turtle = new Turtle();
    public PenDown() {
        this.turtle.penDown();
    }
    
    @Override
    public void run(Interpreter interpreter) {
        interpreter.runPenDown(this);
    }
}