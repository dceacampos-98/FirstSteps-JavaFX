module labfx.cl.bienvenidajavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens labfx.cl.bienvenidajavafx to javafx.fxml;
    exports labfx.cl.bienvenidajavafx;
}