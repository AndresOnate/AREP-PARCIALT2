# AREP-PARCIALT2

Se diseñó un prototipo de sistema de microservicios para computar las funciones de ordenamiento.  El servicio de las funciones de ordenamiento está desplegado en  dos instancias virtuales de EC2. Adicionalmente, debe se implementó un service proxy que recibe las solicitudes de llamado desde los clientes  y se las delega a las dos instancias del servicio de ordenamiento usando un algoritmo de round-robin. El proxy está desplegado en otra máquina EC2. Los puertos pueden ser configurados de las instancias del servicio en el proxy usando variables de entorno del sistema operativo.  Finalmente, se construyó un cliente web para permitir ejecutar los servicios de busqueda linear y busqueda binaria.

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

Video con pruebas del despligue en AWS: https://youtu.be/CKKP6Wpx-V4


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

Debe contar con tres instancias para cumplir con los requisitos de la arquitetura.

En las tres instancias, debe instalar `git`, `maven`, `java 1.8`

1. Ubíquese sobre el directorio donde desea realizar la descarga y ejecute el siguiente comando:

    ``` git clone https://github.com/AndresOnate/AREP-PARCIALT2.git ```

Debe modificar el atributo `mathServices` de la clase `RRInvoker` para que correspondan con los los DNS de las instancias que ejecutarán el MathService

3. Navegue al directorio del proyecto

   ``` cd AREP-PARCIALT2 ```

4. Ejecute el siguiente comando para compilar:

   ``` mvn clean install```
   
5. Ejecute el siguiente comando para  iniciar el MathService, este service se ejecutó en dos de las instancias previamente creadas:

   ``` java -cp "target/classes:target/dependency/*" org.edu.eci.arep.MathService```

   ![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/d02026f4-ba6c-4429-81b3-bc82a09a285c)


4. Ejecute el siguiente comando para  iniciar el Proxy:

   ``` java -cp "target/classes:target/dependency/*" org.edu.eci.arep.ServiceProxyApp ```

   ![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/c53bb61a-7fb6-44d4-a73e-0a5d62f4cd12)

Si los puertos no fueron configurados como variables de entorno, los puertos por defecto son `35000` para el `MathService` y `4567` para el `Proxy`

Compruebe que los MathServices están funcionando de forma independiente `{dns_vm}:{port}/binarysearch?list=1,2,3,4,5&value=5`: 

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/04207c7e-07db-4e16-9c62-eb10f0d63591)

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/d2aabf72-f825-4ce3-b636-24e7e490854d)

Compruebe que el Proxy está entregando el cliente web `{dns_vm}:{port}/index.html: :

![image](https://github.com/AndresOnate/AREP-PARCIALT2/assets/63562181/ea0231d6-9470-4abc-8efe-825400ddb9ee)


## Construido Con. 

- Maven - Administrador de dependencias

## Autores 

- Andrés Camilo Oñate Quimbayo

## Versión
1.0.0
