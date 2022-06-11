package gr.draive.airsimkt.client

import io.grpc.ManagedChannel

abstract class VehicleClient(
    val ipAddress: String,
    val port: Int
) {
    protected val rpcClient: ManagedChannel = createRpcClient(ipAddress, port)
}
