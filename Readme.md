# Integrantes: 
* Ximena Alejandra Rodriguez Salamanca 
* Jordy Santiago Bautista Sepulveda 

mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false -Dpackage=edu.eci.cvds.tdd

![image](https://user-images.githubusercontent.com/123812969/220986229-c2326319-02c2-4e74-b7fd-05935ad0ad0d.png)

Con mvn package se verifica la compilacion del proyecto

Con mvn test corremos todos los test de la aplicacion y aparece el test 

# TDD

Para las pruebas unitarias los cinco escenarios que vamos a validar son:

1. Que una persona este viva 
2. Que una persona sea mayor edad 
3. Que una persona no tenga una edad negativa
4. Que el id sea unico
5. Que cumpla con todos los requisitos para votar
