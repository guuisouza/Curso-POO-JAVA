package metodosabstratos.entities;

import metodosabstratos.entities.enums.Color;

// Classe abstrata pois ela tem um metodo abstrato
public abstract class Shape {
    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Metodo abstrato
    public abstract double area();
}
