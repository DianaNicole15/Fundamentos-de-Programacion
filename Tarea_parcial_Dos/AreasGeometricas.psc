Algoritmo AreasGeometricas
	Definir opcion Como Entero
	Definir lado, largo, ancho, base, altura, radio Como Real
	
	Repetir
		Escribir "Menú de opciones:"
		Escribir "1. Cuadrado"
		Escribir "2. Rectángulo"
		Escribir "3. Triángulo"
		Escribir "4. Círculo"
		Escribir "5. Demostración del cálculo de áreas"
		Escribir "6. Salir"
		Escribir "Ingrese su opción: "
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Ingrese el lado del cuadrado: "
				Leer lado
				Escribir "El área del cuadrado es: ", lado * lado
			2:
				Escribir "Ingrese el largo del rectángulo: "
				Leer largo
				Escribir "Ingrese el ancho del rectángulo: "
				Leer ancho
				Escribir "El área del rectángulo es: ", largo * ancho
			3:
				Escribir "Ingrese la base del triángulo: "
				Leer base
				Escribir "Ingrese la altura del triángulo: "
				Leer altura
				Escribir "El área del triángulo es: ", base * altura / 2
			4:
				Escribir "Ingrese el radio del círculo: "
				Leer radio
				Escribir "El área del círculo es: ", 3.14159 * radio * radio
			5:
				Escribir "Demostración del cálculo de áreas:"
				Escribir "Cuadrado con lado 5: ", 5 * 5
				Escribir "Rectángulo con largo 4 y ancho 6: ", 4 * 6
				Escribir "Triángulo con base 3 y altura 7: ", 3 * 7 / 2
				Escribir "Círculo con radio 2: ", 3.14159 * 2 * 2
			6:
				Escribir "Saliendo del programa..."
			De Otro Modo:
				Escribir "Opción inválida"
		Fin Segun
	Hasta Que opcion = 6
FinAlgoritmo