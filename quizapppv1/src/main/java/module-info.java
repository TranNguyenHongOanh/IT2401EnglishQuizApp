module com.tnho.quizapppv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    requires java.logging;
    
    opens com.tnho.quizapppv1 to javafx.fxml;
    opens com.tnho.pojo to javafx.base;
    exports com.tnho.quizapppv1;
    exports com.tnho.pojo;
}
