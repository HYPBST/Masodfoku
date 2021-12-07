package com.example.masodfoku;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class HelloController {
    @FXML
    private Label lbleredmeny;
    @FXML
    private Button btnszamol;
    @FXML
    private TextField tfa;
    @FXML
    private TextField tfb;
    @FXML
    private TextField tfc;

    @FXML
    public void szamol(){
        if(tfa.getText().isEmpty()||tfb.getText().isEmpty()||tfc.getText().isEmpty()){
            lbleredmeny.setText("Kötelező kitölteni a mezőket");
        }else {
            double a = Double.parseDouble(tfa.getText());
            double b = Double.parseDouble(tfb.getText());
            double c = Double.parseDouble(tfc.getText());
            double d = b * b - 4.0 * a * c;
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            if (r1 < 0 || r2 < 0) {
                lbleredmeny.setText("Nem oldható meg a valós számok halmazán");
                tfa.setText("");
                tfb.setText("");
                tfc.setText("");
            } else if (r1 == r2) {
                lbleredmeny.setText("x1 = x2 =" + r2);
                tfa.setText("");
                tfb.setText("");
                tfc.setText("");
            } else {
                lbleredmeny.setText("x1 = " + r1 + System.lineSeparator() + "x2 =" + r2);
                tfa.setText("");
                tfb.setText("");
                tfc.setText("");
            }
        }
    }
}