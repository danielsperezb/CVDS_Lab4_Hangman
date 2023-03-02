
package hangman;


import com.google.inject.Guice;
import com.google.inject.Injector;

import hangman.setup.factoryMethod.HangmanDefaultFactoryMethod;
import hangman.setup.guice.HangmanFactoryServices;

public class SwingProject {

    public static final String CONTRIBUTORS[] = {
            "Omar Rodriguez, 008796203",
            "Nahid Enayatzadeh, 010164622",
            "Marc Deaso, 011179285",
            "Christopher Santos, ",
            "Jazmin Guerrero, 009007193"};

    public static final String PROJECT_NAME = "CS 245 - Swing Project v1";

    public static GUI createGUIUsingFactoryMethod() {
        return new GUI(new HangmanDefaultFactoryMethod());
    }
    
    public static GUI createGUIUsingGuice() {
        Injector injector = Guice.createInjector(new HangmanFactoryServices());
        return injector.getInstance(GUI.class);
    }

    //method: mainssss
    //purpose: the entry-point to our application
    public static void main(String[] args) {
    	createGUIUsingGuice().play();
    }

}
