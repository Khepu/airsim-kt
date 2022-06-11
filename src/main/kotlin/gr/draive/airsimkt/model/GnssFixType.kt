package gr.draive.airsimkt.model

enum class GnssFixType(val type: Int) {
    NoFix(0),
    TimeOnly(1),
    TwoDimensionalFix(2),
    ThreeDimensionalFix(3)
}
