#language:es
  Característica: realizar compras de articulos
  como un nuvo cliente
  quiero ingresar a la pagina www.asd.com
  para realizar una compra de un articulo

  Escenario: agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega "3" unidades de "Mascara de respirador N95" de "Belleza y salud" al carro
    Entonces el ve los productos listados en el carro de compras

  Esquema del escenario: agregar articulos al carrito de compras
    Dado que un nuevo cliente accede hasta la web de compras
    Cuando el agrega productos al carro
      #|<nombreProducto>| <cantidadAgregar>|
    Entonces el ve los productos listados en el carro de compras

  Ejemplos:
    | nombreProducto | cantidadAgregar |
    | Tapabocas N95  | 100             |


