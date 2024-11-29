// Clase EmpleadoBHD
package com.example.gestionbanco;

public class EmpleadoBHD {
    private String tbNombreEmpleadoBHD;
    private String tbConceptoBHD;
    private String tbReferenciaBHD;
    private String tbCuentaEmpleadoBHD;
    private Double tbMontodelpagoBHD;

    public EmpleadoBHD(String tbNombreEmpleadoBHD, String tbConceptoBHD, String tbReferenciaBHD, String tbCuentaEmpleadoBHD, Double tbMontodelpagoBHD) {
        this.tbNombreEmpleadoBHD = tbNombreEmpleadoBHD;
        this.tbConceptoBHD = tbConceptoBHD;
        this.tbReferenciaBHD = tbReferenciaBHD;
        this.tbCuentaEmpleadoBHD = tbCuentaEmpleadoBHD;
        this.tbMontodelpagoBHD = tbMontodelpagoBHD;
    }

    public String getTbNombreEmpleadoBHD() { return tbNombreEmpleadoBHD; }
    public String getTbConceptoBHD() { return tbConceptoBHD; }
    public String getTbReferenciaBHD() { return tbReferenciaBHD; }
    public String getTbCuentaEmpleadoBHD() { return tbCuentaEmpleadoBHD; }
    public Double getTbMontodelpagoBHD() { return tbMontodelpagoBHD; }
}
