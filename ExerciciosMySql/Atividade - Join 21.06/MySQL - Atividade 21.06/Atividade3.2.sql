create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment not null,

funcao varchar(255) not null,
uso_recomendado varchar(255) not null,
generico boolean not null, -- 1 = sim , 2 = não
primary key (id) 

);

insert into tb_categoria (funcao,uso_recomendado,generico) values ("Alivio de dor " , "Adulto ou Infatil", true);
insert into tb_categoria (funcao,uso_recomendado,generico) values ("Vitamina" , "Adulto ou Infantil" , true);
insert into tb_categoria (funcao,uso_recomendado,generico) values ("Tratamento contínuo" , "Adulto ou Infantil" , true);
insert into tb_categoria (funcao,uso_recomendado,generico) values ("Antialérgico / Imediato" , "Adulto ou Infantil " , true);
insert into tb_categoria (funcao,uso_recomendado,generico) values ("Tratamento contínuo restrito" , "Adulto" , true);

select * from tb_categoria;

create table tb_produto(

id_produto bigint auto_increment not null,

nome varchar (255) not null,
tipagem varchar(255) not null,
preco decimal (7,2) not null,
efeito_colateral varchar (255) not null,
quantidade_comprimidos int not null,



FK_categoriaid bigint,
primary key (id_produto),
foreign key (FK_categoriaid) references tb_categoria (id)
);

insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Lavitan", "Uso Suplementar",16.99, "Fadiga inicial", 30, 2); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Bupropiona", "Uso Psiquiátrico",150.00, "Insônia e Perca de Peso", 60, 5);
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Tamarine Geleia", "Uso Laxante",24.99, "Cólica intestinal", 30, 3); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Merthiolate Spray", "Tratamento de Feridas",17.99, "Coceiras", 1, 1); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Celestone", "Uso no tratamento de alergias",19.99, "Sonolência", 10, 4); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Sertralina", "Uso Psiquiátrico",29.99, "Fadiga", 30, 5); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Nutrinfan Gotas 20ml", "Uso Nutricional",27.70, "Dor de Cabeça, diarréia, ", 1, 2); 
insert into tb_produto (nome,tipagem,preco,efeito_colateral,quantidade_comprimidos, FK_categoriaid) values ("Dorflex", "Uso Oral para dor de cabeça",19.99, "Sede, dilatação da pupila e reações alérgicas", 10, 1); 

select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "B%";

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid;

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid where id = 2;
