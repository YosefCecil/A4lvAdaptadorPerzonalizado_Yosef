package com.example.lista_adapterlayout_yosef;
//Yosef Cecil Flores Martinez
public class Datos {
    private String Nombres;
    private String ApellidoP;
    private String ApellidoM;

    public Datos() {}

    public Datos(String nombres, String apellidoP, String apellidoM) {
        this.Nombres = nombres;
        ApellidoP = apellidoP;
        ApellidoM = apellidoM;
    }

    public String getNombre()
    {
        return Nombres;
    }

    public void setNombre(String nombres)
    {
        this.Nombres = nombres;
    }

    public String getApellidoP()
    {
        return ApellidoP;
    }

    public void setApellidoP(String apellidoP)
    {
        ApellidoP = apellidoP;
    }

    public String getApellodoM()
    {
        return ApellidoM;
    }

    public void setApellodoM(String apellidoM)
    {
        ApellidoM = apellidoM;
    }

    public String toString()
    {
        return Nombres+"    "+ApellidoP+" "+ApellidoM;
    }
}
