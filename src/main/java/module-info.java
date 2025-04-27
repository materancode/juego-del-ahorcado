module es.materancode.juego.ahorcado{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens es.materancode.juego.ahorcado to javafx.fxml;
    exports es.materancode.juego.ahorcado;
    exports es.materancode.juego.ahorcado.controller;
    exports es.materancode.juego.ahorcado.controller.abstractas;
    exports es.materancode.juego.ahorcado.model;
    opens es.materancode.juego.ahorcado.controller to javafx.fxml;
}