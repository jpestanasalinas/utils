# utils

Scripts con utilidades para el día día

## comments-erasing
Hubo un tiempo en el que estuvo de moda generar un comentario por cada clase/método/variable que se implementaba, inútil y absurdo en el 99% de los casos. Cada clase que veo repleta de comentarios siento la necesidad de borrarlos. Se podría hacer con la opción Reemplazar de cualquier IDE y un par de regex pero creo que me resulta más sencillo invocar este script indicandole el path en el cual se encuentra el fichero que quiero limpiar.

```kotlin comments-erasing.kts -<path-al-fichero>```
