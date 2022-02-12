-- nombre, dirección y Ciudad) (tabla Clientes) y
-- un listado con los pedidos que han realizado.

-- Por cada pedido se mostrará el ID_pedido, fecha del pedido e importe a pagar.

-- El importe a pagar deberá de calcularse teniendo en cuenta los artículos 
-- que se vendieron en cada pedido junto con el precio al cual fue vendido.

-- Esta información la debes de recuperar de la tabla detalle_pedidos.

-- También es necesario añadir el importe total para cada cliente. 

-- Para resolver este ejercicio no se puede emplear subinformes.	

USE fabrica;

SELECT
  clientes.ID_Cliente,
  clientes.Nombre,
  clientes.Direccion,
  clientes.Ciudad,
  pedidos.ID_Pedido, 
  pedidos.Fecha_Pedido,
  detalle_pedidos.Unidades,
  detalle_pedidos.Precio
FROM clientes
JOIN pedidos
  ON pedidos.ID_Cliente = clientes.ID_Cliente
JOIN detalle_pedidos
  ON pedidos.ID_Pedido = detalle_pedidos.ID_Pedido;