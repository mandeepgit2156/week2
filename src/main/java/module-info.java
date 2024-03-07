module com.example.weektwo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.weektwo to javafx.fxml;
    exports com.example.weektwo;
}