public class Computer {
    public String procesador;
    public String placabase;
    public String ram;
    public String caja;
    public String getFullName(){
        return  procesador + " " + placabase + " " + ram + " " + caja;
    }
    public String getProcesador(){
        return procesador;
    }
    public String getPlacaBase(){
        return placabase;
    }
    public String getRam(){
        return ram;
    }
    public String getCaja(){
        return caja;
    }
}
