package es.cursojava.orientacionobjetos.ejercicios.tienda;

public class TiendaManiqui {
	
	private String nombre;
	private Maniqui[] maniquies;
	
//	Este ejercicio fue corregido en su última clase (TiendaManiqui.java). *	
	
	public TiendaManiqui(String nombre) {
		super();
		this.maniquies = new Maniqui[3];
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Maniqui[] abrirTienda() {
		System.out.println("Abiertos!");
		Boton boton1 = new Boton("Negro", 2, "Redondo");
		Boton boton2 = new Boton("Negro", 2, "Redondo");
		Boton boton3 = new Boton("Negro", 2, "Redondo");
		Boton boton4 = new Boton("Negro", 2, "Redondo");
		Boton[] botones = {boton1, boton2, boton3, boton4};
		
		Camisa camisa = new Camisa("Blanca", 50, 78, botones);
		Pantalon pantalon = new Pantalon("Azul", 44, 89, boton4);
		Vestido vestido = new Vestido("Rojo", 43, 40);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, camisa, pantalon);
		Maniqui maniqui3 = new Maniqui(3, vestido);
		
		maniquies[0] = maniqui1;
		maniquies[1] = maniqui2;
		maniquies[2] = maniqui3;
		
		return maniquies;
	}
	
	public void vestirManiquies(Maniqui[] maniquiesVestir) {
		
		for (Maniqui maniqui : maniquies) {
			if (!maniqui.isEstaVestido()) {
//				System.out.println("El maniqui " + maniqui.getID() + " no tiene ropa");
				Vestido vestido = new Vestido("Azul", 48, 60);
				maniqui.vestir(vestido);
			}
		}
	}
	
	public void mostrarEscaparate(Maniqui[] maniquiesEscaparate) {
		
		for (Maniqui maniqui : maniquies) {
			System.out.println("Maniqui " + maniqui.getID());
			double precioRopa = 0;
			if (maniqui.getPantalon() != null) {
				Pantalon pantalon = maniqui.getPantalon();
				System.out.println("Pantalon");
				System.out.println("Color: " + pantalon.getColor());
				System.out.println("Talla: " + pantalon.getTalla());
				System.out.println("Precio: " + pantalon.getPrecio());
				precioRopa += pantalon.getPrecio();
			}
			
			if (maniqui.getCamisa() != null) {
				Camisa camisa = maniqui.getCamisa();
				System.out.println("Camisa");
				System.out.println("Color: " + camisa.getColor());
				System.out.println("Talla: " + camisa.getTalla());
				System.out.println("Precio: " + camisa.getPrecio());
				precioRopa += camisa.getPrecio();
			}
			
			if (maniqui.getVestido() != null) {
				Vestido vestido = maniqui.getVestido();
				System.out.println("Camisa");
				System.out.println("Color: " + vestido.getColor());
				System.out.println("Talla: " + vestido.getTalla());
				System.out.println("Precio: " + vestido.getPrecio());
				precioRopa += vestido.getPrecio();
			}
			
			System.out.println("Precio Total del maniqui " + 
								maniqui.getID() + ": " + precioRopa);
		}
	}
	
	public void cerrarTienda(Maniqui[] maniquies) {
		System.out.println("Adios!");
	}
	
	public static void main(String[] args) {
		TiendaManiqui tienda = new TiendaManiqui("Tienda");
		Maniqui[] ms = tienda.abrirTienda();
		tienda.vestirManiquies(ms);
		tienda.mostrarEscaparate(ms);
		tienda.cerrarTienda(ms);
	}
}
