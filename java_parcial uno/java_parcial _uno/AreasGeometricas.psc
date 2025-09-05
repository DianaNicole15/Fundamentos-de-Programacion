Algoritmo AreaFiguras
    Definir opcion Como Entero
    Definir radio, lado, base, altura, area Como Real
	
    Escribir "Menú de Figuras"
    Escribir "1. Círculo"
    Escribir "2. Cuadrado"
    Escribir "3. Rectángulo"
    Escribir "4. Triángulo"
    Escribir "Elige una figura: "
    Leer opcion
	
    Segun opcion Hacer
        1:
            Escribir "Ingresa la medida del radio: "
            Leer radio
            area <- PI * radio * radio
            Escribir "El área del círculo es: ", area
        2:
            Escribir "Ingresa la medida de un lado: "
            Leer lado
            area <- lado * lado
            Escribir "El área del cuadrado es: ", area
        3:
            Escribir "Ingresa la medida de la base: "
            Leer base
            Escribir "Ingresa la medida de la altura: "
            Leer altura
            area <- base * altura
            Escribir "El área del rectángulo es: ", area
        4:
            Escribir "Ingresa la medida de la base: "
            Leer base
            Escribir "Ingresa la medida de la altura: "
            Leer altura
            area <- (base * altura) / 2
            Escribir "El área del triángulo es: ", area
        De Otro Modo:
            Escribir "Opción inválida, intenta de nuevo"
    FinSegun
FinAlgoritmo
