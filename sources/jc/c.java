package jc;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class c implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f30212s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f30213t;

    /* loaded from: classes2.dex */
    public class a implements mc.d {
        public a() {
        }
    }

    public c(b bVar, Context context) {
        this.f30213t = bVar;
        this.f30212s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Context context = this.f30212s;
        sc.c a10 = sc.c.a(context);
        Context context2 = a10.f35324a;
        Long l10 = 0L;
        if (context2 != null) {
            try {
                l10 = Long.valueOf(context2.getSharedPreferences("tramini", 0).getLong("P_UD_TE", l10.longValue()));
            } catch (Error | Exception unused) {
            }
        }
        long longValue = l10.longValue();
        sc.a b10 = a10.b();
        if (b10 != null && longValue + b10.f35306b > System.currentTimeMillis()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            sc.c a11 = sc.c.a(context);
            a aVar = new a();
            a11.getClass();
            sc.b bVar = new sc.b(a11, aVar);
            if (!a11.f35325b && !TextUtils.isEmpty(pc.d.f34499e)) {
                mc.e eVar = new mc.e();
                eVar.f33027a = bVar;
                rc.b.a().f34993a.execute(new mc.a(eVar, 0));
            }
        }
    }
}
