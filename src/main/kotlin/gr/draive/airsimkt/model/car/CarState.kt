package gr.draive.airsimkt.model.car

import gr.draive.airsimkt.model.environment.CollisionInfo
import gr.draive.airsimkt.model.environment.KinematicsState

data class CarState(
    val speed: Double,
    val gear: Int,
    val rpm: Double,
    val maxRpm: Double,
    val handbrake: Boolean,
    val collision: CollisionInfo,
    val kinematicsEstimated: KinematicsState,
    val timestamp: Long
)
