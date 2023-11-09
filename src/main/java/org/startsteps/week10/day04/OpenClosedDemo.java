package org.startsteps.week10.day04;

public class OpenClosedDemo {
}


class Guitar {

    private String make;
    private String model;
    private int volume;

    public Guitar(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }
}

class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    public SuperCoolGuitarWithFlames(String make, String model, int volume, String flameColor) {
        super(make, model, volume);
        this.flameColor = flameColor;
    }
}


interface Shape {
    int area();
}


class Square implements Shape {
    int height;

    public int area() {
        return height * height;
    }
}

class Circle implements Shape {
    int r;

    @Override
    public int area() {
        return ((int) Math.PI * r * r);
    }
}

class OpenOpenExample {

    public int compareArea(Shape a, Shape b) {
        return a.area() - b.area();
    }


}
