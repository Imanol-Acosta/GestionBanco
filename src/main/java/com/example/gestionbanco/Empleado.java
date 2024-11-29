// Clase Empleado
package com.example.gestionbanco;

public class Empleado {
    private String tbNombre;
    private String tbApellido;
    private String tbArea;
    private String tbDepartamento;
    private String tbGenero;
    private int tbID;
    private Double tbSueldoBruto;
    private Double tbSueldoneto;

    public Empleado(String tbNombre, String tbApellido, int tbID, String tbArea, String tbDepartamento, Double tbSueldoBruto, String tbGenero) {
        this.tbNombre = tbNombre;
        this.tbApellido = tbApellido;
        this.tbArea = tbArea;
        this.tbDepartamento = tbDepartamento;
        this.tbGenero = tbGenero;
        this.tbID = tbID;
        this.tbSueldoBruto = tbSueldoBruto;
        this.tbSueldoneto = calcularSueldoNeto(tbSueldoBruto);
    }

    private Double calcularSueldoNeto(Double sueldoBruto) {
        return sueldoBruto * 0.8;
    }

    public String getTbNombre() { return tbNombre; }
    public String getTbApellido() { return tbApellido; }
    public String getTbArea() { return tbArea; }
    public String getTbDepartamento() { return tbDepartamento; }
    public String getTbGenero() { return tbGenero; }
    public int getTbID() { return tbID; }
    public Double getTbSueldoBruto() { return tbSueldoBruto; }
    public Double getTbSueldoneto() { return tbSueldoneto; }
}
