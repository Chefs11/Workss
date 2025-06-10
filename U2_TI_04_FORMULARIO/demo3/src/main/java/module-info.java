module mx.edu.utez.demo3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.demo3 to javafx.fxml;
    exports mx.edu.utez.demo3;
    exports mx.edu.utez.javafx;
    opens mx.edu.utez.javafx to javafx.fxml;
}