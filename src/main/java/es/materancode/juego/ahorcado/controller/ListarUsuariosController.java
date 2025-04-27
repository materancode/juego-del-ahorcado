package es.materancode.juego.ahorcado.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import es.materancode.juego.ahorcado.PrincipalApplication;
import es.materancode.juego.ahorcado.controller.abstractas.AbstractController;
import es.materancode.juego.ahorcado.model.UsuarioEntity;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
/**
 * @author materancode
 * @version 1.0.0
 */
public class ListarUsuariosController extends AbstractController {
    @FXML Button atrasButton;
    @FXML ListView listViewUsuarios;

    @FXML
    public void initialize(){
        ArrayList<UsuarioEntity> usuarios = new ArrayList<>();
        usuarios = new ArrayList<>(getUsuarioServiceModel().obtenerTodosLosUsuarios());
        listViewUsuarios.getItems().addAll(usuarios);
    }
    @FXML
    public void atrasOnClick(){
        try {
            Stage stage = (Stage) atrasButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("inicio.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 820, 640);
            stage.setTitle("Pantalla Recuperar Contraseña");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}