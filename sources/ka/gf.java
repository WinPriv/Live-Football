package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class gf implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f31223s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f31224t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ hf f31225u;

    public gf(hf hfVar, String str, int i10) {
        this.f31225u = hfVar;
        this.f31223s = str;
        this.f31224t = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db.d dVar;
        try {
            Context context = this.f31225u.f31253a;
            synchronized (db.d.f27579g) {
                if (db.d.f == null) {
                    db.d.f = new db.d(context);
                }
                dVar = db.d.f;
            }
            dVar.a(this.f31223s, this.f31224t);
        } catch (Throwable unused) {
            n7.g("PreloadWebViewProcessor", "preLoad fail");
        }
    }
}
