package galaxyraiders.core.game

class Score(var score: Int = 0, var destroyedAsteroids: Int = 0) {

  fun addScore(radius: Double, mass: Double) {
    this.score += (radius * mass).toInt()
    this.destroyedAsteroids += 1
  }

  fun getJSON(): String {
    return "{\"score\": ${this.score}, \"destroyedAsteroids\": ${this.destroyedAsteroids}}"
  }
}
