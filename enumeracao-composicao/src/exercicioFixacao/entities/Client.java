package exercicioFixacao.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(){
    }

    public Client(LocalDate birthDate, String email, String name) {
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return name + " (" + format.format(birthDate) + ") - " + email;
    }
}
