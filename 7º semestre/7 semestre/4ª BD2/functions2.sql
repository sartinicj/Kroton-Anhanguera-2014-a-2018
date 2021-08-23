
/*Exercicio 7*/
create function exer7(@nome varchar(50))
returns decimal(10,2)
begin 
	declare @somatoria decimal(10,2)
	select @somatoria = sum(cr.cred_cli) from cliente cl 
	inner join credito cr on cl.cod_cli=cr.cod_cli
	where cl.nome_cli = @nome
	return @somatoria

	
end

select dbo.exer7('Renata Leão')

/*Exercicio 8*/
create function exer8(@sexo varchar(1))
returns integer
begin
  return(select count(*) from  Funcionario
  where sexo_func = @sexo)
end

select dbo.exer8('m')

/*Exercicio 9*/
alter function exer9(@nome varchar(50))
returns varchar(50)

begin
return(select co.nome_conj from Conjuge co 
inner join cliente cli on co.Cod_Cli=cli.Cod_Cli 
where @nome=cli.Nome_Cli)

end

select dbo.exer9('João Carlos')


/*Exercicio 10*/
alter function exer100(@cidade varchar(20))
returns table

return
select distinct(cli.nome_cli) from cliente cli inner join
endereco en on cli.Cod_Cli=en.Cod_Cid inner join
cidade ci on en.Cod_Cid=ci.Cod_Cid where @cidade = ci.Nome_Cid




select * from dbo.exer100('Americana')


/*Exercicio 11*/
alter function exer11(@funcionario varchar(50))
returns integer
begin

return(select SUM(po.pto_func) from Pontuacao po
inner join funcionario fu on po.Cod_Func=fu.Cod_Func 
where @funcionario=fu.Nome_Func)

end

select dbo.exer11('Amaro Merico Vespucio')

/*Exercicio 12*/
create function exer12(@cliente varchar(50))
returns integer
begin
declare @resultado integer
select @resultado=count(pe.num_ped) from Pedido pe inner join
Cliente cli on pe.Cod_Cli=cli.Cod_Cli where 
@cliente = cli.Nome_Cli

return @resultado
end

select dbo.exer12('João Carlos')

/*Exercicio 13*/
create function exer13(@funcionario varchar(50))
returns integer
begin
return(select count(pe.num_ped) from Pedido pe inner join
Funcionario fu on pe.Cod_Func=fu.Cod_Func where 
@funcionario=fu.Nome_Func)
end

select dbo.exer13('Bia Bianca Bones')
select * from Funcionario

/*Exercicio 14*/
create function exer14(@pedido integer)
returns table
return
	(select cli.nome_cli,fu.nome_func from cliente cli
	inner join Pedido pe on cli.Cod_Cli=pe.Cod_Cli inner join
	Funcionario fu on pe.Cod_Func=fu.Cod_Func where @pedido=pe.Num_Ped)

select * from dbo.exer14(1)
select * from Pedido

/*Exercicio 15*/
create function exer15(@salario1 integer,@salario2 integer)
returns table
return

select nome_cli,renda_cli from Cliente cli
where Renda_Cli between @salario1 and @salario2

select * from dbo.exer15(50,1900)

/*Exercicio 16 resultado dando errradooooo*/
alter function exer16(@cod_cli integer)
returns decimal(10,2)
begin

declare @cli decimal(10,2)
declare @con decimal(10,2)
 select @cli=cli.renda_cli,@con=co.renda_conj from cliente cli
 inner join Conjuge co on co.Cod_Cli= cli.Cod_Cli
 return @cli+@con
end

select dbo.exer16(1)
select * from Cliente

/*Exercicio 17*/

