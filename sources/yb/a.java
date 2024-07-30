package yb;

import android.content.Context;
import com.ironsource.sdk.service.b;
import com.ironsource.sdk.service.d;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f36873s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f36874t;

    public a(Context context, d dVar) {
        this.f36874t = dVar;
        this.f36873s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f36874t.a(b.a(this.f36873s));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
