package db;

import android.webkit.WebView;
import ka.n7;

/* loaded from: classes2.dex */
public final class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f27586s;

    public e(f fVar) {
        this.f27586s = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f27586s;
        fVar.getClass();
        n7.b("PreloadWebViewMonitor", "unbindService");
        d dVar = (d) fVar.f27589c;
        WebView webView = dVar.f27580a;
        if (webView != null) {
            webView.destroy();
        }
        dVar.f27580a = null;
        dVar.f27581b = null;
        synchronized (d.f27579g) {
            d.f = null;
        }
    }
}
