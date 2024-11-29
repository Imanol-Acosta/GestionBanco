// Clase EmpleadoPopular
package com.example.gestionbanco;

public class EmpleadoPopular {
    private String tbNombrePOPULAR;
    private String tbTipoDeidentificacionPOPULAR;
    private String tbIdentificacionPOPULAR;
    private String tbDescripcionPOPULAR;
    private Double tbMontoTransaccionPOPULAR;
    private String tbNumerodereferenciaPOPULAR;

    public EmpleadoPopular(String tbNombrePOPULAR, String tbTipoDeidentificacionPOPULAR, String tbIdentificacionPOPULAR, String tbDescripcionPOPULAR, Double tbMontoTransaccionPOPULAR, String tbNumerodereferenciaPOPULAR) {
        this.tbNombrePOPULAR = tbNombrePOPULAR;
        this.tbTipoDeidentificacionPOPULAR = tbTipoDeidentificacionPOPULAR;
        this.tbIdentificacionPOPULAR = tbIdentificacionPOPULAR;
        this.tbDescripcionPOPULAR = tbDescripcionPOPULAR;
        this.tbMontoTransaccionPOPULAR = tbMontoTransaccionPOPULAR;
        this.tbNumerodereferenciaPOPULAR = tbNumerodereferenciaPOPULAR;
    }

    public String getTbNombrePOPULAR() { return tbNombrePOPULAR; }
    public String getTbTipoDeidentificacionPOPULAR() { return tbTipoDeidentificacionPOPULAR; }
    public String getTbIdentificacionPOPULAR() { return tbIdentificacionPOPULAR; }
    public String getTbDescripcionPOPULAR() { return tbDescripcionPOPULAR; }
    public Double getTbMontoTransaccionPOPULAR() { return tbMontoTransaccionPOPULAR; }
    public String getTbNumerodereferenciaPOPULAR() { return tbNumerodereferenciaPOPULAR; }
}
