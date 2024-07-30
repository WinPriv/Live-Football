package db;

import android.webkit.SslErrorHandler;
import db.j;

/* loaded from: classes2.dex */
public final class h implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j.a f27592s;

    public h(j.a aVar) {
        this.f27592s = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SslErrorHandler sslErrorHandler = this.f27592s.f27595a;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }
}
