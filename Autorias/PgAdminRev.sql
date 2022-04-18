CRIAÇÃO DE TABELAS
create table praticar(
	cod int primary key,
	nome varchar,
	preco decimal(6,2),
	data date,
	praticou boolean
);
insert into praticar
(id, nome, valor, data, praticou)
values
(1, 'user1', 1111.11, '01-01-1111', true),
(2, 'user2', 2222.22, '02-02-2222', false);

create table praticado (
	cod serial primary key,
	praticado_testado int references praticar(cod),
	endereco varchar,
	telefone varchar(30),
	cpf varchar
);

ALTERAÇÃO DA ESTRUTURA DAS TABELAS
alter table praticar add column tipo varchar;  Adicionando coluna
alter table praticar rename column preco to valor;  Renomeando coluna 
alter table praticar drop column tipo;  Removendo coluna
alter table filmes alter column pontuacao type decimal(4,1);  Altera o tipo de dado de uma coluna



ATUALIZANDO DADOS DA TABELA 
update compras set status = true where id = 2  Atualiza para true a coluna de ID 2 
delete from compras where id = 4  Deleta a coluna de ID 4
update compras set valor = 700 where id = 3  Atualiza o valor para 700 a coluna de ID 3
update compras set valor = 700, observacoes = 'Reforma de quartos' where id = 3  Atualiza e altera as colunas valor e observacoes quando o ID for igual a 3.

select * from compras order by id asc  Retorna os dados da tabela em ordem crescente.
select * from compras order by id desc  Retorna os dados da tabela em ordem decrescente.

OR  operador lógico no qual a resposta da operação é verdade, se pelo menos uma das variáveis de entrada for verdade.
select * from compras where valor <= 150 or valor >= 700  visualiza somente valores menor igual a 150 ou maior igual a 700

AND  operador lógico no qual a resposta da operação é verdade, se todas as variáveis de entrada forem verdade.
select * from compras where valor >= 150 and valor <= 700  visualiza somente valores maior igual a 150 e menor igual a 700

BETWEEN 
select valor, observacoes from compras where valor between 100 and 700  visualiza somente valores entre 100 a 700.

APELIDOS
select id as coluna_id, valor as valores, data as data_compra, observacoes as produto, status as tudOk from compras  apelidando e mudando o nomes das colunas na visualização.
OPERADORES ARITMÉTICOS 
select id, valor, data, observacoes, status, qtd, (valor * qtd) as valor_Total from compras  multiplicando a coluna qtd vezes a coluna valor.

EXPORTAÇÃO 
\copy (select id, valor, (valor * 1.1) as new_valor, data, observacoes, status, qtd from compras) to 'C:\Users\famli\OneDrive\Documentos\Trabalhos TI\Sesi Senai - Trabalhos.teste_compra.csv' delimiter ';' csv header; 
 1’ é inserido as colunas desejadas para exportação da tabela, logo em seguida é passado o caminho do local onde deseja salvar e no final o nome do arquivo.csv exportado, pra finalizar o tipo de delimitador e o cabeçario. 
\copy (select * from animais where especie like 't%') to
'C:\Users\raphael_l_silva\Documents\tabelas pg.admin\animais.csv' delimiter ';' csv
header;

IMPORTAÇÃO
\copy funcionário from ‘c:\Users\Aluno\Downloads\Tabela_antiga.csv’ delimiter ‘,’ csv header; 
 1’ é colocado o nome da tabela desejada para importação, logo em seguida é passado o caminho do local onde o arquivo esta salvo, para finalizar o tipo de delimitador e o cabeçario.

FUNÇÕES 
select position('n' in 'Edson Dionisio');  determina a posição do caractere selecionado.
select power(6, 2);  faz a potenciação dos caracteres determinados entre parênteses.
select to_char(current_date, 'dd/mm/yyyy');  determina a data atual.
select avg(<column>);  determina a média da coluna selecionada.

select avg(valor_bilheteria) from filmes where editora_jogo ilike 'nintendo'
select round(avg(valor),2) from compras where observacoes ilike 'fritadeira'

