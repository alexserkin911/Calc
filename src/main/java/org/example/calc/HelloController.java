package org.example.calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.math.BigInteger;

public class HelloController {
    public TextField textField;


    public void addValue(ActionEvent actionEvent) {
        String append = ((Button)  actionEvent.getSource()).getText();
        textField.setText(textField.getText() + append );
    }

    public void convertToDec(ActionEvent actionEvent){
    textField.setText(new BigInteger(textField.getText(), 2).toString(10));
    }
}
