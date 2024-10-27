module net.piedqualt.praytracer {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens net.piedqualt.praytracer to javafx.fxml;
    exports net.piedqualt.praytracer;
}