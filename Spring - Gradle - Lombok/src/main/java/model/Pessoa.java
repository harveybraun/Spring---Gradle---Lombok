package model;

/**
 * Descreve a Classe Pessoa
 *
 * @author Harvey Braun
 * @version 1.0
 * @since 18/04/2020 - 14:00
 */
public class Pessoa {

    private String nome;

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
