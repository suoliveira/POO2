package Comparador;

import java.time.LocalDate;
public class Pessoa implements Comparable<Pessoa>{
    public String nome;
    public String sobrenome;
    public LocalDate nascimento;

    public String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(String nome, String sobrenome, LocalDate nascimento, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nascimento = nascimento;
        this.telefone = telefone;
    }

    @Override
    public int compareTo(Pessoa pessoaDois){
        if (!this.nome.equals(pessoaDois.nome)){
          return this.nome.compareTo(pessoaDois.nome);
        } else if (!this.sobrenome.equals(pessoaDois.sobrenome)){
            return this.sobrenome.compareTo(pessoaDois.sobrenome);
        }else{
             return this.nascimento.compareTo(pessoaDois.nascimento);
        }
    }

    public String toString(){
        return nome + " " + sobrenome + " - Data de Nascimento: " + nascimento + ", Telefone: " + telefone;
    }
}
