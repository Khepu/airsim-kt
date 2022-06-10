package gr.draive.airsimkt.model.environment

enum class WeatherParameter(val type: Int) {
    Rain(0),
    RoadWetness(1),
    Snow(2),
    RoadSnow(3),
    MapleLeaf(4),
    RoadLeaf(5),
    Dust(6),
    Fog(7),
    Enabled(8)
}
