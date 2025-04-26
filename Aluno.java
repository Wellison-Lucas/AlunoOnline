public class Aluno {
    private String nome;
    private String cpf;
    private String endereco;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double mediaPonderada;
    private boolean aprovado;

    public Aluno(String nome, String cpf, String endereco, double nota1, double nota2, double nota3, double nota4) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setNota1(nota1);
        this.setNota2(nota2);
        this.setNota3(nota3);
        this.setNota4(nota4);
    }

    public double calculaMedia() {
        setMediaPonderada((getNota1() *1 + getNota2() *2 + getNota3() *3 + getNota4() *4) /10);
        return getMediaPonderada();
    }

    public boolean verificaMedia() {
        if (this.getMediaPonderada() < 6) {
            setAprovado(false);
        } else {
            setAprovado(true);
        }
        return isAprovado();
    }

    public void mostrarInfor(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Sua média é: " + getMediaPonderada());
        System.out.println("O aluno foi aprovado? " + isAprovado());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaPonderada() {
        return mediaPonderada;
    }

    public void setMediaPonderada(double mediaPonderada) {
        this.mediaPonderada = mediaPonderada;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
