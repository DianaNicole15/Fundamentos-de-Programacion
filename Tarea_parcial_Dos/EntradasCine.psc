Algoritmo EntradasCine
	Definir numPersonas, diaSemana Como Entero
	Definir membresia Como Caracter
	Definir precioTotal Como Real
	
	Escribir "Ingrese el número de personas: "
	Leer numPersonas
	Escribir "Ingrese el día de la semana (1-7, donde 1 es lunes y 7 es domingo): "
	Leer diaSemana
	Escribir "¿Tiene membresía? (s/n): "
	Leer membresia
	
	precioTotal <- calcularPrecio(numPersonas, diaSemana, membresia = "s" O membresia = "S")
	Escribir "El precio total es: $", precioTotal
FinAlgoritmo

Funcion precioTotal <- calcularPrecio(numPersonas, diaSemana, membresia)
	Definir precioBase Como Real
	precioBase <- 50
	Si diaSemana = 3 Entonces // Miércoles
		precioTotal <- numPersonas * 30
	Sino
		Si diaSemana = 4 Entonces // Jueves
			Definir parejas, personasSoltas Como Entero
			parejas <- numPersonas / 2
			personasSoltas <- numPersonas MOD 2
			precioTotal <- parejas * 75 + personasSoltas * 50
		Sino
			precioTotal <- numPersonas * precioBase
		Fin Si
	Fin Si
	Si membresia Entonces
		precioTotal <- precioTotal * 0.9 // 10% de descuento
	Fin Si
	FinFuncion