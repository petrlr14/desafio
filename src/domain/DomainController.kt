package domain

import javafx.beans.property.SimpleDoubleProperty
import javafx.fxml.FXML
import javafx.scene.input.MouseEvent
import javafx.scene.shape.Box
import javafx.scene.transform.Rotate

class DomainController {

    var angleX = SimpleDoubleProperty(0.0)
    var angleY = SimpleDoubleProperty(0.0)
    var anchorX = 0.0
    var anchorY = 0.0
    var anchorAngleX = 0.0
    var anchorAngleY = 0.0

    var rotateX = Rotate(angleX.get(), Rotate.X_AXIS).also {
        it.angleProperty().bind(angleX)
    }
    var rotateY = Rotate(angleY.get(), Rotate.Y_AXIS).also {
        it.angleProperty().bind(angleY)
    }


    @FXML
    lateinit var box: Box

    @FXML
    fun setAnchors(event: MouseEvent) {
        anchorX = event.sceneX
        anchorY = event.sceneY
        anchorAngleX = angleX.get()
        anchorAngleX = angleY.get()
    }

    @FXML
    fun rotateCube(event: MouseEvent) {
        angleX.set(anchorAngleX - (anchorY - event.sceneY))
        angleY.set(anchorAngleY - (anchorX - event.sceneX))
        box.transforms.clear()
        box.transforms.addAll(rotateX, rotateY)
    }

}