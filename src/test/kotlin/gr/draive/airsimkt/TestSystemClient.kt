package gr.draive.airsimkt

import gr.draive.airsimkt.client.CarClient

val carClient = CarClient("localhost", 41452)

fun testPint() {
    carClient.system.ping()
}
