CREATE TABLE pessoa(
cod integer primary key, 
nome varchar(40),
endereço varchar(50),
telefone varchar(22)
);
insert into pessoa
(cod, nome, endereço, telefone)
values
(1001, 'Diego Machado', 'Rua Tal 321, Porto', '1234567895, 7895264523'),
(1002, 'Fulano de Tal', 'Avenida Tal 71, Centro', '7418529632, 2345619875');
select * from pessoa;


-- Normalizando a tabela
alter table pessoa drop column telefone;
alter table pessoa add column bairro varchar(20);
alter table pessoa rename column endereço to rua;
select * from pessoa;


update pessoa set rua = 'Rua Tal 321', bairro = 'Porto' where cod = 1001;
update pessoa set rua = 'Avenida Tal 71', bairro = 'Centro' where cod = 1002;
select * from pessoa;


create table telefone (
cod integer,
numero varchar(10),
foreign key(cod) references pessoa
);
insert into telefone 
(cod, numero)
values
(1001, '1234567895'),
(1001, '8529637412'),
(1002, '4523169875'),
(1002, '7845632915');
select * from telefone;


select * from pessoa inner join telefone on pessoa.cod = telefone.cod;
