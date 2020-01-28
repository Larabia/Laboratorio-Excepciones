package productoTienda.model;

public class Heladera extends Producto{


	public Heladera(int stock, String descripcion, float precio) {
		super(stock, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float CargoVenta() {
		// TODO Auto-generated method stub
		return (precio/100)*30;
	}


}
