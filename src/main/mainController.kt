package main

import domain.Domain
import javafx.fxml.FXML
import javafx.scene.layout.BorderPane
import mesh.Mesh
import modelo.Modelo
import nosepudobro.NoSePudoBro
import table.Table

class MainController {

    @FXML
    lateinit var pane: BorderPane

    @FXML
    fun showDomain() {
        val domain = Domain()
        pane.center = domain
    }

    @FXML
    fun showMesh() {
        pane.center = Mesh()
    }

    @FXML
    fun showTable() {
        pane.center = Table()
    }

    @FXML
    fun showNoSePudo() {
        pane.center = NoSePudoBro()
    }

    @FXML
    fun showModel() {
        pane.center = Modelo()
    }

}