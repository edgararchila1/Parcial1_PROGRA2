module com.example.parcial1_progra2 {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.parcial1_progra2 to javafx.fxml;
    exports com.example.parcial1_progra2;
}