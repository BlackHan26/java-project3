module com.example.javaproject4 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.javaproject4 to javafx.fxml;
    exports com.example.javaproject4;
}