package gr.draive.airsimkt

import gr.draive.airsimkt.client.CarClient
import org.junit.jupiter.api.Test

class TestSystemClient {

    private val carClient = CarClient("localhost", 41451)

    @Test
    fun testPing() {
        val future = carClient.system.ping()
        assert(future.get().asBooleanValue().boolean)
    }

    @Test
    fun testReset() {
        val future = carClient.system.reset()
        assert(future.get().isNilValue)
    }

}