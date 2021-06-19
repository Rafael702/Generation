-- Atividade 2
-- Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
-- informações dos produtos deste ecommerce.
-- Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
-- Popule esta tabela com até 8 dados;
-- Faça um select que retorne os produtos com o valor maior do que 500.
-- Faça um select que retorne os produtos com o valor menor do que 500.
-- Ao término atualize um dado desta tabela através de uma query de atualização.
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
-- coloque no seu GitHuB pessoal e compartilhe esta atividade. --

create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
marca varchar(255),
preco decimal not null,
peso decimal not null,
distribuidor varchar(2500),
descricao varchar(2500),
primary key (id)
);

select * from tb_produtos;

insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Nike", 500,400,"Centauro", "Tênis da Nike");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Adidas", 550,400,"dafiti", "Tênis da Adidas");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Nike", 500,400,"Centauro", "Tênis da Nike");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Asics", 299,400,"World Tennis", "Tênis da Asics - Corrida");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("CAT", 189,400,"Lojas Cat", "Tênis da CAT");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Fila", 169,400,"World Tennis", "Tênis Fila");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Olympikus",139,400,"Simião Calçados", "Tênis da Olympikus");
insert into tb_produtos(marca,preco,peso,distribuidor,descricao) value("Lacoste", 279,400,"Netshoes", "Tênis Couro Lacoste");

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set preco = 400 where id = 7;





