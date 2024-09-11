package application.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReadController {

	@FXML
    private TextField outContent;

    @FXML
    private TextField outNo;

    @FXML
    private Label outReg;

    @FXML
    private TextField outTitle;

    @FXML
    private Label outUpd;

    @FXML
    private TextField outWriter;
    
    @FXML
    private Label outView;



    //리스트 클릭시 화면전환
    @FXML
    void toList(ActionEvent event) throws IOException{
    	Main.setRoot("UI/List");
    }
    
    //출력
    public void passDataTitle(String data) {
		outTitle.setText(data);;
	}
    public void passDataWriter(String data) {
		outWriter.setText(data);;
	}
    public void passDataContent(String data) {
		outContent.setText(data);;
	}
    public void passDataNo(int data) {
		outNo.setText("No. "+data);;
	}
    public void passDataReg(Date reg) {
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(reg);
    	outReg.setText(str);
    }
	public void passDataUpd(Date upd) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(upd);
    	outReg.setText(str);
	}
	public void passDateView(int view) {
		outView.setText("조회수 : " + view);
		
		
	}

}
