package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D
import java.util.Timer
import java.util.TimerTask

const val EXPLOSION_RADIUS = 6.0
const val EXPLOSION_DURATION = 2000L

class Explosion(initialPosition: Point2D) :
  SpaceObject("Explosion", '*', initialPosition, Vector2D(0.0, 0.0), EXPLOSION_RADIUS, mass = 0.0) {

  var isTriggered: Boolean = true
    private set

  init {
    Timer("Schedule", false).schedule(
      object : TimerTask() {
        override fun run() {
          isTriggered = false
        }
      },
      EXPLOSION_DURATION
    )
  }
}
