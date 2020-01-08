/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.avbravo.desktopclient.entity;

/**
 *
 * @author avbravo
 */
public class Jsdusuario {

    private String username;
    private String password;
    private String email;
    private String nombre;
    private String cedula;
    private String rol; // cajera contable administradorpublic class jsdusuarios

    public Jsdusuario() {
    }

    public Jsdusuario(String username, String password, String email, String nombre, String cedula, String rol) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.nombre = nombre;
        this.cedula = cedula;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}
