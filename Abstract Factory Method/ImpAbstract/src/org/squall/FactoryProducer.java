package org.squall;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choix){
        if(choix.equalsIgnoreCase("FIGURE")){
            return new FigureFactory();
        }else if(choix.equalsIgnoreCase("COULEUR")){
            return new CouleurFactory();
        }

        return null;
    }
}
