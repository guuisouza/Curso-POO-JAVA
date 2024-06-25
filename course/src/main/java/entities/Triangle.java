package entities;

public class Triangle {
    
    // Atributos da classe Triangulo (3 lados)
    public double a;
    public double b;
    public double c;
    
    // Agora a responsabilidade de calcular a área será da classe Triangle
    public double area() {
        double p = ((a + b + c) / 2.0);
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }
}
