Algoritmo LlamadaTelefonica
	Definir  minutos Como Entero
	Definir costo, impuesto, total Como Real
	Definir dia, turno como cadena
	
	Escribir  "Ingrese la duracion de la llamada en minutos:"
	Leer minutos
	Escribir "Ingrese el dia  (domingo o habil):"
	Leer dia
	si dia = "habil" Entonces
		Escribir "ingrese el turno (matutino/vespertino):"
		Leer turno
	FinSi
	
	costo <- 0 
	si minutos <- 5 Entonces
		costo <- minutos * 1.00
	SiNo
		costo <- 5 * 1.00
		si minutos <- 8 Entonces
			costo <- costo + (minutos - 5) * 0.80
		SiNo
			costo <- costo + 3 * 0.80
			si minutos <-  10 Entonces
				costo <- costo + (minutos - 8) * 0.70
			SiNo
				costo <- costo + 2 * 0.70
				costo <- costo + (minutos - 10) * 0.50
			FinSi
		FinSi
	FinSi
	
	total <- costo + impuesto
	
	Escribir "Costo base: ", costo
	Escribir "Impuesto: ", impuesto
	Escribir "total a pagar: ", total
FinAlgoritmo
