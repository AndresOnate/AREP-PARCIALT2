# AREP-PARCIALT2


## Diseño de la aplicación



## Guía de Inicio

Las siguientes instrucciones le permitirán descargar una copia y ejecutar la aplicación en su máquina local.

### Prerrequisitos

- Java versión 8 OpenJDK
- Docker
- Maven
- Git

## Instalación 


1. Ubíquese sobre el directorio donde desea realizar la descarga y ejecute el siguiente comando:

    ``` git clone https://github.com/AndresOnate/AREP-PARCIALT2.git ```

2. Navegue al directorio del proyecto

   ``` cd AREP-PARCIALT2 ```

3. Ejecute el siguiente comando para compilar:

   ``` mvn clean install```
   
4. Ejecute el siguiente comando para  iniciar el MathService:

   ``` java -cp "target/classes;target/dependency/*" org.edu.eci.arep.MathService```


4. Ejecute el siguiente comando para  iniciar el Proxy:

   ``` java -cp "target/classes;target/dependency/*" org.edu.eci.arep.ServiceProxyApp``

   
## Probando la Aplicación.  

Ingrese a la siguiente URL para ingresar a el cliente: `` .





## Despliegue en AWS



## Construido Con. 

- Maven - Administrador de dependencias

## Autores 

- Andrés Camilo Oñate Quimbayo

## Versión
1.0.0
