public class PlacaBase {
    public String marca;
    public String modelo;
    public String cpu;
    public String storage;
    public Double precio;
    public String getFullName(){
        return marca + " " + modelo + " " + cpu + " " + storage + " " + precio;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCpu(){
        return cpu;
    }
    public String getStorage(){
        return storage;
    }
    public Double getPrecio(){
        return precio;
    }

}

