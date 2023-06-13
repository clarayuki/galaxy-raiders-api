package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D
import java.util.Timer
import java.util.TimerTask

class Explosion(initialPosition: Point2D) :
SpaceObject("Explosion", '*', initialPosition, Vector2D(0.0, 0.0), 6.0, mass = 0.0) {

  var isTriggered: Boolean = true
    private set

  init {
    Timer("Schedule", false).schedule(object : TimerTask() {
      override fun run() {
        isTriggered = false
      }
    }, 2000)
  }
  
}