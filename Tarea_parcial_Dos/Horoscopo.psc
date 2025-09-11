Algoritmo Horoscopo
	Definir dia, mes Como Entero
	Definir signo Como Caracter
	Definir respuesta Como Caracter
	
	Repetir
		Escribir "Ingrese su día de nacimiento (1-31): "
		Leer dia
		Escribir "Ingrese su mes de nacimiento (1-12): "
		Leer mes
		
		signo <- determinarSigno(dia, mes)
		Escribir "Tu signo del zodíaco es: ", signo
		
		Escribir "¿Desea saber el horóscopo de otra persona? (s/n): "
		Leer respuesta
	Hasta Que respuesta = "n" O respuesta = "N"
	
FinAlgoritmo

Funcion signo <- determinarSigno(dia, mes)
	Segun mes Hacer
		1:
			Si dia >= 20 Entonces
				signo <- "Acuario"
			Sino
				signo <- "Capricornio"
			Fin Si
		2:
			Si dia >= 19 Entonces
				signo <- "Piscis"
			Sino
				signo <- "Acuario"
			Fin Si
		3:
			Si dia >= 21 Entonces
				signo <- "Aries"
			Sino
				signo <- "Piscis"
			Fin Si
		4:
			Si dia >= 20 Entonces
				signo <- "Tauro"
			Sino
				signo <- "Aries"
			Fin Si
		5:
			Si dia >= 21 Entonces
				signo <- "Géminis"
			Sino
				signo <- "Tauro"
			Fin Si
		6:
			Si dia >= 21 Entonces
				signo <- "Cáncer"
			Sino
				signo <- "Géminis"
			Fin Si
		7:
			Si dia >= 23 Entonces
				signo <- "Leo"
			Sino
				signo <- "Cáncer"
			Fin Si
		8:
			Si dia >= 23 Entonces
				signo <- "Virgo"
			Sino
				signo <- "Leo"
			Fin Si
		9:
			Si dia >= 23 Entonces
				signo <- "Libra"
			Sino
				signo <- "Virgo"
			Fin Si
		10:
			Si dia >= 23 Entonces
				signo <- "Escorpio"
			Sino
				signo <- "Libra"
			Fin Si
		11:
			Si dia >= 22 Entonces
				signo <- "Sagitario"
			Sino
				signo <- "Escorpio"
			Fin Si
		12:
			Si dia >= 22 Entonces
				signo <- "Capricornio"
			Sino
				signo <- "Sagitario"
			Fin Si
		De Otro Modo:
			signo <- "Mes inválido"
	Fin Segun
FinFuncion