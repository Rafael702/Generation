create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
estilo_pizza varchar(50),
borda varchar(50) not null,

primary key(id)
);

create table tb_pizza(
FK_id bigint auto_increment,
pizza_nome varchar(50),
nome_cliente varchar(50) not null,
quantidade_pizza int not null,
massa varchar(50) not null,
tempero varchar(50) not null, -- muito ou pouco

foreign key (FK_id) references tb_categoria(id)
);

insert into tb_categoria(estilo_pizza,borda)
values("Italiana","Recheada");
insert into tb_categoria(estilo_pizza,borda)
values("Estufada","Simples");
insert into tb_categoria(estilo_pizza,borda)
values("Napolino","Recheada");
insert into tb_categoria(estilo_pizza,borda)
values("Romana","Fina");
insert into tb_categoria(estilo_pizza,borda)
values("Parmiggiana","Fina");

select * from tb_categoria;

insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Calabresa", "Thompson", 1, "Crocante","Todos");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Portuguesa", "Joesley", 3, "Crocante","Sem tomate");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Muçarela", "Francisco", 2, "Fina","Todos");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Frago com Catupiry", "Lewis", 3, "Fina","Sem azeitona");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Margherita","Nando", 2, "Crocante","Todos");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Mafiosa", "Leonard", 1, "Crocante","Todos");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Alho e Óleo", "Franco", 2, "Fina","Sem azeitona");
insert into tb_pizza(pizza_nome,nome_cliente,quantidade_pizza, massa, tempero)
values("Milho com Bacon", "Rodinei", 3, "Crocante","Todos");


