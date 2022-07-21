package gr.draive.airsimkt.client

import org.msgpack.rpc.Client

abstract class VehicleClient(
    val ipAddress: String,
    val port: Int
) {
    protected val msgpackRpcClient: Client = createMsgPackRpcClient(ipAddress, port)

    val system = SystemClient(msgpackRpcClient)
}
