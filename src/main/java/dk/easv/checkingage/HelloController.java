package dk.easv.checkingage;

import dk.easv.bll.DataProcessorResponsible;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private Button btnCalculate;
    @FXML
    private Button btnReset;
    @FXML
    private Label lblMessage;

    private final DataProcessorResponsible dataProcessorResponsible = new DataProcessorResponsible();


    @FXML
    private void Calculate() {
        int age = dataProcessorResponsible.checkValidAge(txtAge.getText());
        String name = txtName.getText();
        lblMessage.setVisible(true);
        lblMessage.setText(dataProcessorResponsible.checkAge(name, age));
    }



    @FXML
    private void Reset() {
        lblMessage.setVisible(false);
        txtName.setText("");
        txtAge.setText("");
        lblMessage.setText("");
    }


}