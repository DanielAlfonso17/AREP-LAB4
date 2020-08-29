# Autor:Daniel Felipe Alfonso Bueno
# Profesor: Luis Daniel Benavides
# AREP - Arquitectura Empresarial
## Prerrequisitos
Se debe tener instalado JAVA JDK 8 o superior y MVN.

## Diagrama 

![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/7.PNG)
## Uso del Proyecto 
Debemos clonar el proyecto de nuestro repositorio: 
~~~
git clone https://github.com/DanielAlfonso17/AREP-LAB4.git
~~~
Entramos al directorio del proyecto y compilamos con: 
~~~
mvn package
~~~
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/1.PNG)

Ejecutamos nuestro servidor: 
~~~
java -cp target\classes co.edu.escuelaing.sparkd.microspring.MicroSpringBoot co.edu.escuelaing.sparkd.microspring.tests.HelloController
~~~
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/2.PNG)
Probamos en nuestro navegador, con un recurso estatico index.html
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/3.PNG)
Probamos con los EndPoint controllers definidos en HelloController
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/4.PNG)
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/5.PNG)
![imagen](https://github.com/DanielAlfonso17/AREP-LAB4/blob/master/Pantallazos/6.PNG)
