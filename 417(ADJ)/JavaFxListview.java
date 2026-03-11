import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.obervableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Listview;
import.javafx.scene.layout.VBox;
import.javafx.scene.text.Font;
import.javafx.scene.text.FontPosture;
import.javafx.scene.text.Fontweight;
import.javafx.stage.Stage;
public class JavaFxListview extends Applications;
public void sart(Stage stage)
{
Label label=new Label("educational qualification:");
Font font=Font.font("pujitha",Fontweight.BOLD,Fontposture.Regular,12);
label.setFont(font);
observableList<String>names=FxCollections.obesarvable Arraylist("engineering","mca","mba","mtech","mphil");
Listview<String>listview=newListview<String>(names);
listview.setMaxsize(200,160);
VBox layout=new VBox(10);
layout.setpadding(new Insets(5,5,5,50));
layout.getchildren().add ALL(label,listview);
layout.getstyle("-fx-background-color:BEIGE");
Scene scene=new scene(layout,400,300);
stage.setTitle("Listview Example");
satge.setScene(scene);
satge.show();
}
public sattic void main(sring Args[])
{
launch(args);
}
}