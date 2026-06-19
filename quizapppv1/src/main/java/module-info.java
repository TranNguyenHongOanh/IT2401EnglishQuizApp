module com.tnho.quizapppv1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tnho.quizapppv1 to javafx.fxml;
    exports com.tnho.quizapppv1;
}
