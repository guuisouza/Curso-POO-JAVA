package entities;

public class Student {
    public String name;
    public double notaPrimeiroTrimestre;
    public double notaSegundoTrimestre;
    public double notaTerceiroTrimestre;

    public double finalGrade(){
        return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
    }

    public void passOrFailed(){
        double missingPoints = 60.0 - finalGrade();
        if (finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.println("MISSING " + String.format("%.2f", missingPoints) + " POINTS");
        }else{
            System.out.println("PASS");
        }
    }
}
