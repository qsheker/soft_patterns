package classes;

import classes.enums.Cheese;
import classes.enums.Onion;
import classes.enums.Pepper;

import java.util.List;

public class Pizza {

    private Double waterVolume;
    private boolean oliveOil;
    private boolean salt;
    private boolean sugar;
    private Cheese mozzarellaCheese;
    private List<Pepper> peppers;
    private List<Onion> onions;

    public void setWaterVolume(Double waterVolume) {
        this.waterVolume = waterVolume;
    }

    public void setOliveOil(boolean oliveOil) {
        this.oliveOil = oliveOil;
    }

    public void setSalt(boolean salt) {
        this.salt = salt;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public void setMozzarellaCheese(Cheese mozzarellaCheese) {
        this.mozzarellaCheese = mozzarellaCheese;
    }

    public void setPeppers(List<Pepper> peppers) {
        this.peppers = peppers;
    }

    public void setOnions(List<Onion> onions) {
        this.onions = onions;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "waterVolume=" + waterVolume +
                ", oliveOil=" + oliveOil +
                ", salt=" + salt +
                ", sugar=" + sugar +
                ", mozzarellaCheese=" + mozzarellaCheese +
                ", peppers=" + peppers +
                ", onions=" + onions +
                '}';
    }
}
