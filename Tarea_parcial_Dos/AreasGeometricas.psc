Algoritmo AreasGeometricas
	Definir opcion Como Entero
	Definir lado, largo, ancho, base, altura, radio Como Real
	
	Repetir
		Escribir "Men� de opciones:"
		Escribir "1. Cuadrado"
		Escribir "2. Rect�ngulo"
		Escribir "3. Tri�ngulo"
		Escribir "4. C�rculo"
		Escribir "5. Demostraci�n del c�lculo de �reas"
		Escribir "6. Salir"
		Escribir "Ingrese su opci�n: "
		Leer opcion
		
		Segun opcion Hacer
			1:
				Escribir "Ingrese el lado del cuadrado: "
				Leer lado
				Escribir "El �rea del cuadrado es: ", lado * lado
			2:
				Escribir "Ingrese el largo del rect�ngulo: "
				Leer largo
				Escribir "Ingrese el ancho del rect�ngulo: "
				Leer ancho
				Escribir "El �rea del rect�ngulo es: ", largo * ancho
			3:
				Escribir "Ingrese la base del tri�ngulo: "
				Leer base
				Escribir "Ingrese la altura del tri�ngulo: "
				Leer altura
				Escribir "El �rea del tri�ngulo es: ", base * altura / 2
			4:
				Escribir "Ingrese el radio del c�rculo: "
				Leer radio
				Escribir "El �rea del c�rculo es: ", 3.14159 * radio * radio
			5:
				Escribir "Demostraci�n del c�lculo de �reas:"
				Escribir "Cuadrado con lado 5: ", 5 * 5
				Escribir "Rect�ngulo con largo 4 y ancho 6: ", 4 * 6
				Escribir "Tri�ngulo con base 3 y altura 7: ", 3 * 7 / 2
				Escribir "C�rculo con radio 2: ", 3.14159 * 2 * 2
			6:
				Escribir "Saliendo del programa..."
			De Otro Modo:
				Escribir "Opci�n inv�lida"
		Fin Segun
	Hasta Que opcion = 6
FinAlgoritmo