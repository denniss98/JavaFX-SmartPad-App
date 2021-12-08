import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class ApplicationRunner extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //TOP LEFT BLOCK
        //Top left gridpane to set lighting values
        
        GridPane leftTop = new GridPane();
        
        leftTop.setStyle("-fx-border-color:darkgray; -fx-border-radius: 5; -fx-border-width: 2; -fx-background-color:white;");
        leftTop.setMaxSize(280, 260);
        leftTop.setMinSize(280, 260);
                
        //Hall Lighting controls
        Label hallLabel = new Label("\t       Hall:");
        Slider hallSlider = new Slider(0, 255, 127);
        hallSlider.setMaxWidth(150);
        Circle hallCircle = new Circle(40, 40, 13, Color.rgb(127,127,0));
        hallCircle.setStroke(Color.BLACK);
        
        //Kitchen Lighting controls
        Label kitchenLabel = new Label("\t Kitchen:");
        Slider kitchenSlider = new Slider(0, 255, 127);
        kitchenSlider.setPrefWidth(150);
        Circle kitchenCircle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        kitchenCircle.setStroke(Color.BLACK);
        
        //Dining Room Lighting controls
        Label diningRoomLabel = new Label("Dining Room:");
        Slider diningRoomSlider = new Slider(0, 255, 127);
        diningRoomSlider.setPrefWidth(150);
        Circle diningRoomCircle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        diningRoomCircle.setStroke(Color.BLACK);
        
        //Living Room Lighting controls
        Label livingRoomLabel = new Label(" Living Room:");
        Slider livingRoomSlider = new Slider(0, 255, 127);
        livingRoomSlider.setPrefWidth(150);
        Circle livingRoomCircle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        livingRoomCircle.setStroke(Color.BLACK);
        
        //Landing Lighting controls
        Label landingLabel = new Label("        Landing:");
        Slider landingSlider = new Slider(0, 255, 127);
        landingSlider.setPrefWidth(150);
        Circle landingCircle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        landingCircle.setStroke(Color.BLACK);
        
        //Bedroom1 Lighting controls
        Label bedroom1Label = new Label("  Bedroom 1:");
        Slider bedroom1Slider = new Slider(0, 255, 127);
        bedroom1Slider.setPrefWidth(150);
        Circle bedroom1Circle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        bedroom1Circle.setStroke(Color.BLACK);
        
        //Bedroom2 Lighting controls
        Label bedroom2Label = new Label("  Bedroom 2:");
        Slider bedroom2Slider = new Slider(0, 255, 127);
        bedroom2Slider.setPrefWidth(150);
        Circle bedroom2Circle = new Circle(40, 40, 13,  Color.rgb(127,127,0));
        bedroom2Circle.setStroke(Color.BLACK);
        
        //Hall adjustable slider
        ChangeListener<Object> hallSliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            hallCircle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        hallSlider.valueProperty().addListener(hallSliderListener);
        
        //Kitchen adjustable slider
        ChangeListener<Object> kitchenSliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            kitchenCircle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        kitchenSlider.valueProperty().addListener(kitchenSliderListener);
        
        //Dining Room adjustable slider
        ChangeListener<Object> diningRoomSliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            diningRoomCircle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        diningRoomSlider.valueProperty().addListener(diningRoomSliderListener);
        
        //Living Room adjustable slider
        ChangeListener<Object> livingRoomSliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            livingRoomCircle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        livingRoomSlider.valueProperty().addListener(livingRoomSliderListener);
        
        //Landing adjustable slider
        ChangeListener<Object> LandingSliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            landingCircle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        landingSlider.valueProperty().addListener(LandingSliderListener);
        
        //Bedroom 1 adjustable slider
        ChangeListener<Object> bedroom1SliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            bedroom1Circle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        bedroom1Slider.valueProperty().addListener(bedroom1SliderListener);
        
        //Bedroom 2 adjustable slider
        ChangeListener<Object> bedroom2SliderListener = (ObservableValue<? extends Object> obs, Object oldValue, Object newValue) -> {
            Double obj = (double) newValue;
            bedroom2Circle.setFill(Color.rgb(0+obj.intValue(), 0+obj.intValue(),0));
        };
        bedroom2Slider.valueProperty().addListener(bedroom2SliderListener);
        
        Label lightingLabel = new Label("Lighting");
        lightingLabel.setStyle("-fx-font-weight:BOLD;-fx-font-size:11pt");

        leftTop.addRow(0, lightingLabel);
        leftTop.addRow(1, hallLabel,hallSlider,hallCircle);
        leftTop.addRow(2, kitchenLabel,kitchenSlider,kitchenCircle);
        leftTop.addRow(3, diningRoomLabel,diningRoomSlider,diningRoomCircle);
        leftTop.addRow(4, livingRoomLabel,livingRoomSlider,livingRoomCircle);
        leftTop.addRow(5, landingLabel,landingSlider,landingCircle);
        leftTop.addRow(6, bedroom1Label,bedroom1Slider,bedroom1Circle);
        leftTop.addRow(7, bedroom2Label,bedroom2Slider,bedroom2Circle);
        
        leftTop.setVgap(5);
        leftTop.setHgap(5);
        
        leftTop.setAlignment(Pos.CENTER);
        
        //BOTTOM LEFT BLOCK
        //Temperature vertical slider
        Slider temperatureSlider = new Slider(0.0, 30.0, 20.0);
        //Define each tick to show temperature value range
        temperatureSlider.setMajorTickUnit(5.0);
        temperatureSlider.setMinorTickCount(1);
        temperatureSlider.setSnapToTicks(true);
        temperatureSlider.setShowTickMarks(true);
        temperatureSlider.setShowTickLabels(true);
        temperatureSlider.setOrientation(Orientation.VERTICAL);
        temperatureSlider.setStyle("-fx-font-size: 14px; ");
        
        //Assign values to the ticks
        temperatureSlider.setLabelFormatter(new StringConverter<Double>() {
            @Override
            public Double fromString(String tempStr) {
                if(tempStr.equals("0.0 °C"))
                    return 0.0d;
                else if(tempStr.equals("5.0 °C"))
                    return 5.0d;
                else if(tempStr.equals("10.0 °C"))
                    return 10.0d;
                else if(tempStr.equals( "15.0 °C"))
                    return 15.0d;
                else if(tempStr.equals( "20.0 °C"))
                    return 20.0d;
                else if(tempStr.equals( "25.0 °C"))
                    return 25.0d;
                else if(tempStr.equals( "30.0 °C"))
                    return 30.0d;
                else
                    return 20.0d;
            }
            
            @Override
            public String toString(Double temp) {
                if (temp == 0.0) 
                    return "0.0 °C";
                else if (temp <= 5.0) 
                    return "5.0 °C";
                else if (temp <= 10.0) 
                    return "10.0 °C";
                else if (temp <= 15.0) 
                    return "15.0 °C";
                else if (temp <= 20.0) 
                    return "20.0 °C";
                else if (temp <= 25.0) 
                    return "25.0 °C";
                else if (temp <= 30.0) 
                    return "30.0 °C";
                else 
                    return "20.0 °C";
            }
        });
        String font11Bold = "-fx-font-weight:BOLD;-fx-font-size:11pt";
        //Temperature radio buttons
        Label centralHeatingLabel = new Label("Central Heating");
        centralHeatingLabel.setStyle(font11Bold);

        RadioButton offHeatRadioBtn = new RadioButton("Off");
        RadioButton autoHeatRadioBtn = new RadioButton("Auto");
        autoHeatRadioBtn.setSelected(true);
        RadioButton onceHeatRadioBtn = new RadioButton("Once");
        RadioButton contHeatRadioBtn = new RadioButton("Cont");
        
        //Toggle group on radio buttons
        ToggleGroup radioGroup = new ToggleGroup();
        offHeatRadioBtn.setToggleGroup(radioGroup);
        autoHeatRadioBtn.setToggleGroup(radioGroup);
        onceHeatRadioBtn.setToggleGroup(radioGroup);
        contHeatRadioBtn.setToggleGroup(radioGroup);
        
        VBox heatRadioBtns = new VBox(offHeatRadioBtn,autoHeatRadioBtn,onceHeatRadioBtn,contHeatRadioBtn);
        
        heatRadioBtns.setSpacing(30);
        heatRadioBtns.setPadding(new Insets(0,0,0,5));
        
        //Temperature log to show current temperature
        Label leftBtmTemplabel = new Label("20.0");
        leftBtmTemplabel.setMinSize(65, 35);
        leftBtmTemplabel.setMaxSize(65, 35);
        leftBtmTemplabel.setStyle("-fx-font-weight:BOLD;-fx-font-size:14pt;-fx-border-color:darkgray;-fx-border-radius: 3; -fx-border-width: 2; ");
        leftBtmTemplabel.setPadding(new Insets(0,5,0,5));
        
        temperatureSlider.valueProperty().addListener((ObservableValue <? extends Number > observable, Number oldValue, Number newValue) -> {
            Double obj = (double) newValue;
            leftBtmTemplabel.setText(String.valueOf(((Math.round(obj.floatValue()))*10.0f)/10.0f));
        });
        
        //Temperature label
        BorderPane leftBtmTemplabelPane = new BorderPane(leftBtmTemplabel);
        leftBtmTemplabelPane.setStyle("-fx-border-color:darkgray;-fx-border-radius: 3; -fx-border-width: 1; ");
        leftBtmTemplabelPane.setMinSize(70, 40);
        leftBtmTemplabelPane.setMaxSize(70, 40);
        
        //Bottom left gridpane to display temperature controls
        GridPane leftBottom = new GridPane();
        leftBottom.setVgap(5);
        leftBottom.setHgap(30);
        leftBottom.setPadding(new Insets(5,10,5,10));
        leftBottom.setStyle("-fx-border-color:darkgray;-fx-border-radius: 5; -fx-border-width: 2; -fx-background-color:white;");
        leftBottom.setMinSize(280, 210);
        leftBottom.setMaxSize(280, 210);
        leftBottom.add( centralHeatingLabel,0,0,2,1);
        leftBottom.addRow(1, heatRadioBtns,temperatureSlider,leftBtmTemplabelPane);
        

        //TOP RIGHT BLOCK
        VBox left = new VBox();
        left.getChildren().addAll(leftTop,leftBottom);
        left.setSpacing(10);
        
        //Images to display in the blocks
        File file1 = new File("images/front.jpg");
        Image image1 = new Image(file1.toURI().toString());
        
        File file2 = new File("images/back.jpg");
        Image image2 = new Image(file2.toURI().toString());
        
        File file3 = new File("images/side.jpg");
        Image image3 = new Image(file3.toURI().toString());
        
        File file4 = new File("images/drive.jpg");
        Image image4 = new Image(file4.toURI().toString());
        
        //Four imageviews for four images
        ImageView topLeftImg = new ImageView();
        ImageView topRightImg = new ImageView();
        ImageView btmLeftImg = new ImageView();
        ImageView btmRightImg = new ImageView();
        
        //Assigning images to image views
        topLeftImg.setImage(image1);
        topRightImg.setImage(image2);
        btmLeftImg.setImage(image3);
        btmRightImg.setImage(image4);
        
        //Image view reserve ration
        topLeftImg.setPreserveRatio(true);
        btmLeftImg.setPreserveRatio(true);
        btmRightImg.setPreserveRatio(true);
        topRightImg.setPreserveRatio(true);
        
        //Width of the images
        topLeftImg.setFitHeight(183);
        topRightImg.setFitHeight(183);
        btmRightImg.setFitHeight(183);
        btmLeftImg.setFitHeight(183);
        
        //Image border
        BorderPane borderPane1 = new BorderPane();
        BorderPane borderPane2 = new BorderPane();
        BorderPane borderPane3 = new BorderPane();
        BorderPane borderPane4 = new BorderPane();
        
        borderPane1.setCenter(topLeftImg);
        borderPane2.setCenter(topRightImg);
        borderPane3.setCenter(btmLeftImg);
        borderPane4.setCenter(btmRightImg);
        
        borderPane1.setStyle("-fx-border-color:black; -fx-border-width: 1; -fx-background-color:white;");
        borderPane2.setStyle("-fx-border-color:black; -fx-border-width: 1; -fx-background-color:white;");
        borderPane3.setStyle("-fx-border-color:black; -fx-border-width: 1; -fx-background-color:white;");
        borderPane4.setStyle("-fx-border-color:black; -fx-border-width: 1; -fx-background-color:white;");
         
        GridPane rightTop = new GridPane();
        
        rightTop.addRow(1, borderPane1,borderPane2);
        rightTop.addRow(2, borderPane3,borderPane4);
        rightTop.setAlignment(Pos.CENTER);
        rightTop.setVgap(2);
        rightTop.setHgap(2);
        rightTop.setAlignment(Pos.CENTER);
        
        //BOTTOM RIGHT BLOCK
        HBox rightBtm = new HBox();
        rightBtm.setAlignment(Pos.CENTER);
        rightBtm.setSpacing(10);
        
        //Toggle buttons
        ToggleButton btn1 = new ToggleButton("Front");
        ToggleButton btn2 = new ToggleButton("Rear");
        ToggleButton btn3 = new ToggleButton("Side");
        ToggleButton btn4 = new ToggleButton("Drive");
        
        //Action for mute button
        btn1.setOnAction((ActionEvent e) -> {
            if(btn1.isSelected()){
                File file = new File("images/mute-screen.gif");
                Image image = new Image(file.toURI().toString());
                topLeftImg.setImage(image);
                
            }else{
                File file = new File("images/front.jpg");
                Image image = new Image(file.toURI().toString());
                topLeftImg.setImage(image);
            }
        });
        
        btn2.setOnAction((ActionEvent e) -> {
            if(btn2.isSelected()){
                
                File file = new File("images/mute-screen.gif");
                Image image = new Image(file.toURI().toString());
                topRightImg.setImage(image);
                
            }else{
                File file = new File("images/images/back.jpg");
                Image image = new Image(file.toURI().toString());
                topRightImg.setImage(image);
            }
        });
        
        btn3.setOnAction((ActionEvent e) -> {
            if(btn3.isSelected()){
                
                File file = new File("images/mute-screen.gif");
                Image image = new Image(file.toURI().toString());
                btmLeftImg.setImage(image);
                
            }else{
                File file = new File("images/side.jpg");
                Image image = new Image(file.toURI().toString());
                btmLeftImg.setImage(image);
            }
        });
        
        btn4.setOnAction((ActionEvent e) -> {
            if(btn4.isSelected()){
                
                File file = new File("images/mute-screen.gif");
                Image image = new Image(file.toURI().toString());
                btmRightImg.setImage(image);
                
            }else{
                File file = new File("images/drive.jpg");
                Image image = new Image(file.toURI().toString());
                btmRightImg.setImage(image);
            }
        });
       
        rightBtm.getChildren().addAll(btn1,btn2,btn3,btn4);
        
        VBox right = new VBox();
        
        right.setStyle("-fx-border-color:darkgray; -fx-border-radius: 5; -fx-border-width: 2; -fx-background-color:white;");
        right.setMinSize(510, 470);
        right.setPadding(new Insets(5));
        right.setSpacing(20);
        
        Label rightToplabel = new Label("CCTV");
        rightToplabel.setStyle("-fx-font-weight:BOLD;-fx-font-size:11pt");
        right.getChildren().addAll(rightToplabel,rightTop,rightBtm);
        
        HBox root = new HBox();
        
        root.getChildren().addAll(left,right);
        root.setSpacing(15);
        root.setPadding(new Insets(5));
        
        //Creating scene
        Scene scene = new Scene(root, 805, 480);
        
        //Creating primary stage
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("SmartPad App");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}