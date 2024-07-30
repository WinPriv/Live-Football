package okhttp3;

import javax.annotation.Nullable;
import okio.e;

/* loaded from: classes2.dex */
public interface WebSocket {

    /* loaded from: classes2.dex */
    public interface Factory {
        WebSocket newWebSocket(Request request, WebSocketListener webSocketListener);
    }

    void cancel();

    boolean close(int i10, @Nullable String str);

    long queueSize();

    Request request();

    boolean send(String str);

    boolean send(e eVar);
}
