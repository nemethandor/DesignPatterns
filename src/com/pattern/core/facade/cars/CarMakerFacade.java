package com.pattern.core.facade.cars;

public class CarMakerFacade {
    private CarInterface lada;
    private CarInterface kisPolak;
    private CarInterface trabant;

    public CarMakerFacade() {
        lada = new Lada();
        kisPolak = new KisPolak();
        trabant = new Trabant();
    }

    public void mindenkiMegy() {
        lada.megyekMintAllat();
        trabant.megyekMintAllat();
        kisPolak.megyekMintAllat();

    }

}
