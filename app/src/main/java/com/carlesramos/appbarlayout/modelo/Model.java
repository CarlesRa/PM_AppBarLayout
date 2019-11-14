package com.carlesramos.appbarlayout.modelo;

public class Model {
    private String nif;
    private String nom;
    private String cognom;
    private String fecha;
    private String direccio;
    private String raoSocial;
    private String cif;
    private String webSite;
    private String email;
    private String contrasenya;

    public Model(String nif, String nom, String cognom, String fecha, String direccio,
                 String raoSocial, String cif, String webSite, String email, String contrasenya) {
        this.nif = nif;
        this.nom = nom;
        this.cognom = cognom;
        this.fecha = fecha;
        this.direccio = direccio;
        this.raoSocial = raoSocial;
        this.cif = cif;
        this.webSite = webSite;
        this.email = email;
        this.contrasenya = contrasenya;
    }

    public String getNif() {
        return nif;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public String getFecha() {
        return fecha;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getRaoSocial() {
        return raoSocial;
    }

    public String getCif() {
        return cif;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getEmail() {
        return email;
    }

    public void setContrasenya(String contrasenya) {
        if (contrasenya.equals(this.contrasenya)){
            this.contrasenya = contrasenya;
        }
    }
}
