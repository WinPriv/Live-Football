package okhttp3;

import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.RealConnectionPool;

/* loaded from: classes2.dex */
public final class ConnectionPool {
    final RealConnectionPool delegate;

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public int connectionCount() {
        return this.delegate.connectionCount();
    }

    public void evictAll() {
        this.delegate.evictAll();
    }

    public int idleConnectionCount() {
        return this.delegate.idleConnectionCount();
    }

    public ConnectionPool(int i10, long j10, TimeUnit timeUnit) {
        this.delegate = new RealConnectionPool(i10, j10, timeUnit);
    }
}
