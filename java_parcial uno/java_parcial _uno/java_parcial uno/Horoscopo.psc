Algoritmo Horoscopo
    Escribir "Ingresa tu día de nacimiento: "
    Leer dia
    Escribir "Ingresa tu mes de nacimiento (1-12): "
    Leer mes
	
    Segun mes Hacer
        Caso 1:
            Si dia <= 20 Entonces
                Escribir " Tu signo zodiacal es Capricornio"
            Sino
                Escribir "Tu signo zodiacal es Acuario"
            FinSi
        Caso 2:
            Si dia <= 19 Entonces
                Escribir "Tu signo zodiacal es Acuario"
            Sino
                Escribir "Tu signo zodiacal es Piscis"
            FinSi
        Caso 3:
            Si dia <= 20 Entonces
                Escribir "Tu signo zodiacal es Piscis"
            Sino
                Escribir "Tu signo zodiacal es Aries"
            FinSi
        Caso 4:
            Si dia <= 20 Entonces
                Escribir "Tu signo zodiacal es Aries"
            Sino
                Escribir "Tu signo zodiacal es Tauro"
            FinSi
        Caso 5:
            Si dia <= 21 Entonces
                Escribir "Tu signo zodiacal es Tauro"
            Sino
                Escribir "Tu signo zodiacal es Géminis"
            FinSi
        Caso 6:
            Si dia <= 21 Entonces
                Escribir "Tu signo zodiacal es Géminis"
            Sino
                Escribir "Tu signo zodiacal es Cáncer"
            FinSi
        Caso 7:
            Si dia <= 22 Entonces
                Escribir "Tu signo zodiacal es Cáncer"
            Sino
                Escribir "Tu signo zodiacal es Leo"
            FinSi
        Caso 8:
            Si dia <= 23 Entonces
                Escribir "Tu signo zodiacal es Leo"
            Sino 
                Escribir "Tu signo zodiacal es Virgo"
            FinSi
        Caso 9:
            Si dia <= 23 Entonces
                Escribir "Tu signo zodiacal es Virgo"
            Sino
                Escribir "Tu signo zodiacal es Libra"
            FinSi
        Caso 10:
            Si dia <= 23 Entonces
                Escribir "Tu signo zodiacal es Libra"
            Sino
                Escribir "Tu signo zodiacal es Escorpio"
            FinSi
        Caso 11:
            Si dia <= 22 Entonces
                Escribir "Tu signo zodiacal es Escorpio"
            Sino
                Escribir "Tu signo zodiacal es Sagitario"
            FinSi
        Caso 12:
            Si dia <= 21 Entonces
                Escribir "Tu signo zodiacal es Sagitario"
            Sino
                Escribir "Tu signo zodiacal es Capricornio"
            FinSi
        De Otro Modo:
            Escribir "Mes no válido, ingresa un número del 1 al 12"
    FinSegun
	
FinAlgoritmo

