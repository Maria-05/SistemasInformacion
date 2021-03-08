package modelo;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empresas", schema = "bjklpbumfnubxc82xsel", catalog = "")
public class Empresas {
    private Long id;
    private int idEmpresa;
    private String nombre;
    private String cif;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "IdEmpresa")
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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
    @Column(name = "CIF")
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresas that = (Empresas) o;
        return idEmpresa == that.idEmpresa && Objects.equals(nombre, that.nombre) && Objects.equals(cif, that.cif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpresa, nombre, cif);
    }
}
