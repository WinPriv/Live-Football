package okhttp3;

import javax.annotation.Nullable;
import okio.e;

/* loaded from: classes2.dex */
public abstract class WebSocketListener {
    public void onMessage(WebSocket webSocket, String str) {
    }

    public void onMessage(WebSocket webSocket, e eVar) {
    }

    public void onOpen(WebSocket webSocket, Response response) {
    }

    public void onClosed(WebSocket webSocket, int i10, String str) {
    }

    public void onClosing(WebSocket webSocket, int i10, String str) {
    }

    public void onFailure(WebSocket webSocket, Throwable th, @Nullable Response response) {
    }
}
