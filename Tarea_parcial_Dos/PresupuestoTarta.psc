Algoritmo PresupuestoTarta
	Definir sabor, tipoChocolate, cantidadSnack Como Entero
	Definir snack, personalizar Como Caracter
	Definir precioTarta, precioTotal Como Real
	
	Escribir "Seleccione el sabor de la tarta:"
	Escribir "1. Manzana ($200)"
	Escribir "2. Fresa ($250)"
	Escribir "3. Chocolate"
	Leer sabor
	
	Segun sabor Hacer
		1:
			precioTarta <- 200
		2:
			precioTarta <- 250
		3:
			Escribir "Seleccione el tipo de chocolate:"
			Escribir "1. Negro ($280)"
			Escribir "2. Blanco ($300)"
			Leer tipoChocolate
			Si tipoChocolate = 1 Entonces
				precioTarta <- 280
			Sino
				precioTarta <- 300
			Fin Si
		De Otro Modo:
			Escribir "Opción inválida"
	Fin Segun
	
	Escribir "¿Desea agregar snack? (s/n): "
	Leer snack
	Si snack = "s" O snack = "S" Entonces
		Escribir "Ingrese la cantidad de snack: "
		Leer cantidadSnack
	Sino
		cantidadSnack <- 0
	Fin Si
	
	Escribir "¿Desea personalizar la tarta con un nombre? (s/n): "
	Leer personalizar
	Definir personalizado Como Logico
	Si personalizar = "s" O personalizar = "S" Entonces
		personalizado <- Verdadero
	Sino
		personalizado <- Falso
	Fin Si
	
	Si personalizado Entonces
		precioTotal <- precioTarta + cantidadSnack * 25 + 30
	Sino
		precioTotal <- precioTarta + cantidadSnack * 25
	Fin Si
	
	Escribir "El precio total es: $", precioTotal
FinAlgoritmo