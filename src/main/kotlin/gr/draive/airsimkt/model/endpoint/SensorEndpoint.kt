package gr.draive.airsimkt.model.endpoint

enum class SensorEndpoint(val endpoints: String) {
    GetImuData("getImuData"),
    GetBarometerData("getBarometerData"),
    GetMagnetometerData("getMagnetometerData"),
    GetGpsData("getGpsData"),
    GetDistanceSensorData("getDistanceSensorData"),
    GetLidarData("getLidarData"),

}