package prueba.modelo;

public class ModeloProducto {
	
private String codigo;	
private String nombre;
private String stock;

public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getStock() {
	return stock;
}
public void setStock(String stock) {
	this.stock = stock;
}




@Override
public String toString() {
	return "ModeloProducto [codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + "]";
}





}
