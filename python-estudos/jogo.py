# -*- coding: UTF-8 -*-

import random

def pedra_papel_tesoura():
	
	opcoes_maquina = ('pedra', 'papel', 'tesoura')

	pontuacao_jogador = 0
	pontuacao_maquina = 0
	
	print 'Informe seu nome'
	nome_jogador = raw_input()

	print 'Qual será sua escolha? Pedra, Papel ou Tesoura ?'
	escolha_jogador = raw_input()
	escolha_jogador = escolha_jogador.lower()

	escolha_maquina = opcoes_maquina[random.randrange(len(opcoes_maquina))]
		
	if(escolha_jogador == escolha_maquina):
		print 'Empate'
		pontuacao_maquina = 1
		pontuacao_jogador = 1
		i += 1

	elif(escolha_jogador == 'pedra' and escolha_maquina == 'tesoura') or (escolha_jogador == 'papel' and 
		escolha_maquina == 'pedra') or (escolha_jogador == 'tesoura' and escolha_maquina == 'papel'):
		print 'Voce Ganhou!!!'
	
	else:
		print 'Você Perdeu =('
			

pedra_papel_tesoura()
