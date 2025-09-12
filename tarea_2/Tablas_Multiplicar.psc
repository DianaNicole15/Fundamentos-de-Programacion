Algoritmo Tablas_Multiplicar
	Definir n Como Entero
	Repetir
		Escribir "Ingres un numero (0 para salir);"
		Leer n
		si n <> 0 Entonces
			Para i <- 1 Hasta 10 Hacer
				Escribir n, "x", i, "=", n * i
			FinPara
		FinSi
	Hasta Que n = 0
	
FinAlgoritmo
