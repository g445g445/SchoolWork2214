/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationundo;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author clatulip
 */
public class DrawingUndoStackSimulation {
    private Stack<DrawingOp> myOpStack;
    

    public DrawingUndoStackSimulation() {
        myOpStack = new Stack<>();
        runSimulation();
    }

    
    private DrawingOp createNewOp() {
        int opName = (int)(Math.random()*8);
        DrawingOp op = null;
        switch (opName) {
            case 0:
                op = new DrawingOp("Draw Line");
                break;
            case 1:
                op = new DrawingOp("Draw Rectangle");    
                break;
            case 2:
                op = new DrawingOp("Draw Oval");
                break;
            case 3:
                op = new DrawingOp("Draw Curve");
                break;
            case 4:
                op = new ColorOp("Change Line Color", "red");
                break;
            case 5:
                op = new ColorOp("Change Line Color", "blue");
                break;
            case 6:
                op =  new ColorOp("Change Fill Color", "yellow");
                break;
            case 7:
                op =  new ColorOp("Change Fill Color", "black");
                break;
        }
        
        return op;
    }

    private void runSimulation() {
        System.out.println("***Running simulation***");
        int countDown = 30;
        while (countDown > 0) {
            int randStackOp = (int)(Math.random()*6);
            switch (randStackOp) {
                case 0:
                case 1:
                case 2:
                    // push
                    DrawingOp o = createNewOp();
                    System.out.println(o.getName() + ". Pushed new op on top of stack");
                    myOpStack.push(o);
                    printStack();
                    break;
                case 3:
                    // peek
                    try {
                        DrawingOp p = myOpStack.peek();
                        System.out.println("Peeked, current op at top of stack is:" + p.toString());
                    } catch (EmptyStackException e) {
                        System.out.println("EXCEPTION: Stack is empty, can't peek.");
                    }
                    break;
                case 4: 
                    // pop
                    try {
                        DrawingOp q = myOpStack.pop();
                        System.out.println("UNDO! Popped, got this off stack:" + q.toString());
                    } catch (EmptyStackException e) {
                        System.out.println("EXCEPTION: Stack is empty, can't pop.");
                    }
                    printStack();
                    break;
                case 5:
                    // check size
                    System.out.println("Stack size is: " + myOpStack.size());
                    break;
            }
            
            countDown--;
        }
    }
    
    public void printStack() {
        System.out.println("\t Printing stack: \n");
        // note that this collections-based for loop prints the collection,
        // but in bottom-to-top order. 
        
        for (DrawingOp o : myOpStack) {
            System.out.println("\t\t" + o.toString());
        }
        if (myOpStack.empty()) System.out.println("\t\t ***Stack is empty.***");
    }
    
    
}
