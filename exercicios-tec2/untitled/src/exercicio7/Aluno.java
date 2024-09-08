package exercicio7;

public class Aluno {
    private String nome;
    private Double p1;
    private Double p2;

    public Aluno() {
    }

    public Aluno(String nome, Double p1, Double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
