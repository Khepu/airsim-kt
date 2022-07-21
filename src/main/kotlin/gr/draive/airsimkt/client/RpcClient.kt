package gr.draive.airsimkt.client

import org.msgpack.rpc.Client


fun createMsgPackRpcClient(ipAddress: String, port: Int): Client =
    Client(ipAddress, port)
