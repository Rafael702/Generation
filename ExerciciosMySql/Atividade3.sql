-- Atividade 3
-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
-- informações dos estudantes deste registro dessa escola.
-- Crie uma tabela estudantes e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos estudantes para se trabalhar com o serviço dessa escola.
-- Popule esta tabela com até 8 dados;
-- Faça um select que retorne o/as estudantes com a nota maior do que 7.
-- Faça um select que retorne o/as estudantes com a nota menor do que 7.
-- Ao término atualize um dado desta tabela através de uma query de atualização.
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
-- coloque no seu GitHuB pessoal e compartilhe esta atividade.

create database db_escola;

use db_escola;

create table tb_estudantes(
id bigint auto_increment,
nome varchar(255) not null,
rm int not null,
classe int not null,
nota int not null,
cpf bigint not null,
primary key (id)
);

insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Ronaldo", 1806,01, 10, 54043214706);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Pedro", 1517,05, 5, 12345678904);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Franco", 1023,07, 6, 12378945601);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Bunyan", 1593,08, 3, 75315946203);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Edwards", 1591,03, 8, 10335714814);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Cornélio", 1532,09, 8, 10258796397);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Miconio", 1953,04, 10, 74106996345);
insert into tb_estudantes(nome,rm,classe,nota,cpf) value("Valter", 1478,03, 8, 14785296312);

select * from tb_estudantes;

select * from tb_estudantes where nota > 7;
select * from tb_estudantes where nota < 7;

-- O professor errou na hora de lançar a nota do aluno e corrigiu.
update tb_estudantes set nota = 8 where id = 4;

