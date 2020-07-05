package mesh

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane

class Mesh : AnchorPane() {

    init {
        val loader = FXMLLoader(javaClass.getResource("mesh.fxml"))
        loader.setRoot(this)
        try {
            loader.load<AnchorPane>()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}