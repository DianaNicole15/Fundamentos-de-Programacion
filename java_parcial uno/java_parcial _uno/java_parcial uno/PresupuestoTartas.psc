Algoritmo PresuTartas
		Definir sabor, tipoChocolate, respuestaSnack, respuestaNombre, seguirSnack Como Cadena
		Definir total, precioBase, precioSnack, precioNombre Como Entero
		
		// Inicializar precios
		total <- 0
		precioSnack <- 0
		precioNombre <- 0
		
		// Entrada: sabor de la tarta
		Escribir "Ingresa el sabor de la tarta (manzana, fresa, chocolate): "
		Leer sabor
		
		// Selección del sabor
		Segun sabor Hacer
			Caso "manzana":
				precioBase <- 200
			Caso "fresa":
				precioBase <- 250
			Caso "chocolate":
				Escribir " ¿Qué chocolate prefieres? (negro o blanco): "
				Leer tipoChocolate
				
				Segun tipoChocolate Hacer
					Caso "negro":
						precioBase <- 280
					Caso "blanco":
						precioBase <- 300
					De Otro Modo:
						Escribir "Tipo de chocolate no válido, ingresa otro tipo"
						total <- 0
				FinSegun
			De Otro Modo:
				Escribir "Sabor no válido, ingresa un sabor válido"
				total <- 0
		FinSegun
		
		// Agregar snacks uno por uno
		Escribir "¿Quieres añadir snacks? (si/no): "
		Leer respuestaSnack
		Mientras respuestaSnack = "si" Hacer
			precioSnack <- precioSnack + 25
			Escribir "¿Quieres agregar otro snack? (si/no): "
			Leer seguirSnack
			respuestaSnack <- seguirSnack
		FinMientras
		
		// Preguntar si desea personalizar con nombre
		Escribir "¿Quieres personalizar la tarta con un nombre? (si/no): "
		Leer respuestaNombre
		Si respuestaNombre = "si" Entonces
			precioNombre <- 30
		FinSi
		
		// Calcular total
		total <- precioBase + precioSnack + precioNombre
		
		// Salida
		Escribir "El precio total de la tarta es $", total, " pesos"
FinAlgoritmo
