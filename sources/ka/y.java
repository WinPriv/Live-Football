package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class y implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f32203a;

    public y(String str) {
        this.f32203a = str;
    }

    public static void d(com.huawei.android.hms.ppskit.a aVar, String str, int i10, String str2) {
        if (n7.d()) {
            n7.c("API: ", "call: %s code: %s result: %s", str, Integer.valueOf(i10), com.huawei.openalliance.ad.ppskit.utils.y1.j(str2));
        }
        if (aVar != null) {
            try {
                aVar.e(str, i10, str2);
            } catch (Throwable th) {
                e0.i.p(th, "notifyResultCallback: ", "API: ");
            }
        }
    }

    @Override // ka.b2
    public String a(Context context, String str, String str2, String str3) {
        n7.g("API: " + this.f32203a, "direct call is not implemented!");
        throw new IllegalStateException("direct call is not implemented!");
    }

    @Override // ka.b2
    public void b(Context context, String str, String str2, String str3, com.huawei.android.hms.ppskit.a aVar) {
        n7.g("API: " + this.f32203a, "async execute is not implemented!");
        throw new IllegalStateException("async execute is not implemented!");
    }

    public final void c(com.huawei.android.hms.ppskit.a aVar) {
        d(aVar, this.f32203a, -1, "");
    }

    public final void e(com.huawei.android.hms.ppskit.a aVar) {
        d(aVar, this.f32203a, 200, "ok");
    }

    @Override // ka.b2
    public void a() {
    }

    @Override // ka.b2
    public int b() {
        return 11;
    }
}
