package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import javax.annotation.Nullable;

/* compiled from: Okio.java */
/* loaded from: classes2.dex */
public final class p extends a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Socket f33860a;

    public p(Socket socket) {
        this.f33860a = socket;
    }

    @Override // okio.a
    public final IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.a
    public final void timedOut() {
        boolean z10;
        Socket socket = this.f33860a;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (e10.getCause() != null && e10.getMessage() != null && e10.getMessage().contains("getsockname failed")) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                q.f33861a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            q.f33861a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
