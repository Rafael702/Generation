create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment not null ,

secao varchar(255) not null,
tamanho varchar(255) not null,
utilidade  varchar(255) not null,

primary key (id) 
);
insert into tb_categoria (secao,tamanho,utilidade) values ("Pintura","Grande" , "produção");
insert into tb_categoria (secao,tamanho,utilidade) values ("Construção","Grande" , "produção");
insert into tb_categoria (secao,tamanho,utilidade) values ("Decoração","Pequeno" , "Enfeitar");
insert into tb_categoria (secao,tamanho,utilidade) values ("Pintura","médio" , "produção");
insert into tb_categoria (secao,tamanho,utilidade) values ("Decoração","Médio" , "enfeitar");
insert into tb_categoria (secao,tamanho,utilidade) values ("Utilidades variadas","Pequeno" , "produção");


select * from tb_categoria;

create table tb_produto(

id_produto bigint auto_increment not null,

nome varchar(255) not null,
preco decimal (7,2) not null,
utilidade varchar(255) not null,
aprovacao_entre_clientes int not null,

FK_categoriaid bigint,
primary key (id_produto),
foreign key (FK_categoriaid) references tb_categoria (id)

);

insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Argamassa", 40.00 , "Produzir Cimento" , 9 , 2); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Rolo de Parede", 35.00 , "Objeto para Pintar paredes com mais agilidade" , 10 , 1); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Vaso de porcelana", 80.00 , "Enfeite de Mesa" , 8 , 3); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Balde de Tinta", 90.00 , "Pintar Paredes" , 8 , 1); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Cano PVC", 25.00 , "construir encanamento" , 10 , 2); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Alicate", 15.00 , "Cortar superfícies de fios e arame de ferro" , 6 , 5); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values (" 50 Tijolos", 100.00 , "Levantar paredes" , 9 , 2); 
insert into tb_produto (nome,preco,utilidade,aprovacao_entre_clientes, FK_categoriaid) values ("Espelho", 50.00 , "Cola sobre a parede" , 10 , 4); 

select * from tb_produto;
select * from tb_produto where preco > 50;
select * from tb_produto where preco between 3 and 60;
select * from tb_produto where nome like "C%";

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid;

select * from tb_produto 
inner join tb_categoria on tb_categoria.id = tb_produto.FK_categoriaid where id = 4;