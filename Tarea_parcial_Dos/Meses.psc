Algoritmo Meses
	Definir mes Como Entero
	Escribir "Ingrese un mes (1-12): "
	Leer mes
	
	Segun mes Hacer
		1:
			Escribir "El mes de Enero tiene 31 d�as."
		2:
			Escribir "El mes de Febrero tiene 28 d�as."
		3:
			Escribir "El mes de Marzo tiene 31 d�as."
		4:
			Escribir "El mes de Abril tiene 30 d�as."
		5:
			Escribir "El mes de Mayo tiene 31 d�as."
		6:
			Escribir "El mes de Junio tiene 30 d�as."
		7:
			Escribir "El mes de Julio tiene 31 d�as."
		8:
			Escribir "El mes de Agosto tiene 31 d�as."
		9:
			Escribir "El mes de Septiembre tiene 30 d�as."
		10:
			Escribir "El mes de Octubre tiene 31 d�as."
		11:
			Escribir "El mes de Noviembre tiene 30 d�as."
		12:
			Escribir "El mes de Diciembre tiene 31 d�as."
		De Otro Modo:
			Escribir "Mes inv�lido"
	Fin Segun
	
	Escribir "Meses del a�o: "
	Para i <- 1 Hasta 12 Hacer
		Segun i Hacer
			1:
				Escribir i, ". Enero"
			2:
				Escribir i, ". Febrero"
			3:
				Escribir i, ". Marzo"
			4:
				Escribir i, ". Abril"
			5:
				Escribir i, ". Mayo"
			6:
				Escribir i, ". Junio"
			7:
				Escribir i, ". Julio"
			8:
				Escribir i, ". Agosto"
			9:
				Escribir i, ". Septiembre"
			10:
				Escribir i, ". Octubre"
			11:
				Escribir i, ". Noviembre"
			12:
				Escribir i, ". Diciembre"
		Fin Segun
	Fin Para
FinAlgoritmo
