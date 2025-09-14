/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tavio
 */
public class Aluno {
    public String nome;
    public int idade;
    public String curso;
    
    //contrutor para inicializar o objeto recém-criado - ALUNO
    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    //método
    public Object[] obterDados(){
        return new Object[] {nome, idade, curso};
    }
}
