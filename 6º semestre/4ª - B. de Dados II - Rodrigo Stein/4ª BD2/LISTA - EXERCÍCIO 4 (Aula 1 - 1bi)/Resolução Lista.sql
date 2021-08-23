create database Primeiro
/* Exercício 2: Quantos EMAILS, cada CLIENTE, nome de cada CLIENTE  */
select cl.Nome_Cli,count(em.cod_cli) /*tabela cliente(cl).Coluna (Nome_cli),count tabela email(em).Coluna*/
/* Para nomear a coluna escrever: as "nome_coluna" */
from cliente cl inner join /*Nesta linha apelida-se a tabela*/
email em on cl.cod_cli=em.cod_cli
group by cl.nome_cli /* Group by agrupa */
/* FIM Exercício 2 */
/* Exercício 3: Quantos CLENTES, cada TIPO, nome de cada TIPO   */
select ti.nome_tipocli,count(cl.cod_cli) /*tabela (ti).Coluna(tipo_cli),count tabela (cl).Coluna*/
from tipocli ti inner join cliente cl /*Nesta linha apelida-se a tabela*/
on ti.cod_tipocli= cl.cod_tipocli
group by ti.nome_tipocli
/* FIM Exercício 3 */
/* Exercício 4: Quantia de PARCELAS, cada PEDIDO, dados do PEDIDO */
select ped.Num_Ped, ped.Cod_Cli, ped.Cod_Func, ped.Cod_Sta, ped.Data_Ped, ped.Val_Ped, count(Parc.Num_Par)
from Pedido ped inner join 
Parcela parc on ped.Num_Ped=parc.Num_Ped
group by ped.Num_Ped, ped.Cod_Cli, ped.Cod_Func, ped.Cod_Sta, ped.Data_Ped, ped.Val_Ped
/* FIM Exercício 4 */
/* Exercício 5: Quantia de DEPENDENTES, cada FUNCIONARIO, nome do FUNCIONARIO */
select fun.Cod_Func, fun.Nome_Func, fun.Data_CadFunc, fun.Sexo_Func, fun.Sal_Func, fun.End_Func, count(dep.Cod_Dep)
from Funcionario fun inner join
Dependente dep on fun.Cod_Func=dep.Cod_Func
group by fun.Cod_Func, fun.Nome_Func, fun.Data_CadFunc, fun.Sexo_Func, fun.Sal_Func, fun.End_Func
/* FIM Exercício 5 */
/* Exercício 6: Quantos PRODUTOS, cada TIPO, nome do TIPO */
select tp.Nome_TipoProd, count(pro.Qtd_EstqProd)
from TipoProd tp inner join
Produto pro on tp.Cod_TipoProd=pro.Cod_TipoProd
group by tp.Nome_TipoProd
/* FIM Exercício 6 */
/* Exercício 7: Quanto cada CLIENTE GASTOU em PEDIDO, nome CLIENTE */
select cl.Nome_Cli, count(ped.Val_Ped)
from Cliente cl inner join
Pedido ped on cl.Cod_Cli=ped.Cod_Cli
group by cl.Nome_Cli
/* FIM Exercício 7 */
/* Exercício 8: Quantos CLIENTES, cada CIDADE, nome de cada CIDADE */
select cid.Nome_Cid, count(cl.Cod_Cli) as "Quantidade de Clientes"
from cliente cl inner join
Endereco edc on edc.Cod_Cli=cl.Cod_Cli inner join
Cidade cid on cid.Cod_Cid=edc.Cod_Cid
group by cid.Nome_Cid
/* FIM Exercício 8 */
/* Exercício 9: Quantas CIDADES, cada ESTADO, nome ESTADO */
select est.Nome_Est, count(cid.Cod_Cid)
from Estado est inner join
Cidade cid on est.Sigla_Est=cid.Sigla_Est
group by est.Nome_Est
/* FIM Exercício 9 */

