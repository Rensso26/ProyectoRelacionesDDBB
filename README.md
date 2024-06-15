------Requisitos---------
se necesita una base de datos con el schema
persistencia_db

------Descripción---------

En ProyectoRelaciones
se tiene la carpeta entity donde se crea las tablas Carrera, Estudiantes, Horarios, Materias, Profesor,
donde se tiene las relaciones:
OneToOne entre Horarios y Materias
OneToMany entre Carrera y Materias
ManyToMany entre Estudiantes y Materias
ManyToOne entre Profesor y Materias
En repository se tiene las interfaces que utilizamos con jpa para crear el CRUD
la carpeta services donde se encuentra la clase CRUD donde:
podemos crear, leer, actualizar y eliminar los datos de la base de datos
y afuera de todo la clase Example donde se obtiene un ejemplo de cada tipo de relación mediante consola y se puede ver en la base de datos los resultados
