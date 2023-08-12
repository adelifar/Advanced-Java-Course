package com.company;

import interfaces.ActionInterface;

public class Calculator {
//    private int a;
//    private int b;
//    private ActionInterface actionInterface;
//
//    public int getA() {
//        return a;
//    }
//
//    public void setA(int a) {
//        this.a = a;
//    }
//
//    public int getB() {
//        return b;
//    }
//
//    public void setB(int b) {
//        this.b = b;
//    }
//
//    public ActionInterface getActionInterface() {
//        return actionInterface;
//    }
//
//    public void setActionInterface(ActionInterface actionInterface) {
//        this.actionInterface = actionInterface;
//    }
//
public int calculate(ActionInterface actionInterface,int a, int b){
    int c=actionInterface.action(a,b);
    return c;
}
}
