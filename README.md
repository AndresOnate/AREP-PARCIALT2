# AREP-PARCIALT2


## Diseño de la aplicación

<img width="644" alt="descarga" src="https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/c9594515-7257-453f-b404-397496ff514c">


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

   ``` java -cp "target/classes;target/dependency/*" org.edu.eci.arep.ServiceProxyApp ```

   
## Probando la Aplicación.  

Ingrese a la siguiente URL para ingresar a el cliente: `http://localhost:4567/index.html` .

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/28910c59-9f4d-4849-8efb-6214fc06a3f2)


## Linear Search.  

Ingrese en el espacio correspondiente la lista usando como separador una coma, por ejemplo `1,2,3,4,5` y el valor a buscar:

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/f94b9b4f-090b-45af-96cc-241e2401a708)

El resultado muestra un JSON con el index del valor, en la propiedad `output`, si este es encontrado o -1 de lo contrario.

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/55ee93de-ba9a-4770-bd40-54d31596367e)

## Linear Search.  

Ingrese en el espacio correspondiente la lista usando como separador una coma, por ejemplo `1,2,3,4,5` y el valor a buscar:

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/b805dac2-0ea7-4ae1-9a26-11751bfe35d7)

El resultado muestra un JSON con el index del valor, en la propiedad `output`, si este es encontrado o -1 de lo contrario.

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/5075c392-3d96-427b-b399-c3aff132cb5e)

## Despliegue en AWS




## Construido Con. 

- Maven - Administrador de dependencias

## Autores 

- Andrés Camilo Oñate Quimbayo

## Versión
1.0.0
