Algoritmo Calculadora
	Definir num1, num2 Como Real
	Definir operacion Como Caracter
	Definir respuesta Como Caracter
	
	Repetir
		Escribir "Ingrese el primer n�mero: "
		Leer num1
		Escribir "Ingrese el segundo n�mero: "
		Leer num2
		Escribir "Ingrese la operaci�n (+, -, *, /): "
		Leer operacion
		
		Segun operacion Hacer
			"+":
				Escribir "La suma es: ", num1 + num2
			"-":
				Escribir "La resta es: ", num1 - num2
			"*":
				Escribir "La multiplicaci�n es: ", num1 * num2
			"/":
				Si num2 <> 0 Entonces
					Escribir "La divisi�n es: ", num1 / num2
				Sino
					Escribir "Error: No se puede dividir por cero"
				Fin Si
			De Otro Modo:
				Escribir "Operaci�n inv�lida"
		Fin Segun
		
		Escribir "�Desea realizar otra operaci�n? (s/n): "
		Leer respuesta
	Hasta Que respuesta = "n" O respuesta = "N"
FinAlgoritmo