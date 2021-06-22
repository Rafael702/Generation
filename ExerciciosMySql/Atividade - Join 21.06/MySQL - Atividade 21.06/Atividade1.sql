create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
	id bigint auto_increment,
	tipo_personagem varchar(50), -- Guerreiro, Mago, Bárbaro, Druída, Paladino e Gazda
	origem varchar(50),
    tank boolean, -- terá um tank
    
    primary key (id)
);

create table tb_personagem(
	FK_personagem_id bigint not null,
    nome varchar(50) not null,
    habilidades varchar (50) not null ,  -- Escolher apenas uma
    forca int not null,
    defesa int not null,
    time_personagem varchar(50) not null,
    
   foreign key (FK_personagem_id) references tb_classe(id)
);

insert into tb_classe(tipo_personagem, origem, tank) value("Guerreiro", "Asvilândia", true);
insert into tb_classe(tipo_personagem, origem, tank) value("Barbaro", "Nenfild", false);
insert into tb_classe(tipo_personagem, origem, tank) value("Mago", "Northand", true);
insert into tb_classe(tipo_personagem, origem, tank) value("Gazda", "Mopotonia", false);
insert into tb_classe(tipo_personagem, origem, tank) value("Druida", "Askatipapim", true);

Select * from tb_personagem;

insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (2,"Jorge", "Força",500,30,"Os Borgs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (1,"BrodvysK", "Inteligência",3000,350,"Os Dorcs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (3,"Forth", "Magia",4500,555,"Os Borgs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (5,"Fanvinsky", "Inteligência",3500,450,"Os Dorcs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (4,"Blovoat", "Força",750,1500,"Os Borgs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (3,"Vroad", "Magia",1050,155,"Os Dorcs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (5,"Plotz", "Velocidade",350,5000,"Os Borgs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (1,"Thomp", "Força",6500,450,"Os Dorc");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (4,"Laravel", "Sabedora",1600,1107,"Os Borgs");
insert into tb_personagem(FK_personagem_id,nome,habilidades,forca,defesa,time_personagem)
values (3,"Crang", "Magia",1700,2500,"Os Borgs");

select * from tb_personagem where forca > 2000;
select * from tb_personagem where defesa > 1000 and defesa < 2000;
select * from tb_personagem where nome like "%c%";

select tb_personagem.nome,tb_personagem.FK_personagem_id, tb_personagem.defesa,
tb_personagem.forca, tb_classe.id, tb_classe.tipo_personagem,tb_classe.origem
	from tb_personagem
    inner join tb_classe on tb_classe.id = tb_personagem.FK_personagem_id;
    
    select * from tb_personagem where FK_personagem_id = 3;
    

