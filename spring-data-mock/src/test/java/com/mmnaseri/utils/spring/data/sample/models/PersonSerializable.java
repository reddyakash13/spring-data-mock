/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mmnaseri.utils.spring.data.sample.models;

import java.io.Serializable;

/**
 *
 * @author blackleg
 */
public class PersonSerializable extends Person implements Serializable {

    @Override
    public String getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

}
