package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Optional;

public class Controller {

    @FXML
    private TableView<Contact2> tableView;

    @FXML
    private BorderPane bp;


    public void initialize() {

        tableView = new TableView<>();
        tableView.setItems(ContactData.getInstance().getContacts());

        TableColumn<Contact2, String> firstNameColumn= new TableColumn<>("First Name");
        TableColumn<Contact2, String> lastNameColumn= new TableColumn<>("Last Name");
        TableColumn<Contact2, String> phoneNumberColumn= new TableColumn<>("Phone number");
        TableColumn<Contact2, String> notesColumn= new TableColumn<>("Notes ");

        tableView.getColumns().setAll(firstNameColumn,lastNameColumn,phoneNumberColumn,notesColumn);



    }


    @FXML
    public void showNewItemDialog() {

        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(bp.getScene().getWindow());
        dialog.setTitle("New contact");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("newItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException e){
            System.out.println("Failed to load the dialog LOL");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            NewItemDialog newItemDialog = fxmlLoader.getController();
            Contact2 newContact = newItemDialog.processResults();
            ContactData.getInstance().addToContacts(newContact);
//            tableView.getSelectionModel().select(newContact);
        }
    }


}
