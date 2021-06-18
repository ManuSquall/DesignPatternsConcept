package org.squall;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FigureFactory figureFactory = new FigureFactory();

        Figure figure = figureFactory.getFigure("CARRE");

        figure.dessiner();
    }
}
