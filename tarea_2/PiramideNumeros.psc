Algoritmo PiramideNumeros
	Definir n Como Entero
	Escribir "Ingrese un número entero: "
	Leer n
	
	Para i <- 1 Hasta n Hacer
		Para j <- 1 Hasta n - i Hacer
			Escribir Sin Saltar " "
		Fin Para
		Para k <- 1 Hasta i Hacer
			Escribir Sin Saltar k, " "
		Fin Para
		Escribir ""
	Fin Para
FinAlgoritmo
