module com.example.gestionbanco {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    requires com.google.gson;

    opens com.example.gestionbanco to com.google.gson, javafx.fxml;

    exports com.example.gestionbanco;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;



}