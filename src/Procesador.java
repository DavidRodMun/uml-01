public class Procesador {
    //Estados, atributos, propiedades
    public String marca;
    public String modelo;
    public Double precio;
    //Comportamiento o metodo (funciones que estan dentro de una clase)
    //public (+) (modelo de clases)
    //String: tipo devuelto por el metodo
    public String getFullName(){
        //Concatenar cadenas con +
        return marca + " " + modelo + " " + precio;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public Double getPrecio(){
        return precio;
    }

}