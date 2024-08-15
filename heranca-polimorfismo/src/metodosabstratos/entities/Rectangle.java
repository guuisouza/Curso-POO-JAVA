package metodosabstratos.entities;

import metodosabstratos.entities.enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    // A classe retangulo TEM que implementar o metodo abstrato shape.area(), sendo obrigada
    // a sobrescrever o metodo abstrato da superclasse
    @Override
    public double area() {
        return width * height;
    }

}
