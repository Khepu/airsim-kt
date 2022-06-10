package gr.draive.airsimkt.model.drone

import gr.draive.airsimkt.model.KinematicsState
import gr.draive.airsimkt.model.RCData
import gr.draive.airsimkt.model.environment.CollisionInfo
import gr.draive.airsimkt.model.environment.GeoPoint

data class MultirotorState(
    val collision: CollisionInfo,
    val kinematicsEstimated: KinematicsState,
    val gpsLocation: GeoPoint,
    val timestmap: Long,
    val landedState: LandedState,
    val rcData: RCData,
    val ready: Boolean,
    val readyMessage: String,
    val canArm: Boolean
)
