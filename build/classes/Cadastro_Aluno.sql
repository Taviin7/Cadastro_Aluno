drop database if exists Cadastro_Aluno;
create database Cadastro_Aluno;
use Cadastro_Aluno;

create table Aluno(
	id int auto_increment primary key,
	nome varchar(45) not null,
    idade int not null,
    curso varchar(30) not null
);

select * from Aluno;