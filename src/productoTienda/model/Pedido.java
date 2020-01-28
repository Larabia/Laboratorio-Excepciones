package productoTienda.model;

import productoTienda.exceptions.SinStockException;

public class Pedido {

		private Producto producto;
		private int cantidad;
		private float precioVenta;

		public Producto getProducto() {
			return producto;
		}
		
		

		public Pedido(Producto producto, int cantidad, float precioVenta) {
			super();
			this.producto = producto;
			this.cantidad = cantidad;
			this.precioVenta = precioVenta;
		}



		public void setProducto(Producto producto) {
			this.producto = producto;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}

		public float getPrecioVenta() {
			return precioVenta;
		}

		public void setPrecioVenta(float precio) {
			this.precioVenta = precio;
		}
		
		public void ConsultaStock (Producto prod, int cant) throws SinStockException {
			
			if (cant > prod.getStock()) {
				throw new SinStockException();
				
			}else {
				System.out.println("Stock disponible");
				
			}
		}
		
		 

		}

	


