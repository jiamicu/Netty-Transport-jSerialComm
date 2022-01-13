module netty.transport.jserialcomm {
    requires com.fazecast.jSerialComm;
    requires io.netty.transport;
    requires io.netty.buffer;
    exports io.netty.channel.jsc;
}
