package gr.draive.airsimkt.model.endpoint

enum class VehicleEndpoint(val endpoint: String) {
    /**
     * Reset the vehicle to its original starting state.
     */
    Reset("reset"),

    EnableApiControl("enableApiControl"),
    IsApiControlEnabled("isApiControlEnabled"),

    GetHomeGeoPoint("getHomeGeoPoint"),
    GetCollisionInfo("simGetCollisionInfo"),

    GetVehiclePose("simGetVehiclePose"),
    SetVehiclePose("simSetVehiclePose"),

    GetGroundTruthKinematics("simGetGroundTruthKinematics"),
    SetKinematics("simSetKinematics"),

    CancelLastTask("cancelLastTask")
}