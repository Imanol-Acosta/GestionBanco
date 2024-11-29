package com.example.gestionbanco;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;

public class HelloController {

    @FXML
    private Button btInsertar, btInsertarBHD, btInsertarPOPULAR;
    @FXML
    private Button btLimpiar, btLimpiarBHD, btLimpiarPOPULAR;
    @FXML
    private Button guardarEmpleado, guardarEmpleadoBHD, guardarEmpleadoPopular;

    @FXML
    private TableView<Empleado> table;
    @FXML
    private TableView<EmpleadoBHD> table1;
    @FXML
    private TableView<EmpleadoPopular> table11;

    @FXML
    private TableColumn<Empleado, String> tbNombre, tbApellido, tbArea, tbDepartamento, tbGenero;
    @FXML
    private TableColumn<Empleado, Integer> tbID;
    @FXML
    private TableColumn<Empleado, Double> tbSueldoBruto, tbSueldoneto;

    @FXML
    private TableColumn<EmpleadoBHD, String> tbNombreEmpleadoBHD, tbConceptoBHD, tbReferenciaBHD, tbCuentaEmpleadoBHD;
    @FXML
    private TableColumn<EmpleadoBHD, Double> tbMontodelpagoBHD;

    @FXML
    private TableColumn<EmpleadoPopular, String> tbNombrePOPULAR, tbTipoDeidentificacionPOPULAR, tbIdentificacionPOPULAR, tbDescripcionPOPULAR, tbNumerodereferenciaPOPULAR;
    @FXML
    private TableColumn<EmpleadoPopular, Double> tbMontoTransaccionPOPULAR;

    @FXML
    private TextField tfNombre, tfApellido, tfId, tfArea, tfDepartamento, tfSueldobruto, tfGenero;
    @FXML
    private TextField tfNombredelempleadoBHD, tfConceptoBHD, tfReferenciaBHD, tfCuentaEmpleadoBHD, tfMontoDelPagoBHD;
    @FXML
    private TextField tfNombrePOPULAR, tfTipoIdentificacionPOPULAR, tfIdentificacionPOPULAR, tfDescripcionPOPULAR, tfMontoTransaccionPOPULAR, tfNumeroDeReferenciaPOPULAR;

    private ObservableList<Empleado> empleadoList;
    private ObservableList<EmpleadoBHD> empleadoBHDList;
    private ObservableList<EmpleadoPopular> empleadoPopularList;

    @FXML
    public void initialize() {
        // Inicializar listas
        empleadoList = FXCollections.observableArrayList();
        empleadoBHDList = FXCollections.observableArrayList();
        empleadoPopularList = FXCollections.observableArrayList();

        // Conectar columnas con propiedades de Empleado
        tbNombre.setCellValueFactory(new PropertyValueFactory<>("tbNombre"));
        tbApellido.setCellValueFactory(new PropertyValueFactory<>("tbApellido"));
        tbID.setCellValueFactory(new PropertyValueFactory<>("tbID"));
        tbArea.setCellValueFactory(new PropertyValueFactory<>("tbArea"));
        tbDepartamento.setCellValueFactory(new PropertyValueFactory<>("tbDepartamento"));
        tbSueldoBruto.setCellValueFactory(new PropertyValueFactory<>("tbSueldoBruto"));
        tbSueldoneto.setCellValueFactory(new PropertyValueFactory<>("tbSueldoneto"));
        tbGenero.setCellValueFactory(new PropertyValueFactory<>("tbGenero"));
        table.setItems(empleadoList);

        // Conectar columnas con propiedades de EmpleadoBHD
        tbNombreEmpleadoBHD.setCellValueFactory(new PropertyValueFactory<>("tbNombreEmpleadoBHD"));
        tbConceptoBHD.setCellValueFactory(new PropertyValueFactory<>("tbConceptoBHD"));
        tbReferenciaBHD.setCellValueFactory(new PropertyValueFactory<>("tbReferenciaBHD"));
        tbCuentaEmpleadoBHD.setCellValueFactory(new PropertyValueFactory<>("tbCuentaEmpleadoBHD"));
        tbMontodelpagoBHD.setCellValueFactory(new PropertyValueFactory<>("tbMontodelpagoBHD"));
        table1.setItems(empleadoBHDList);

        // Conectar columnas con propiedades de EmpleadoPopular
        tbNombrePOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbNombrePOPULAR"));
        tbTipoDeidentificacionPOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbTipoDeidentificacionPOPULAR"));
        tbIdentificacionPOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbIdentificacionPOPULAR"));
        tbDescripcionPOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbDescripcionPOPULAR"));
        tbMontoTransaccionPOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbMontoTransaccionPOPULAR"));
        tbNumerodereferenciaPOPULAR.setCellValueFactory(new PropertyValueFactory<>("tbNumerodereferenciaPOPULAR"));
        table11.setItems(empleadoPopularList);
    }

    @FXML
    void OnInsertar(ActionEvent event) {
        try {
            Empleado newEmpleado = new Empleado(
                    tfNombre.getText(), tfApellido.getText(),
                    Integer.parseInt(tfId.getText()), tfArea.getText(),
                    tfDepartamento.getText(), Double.parseDouble(tfSueldobruto.getText()),
                    tfGenero.getText()
            );
            empleadoList.add(newEmpleado);
        } catch (NumberFormatException e) {
            System.out.println("Error: ID y Sueldo Bruto deben ser numéricos.");
        }
    }

    @FXML
    void OnInsertarBHD(ActionEvent event) {
        try {
            EmpleadoBHD newEmpleadoBHD = new EmpleadoBHD(
                    tfNombredelempleadoBHD.getText(), tfConceptoBHD.getText(),
                    tfReferenciaBHD.getText(), tfCuentaEmpleadoBHD.getText(),
                    Double.parseDouble(tfMontoDelPagoBHD.getText())
            );
            empleadoBHDList.add(newEmpleadoBHD);
        } catch (NumberFormatException e) {
            System.out.println("Error: Monto del Pago debe ser numérico.");
        }
    }

    @FXML
    void OnInsertarPOPULAR(ActionEvent event) {
        try {
            EmpleadoPopular newEmpleadoPopular = new EmpleadoPopular(
                    tfNombrePOPULAR.getText(), tfTipoIdentificacionPOPULAR.getText(),
                    tfIdentificacionPOPULAR.getText(), tfDescripcionPOPULAR.getText(),
                    Double.parseDouble(tfMontoTransaccionPOPULAR.getText()), tfNumeroDeReferenciaPOPULAR.getText()
            );
            empleadoPopularList.add(newEmpleadoPopular);
        } catch (NumberFormatException e) {
            System.out.println("Error: Monto de la Transacción debe ser numérico.");
        }
    }

    @FXML
    void OnLimpiar(ActionEvent event) {
        tfNombre.clear(); tfApellido.clear(); tfId.clear(); tfArea.clear();
        tfDepartamento.clear(); tfSueldobruto.clear(); tfGenero.clear();
    }

    @FXML
    void OnLimpiarBHD(ActionEvent event) {
        tfNombredelempleadoBHD.clear(); tfConceptoBHD.clear(); tfReferenciaBHD.clear();
        tfCuentaEmpleadoBHD.clear(); tfMontoDelPagoBHD.clear();
    }

    @FXML
    void OnLimpiarPOPULAR(ActionEvent event) {
        tfNombrePOPULAR.clear(); tfTipoIdentificacionPOPULAR.clear(); tfIdentificacionPOPULAR.clear();
        tfDescripcionPOPULAR.clear(); tfMontoTransaccionPOPULAR.clear(); tfNumeroDeReferenciaPOPULAR.clear();
    }

    @FXML
    void guardarEmpleados(ActionEvent event) {
        guardarDatosEnJSON(empleadoList, "empleados.json");
    }

    @FXML
    void guardarEmpleadosBHD(ActionEvent event) {
        guardarDatosEnJSON(empleadoBHDList, "empleadosBHD.json");
    }

    @FXML
    void guardarEmpleadosPopular(ActionEvent event) {
        guardarDatosEnJSON(empleadoPopularList, "empleadosPopular.json");
    }

    private <T> void guardarDatosEnJSON(ObservableList<T> list, String filename) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter(filename)) {
            gson.toJson(list, writer);
            System.out.println("Datos guardados en " + filename);
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }
}
