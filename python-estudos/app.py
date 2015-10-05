# -*- coding: UTF-8 -*-

def cadastrar(nomes):
	print ('Digite o nome: ')
	nome = raw_input()
	nomes.append(nomes)

def listar(nomes):
	for nome in nomes:
		print nome

def remover(nomes):
	print 'Digite o nome que deseja remover'
	for nome in nomes:
		print nome
	nome = raw_input()
	nomes.remove(nome)

def alterar(nomes):
	print 'Qual dos nomes deseja alterar'
	for nome in nomes:
		print nome

	nome = raw_input()
	if (nome in nomes):
		indice = nomes.index(nome)
		print 'Digite o novo nome'
		novo_nome = raw_input()
		nomes[indice] = novo_nome
		print 'Nome alterado'
		listar(nomes)
	else:
		print 'Nome não existe'

def procurar(nomes):
	print ('Digite a expressão regular')
	regex = raw_input()
	nomes_depois_join = ' '.join(nomes)
	resultado = re.findall(regex, nomes_depois_join)
	print resultado

def menu():
	nomes = []
	escolha = ''

	while (escolha != '0'):
		print('Escolha uma opção')
		print('1 - Cadastar um nome')
		print('2 - Listar um nome')
		print('3 - Remover um nome')
		print('4 - Alterar nome')
		print('5 - Procurar um nome')
		print('0 - Sair')

		escolha = raw_input()

		if(escolha == '1'):
			cadastrar(nomes)
		if(escolha == '2'):
			listar(nomes)
		if(escolha == '3'):
			remover(nomes)
		if(escolha == '4'):
			alterar(nomes)
		if(escolha == '5'):
			procurar(nomes)

menu()