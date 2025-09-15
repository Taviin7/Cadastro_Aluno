package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tavio
 */
public class Aluno {
    private int id;
    public String nome;
    public int idade;
    public String curso;
    
    //contrutor para inicializar o objeto recém-criado - ALUNO
    public Aluno(String nome, int idade, String curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    //método comum
    public Object[] obterDados(){
        return new Object[] {nome, idade, curso};
    }
    
    //métodos para connection bd
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCurso(){
        return curso;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
}
