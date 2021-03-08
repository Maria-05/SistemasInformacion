package modelo;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "nomina", schema = "bjklpbumfnubxc82xsel")
public class Nomina {
    private Long id;
    private int idNomina;
    private int mes;
    private int anio;
    private Integer numeroTrienios;
    private Double importeTrienios;
    private Double importeSalarioMes;
    private Double importeComplementoMes;
    private Double valorProrrateo;
    private Double brutoAnual;
    private Double irpf;
    private Double importeIrpf;
    private Double baseEmpresario;
    private Double seguridadSocialEmpresario;
    private Double importeSeguridadSocialEmpresario;
    private Double desempleoEmpresario;
    private Double importeDesempleoEmpresario;
    private Double formacionEmpresario;
    private Double importeFormacionEmpresario;
    private Double accidentesTrabajoEmpresario;
    private Double importeAccidentesTrabajoEmpresario;
    private Double fogasaEmpresario;
    private Double importeFogasaEmpresario;
    private Double seguridadSocialTrabajador;
    private Double importeSeguridadSocialTrabajador;
    private Double desempleoTrabajador;
    private Double importeDesempleoTrabajador;
    private Double formacionTrabajador;
    private Double importeFormacionTrabajador;
    private Double brutoNomina;
    private Double liquidoNomina;
    private Double costeTotalEmpresario;


    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "IdNomina")
    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    @Basic
    @Column(name = "Mes")
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Basic
    @Column(name = "Anio")
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Basic
    @Column(name = "NumeroTrienios")
    public Integer getNumeroTrienios() {
        return numeroTrienios;
    }

    public void setNumeroTrienios(Integer numeroTrienios) {
        this.numeroTrienios = numeroTrienios;
    }

    @Basic
    @Column(name = "ImporteTrienios")
    public Double getImporteTrienios() {
        return importeTrienios;
    }

    public void setImporteTrienios(Double importeTrienios) {
        this.importeTrienios = importeTrienios;
    }

    @Basic
    @Column(name = "ImporteSalarioMes")
    public Double getImporteSalarioMes() {
        return importeSalarioMes;
    }

    public void setImporteSalarioMes(Double importeSalarioMes) {
        this.importeSalarioMes = importeSalarioMes;
    }

    @Basic
    @Column(name = "ImporteComplementoMes")
    public Double getImporteComplementoMes() {
        return importeComplementoMes;
    }

    public void setImporteComplementoMes(Double importeComplementoMes) {
        this.importeComplementoMes = importeComplementoMes;
    }

    @Basic
    @Column(name = "ValorProrrateo")
    public Double getValorProrrateo() {
        return valorProrrateo;
    }

    public void setValorProrrateo(Double valorProrrateo) {
        this.valorProrrateo = valorProrrateo;
    }

    @Basic
    @Column(name = "BrutoAnual")
    public Double getBrutoAnual() {
        return brutoAnual;
    }

    public void setBrutoAnual(Double brutoAnual) {
        this.brutoAnual = brutoAnual;
    }

    @Basic
    @Column(name = "IRPF")
    public Double getIrpf() {
        return irpf;
    }

    public void setIrpf(Double irpf) {
        this.irpf = irpf;
    }

    @Basic
    @Column(name = "ImporteIRPF")
    public Double getImporteIrpf() {
        return importeIrpf;
    }

    public void setImporteIrpf(Double importeIrpf) {
        this.importeIrpf = importeIrpf;
    }

    @Basic
    @Column(name = "BaseEmpresario")
    public Double getBaseEmpresario() {
        return baseEmpresario;
    }

    public void setBaseEmpresario(Double baseEmpresario) {
        this.baseEmpresario = baseEmpresario;
    }

    @Basic
    @Column(name = "SeguridadSocialEmpresario")
    public Double getSeguridadSocialEmpresario() {
        return seguridadSocialEmpresario;
    }

    public void setSeguridadSocialEmpresario(Double seguridadSocialEmpresario) {
        this.seguridadSocialEmpresario = seguridadSocialEmpresario;
    }

    @Basic
    @Column(name = "ImporteSeguridadSocialEmpresario")
    public Double getImporteSeguridadSocialEmpresario() {
        return importeSeguridadSocialEmpresario;
    }

    public void setImporteSeguridadSocialEmpresario(Double importeSeguridadSocialEmpresario) {
        this.importeSeguridadSocialEmpresario = importeSeguridadSocialEmpresario;
    }

    @Basic
    @Column(name = "DesempleoEmpresario")
    public Double getDesempleoEmpresario() {
        return desempleoEmpresario;
    }

    public void setDesempleoEmpresario(Double desempleoEmpresario) {
        this.desempleoEmpresario = desempleoEmpresario;
    }

    @Basic
    @Column(name = "ImporteDesempleoEmpresario")
    public Double getImporteDesempleoEmpresario() {
        return importeDesempleoEmpresario;
    }

    public void setImporteDesempleoEmpresario(Double importeDesempleoEmpresario) {
        this.importeDesempleoEmpresario = importeDesempleoEmpresario;
    }

    @Basic
    @Column(name = "FormacionEmpresario")
    public Double getFormacionEmpresario() {
        return formacionEmpresario;
    }

    public void setFormacionEmpresario(Double formacionEmpresario) {
        this.formacionEmpresario = formacionEmpresario;
    }

    @Basic
    @Column(name = "ImporteFormacionEmpresario")
    public Double getImporteFormacionEmpresario() {
        return importeFormacionEmpresario;
    }

    public void setImporteFormacionEmpresario(Double importeFormacionEmpresario) {
        this.importeFormacionEmpresario = importeFormacionEmpresario;
    }

    @Basic
    @Column(name = "AccidentesTrabajoEmpresario")
    public Double getAccidentesTrabajoEmpresario() {
        return accidentesTrabajoEmpresario;
    }

    public void setAccidentesTrabajoEmpresario(Double accidentesTrabajoEmpresario) {
        this.accidentesTrabajoEmpresario = accidentesTrabajoEmpresario;
    }

    @Basic
    @Column(name = "ImporteAccidentesTrabajoEmpresario")
    public Double getImporteAccidentesTrabajoEmpresario() {
        return importeAccidentesTrabajoEmpresario;
    }

    public void setImporteAccidentesTrabajoEmpresario(Double importeAccidentesTrabajoEmpresario) {
        this.importeAccidentesTrabajoEmpresario = importeAccidentesTrabajoEmpresario;
    }

    @Basic
    @Column(name = "FOGASAEmpresario")
    public Double getFogasaEmpresario() {
        return fogasaEmpresario;
    }

    public void setFogasaEmpresario(Double fogasaEmpresario) {
        this.fogasaEmpresario = fogasaEmpresario;
    }

    @Basic
    @Column(name = "ImporteFOGASAEmpresario")
    public Double getImporteFogasaEmpresario() {
        return importeFogasaEmpresario;
    }

    public void setImporteFogasaEmpresario(Double importeFogasaEmpresario) {
        this.importeFogasaEmpresario = importeFogasaEmpresario;
    }

    @Basic
    @Column(name = "SeguridadSocialTrabajador")
    public Double getSeguridadSocialTrabajador() {
        return seguridadSocialTrabajador;
    }

    public void setSeguridadSocialTrabajador(Double seguridadSocialTrabajador) {
        this.seguridadSocialTrabajador = seguridadSocialTrabajador;
    }

    @Basic
    @Column(name = "ImporteSeguridadSocialTrabajador")
    public Double getImporteSeguridadSocialTrabajador() {
        return importeSeguridadSocialTrabajador;
    }

    public void setImporteSeguridadSocialTrabajador(Double importeSeguridadSocialTrabajador) {
        this.importeSeguridadSocialTrabajador = importeSeguridadSocialTrabajador;
    }

    @Basic
    @Column(name = "DesempleoTrabajador")
    public Double getDesempleoTrabajador() {
        return desempleoTrabajador;
    }

    public void setDesempleoTrabajador(Double desempleoTrabajador) {
        this.desempleoTrabajador = desempleoTrabajador;
    }

    @Basic
    @Column(name = "ImporteDesempleoTrabajador")
    public Double getImporteDesempleoTrabajador() {
        return importeDesempleoTrabajador;
    }

    public void setImporteDesempleoTrabajador(Double importeDesempleoTrabajador) {
        this.importeDesempleoTrabajador = importeDesempleoTrabajador;
    }

    @Basic
    @Column(name = "FormacionTrabajador")
    public Double getFormacionTrabajador() {
        return formacionTrabajador;
    }

    public void setFormacionTrabajador(Double formacionTrabajador) {
        this.formacionTrabajador = formacionTrabajador;
    }

    @Basic
    @Column(name = "ImporteFormacionTrabajador")
    public Double getImporteFormacionTrabajador() {
        return importeFormacionTrabajador;
    }

    public void setImporteFormacionTrabajador(Double importeFormacionTrabajador) {
        this.importeFormacionTrabajador = importeFormacionTrabajador;
    }

    @Basic
    @Column(name = "BrutoNomina")
    public Double getBrutoNomina() {
        return brutoNomina;
    }

    public void setBrutoNomina(Double brutoNomina) {
        this.brutoNomina = brutoNomina;
    }

    @Basic
    @Column(name = "LiquidoNomina")
    public Double getLiquidoNomina() {
        return liquidoNomina;
    }

    public void setLiquidoNomina(Double liquidoNomina) {
        this.liquidoNomina = liquidoNomina;
    }

    @Basic
    @Column(name = "CosteTotalEmpresario")
    public Double getCosteTotalEmpresario() {
        return costeTotalEmpresario;
    }

    public void setCosteTotalEmpresario(Double costeTotalEmpresario) {
        this.costeTotalEmpresario = costeTotalEmpresario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nomina that = (Nomina) o;
        return idNomina == that.idNomina && mes == that.mes && anio == that.anio && Objects.equals(numeroTrienios, that.numeroTrienios) && Objects.equals(importeTrienios, that.importeTrienios) && Objects.equals(importeSalarioMes, that.importeSalarioMes) && Objects.equals(importeComplementoMes, that.importeComplementoMes) && Objects.equals(valorProrrateo, that.valorProrrateo) && Objects.equals(brutoAnual, that.brutoAnual) && Objects.equals(irpf, that.irpf) && Objects.equals(importeIrpf, that.importeIrpf) && Objects.equals(baseEmpresario, that.baseEmpresario) && Objects.equals(seguridadSocialEmpresario, that.seguridadSocialEmpresario) && Objects.equals(importeSeguridadSocialEmpresario, that.importeSeguridadSocialEmpresario) && Objects.equals(desempleoEmpresario, that.desempleoEmpresario) && Objects.equals(importeDesempleoEmpresario, that.importeDesempleoEmpresario) && Objects.equals(formacionEmpresario, that.formacionEmpresario) && Objects.equals(importeFormacionEmpresario, that.importeFormacionEmpresario) && Objects.equals(accidentesTrabajoEmpresario, that.accidentesTrabajoEmpresario) && Objects.equals(importeAccidentesTrabajoEmpresario, that.importeAccidentesTrabajoEmpresario) && Objects.equals(fogasaEmpresario, that.fogasaEmpresario) && Objects.equals(importeFogasaEmpresario, that.importeFogasaEmpresario) && Objects.equals(seguridadSocialTrabajador, that.seguridadSocialTrabajador) && Objects.equals(importeSeguridadSocialTrabajador, that.importeSeguridadSocialTrabajador) && Objects.equals(desempleoTrabajador, that.desempleoTrabajador) && Objects.equals(importeDesempleoTrabajador, that.importeDesempleoTrabajador) && Objects.equals(formacionTrabajador, that.formacionTrabajador) && Objects.equals(importeFormacionTrabajador, that.importeFormacionTrabajador) && Objects.equals(brutoNomina, that.brutoNomina) && Objects.equals(liquidoNomina, that.liquidoNomina) && Objects.equals(costeTotalEmpresario, that.costeTotalEmpresario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNomina, mes, anio, numeroTrienios, importeTrienios, importeSalarioMes, importeComplementoMes, valorProrrateo, brutoAnual, irpf, importeIrpf, baseEmpresario, seguridadSocialEmpresario, importeSeguridadSocialEmpresario, desempleoEmpresario, importeDesempleoEmpresario, formacionEmpresario, importeFormacionEmpresario, accidentesTrabajoEmpresario, importeAccidentesTrabajoEmpresario, fogasaEmpresario, importeFogasaEmpresario, seguridadSocialTrabajador, importeSeguridadSocialTrabajador, desempleoTrabajador, importeDesempleoTrabajador, formacionTrabajador, importeFormacionTrabajador, brutoNomina, liquidoNomina, costeTotalEmpresario);
    }
}
