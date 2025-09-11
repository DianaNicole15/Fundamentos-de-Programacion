Algoritmo Saludo_Hora
	Definir hora Como Entero
	
	Escribir "Ingrese la hora (0-23): "
	Leer hora
	
	Si hora >= 6 Y hora <= 12 Entonces
		Escribir "Buenos días"
	Sino
		Si hora >= 13 Y hora <= 20 Entonces
			Escribir "Buenas tardes"
		Sino
			Escribir "Buenas noches"
		Fin Si
	Fin Si
	
	Escribir "Demostración del funcionamiento: "
	Para i <- 0 Hasta 23 Hacer
		Si i >= 6 Y i <= 12 Entonces
			Escribir "Hora: ", i, " - Buenos días"
		Sino
			Si i >= 13 Y i <= 20 Entonces
				Escribir "Hora: ", i, " - Buenas tardes"
			Sino
				Escribir "Hora: ", i, " - Buenas noches"
			Fin Si
		Fin Si
	Fin Para
FinAlgoritmo