# Validacion Mutantes

Prueba tecnica



## Pre-requisitos 📋

Servidor de aplicaciones puedes ser apache, base de datos MYSQL, herramienta para testing de API REST (Postman)



### Instalación 🔧

_ Se debe compilar el codigo este genera un archivo .WAR el cual se debera desplegar en el servidor de apliacaiones apache, para su correcto funcionamiente debe estar instalada la base de datos


## Ejecutando las pruebas ⚙️

Para realizar las pruebas y acceder al servicio los end point son:


/mutant/
_ el cual resive un array de String y devuelve HTTP 200-OK si es afirmativo, en caso contrario un
403-Forbidden

ejemplo de  String
“dna”:["AXXXEA","CRTTRC","TRATGE","AGATTG","CCAATA","ACACTG"]

/stats
_ el cual retorna un informe de la cantidad de registros y el ratio de mutantes

## Construido con 🛠️

_Menciona las herramientas que utilizaste para crear tu proyecto_

* [Sprint boot](https://spring.io/projects/spring-boot) - Framework
* [MYSQL](https://www.mysql.com/) - Motor Base de Datos


## Autores ✒️



* **Yeferson martinez** - *Trabajo Inicial* 


## Licencia 📄
_Este proyecto esta bajo licencia de codigo abierto



