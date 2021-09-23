package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Controller {

    @FXML
    private GridPane gridPane;

    @FXML
    private Label label1;
    private double rotation = 0;

    @FXML
    private Button button4;

    public void initialize(){
        button4.setEffect(new DropShadow());
    }


    @FXML
    public void handleMouseEnter(){
        label1.setScaleX(2.0);
        label1.setScaleY(2.0);
        this.rotation= rotation+45.0;
        label1.setRotate(this.rotation);
    }
    @FXML
    public void handleMouseExit(){
        label1.setScaleX(1.0);
        label1.setScaleY(1.0);
        this.rotation= rotation+45.0;
        label1.setRotate(rotation);
    }

    @FXML
    public void handleClick(){
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File...");
        chooser.getExtensionFilters().addAll(
            new FileChooser.ExtensionFilter("Text", "*.txt"),
            new FileChooser.ExtensionFilter("PDF", "*.pdf"),
            new FileChooser.ExtensionFilter("Image file","*.jpg", "*.png", "*.gif"),
            new FileChooser.ExtensionFilter("All files", "*.*")
        );
        File file = chooser.showSaveDialog(gridPane.getScene().getWindow());
        if(file!=null){
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was canceled");
        }
    }

    @FXML
    public void handleLinkClickEvent(){
        System.out.println("lol");


    }
//        try {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        } catch (IOException e){
//            e.printStackTrace();
//        } catch (URISyntaxException e){
//            e.printStackTrace();
//        }
//    }


}
