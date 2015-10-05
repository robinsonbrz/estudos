
# -*- encoding: UTF-8 -*-

#New Style - Na criação da classe eu passo sempre como parametro 'object'
class Perfil(object):
	
	def __init__(self, nome, telefone, empresa):
		
		'__init__ trabalha como uma função construtora'
		'Esse construtor funciona como no JAVA, mas é preciso discriminar que nosso construtor vai instanciar um Objeto'

		self.nome = nome
		self.telefone = telefone
		self.empresa = empresa

	def imprimir(self):
		print 'Nome: %s, Telefone: %s, Empresa: %s' % (self.nome, self.telefone, self.empresa)


class Data(object):
	"""Esta classe tem o intuito de representar uma Data - Exercico Python Básico"""
	def __init__(self, dia, mes, ano):
		self.dia = dia
		self.mes = mes
		self.ano = ano

	def imprimir_data(self):
		print '%s/%s/%s' % (self.dia, self.mes, self.ano)

class IMC(object):

	def __init__(self, peso, altura):
		self.peso = peso
		self.altura = altura

	def calcular_imc(self):
		resultado_imc = self.peso / (self.altura**2)

		if (resultado_imc < 17):
			print 'Você esta muito abaixo do peso'

		elif (resultado_imc >= 17) and (resultado_imc <= 18.4):
			print 'Você esta abaixo do peso'
		elif (resultado_imc >= 18.5) and (resultado_imc <= 24.9):
			print 'Peso Normal'
		elif (resultado_imc >= 25) and (resultado_imc <=29.9):
			print 'Acima do Peso'
		elif (resultado_imc >= 30) and (resultado_imc <= 34.9):
			print 'Obesidade 1'
		elif (resultado_imc >= 35) and (resultado_imc <= 39.9):
			print 'Obesidade 2'
		elif (resultado_imc >= 40):
			print 'Obesidade 3 (Mórbida)'