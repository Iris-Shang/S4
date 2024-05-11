package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

public class PersonController {

    @FXML
    private Label ADContent;

    @FXML
    private Button CloseADbutton;

    @FXML
    private Button Editbutton;

    @FXML
    private Label companyLabel;

    @FXML
    private ImageView image;

    @FXML
    private ListView<?> joblist;

    @FXML
    private Label nameLabel;

    @FXML
    private Label occupatationlabel;

    @FXML
    private ListView<?> projectlist;

    @FXML
    private ListView<?> skillslist;

    @FXML
    void ClickonClose(ActionEvent event) {

    }

    @FXML
    void handleEditProfileButtonAction(ActionEvent event) {

    }

}
