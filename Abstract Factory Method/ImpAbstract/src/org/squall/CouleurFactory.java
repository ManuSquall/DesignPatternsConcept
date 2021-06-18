package org.squall;

public class CouleurFactory extends AbstractFactory{

        @Override
        public Couleur getCouleur(String TypeCouleur){
        if(TypeCouleur == null){
            return null;
        }
        if(TypeCouleur.equalsIgnoreCase("ROUGE")){
            return new Rouge();
        }else if(TypeCouleur.equalsIgnoreCase("JAUNE")){
            return new Jaune();
        }else if(TypeCouleur.equalsIgnoreCase("VERT")){
            return new Vert();
        }

        return null;
}

    @Override
    public Figure getFigure(String TypeFigure){
            return null;
    }
}
