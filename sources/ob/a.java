package ob;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.h;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f33805s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.ironsource.environment.c.a f33806t;

    public a(com.ironsource.environment.c.a aVar, Context context) {
        this.f33806t = aVar;
        this.f33805s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.ironsource.environment.c.a aVar = this.f33806t;
        try {
            Context context = this.f33805s;
            if (context != null) {
                String C = h.C(context);
                if (!TextUtils.isEmpty(C)) {
                    aVar.a("gaid", C);
                }
                String D = h.D(context);
                if (!TextUtils.isEmpty(D)) {
                    aVar.a("lat", Boolean.valueOf(Boolean.parseBoolean(D)));
                }
            }
        } catch (Exception unused) {
        }
        aVar.f24646b.set(false);
    }
}
