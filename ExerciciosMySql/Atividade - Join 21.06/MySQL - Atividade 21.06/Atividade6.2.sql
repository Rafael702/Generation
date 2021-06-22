create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment not null ,

area varchar(255) not null,
duracao varchar(255) not null,
  diploma boolean -- 1 = verdadeiro, 2 = falso,

primary key (id) 

);

insert into tb_categoria (area,duracao,diploma) values ("Humanas" , "70 aulas", true );
insert into tb_categoria (area,duracao,diploma) values ("Exatas" , "120 aulas", true );
insert into tb_categoria (area,duracao,diploma) values ("Biologicas" , "60 aulas", true );
insert into tb_categoria (area,duracao,diploma) values ("Tecnologia & Java" , "140 aulas", true );
insert into tb_categoria (area,duracao,diploma) values ("Estudos sociais" , "70 aulas", true );

select * from tb_categoria;

create table tb_produto(
id_produto bigint auto_increment not null,

nome varchar(255) not null,
preco decimal (7,2) not null,
materia varchar(255) not null,
aprovacao_entre_alunes int not null,

FK_categoriaid bigint,
primary key (id_produto),
foreign key (FK_categoriaid) references tb_categoria (id)
);

insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Interpretação e Sintaxe", 46.99 , "Português" , 9 , 1); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Logarítmos e progressão aritmética ", 59.99 , "Matemática" , 10 , 2); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Introdução à Fiísica Quântica", 49.99 , "Física" , 8 , 2); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Java JDK", 59.99 , "Programação" , 10 , 4); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("A Mentalidade Infantil e como entendê-la", 36.50 , "Psicologia" , 7 , 5); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Design UI & UX", 79.99 , "Artes e Tecnologia" , 10 , 4); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("Fisiologia Animal", 65.50 , "Biologia" , 6 , 3); 
insert into tb_produto (nome,preco,materia,aprovacao_entre_alunes, FK_categoriaid) values ("História da Arte Brasileira", 89.99 , "Artes" , 9 , 1); 


select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "J%";

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid;

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid where id = 5;