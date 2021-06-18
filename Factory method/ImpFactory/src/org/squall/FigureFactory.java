package org.squall;

import java.lang.reflect.Type;

public class FigureFactory {

    public Figure getFigure(String TypeFigure){
        if(TypeFigure == null){
            return null;
        }
        if(TypeFigure.equalsIgnoreCase("CERCLE")){
            return new Cercle();
        }else if(TypeFigure.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(TypeFigure.equalsIgnoreCase("CARRE")){
            return new Carre();
        }

        return null;
    }
}
