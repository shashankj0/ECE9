import javafx.application.*;
import javafx.stage.*; 
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.geometry.*;
import javafx.event.*;
public class CheckBoxFxDemo1 extends Application{
	Label l1, l2;
	CheckBox c[];
	Button confirm;
	FlowPane fp;
	VBox v;
	Scene s;
	Separator se;
	String str = " ";
	public void init(){
		l1 = new Label ("please select the inserted language: ");
		l2 = new Label();
		c = new CheckBox [7];
		c[0] = new CheckBox("java");
		c[0].setSelected(true);
		c[1] = new CheckBox("python");
		c[1].fire();
		c[2] = new CheckBox("cpp");
		c[3] = new CheckBox("rust");
		c[4] = new CheckBox("c#");
		c[5] = new CheckBox("julia");
		c[6] = new CheckBox("lisp");
		c[6].setIndeterminate(true);
		se.new Separetor();
		se.setAlignment(Pos.CENTER);
		for ( int i = 0; i < 7; i++){
			fp.getChildren().add(c[i]);
		}
		v = new VBox();
		v.setSpacing(30);
		v.setAlignment(Pos.CENTER);
		v.getChildren().addAll(l1, fp, se, confirm, l2);
		
	}
	public void start (Stage st){
		confirm.setOnAction((ae)->{
			str = " ";
			for(int i = 0; i < 7; i++){
				if(c[i].isSelected()){
					str +=c[i].getText()+" ";
					
				}
			}
			l2.setText("yuor language = " + str);
		});
		s = new Scene(v, 1000, 1000);
		st.setScene(s);
		st.setTitle("Intelligent Programmers Language");
		
	}
	public static void main(String[] args){
		launch(args);
	}
}