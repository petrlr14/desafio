package nosepudobro

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import java.lang.Exception

class NoSePudoBro : AnchorPane() {

    init {
        val loader = FXMLLoader(javaClass.getResource("nosepudobro.fxml"))
        loader.setRoot(this)
        try {
            loader.load<AnchorPane>()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}