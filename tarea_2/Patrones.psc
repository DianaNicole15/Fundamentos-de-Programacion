Algoritmo Patrones
	Definir n Como Entero
	Definir opcion Como Entero
	
	Escribir "Seleccione un patrón:"
	Escribir "1. Triángulo"
	Escribir "2. Triángulo invertido"
	Escribir "3. Cuadrado"
	Escribir "4. Pirámide"
	Leer opcion
	
	Escribir "Ingrese el número de líneas: "
	Leer n
	
	Segun opcion Hacer
		1:
			Para i <- 1 Hasta n Hacer
				Para j <- 1 Hasta i Hacer
					Escribir Sin Saltar "* "
				Fin Para
				Escribir ""
			Fin Para
		2:
			Para i <- n Hasta 1 Con Paso -1 Hacer
				Para j <- 1 Hasta i Hacer
					Escribir Sin Saltar "* "
				Fin Para
				Escribir ""
			Fin Para
		3:
			Para i <- 1 Hasta n Hacer
				Para j <- 1 Hasta n Hacer
					Escribir Sin Saltar "* "
				Fin Para
				Escribir ""
			Fin Para
		4:
			Para i <- 1 Hasta n Hacer
				Para j <- 1 Hasta n - i Hacer
					Escribir Sin Saltar " "
				Fin Para
				Para k <- 1 Hasta 2 * i - 1 Hacer
					Escribir Sin Saltar "* "
				Fin Para
				Escribir ""
			Fin Para
		De Otro Modo:
			Escribir "Opción inválida"
	Fin Segun
FinAlgoritmo