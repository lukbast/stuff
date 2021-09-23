package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private CheckBox cb1;
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private Label label1;
    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }
    @FXML
    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(helloButton)){
            System.out.println("Hello, " +nameField.getText());
        } else if(e.getSource().equals(byeButton)){
            System.out.println("Bye, " + nameField.getText());
        }

        Runnable task = () -> {
            try {
                String s = Platform.isFxApplicationThread() ? "UI thread" : "Background";
                System.out.println("Im going to sleep on " + s);
                Thread.sleep(10000);
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        String s = Platform.isFxApplicationThread() ? "UI thread" : "Background";
                        System.out.println("Im updating the label on the "+s);

                        label1.setText("we did something");

                    }
                });
            } catch (InterruptedException event){
                // we don't care about this
            }
        };
        new Thread(task).start();

        if (cb1.isSelected()){
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }
    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }
    @FXML
    public void handleChange(){
        if(cb1.isSelected()){
        System.out.println("Checkbox is selected");
        } else System.out.println("Checkbox is unselected");
    }

}
