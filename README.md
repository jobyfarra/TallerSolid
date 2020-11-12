# TallerSolid
Taller Principios de S.O.L.I.D

# Literal 1
La clase Pastel y Helado comparten similitudes; los métodos y atributos, es decir, no tenían una función específica que cumplir por lo que ambas tenían código repetido. Por esta razón se esta violando el parámetro Single Responsability Principle que dice que cada clase debe ocuparse de un solo menester. A medida que vaya creciendo los módulos en cada clase van a existir dos clases que van a realizar el mismo trabajo. Lo correcto es crear una clase padre y que las clases mencionadas extiendan de ella.

# Literal 2
En este caso se dice que existe una clase llamada Operaciones.Aderezo que puede ser incluida en un metodo dentro de la clase postre. En ese estado no estan compliendo con la Dependency Inversion Principle al usar metodos en una clase no abstracta para modoficiar otros elementos de otras clases.

# Literal 3
El primer principio Single Responsability Principle nos dice que cada clase debe tener un unico motivo para ser modificada y en el caso de este literal nos dice que calcular y mostrar precio final estar muy relacionadas por la que deben estar en otra clase por si cambia la formula.

# Literal 4
Este literal nos habla de que tenemos un enum que se convierte en una clase abstracta para poder jerarquizar de mejor manera el proyecto y claramente hace referencia al principio Liskov Substitution Principle.

# Literal 5
El pastel se hace de distinta forma que el helado, especificamente un pastel no se hace con leche deslactosada, entonces se debe hacer una verificacion para hacer el pastel con leche descremada. Open-Closed Principle dice que una entidad debe estar abierta a extensiones pero cerrada a modificaciones. Puesto que el software requiere cambios y que unas entidades dependen de otras, las modificaciones en el código de una de ellas puede generar indeseables efectos colaterales en cascada.
