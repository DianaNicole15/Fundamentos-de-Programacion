Algoritmo Calculadora
	Definir num1, num2 Como Real
	Definir operacion Como Caracter
	Definir respuesta Como Caracter
	
	Repetir
		Escribir "Ingrese el primer número: "
		Leer num1
		Escribir "Ingrese el segundo número: "
		Leer num2
		Escribir "Ingrese la operación (+, -, *, /): "
		Leer operacion
		
		Segun operacion Hacer
			"+":
				Escribir "La suma es: ", num1 + num2
			"-":
				Escribir "La resta es: ", num1 - num2
			"*":
				Escribir "La multiplicación es: ", num1 * num2
			"/":
				Si num2 <> 0 Entonces
					Escribir "La división es: ", num1 / num2
				Sino
					Escribir "Error: No se puede dividir por cero"
				Fin Si
			De Otro Modo:
				Escribir "Operación inválida"
		Fin Segun
		
		Escribir "¿Desea realizar otra operación? (s/n): "
		Leer respuesta
	Hasta Que respuesta = "n" O respuesta = "N"
FinAlgoritmo