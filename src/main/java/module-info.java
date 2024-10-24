module dk.easv.checkingage {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.checkingage to javafx.fxml;
    exports dk.easv.checkingage;
}