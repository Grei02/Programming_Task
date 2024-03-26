module cr.ac.una.programming_task {
    requires javafx.controls;
    requires javafx.fxml;

    opens cr.ac.una.programming_task to javafx.fxml;
    exports cr.ac.una.programming_task;
}
