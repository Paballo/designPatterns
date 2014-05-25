/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.structural.bridge;

/**
 *
 * @author donkey
 */
public class SmallEngine implements Engine {
    
    int horsepower;
    
    public SmallEngine()
    {
        horsepower = 100;
    }
    
    @Override
    public int go()
    {
        System.out.println("running");
        return horsepower;
    }
}
