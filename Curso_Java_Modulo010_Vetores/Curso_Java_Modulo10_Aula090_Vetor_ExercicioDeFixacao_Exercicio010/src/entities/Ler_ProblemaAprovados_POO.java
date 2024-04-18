package entities;

public class Ler_ProblemaAprovados_POO {
    private String nome;
    private double semestre1;
    private double semestre2;

    public Ler_ProblemaAprovados_POO(String nome, double semestre1, double semestre2) {
        this.nome = nome;
        this.semestre1 = semestre1;
        this.semestre2 = semestre2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSemestre1() {
        return semestre1;
    }

    public void setSemestre1(double semestre1) {
        this.semestre1 = semestre1;
    }

    public double getSemestre2() {
        return semestre2;
    }

    public void setSemestre2(double semestre2) {
        this.semestre2 = semestre2;
    }
}
