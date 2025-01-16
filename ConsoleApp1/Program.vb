Imports System

Module Program


    Sub Main(args As String())

        ' Declaración de variables
        Dim edad As Integer = 25
        Dim altura As Double = 1.75
        Dim nombre As String = "Juan"
        Dim esEstudiante As Boolean = True
        Dim number As Integer = 1



        ' Mostrar los valores en la consola
        Console.WriteLine("Edad: " & edad)
        Console.WriteLine("Altura: " & altura)
        Console.WriteLine("Nombre: " & nombre)
        Console.WriteLine("¿Es estudiante?: " & esEstudiante)


        'Condicional If '
        If number < 0 Then
            Console.WriteLine("El número es negativo")
        ElseIf number > 0 Then
            Console.WriteLine("El número es positivo")
        Else
            Console.WriteLine("El número es 0")
        End If

        'Condicional Switch'
        Select Case number
            Case 5
                Console.WriteLine("El número es 5")
            Case 3
                Console.WriteLine("El número es 2")
            Case 34
                Console.WriteLine("El número es 34")
            Case 12
                Console.WriteLine("El número es 12")
            Case Else
                Console.WriteLine("El número es otro")
        End Select

        'Bucles'

        'Bucle Do While'
        Do While number <= 5
            'Código para que se ejecute'
        Loop

        'Bucle Do Until'
        Do Until 
            'Código para que se ejecute'
        Loop

        ' Pausa para ver el resultado
        Console.ReadLine()
    End Sub
End Module
