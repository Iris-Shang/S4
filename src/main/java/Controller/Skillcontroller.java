package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class Skillcontroller {

    @FXML
    private Label ADContent;

    @FXML
    private AnchorPane ADList;

    @FXML
    private Button CloseADbutton;

    @FXML
    private Label Description;

    @FXML
    private Button Editbutton;

    @FXML
    private Label Namefield;

    @FXML
    private Label desclabel;

    @FXML
    private ImageView image;

    @FXML
    private ListView<?> skilledperson;

    @FXML
    private Label skinameLabel;

    @FXML
    void ClickonClose(ActionEvent event) {
    	ADContent.setVisible(false);
    	image.setVisible(false);
    	CloseADbutton.setVisible(false);

    }

    @FXML
    void handleEditProfileButtonAction(ActionEvent event) {

    }

}
