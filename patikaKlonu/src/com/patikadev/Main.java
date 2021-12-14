package com.patikadev;
import com.patikadev.Helper.Helper;
import com.patikadev.Model.Operator;
import com.patikadev.View.OperatorGUI;

public class Main {
    public static void main(String[] args) {

        Helper.setLayout();
        Operator op = new Operator();
        OperatorGUI operatorGUI = new OperatorGUI(op);
    }
}
