package gr.draive.airsimkt

import gr.draive.airsimkt.client.CarClient
import org.junit.jupiter.api.Test

class TestSystemClient {

    private val carClient = CarClient("localhost", 41452)

    @Test
    fun testPint() {
        carClient.system.ping()
    }
}