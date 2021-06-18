package org.squall;

public class FigureFactory extends AbstractFactory{

    @Override
    public Figure getFigure(String TypeFigure) {
        if (TypeFigure == null) {
            return null;
        }
        if (TypeFigure.equalsIgnoreCase("CERCLE")) {
            return new Cercle();
        } else if (TypeFigure.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (TypeFigure.equalsIgnoreCase("CARRE")) {
            return new Carre();
        }

        return null;
    }

    @Override
    public Couleur getCouleur(String couleur) {
        return null;
    }
}
