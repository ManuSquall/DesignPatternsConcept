package org.squall;

public abstract class AbstractFactory{

    abstract Figure getFigure(String figure);
    abstract Couleur getCouleur(String couleur);

}
