package ka;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class z8 extends ProxySelector {

    /* renamed from: d, reason: collision with root package name */
    public static final List<Proxy> f32241d = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: a, reason: collision with root package name */
    public final ProxySelector f32242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32243b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32244c;

    public z8(ProxySelector proxySelector, String str, int i10) {
        if (proxySelector != null && str != null) {
            this.f32242a = proxySelector;
            this.f32243b = str;
            this.f32244c = i10;
            return;
        }
        throw null;
    }

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f32242a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public final List<Proxy> select(URI uri) {
        boolean z10;
        if (this.f32243b.equals(uri.getHost()) && this.f32244c == uri.getPort()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return f32241d;
        }
        return this.f32242a.select(uri);
    }
}
