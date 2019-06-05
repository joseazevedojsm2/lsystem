/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsystem2;

import java.util.List;
import galapagos.*;
        
/**
 *
 * @author JSM
 */
public interface Interpreter {
    void run(List<TurtleStatement> program);
    void runForward(Forward statement);
    void runTurn(Turn statement);
    void runPenUp(PenUp statement);
    void runPenDown(PenDown statement);

    

            
}

