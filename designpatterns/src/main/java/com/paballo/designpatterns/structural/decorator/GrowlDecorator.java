/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.paballo.designpatterns.structural.decorator;

/**
 *
 * @author donkey
 */
public class GrowlDecorator  extends AnimalDecorator{

    public GrowlDecorator(Animalio animalio) {
        super(animalio);
    }
    
    @Override
    public void describe()
    {
        animalio.describe();
        growl();
    }

    private void growl() {
        System.out.println("Grrrr");
    }
}
