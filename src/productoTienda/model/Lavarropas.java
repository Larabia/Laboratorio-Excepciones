package productoTienda.model;

public class Lavarropas extends Producto{

	public Lavarropas(int stock, String descripcion, float precio) {
		super(stock, descripcion, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float CargoVenta() {
		
		return (precio/100)*35;
	}



}
