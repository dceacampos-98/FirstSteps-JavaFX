package labfx.cl.bienvenidajavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txtHood;

    @FXML
    private TextField txtSkill;

    @FXML
    private Button btnDown;

    @FXML
    private Button btnWack;

    @FXML
    private Label lblResultado;

    @FXML
    private void stepUp(){
        String hood = txtHood.getText();

        if (hood == null || hood.trim().isEmpty()){
            hood = "your style";
        }

        lblResultado.setText("Yo' " + hood + " is dope! Step up and rock the mic!");
        lblResultado.setVisible(true);
    }

    @FXML
    private void takeAWalk(){
        String hood = txtHood.getText();

        if (hood == null || hood.trim().isEmpty()){
            hood = "kid";
        }

        lblResultado.setText("Take a walk " + hood + ", ain't ready for the groove.");
        lblResultado.setVisible(true);
    }

}
