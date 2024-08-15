package metodosabstratos.entities;

import metodosabstratos.entities.enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // A classe circulo TEM que implementar o metodo abstrato shape.area(), sendo obrigada
    // a sobrescrever o metodo abstrato da superclasse
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
