/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tnho.utils.themes;

import com.tnho.quizapppv1.App;

/**
 *
 * @author Admin
 */
public class DefaultFactory extends ThemeAbstractFactory{

    @Override
    public String getStyleSheet() {      
        return App.class.getResource("styles.css").toExternalForm();
    }
    
}
