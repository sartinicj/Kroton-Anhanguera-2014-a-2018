create database teste
/*Exercicio 1*/
create function exer1(@num1 integer, @num2 integer)
returns integer
begin
	declare @resultado integer
	set @resultado=@num1/@num2
	return @resultado
end
/* Fim Exercicio 1*/
/*Exercicio 2*/
create function exer2(@codcli integer, @porc decimal(10,2))
returns decimal(10,2)
begin
	declare @salario decimal (10,2)
	select @salario=renda_cli from cliente where cod_cli=@codcli
	declare @salarionovo decimal (10,2)
	set @salarionovo= @salario + (@salario*(@porc/100))
	return @salarionovo
end 
/* Fim Exercicio 2*/
/*Exercicio 3*/
create function exer3(@codcli integer)
returns table
return
select 'email' count(cod_cli) from email where cod_cli=@codcli
union
select 'fones' count(cod_cli) from fone where cod_cli=@codcli  
select * from dbo exer3(3)
/* Fim Exercicio 3*/
/*Exercicio 4*/

/* Fim Exercicio 4*/
/*Exercicio 5*/

/* Fim Exercicio 5*/
/*Exercicio 6*/

/* Fim Exercicio 6*/
/*Exercicio 7*/

/* Fim Exercicio 7*/
/*Exercicio 8*/

/* Fim Exercicio 8*/
/*Exercicio 9*/

/* Fim Exercicio 9*/
/*Exercicio 10*/

/* Fim Exercicio 10*/
/*Exercicio 11*/

/* Fim Exercicio 11*/
/*Exercicio 12*/

/* Fim Exercicio 12*/
/*Exercicio 13*/

/* Fim Exercicio 13*/
/*Exercicio 14*/

/* Fim Exercicio 14*/
/*Exercicio 15*/

/* Fim Exercicio 15*/
/*Exercicio 16*/

/* Fim Exercicio 16*/
/*Exercicio 17*/

/* Fim Exercicio 17*/
/*Exercicio 18*/

/* Fim Exercicio 18*/
/*Exercicio 19*/

/* Fim Exercicio 19*/
/*Exercicio 20*/

/* Fim Exercicio 20*/
