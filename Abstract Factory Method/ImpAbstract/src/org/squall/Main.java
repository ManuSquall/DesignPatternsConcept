package org.squall;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // get figure factory
        AbstractFactory figureFactory = FactoryProducer.getFactory("FIGURE");

        // get couleur factory
        AbstractFactory couleurFactory = FactoryProducer.getFactory("COULEUR");

        Figure cercle = figureFactory.getFigure("CERCLE");
        cercle.dessiner();

        Couleur rouge = couleurFactory.getCouleur("ROUGE");
        rouge.colorier();

    }
}
