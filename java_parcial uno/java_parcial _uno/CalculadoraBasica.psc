Algoritmo CalBasic
    Definir num1, num2 Como Entero
    Definir op Como Caracter
	
    Escribir "Ingresa el primer número: "
    Leer num1
	
    Escribir "Ingresa el segundo número: "
    Leer num2
	
    Escribir "Ingresa la operación (+, -, *, /): "
    Leer op
	
    Segun op Hacer
        "+":
            Escribir "Resultado: ", num1 + num2
        "-":
            Escribir "Resultado: ", num1 - num2
        "*":
            Escribir "Resultado: ", num1 * num2
        "/":
            Si num2 <> 0 Entonces
                Escribir "Resultado: ", num1 / num2
            SiNo
                Escribir "Error: no se puede realizar la división por cero"
            FinSi
        De Otro Modo:
            Escribir "Operador inválido, intenta con otro diferente"
    FinSegun
FinAlgoritmo