package domain

import javafx.fxml.FXMLLoader
import javafx.scene.layout.AnchorPane
import javafx.scene.paint.Color
import javafx.scene.paint.PhongMaterial
import javafx.scene.shape.Box
import javafx.scene.transform.Rotate

class Domain : AnchorPane() {
    init {
        val loader = FXMLLoader(javaClass.getResource("domain.fxml"))
        loader.setRoot(this)
        try {
            val root = loader.load<AnchorPane>()
            val box = root.children[1] as Box
            box.material = PhongMaterial(Color.rgb(249, 199, 79))
            box.transforms.addAll(
                Rotate(30.0, Rotate.X_AXIS),
                Rotate(60.0, Rotate.Y_AXIS)
            )
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}