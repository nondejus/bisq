package io.bitsquare.p2p.peers.keepalive.messages;

import io.bitsquare.app.Version;
import io.bitsquare.p2p.Message;

public abstract class KeepAliveMessage implements Message {
    @Override
    public int getMessageVersion() {
        return Version.getP2PMessageVersion();
    }

    @Override
    public String toString() {
        return "KeepAliveMessage{" +
                "messageVersion=" + getMessageVersion() +
                '}';
    }
}
