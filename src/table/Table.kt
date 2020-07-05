package table

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane

class Table : AnchorPane() {

    init {
        val loader = FXMLLoader(javaClass.getResource("table.fxml"))
        loader.setRoot(this)
        try {
            loader.load<AnchorPane>()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}