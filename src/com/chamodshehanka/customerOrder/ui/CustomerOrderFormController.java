package com.chamodshehanka.customerOrder.ui;

import com.chamodshehanka.customerOrder.controller.CashierController;
import com.chamodshehanka.customerOrder.controller.impl.CashierControllerImpl;
import com.chamodshehanka.customerOrder.dto.CustomerDTO;
import com.chamodshehanka.customerOrder.dto.OrderDTO;
import com.chamodshehanka.customerOrder.tableModel.OrderTableModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.swing.table.TableModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @author chamodshehanka on 10/23/2017
 * @project CustomerOrder
 **/
public class CustomerOrderFormController implements Initializable{

    @FXML
    private JFXTextField txtCustomer;

    @FXML
    private JFXTextField txtContact;

    @FXML
    private JFXDatePicker txtOrderDate;

    @FXML
    private JFXComboBox cbxPriority;

    @FXML
    private JFXButton btnAddtoTable;

    @FXML
    private TableView tblOrder;

    @FXML
    private TableColumn colOrderDate;

    @FXML
    private TableColumn colPriority;

    @FXML
    private JFXButton btnConfirm;

    private final ObservableList<OrderTableModel> data = FXCollections.observableArrayList();
    private ObservableList<String> cbxValues = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        cbxValues.addAll("Low","High");
        cbxPriority.setItems(cbxValues);

        colOrderDate.setCellValueFactory(new PropertyValueFactory<OrderTableModel,String>("oDate"));
        colPriority.setCellValueFactory(new PropertyValueFactory<OrderTableModel,String>("priority"));

        tblOrder.setItems(data);

    }

    @FXML
    private void addToTableAction(ActionEvent event) {
        OrderTableModel row=new OrderTableModel(txtOrderDate.getValue().toString(),cbxPriority.getValue().toString());
        data.add(row);
    }

    @FXML
    void comfirmOrderAction(ActionEvent event) {
        CashierController cashierController=new CashierControllerImpl();
        CustomerDTO customerDTO=new CustomerDTO(txtCustomer.getText(),txtContact.getText(),null);
        List<OrderDTO> orders=new ArrayList<>();
        for(OrderTableModel row:data){
            orders.add(new OrderDTO(row.getoDate(),row.getPriority()));
        }

        customerDTO.setOrderList(orders);
        try {
            if(cashierController.placeNewOrder(customerDTO)){
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Order Add");
                alert.setHeaderText("This is an infomation dialog");
                alert.setContentText("Order has being added sucessfully!!");
                alert.showAndWait();
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                DialogPane dialogPane = alert.getDialogPane();
                dialogPane.getStyleClass().add("myDialog");
                alert.setTitle("Order Add");
                alert.setHeaderText("This is an infomation dialog");
                alert.setContentText("Error .............!!");
                alert.showAndWait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
