import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
pulbic class FlagButton extends Application{
Button in,sr,pk,usa,cd,exit;
label 1;
Flowpane fp;
Scene s;
public void init(){
System.out.println("From init() method");
in=new Button("india")
sr=new Button("srilanka")
pk=new Button("pakistan")
usa=new Button("united states of america")
cd=new Button("canada")
exit=new Button("Exit")
1=new Button("Flag displayed")
fp=new FlowPane();
fp.setAlignment(pos.CENTER);
fp.getChildren().addAll(in,sr,pk,usa,cd,exit,1);
s=new Scene(fp,500,500);
}
public void start(stage st)
{
Sys



}
}