Server [localhost]:
Database [postgres]:
Port [5432]:
Username [postgres]:
Password for user postgres:
psql (14.1)
postgres=# \copy ( select tecido, tamanho, colecao, preco, (preco * 1.05) as
preco_reajuste from roupas ) to &#39;C:\Users\raphael_l_silva\Documents\roupas.csv&#39;
delimiter &#39;;&#39; csv header;
COPY 2

postgres=# \copy ( select nome, salario, (salario * 1.1) as aumento_salario, telefone,
cargo from funcionarios ) to &#39;C:\Users\raphael_l_silva\Documents\funcionarios.csv&#39;
delimiter &#39;;&#39; csv header;
COPY 2

postgres=# \copy ( select colecao, cor, tamanho, tecido, cod_cliente from compra inner
join roupas on compra.cod_roupa = cod ) to
&#39;C:\Users\raphael_l_silva\Documents\compra_roupas.csv&#39; delimiter &#39;;&#39; csv header;
COPY 2

