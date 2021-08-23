
create procedure sp_exer1

@nota1 decimal (5,2), @nota2 decimal (5,2)
as

	declare @media decimal (5,2)
	set @media = (@nota1*0.4)+(@nota2 * 0.6)
	print 'A sua media e:' +  cast(@media as varchar (10))
	if @media >=5
		print 'Aprovado'
	else
		print 'Reprovado'

exec sp_exer1 5,4.9

create procedure sp_exer2

@numero integer
as
	declare @cont integer
	declare @resultado integer
	set @cont = 0
	while(@cont<=10)
	begin
		set @resultado = @numero*@cont
		print cast(@numero as varchar(15))+'x'+cast(@cont as varchar(15)) + '=' + cast(@resultado as varchar(15))
		set @cont=@cont+1
	end

exec sp_exer2 547

alter procedure sp_exer3
@produto varchar (50)
as
	declare @quantidade integer
	declare @codprod integer
	declare @precoatual decimal(10,2)
	declare @preconovo decimal (10,2)
	select @codprod=cod_prod, @precoatual=Val_UnitProd from produto where Nome_Prod=@produto
	select @quantidade=sum(qtd_vend) from itens where cod_prod=@codprod
	print 'A quantidade vendida foi de :' +cast(@quantidade as varchar(30))
	if(@quantidade >=1000)
		update produto set val_unitprod=Val_UnitProd * 0.9 where cod_prod =@codprod
		else
	    update produto set val_unitprod =Val_UnitProd * 1.1 where cod_prod =@codprod
    select @preconovo=Val_UnitProd from produto where Nome_Prod=@produto
	print 'Preço velho =' + cast(@precoatual as varchar(30))
	print 'Preço novo =' + cast(@preconovo as varchar(30))
	
select * from produto	
exec sp_exer3 'Sofa Couro'

create procedure sp_exer6
@nomefunc varchar(50)
as
declare @sexo varchar(1)
declare @tempodecasa integer
declare @novosalario decimal(10,2)
select @sexo=sexo_func, @tempodecasa=2016-year(data_cadfunc) from Funcionario where Nome_Func=@nomefunc

if (@sexo='M')
 if(@tempodecasa >=15)
	update Funcionario set Sal_Func=Sal_Func*1.2
	where Nome_Func=@nomefunc
  else
	update Funcionario set Sal_Func=Sal_Func+500
	where Nome_Func=@nomefunc

else 
	if(@tempodecasa>=10)
		update Funcionario set Sal_Func=Sal_Func*1.25
		where Nome_Func=@nomefunc
	else
		update Funcionario set Sal_Func=Sal_Func+500
		where nome_func=@nomefunc
select @novosalario=sal_func from Funcionario where Nome_Func=@nomefunc
print 'O salario novo é de :' + cast(@novosalario as varchar(30))

select * from Funcionario

exec sp_exer6 'Antonio Antonino Antones'

update Funcionario set Nome_Func='Talitha Felix Campos'