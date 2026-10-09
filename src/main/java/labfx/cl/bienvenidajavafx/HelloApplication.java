package labfx.cl.bienvenidajavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // 1. Ajustamos dimensiones para que no se corta la imagen ni las cajas de texto
        Scene scene = new Scene(fxmlLoader.load(), 550, 390);

        // 2. Personalizamos el título de la ventana
        stage.setTitle("Fresh JavaFX App!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
