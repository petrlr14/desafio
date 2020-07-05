package modelo

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import java.lang.Exception

class Modelo : AnchorPane() {
    init {
        val loader = FXMLLoader(javaClass.getResource("modelo.fxml"))
        loader.setRoot(this)
        try {
            loader.load<AnchorPane>()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}