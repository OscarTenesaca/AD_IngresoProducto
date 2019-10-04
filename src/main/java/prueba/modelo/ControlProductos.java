package prueba.modelo;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean (name ="controlproductos")
@ApplicationScoped

public class ControlProductos {
	
	private ModeloProducto modeloProducto;
	private ArrayList<ModeloProducto> productos;
	private String cod;
	
	
	@PostConstruct
	public void init() {
		
		modeloProducto = new ModeloProducto();
		productos = new ArrayList<ModeloProducto>();
	}
	
	public String guardarProducto() {


		productos.add(modeloProducto);
		modeloProducto = new ModeloProducto();
		return null;

	}
	
	public String listarProducto() {
		for (ModeloProducto modeloProducto : productos) {
			System.out.println(">> " + modeloProducto.toString());
		}
		System.out.println(productos.size());
		return null;
	}

	public ModeloProducto getModeloProducto() {
		return modeloProducto;
	}

	public void setModeloProducto(ModeloProducto modeloProducto) {
		this.modeloProducto = modeloProducto;
	}

	public ArrayList<ModeloProducto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<ModeloProducto> productos) {
		this.productos = productos;
	}
	
	

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}
	
	
	
	

	public String consultar() {

		
		return "BuscarProductos";
	}	


	public String BuscarProducto() {
		
		
		System.out.println(cod);
	
			for (ModeloProducto modeloProducto : productos) {
				
				System.out.println("llega des lisr");
				String cod1=cod;
				
				if(productos.get(0).equals(cod1)) {
					
					System.out.println(cod1+"hfjhfjh");
					
					System.out.println(">>ggggg " + modeloProducto.toString());

					
					
				}
				
			}
		
		
	
		return "BuscarProductos";
	}
	
	

	

}
