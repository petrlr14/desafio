package main

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Main : Application() {

    private lateinit var scene: Scene
    private lateinit var root: Parent

    override fun start(primaryStage: Stage?) {
        root = FXMLLoader.load(javaClass.getResource("main.fxml"))
        root.stylesheets.add("main/main.css")
        scene = Scene(root)
        primaryStage?.let {
            it.scene = scene
            it.isResizable = false
        }
        primaryStage?.show()
    }
}

fun main() {
    Application.launch(Main::class.java)
}
