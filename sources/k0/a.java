package k0;

import android.graphics.Typeface;
import e0.f;
import f0.e;

/* compiled from: CallbackWithHandler.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.n f30243s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Typeface f30244t;

    public a(androidx.activity.n nVar, Typeface typeface) {
        this.f30243s = nVar;
        this.f30244t = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f.e eVar = ((e.a) this.f30243s).J0;
        if (eVar != null) {
            eVar.d(this.f30244t);
        }
    }
}
