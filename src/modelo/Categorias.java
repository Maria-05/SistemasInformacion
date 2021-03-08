package modelo;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "categorias", schema = "bjklpbumfnubxc82xsel")
public class Categorias {
    private Long id;
    private int idCategoria;
    private String nombreCategoria;
    private double salarioBaseCategoria;
    private double complementoCategoria;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "IdCategoria")
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Basic
    @Column(name = "NombreCategoria")
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Basic
    @Column(name = "SalarioBaseCategoria")
    public double getSalarioBaseCategoria() {
        return salarioBaseCategoria;
    }

    public void setSalarioBaseCategoria(double salarioBaseCategoria) {
        this.salarioBaseCategoria = salarioBaseCategoria;
    }

    @Basic
    @Column(name = "ComplementoCategoria")
    public double getComplementoCategoria() {
        return complementoCategoria;
    }

    public void setComplementoCategoria(double complementoCategoria) {
        this.complementoCategoria = complementoCategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categorias that = (Categorias) o;
        return idCategoria == that.idCategoria && Double.compare(that.salarioBaseCategoria, salarioBaseCategoria) == 0 && Double.compare(that.complementoCategoria, complementoCategoria) == 0 && Objects.equals(nombreCategoria, that.nombreCategoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCategoria, nombreCategoria, salarioBaseCategoria, complementoCategoria);
    }


}
