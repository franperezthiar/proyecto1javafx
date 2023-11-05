module com.example.proyectojavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens com.example.proyectojavafx to javafx.fxml;
    exports com.example.proyectojavafx;
}