package com.chamodshehanka.customerOrder.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class StartProject extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/chamodshehanka/customerOrder/ui/CustomerOrderForm.fxml"));
        primaryStage.setTitle("Place Orders");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
