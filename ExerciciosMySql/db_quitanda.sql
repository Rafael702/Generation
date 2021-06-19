use db_quitanda;

-- use db_quitanda; > usar o banco de dados; --
-- Criar tabelas --
-- create table tb_produtos( --
-- id bigint auto_increment,  --
 -- Informações criadas na tabelas --
-- nome varchar(255) not null,	--
-- Registros --
-- preco decimal(2) not null,-- 
-- Que tipos de informações eles vão guardar--
-- primary key(id) -- 
-- ); --
-- Inserindo dados--
-- insert into tb_produtos(nome,preco) value("Maçã",5.00");--
-- Insert into tb_produtos(nome,preco) value("Banana",3.00");--
-- Insert into tb_produtos(nome,preco) value("Batata",4.50"); --
-- Insert into tb_produtos(nome,preco) value("Cheiro verde", 2.50"); --
-- Insert into tb_produtos(nome,preco) value("Morango",5.00"); --

select * from tb_produto;

insert into tb_produto(nome,preco) value("Maçã",5.00);
insert into tb_produto(nome,preco) value("Banana",3.00);
insert into tb_produto(nome,preco) value("Bata", 4.50);
insert into tb_produto(nome,preco) value("Cheiro verde", 2.50);

alter table tb_produto modify preco decimal(5,2);

update tb_produto set nome = "Batata" where id = 6;
update tb_produto set nome = "Cenoura" where id = 3;

alter table tb_produto add descricao varchar(255);
alter table tb_produto drop descricao;
