# Autor:Daniel Felipe Alfonso Bueno
# Profesor: Luis Daniel Benavides
# AREP - Arquitectura Empresarial
## Prerrequisitos
Se debe tener instalado JAVA JDK 8 o superior y MVN.

## Uso del Proyecto 
Debemos clonar el proyecto de nuestro repositorio: 
~~~
git clone https://github.com/DanielAlfonso17/AREP-LAB4.git
~~~
Entramos al directorio del proyecto y compilamos con: 
~~~
mvn package
~~~
Ejecutamos nuestro servidor: 
~~~
java -cp target\classes co.edu.escuelaing.sparkd.microspring.MicroSpringBoot co.edu.escuelaing.sparkd.microspring.tests.HelloController
~~~
Probamos en nuestro navegador, con un recurso estatico index.html
