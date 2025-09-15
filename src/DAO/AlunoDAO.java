package DAO;




import model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2830482411045
 */
public class AlunoDAO {
    private Conexao conexao;
    private Connection conn;
    
    //contrutor
    public AlunoDAO(){
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
    
    public void inserir(Aluno aluno){
        String sql = "INSERT INTO Aluno (nome, idade, curso) VALUES (?, ?, ?);";
        
        try{
            PreparedStatement smt = this.conn.prepareStatement(sql);
            smt.setString(1, aluno.getNome());
            smt.setInt(2, aluno.getIdade());
            smt.setString(3, aluno.getCurso());
            
            smt.execute();
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir o aluno: "+ex.getMessage());
        }
    }
}
