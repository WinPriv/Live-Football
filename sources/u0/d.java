package u0;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import y6.h;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class d extends b<d> {

    /* renamed from: r, reason: collision with root package name */
    public e f35739r;

    /* renamed from: s, reason: collision with root package name */
    public float f35740s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35741t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Object obj) {
        super(obj);
        h.a aVar = h.I;
        this.f35739r = null;
        this.f35740s = Float.MAX_VALUE;
        this.f35741t = false;
    }

    public final void c() {
        boolean z10;
        if (this.f35739r.f35743b > 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f) {
                    this.f35741t = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
