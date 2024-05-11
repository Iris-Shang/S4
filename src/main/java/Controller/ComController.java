package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ComController {

    @FXML
    private Label ADContent;

    @FXML
    private Button CloseADbutton;

    @FXML
    private Button Editbutton;

    @FXML
    private ListView<?> comjoblist;

    @FXML
    private ListView<?> comprolist;

    @FXML
    private Label descLabel;

    @FXML
    private ListView<?> employeelist;

    @FXML
    private ImageView image;

    @FXML
    private Label nameLabel;

    @FXML
    void ClickonClose(ActionEvent event) {
    	Image image = new Image("https://img.ixintu.com/download/jpg/202003/17aed05cb05187499fd34e03d5afcca1_800_1422.jpg!con0");

    }

    @FXML
    void handleEditProfileButtonAction(ActionEvent event) {

    }

}
