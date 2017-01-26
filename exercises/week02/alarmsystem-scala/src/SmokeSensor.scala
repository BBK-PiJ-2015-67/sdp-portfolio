class SmokeSensor extends Sensor {
  private val ChanceOfTriggering = 10
  private val BatteryDrainPerPoll = 20
  private val SensorType: String = "Smoke sensor"
  private val Location: String = "Canteen"

  private var batteryPercentage: Double = 100

  override def isTriggered: Boolean = Random.nextInt(100) < ChanceOfTriggering

  override def getLocation: String = Location

  override def getSensorType: String = SensorType

  override def getBatteryPercentage: Double = {
    batteryPercentage -= BatteryDrainPerPoll
    batteryPercentage
  }
}
