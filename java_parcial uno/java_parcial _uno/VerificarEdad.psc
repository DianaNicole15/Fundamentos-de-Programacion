Algoritmo VerificarEdad
    Definir edad Como Entero
	
    Escribir "¿Qué edad tienes? "
    Leer edad
	
    Si edad < 18 Entonces
        Escribir "Eres menor de edad"
    Sino
        Si edad >= 18 Y edad < 65 Entonces
            Escribir "Eres mayor de edad"
        Sino
            Si edad >= 65 Entonces
                Escribir "Eres adulto mayor"
            FinSi
        FinSi
    FinSi
FinAlgoritmo
