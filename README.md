# microservices

Arquitectura de ejemplo con microservicios, compuesta por lo siguiente:

- **eureka-server:** Servidor para registro de microservicios 
- **eureka-client-1:** Cliente de ejemplo 1 con servicio remoto para Cliente de ejemplo 2
- **eureka-client-2:** Cliente de ejemplo 2
- **zuul-server:** Proxy para gestión de peticiones hacia los clientes de ejemplo

## Pasos para ejecutar los proyectos:

1. Ejecutar **eureka-server**, por configuración estará habilitado sobre el puerto ```8761```
2. Iniciar los clientes 1 y 2, los puertos pueden variar ya que se configuraron en modo aleatorio
4. Verificar en la dirección ```http://localhost:8761``` que los clientes se encuentren registrados en el servidor Eureka
5. Ejecutar **zuul-server** que quedará expuesto sobre el puerto ```8080```
6. Verificar nuevamente en ```http://localhost:8761``` que el proxy se encuentre registrado
7. Realizar las siguientes peticiones para comprobar el redireccionamiento de Zuul:
    - ```http://localhost:8080/client1``` debería retornar ```{key1: value:1}```
    - ```http://localhost:8080/client1/client2``` debería retornar ```{key2: value:2}```
    - ```http://localhost:8080/client2``` debería retornar ```{key2: value:2}```
