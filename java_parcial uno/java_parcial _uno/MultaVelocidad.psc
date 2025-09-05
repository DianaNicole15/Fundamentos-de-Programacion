Algoritmo MultaVelocidad
    Definir velocidad Como Entero
    Definir cumple Como Cadena
	
    Escribir "Ingresa tu velocidad: "
    Leer velocidad
	
    Escribir "¿Es tu cumpleaños? (si/no): "
    Leer cumple
	
    Si cumple = "si" O cumple = "SI" Entonces
        Escribir "No tienes una multa porque es tu cumpleaños"
    Sino
        Si velocidad < 60 Entonces
            Escribir "No tienes multa."
        Sino
            Si velocidad <= 80 Entonces
                Escribir "Tienes una multa pequeña."
            Sino
                Escribir "Tienes una multa grande."
            FinSi
        FinSi
    FinSi
FinAlgoritmo
