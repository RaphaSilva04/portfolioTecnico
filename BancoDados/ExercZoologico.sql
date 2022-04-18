create table loja(
cod int primary key,
nome varchar
);
insert into loja
(cod, nome)
values
(01, 'zooshop'),
(02, 'storezoo');

create table habitat(
cod int primary key,
nome varchar,
qtd_animais int,
qtd_comida varchar,
esta_aberto varchar
);
insert into habitat
(cod, nome, qtd_animais, qtd_comida, esta_aberto)
values
(01, 'tropical', 30, 'metade', 'true'),
(02, 'aquatico', 15, 'cheio', 'false');

create table fornecedores(
cod int primary key,
cnpj varchar,
nome varchar,
contato varchar(30)
);
insert into fornecedores

(cod, cnpj, nome, contato)
values
(01, '43.836.648/0001-05', 'fornec1', '(48)3803-5433'),
(02, '28.413.540/0001-16', 'fornec2', '(48)3264-6439');

create table loja_franquia(
cnpj varchar primary key,
nome varchar,
aluguel decimal(6,2),
area_atuacao varchar,
email varchar
);
insert into loja_franquia
(cnpj, nome, aluguel, area_atuacao, email)
values
('51.367.026/0001-03', 'loja1', 3500.00, 'alimentação', 'loja1email@gmail.com'),
('80.842.363/0001-03', 'loja2', 3000.00, 'entretenimento', 'loja2email@gmail.com');

create table bilheteria(
cod int primary key,
meia varchar,
preco decimal(4,2),
data date
);
insert into bilheteria
(cod, meia, preco, data)
values
(01, true, 40.00, '01-01-22'),
(02, false, 80.00, '01-02-22');

create table animais(
cod int primary key,
cod_habitat int,
foreign key (cod_habitat) references habitat,
especie varchar,
classe_animal varchar,
sexo varchar,
ano_nasc date
);
insert into animais
(cod, cod_habitat, especie, classe_animal, sexo, ano_nasc)
values
(01, 01, 'tucanos', 'aves', 'macho', '07-04-2010'),
(02, 02, 'orca', 'mamiferos', 'femea', '19-07-2019');

create table pessoas(
cod_carteirinha int primary key,
cod_bilheteria int,
foreign key (cod_bilheteria) references bilheteria,
nome varchar,
data_nasc date,
ctt_emergencia varchar
);
insert into pessoas
(cod_carteirinha, cod_bilheteria, nome, data_nasc, ctt_emergencia)
values
(01, 01, 'joao', '09-10-2000', '(48)2574-2636'),
(02, 02, 'diana', '10-07-1997', '(21)2002-8415');

create table produtos(

cod int primary key,
cod_fornec int,
foreign key (cod_fornec) references fornecedores,
nome varchar,
qtd int,
preco decimal(5,2)
);

create table funcionarios(
cpf varchar primary key,
cod_loja int,
foreign key (cod_loja) references loja,
nome varchar,
cargo varchar,
cargo_horaria varchar,
salario decimal(6,2),
ferias date,
observacoes varchar
);

create table contem(
cod_loja int,
foreign key (cod_loja) references loja,
cod_produto int,
foreign key (cod_produto) references produtos
);
Server [localhost]:
Database [postgres]: Zoologico
Port [5432]:
Username [postgres]:

Password for user postgres:
psql (14.1)
Zoologico=# \copy produtos from
'C:\Users\raphael_l_silva\Downloads\produtos_table.csv' delimiter ';' csv header
COPY 2

Zoologico=#
Zoologico=# \copy funcionarios from
'C:\Users\raphael_l_silva\Downloads\funcionarios_table.csv' delimiter ';' csv header
COPY 2

Zoologico=# \copy contem from
'C:\Users\raphael_l_silva\Downloads\contem_table.csv' delimiter ';' csv header
COPY 2
