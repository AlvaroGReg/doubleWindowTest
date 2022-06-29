module com.example.doublewindowtest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.doublewindowtest to javafx.fxml;
    exports com.example.doublewindowtest;
}