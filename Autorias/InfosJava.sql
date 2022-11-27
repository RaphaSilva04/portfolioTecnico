create table Autoria(
	cod int primary key,
	nome varchar,
	descricao varchar
);
insert into Autoria
(cod, nome, descricao)
values
(1, 'if-else', 'executa condicionalmente comandos mediante um critério de seleção'),
(2, 'while', 'avalia expressão condicional, que deve resultar true ou false'),
(3, 'for', 'avalia a expressão de inicialização e a expressão condicional'),
(4, 'break', 'usado para interromper a execução de um dos laços de iteração'),
(5, 'abstract', 'um método declarado como abstract não terá código'),
(6, 'public', 'qualquer um pode acessar variáveis de instância públicas'),
(7, 'protected', 'apenas métodos do mesmo pacote ou subclasse podem acessar'),
(8, 'private', 'apenas métodos da mesma classe podem acessar'),
(9, 'static', 'usada para declarar uma variável que é associada com a classe'),
(10, 'final', 'tipo de variável que se deve atribuir um valor inicial');

