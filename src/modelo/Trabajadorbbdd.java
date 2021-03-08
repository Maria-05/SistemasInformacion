package modelo;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;


@Entity
@Table(name = "trabajadorbbdd", schema = "bjklpbumfnubxc82xsel")
public class Trabajadorbbdd {
    private Long id;
    private int idTrabajador;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String nifnie;
    private String email;
    private Date fechaAlta;
    private String codigoCuenta;
    private String iban;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "IdTrabajador")
    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Apellido1")
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    @Basic
    @Column(name = "Apellido2")
    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    @Basic
    @Column(name = "NIFNIE")
    public String getNifnie() {
        return nifnie;
    }

    public void setNifnie(String nifnie) {
        this.nifnie = nifnie;
    }

    @Basic
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FechaAlta")
    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Basic
    @Column(name = "CodigoCuenta")
    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    @Basic
    @Column(name = "IBAN")
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajadorbbdd that = (Trabajadorbbdd) o;
        return idTrabajador == that.idTrabajador && Objects.equals(nombre, that.nombre) && Objects.equals(apellido1, that.apellido1) && Objects.equals(apellido2, that.apellido2) && Objects.equals(nifnie, that.nifnie) && Objects.equals(email, that.email) && Objects.equals(fechaAlta, that.fechaAlta) && Objects.equals(codigoCuenta, that.codigoCuenta) && Objects.equals(iban, that.iban);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTrabajador, nombre, apellido1, apellido2, nifnie, email, fechaAlta, codigoCuenta, iban);
    }


}
