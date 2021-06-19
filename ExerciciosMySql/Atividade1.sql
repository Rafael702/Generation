-- Atividade 1 --
-- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema --
-- trabalhará com as informações dos funcionaries desta empresa. --
-- Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5 --
-- atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH. -- 
-- Popule esta tabela com até 5 dados; --
-- Faça um select que retorne os funcionaries com o salário maior do que 2000. --
-- Faça um select que retorne os funcionaries com o salário menor do que 2000.--
-- Ao término atualize um dado desta tabela através de uma query de atualização. --
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e--
-- coloque no seu GitHuB pessoal e compartilhe esta atividade. --

create database db_RH;

use db_RH;

create table tb_funcionario(
id bigint auto_increment,
nome varchar(255) not null,
funcao varchar(255) not null,
salario int not null,
idade int not null,
primary key(id)
);

Select *from tb_funcionario;

insert into tb_funcionario(nome,salario,idade,funcao,cargoHoraria) values("Robson",2500,24, "Programador", "8");
insert into tb_funcionario(nome,salario,idade,funcao,cargoHoraria) values("Francisco",1500,35, "Operador de Máquinas", "8");
insert into tb_funcionario(nome, salario,idade,funcao,cargoHoraria) values("Jefrey", 2000,41, "Analista", "8");
insert into tb_funcionario(nome,salario,idade,funcao,cargoHoraria) values("John",6000,42, "CEO", "8");
insert into tb_funcionario(nome,salario,idade,funcao,cargoHoraria) values("Roberto",1200, 21, "Aux. de Limpeza", "6");

alter table tb_funcionario add horarioDeTrabalho datetime(2);
alter table tb_funcionario drop horarioDeTrabalho;

alter table tb_funcionario add cargoHoraria int not null;

select *from tb_funcionario where salario > 2000;
select *from tb_funcionario where salario < 2000;

update tb_funcionario set nome = "John Wesley" where id = 5;


