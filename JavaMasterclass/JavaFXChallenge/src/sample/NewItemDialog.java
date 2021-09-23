package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewItemDialog {

    @FXML
    private TextField fnTextField;

    @FXML
    private TextField lnTextField;

    @FXML
    private TextField phTextField;

    @FXML
    private TextField ntsTextField;

    @FXML
    public Contact2 processResults(){

        String s1 = fnTextField.getText().trim();
        System.out.println(s1);
        String s2 = lnTextField.getText().trim();
        System.out.println(s2);
        String s3 = phTextField.getText().trim();
        System.out.println(s3);
        String s4 = ntsTextField.getText().trim();
        System.out.println(s4);
        Contact2 newContact= new Contact2(s1,s2,s3,s4);
        return newContact;
    }



}
