package gr.draive.airsimkt.client

import org.msgpack.rpc.Client
import org.msgpack.rpc.Future
import org.msgpack.type.Value


class SystemClient(
    private val rpcClient: Client
) {
    fun ping(): Future<Value> {
        return rpcClient.sendRequest("ping", arrayOf())
    }

    fun reset(): Future<Value> {
        return rpcClient.sendRequest("reset", arrayOf())
    }

    fun simPrintLogMessage(): Future<Value> {
        // Does not work.. need to fix
        // https://microsoft.github.io/AirSim/apis/#common-apis -- > simPrintLogMessage
        // Need to find how to send args properly
        return rpcClient.sendRequest("simPrintLogMessage", arrayOf("hello kotlin"))
    }
}