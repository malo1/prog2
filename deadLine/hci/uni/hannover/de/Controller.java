package hci.uni.hannover.de;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.TextField;


/**
 * @author marius and erik
 */

public class Controller {
	
    private Node node;
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlLoader;
    private Parent root;
   
    @FXML AnchorPane mainAnchorPane;
	@FXML Button menu_join;
	@FXML Button menu_host;
	@FXML TextField name;
	@FXML TextField IPAdresse;
	@FXML Button menu_start;
	
    @FXML Button S1;
	@FXML ImageView Stack1image;
    @FXML Button S2;
	@FXML ImageView Stack2image;
    @FXML Button S3;
	@FXML ImageView Stack3image;
	@FXML Button H1;
	@FXML ImageView Hand1image;
    @FXML Button H2;
	@FXML ImageView Hand2image;
    @FXML Button H3;
	@FXML ImageView Hand3image;
	@FXML Button klopfen;
	@FXML ImageView klopfenimage;
    @FXML Button ende;
	@FXML ImageView endeimage;
	@FXML Button select1;
	@FXML Button select2;
	@FXML Label Spieler1;
	@FXML Label Spieler2;
	@FXML Label Spieler3;
	@FXML Label Spieler4;
	@FXML TextField Chatbox;

	//--------------------------------------------Variablen
    public int selectedHand = 0;
    public int selectedStack = 0;
	private String IP = "";
	private String PlayerName = "";
	public Card[] stack;
	
	//--------------------------------------------Konstruktoren
	public void setStack(Card[] stack){
		this.stack = stack;
	}
   
   
   //--------------------------------------------Hauptmenü/Lobby
    @FXML
    protected void Join(ActionEvent event) {
		try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
			stage.setFullScreen(true);
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("fxml_Lobby.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	@FXML
    protected void Host(ActionEvent event) {
		menu_start.relocate(300, 270);
    }
	
	@FXML
	protected void Start(ActionEvent event) {
		try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
			stage.setFullScreen(true);
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("fxml_stage2.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@FXML
	protected void setIPAddress(ActionEvent event) {
		IP = IPAdresse.getText();
	}
	
	@FXML
	protected void setName(ActionEvent event) {
		PlayerName = name.getText();
	}
	
	
	//--------------------------------------------FXML_stage2
	@FXML
	protected void selectHand(ActionEvent event) {
		Button btn = (Button) event.getSource();
		String s = btn.getId();
		if(s.charAt(6) == 1) {
			//send left
		} else {
			//send right
		}
		try {
            node = (Node) event.getSource();
            stage = (Stage) node.getScene().getWindow();
			stage.setFullScreen(true);
            scene = stage.getScene();
            fxmlLoader = new FXMLLoader(getClass().getResource("fxml_stage1.fxml"));
            root = (Parent) fxmlLoader.load();
            scene.setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	//--------------------------------------------Spiel
	@FXML
	protected void selectCard(ActionEvent event) {
		Button btn = (Button) event.getSource();
		String s = btn.getId();
		int i = 0;
		char c = s.charAt(1);
		i = c - 48;
		if(s.charAt(0) == 'S') {
			selectedStack = i;
		} else if(s.charAt(0) == 'H') {
			selectedHand = i;
		} else {
			System.out.println("selectCard Error!");
		}
		changeCards();
	}
	
	@FXML
	protected void End(ActionEvent event) {
		
	}
	
	@FXML
	protected void Knock(ActionEvent event) {
		
	}
	
	@FXML
	protected void changeAll(ActionEvent event) {
		
	}
	
	protected void changeCards(){
		int zahl = 7;
		String farbe = "herz"
		Image image = new Image(Controller.class.getResourceAsStream("textures/cards/" + zahl + "_" + farbe ".png"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
/*

	@FXML
    protected void changeLabel(ActionEvent event) {
		Spieler1.setText("Erik");
		Spieler2.setText("Marius");
		Spieler3.setText("Daniel");
		Spieler4.setText("Markus");
    }

    @FXML
    protected void Knock(ActionEvent event) {
        Player.action = Mode.SKIP;
    }

    protected void ChangeCardS1 (ActionEvent event){
        i = 1;
    }
    protected void ChangeCardS2 (ActionEvent event){
        i = 2;
    }
    protected void ChangeCardS3 (ActionEvent event){
        i = 3;
    }
    protected void ChangeCardH1 (ActionEvent event){
        j = 1;
    }
    protected void ChangeCardH2 (ActionEvent event){
        j = 2;
    }
    protected void ChangeCardH3 (ActionEvent event){
        j = 3;
    }

	@FXML
	protected void ChangeCard(ActionEvent event) {
	    if(!(i == 0 || j == 0)) {
            Cards temp = new Cards();
            temp = st.getCard(i-1);
            this.Hand.changeCards(Hand.getCard(j-1), Stack.getCard(i-1), i-1, j-1, Stack);
            i = 0;
            j = 0;
        }


    }

    @FXML
    protected void ChangeAllCards(ActionEvent event) {
        Image[] images = new Image[3];

        images[0] = Stack1image.getImage();
        images[1] = Stack2image.getImage();
        images[2] = Stack3image.getImage();

        Stack1image.setImage(Hand1image.getImage());
        Stack2image.setImage(Hand2image.getImage());
        Stack3image.setImage(Hand3image.getImage());

        Hand1image.setImage(image[0]);
        Hand2image.setImage(image[1]);
        Hand3image.setImage(image[2]);
        //Hand2image.setImage(image);
    }
	*/
}