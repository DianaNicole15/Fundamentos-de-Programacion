Algoritmo SaludoTiempo
    Escribir "Ingresa la hora (0-23): "
    Leer hora
	
    Segun hora
        Caso 6,7,8,9,10,11,12:
            Escribir "Buenos días"
        Caso 13,14,15,16,17,18,19,20:
            Escribir "Buenas tardes"
        Caso 21,22,23,0,1,2,3,4,5:
            Escribir "Buenas noches"
        De Otro Modo:
            Escribir "Hora no válida, ingresa otra hora."
    FinSegun
FinAlgoritmo
