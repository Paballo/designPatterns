/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.structural.adapter;

/**
 *
 * @author donkey
 */
public interface TemperatureInfo {
    
    public double getTemperatureInF();
    public void   setTemperatureInF(double temperatureInF);
    public double getTemperatureInC();
    public void   setTemperatureInC(double temperatureInC);
    
    
    
}
