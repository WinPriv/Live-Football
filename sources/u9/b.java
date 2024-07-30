package u9;

import android.util.Log;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f35806b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f35807a;

    public b() {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.f35807a = true;
        } catch (ClassNotFoundException unused) {
            this.f35807a = false;
        }
    }

    public final void a(String str, String str2) {
        if (this.f35807a) {
            a.f35805a.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public final void b(String str, String str2, Exception exc) {
        if (this.f35807a) {
            a.f35805a.e(str, str2, exc);
        } else {
            Log.e(str, str2, exc);
        }
    }

    public final void c(String str, String str2) {
        if (this.f35807a) {
            a.f35805a.i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public final void d(String str) {
        if (this.f35807a) {
            a.f35805a.w("X509CertUtil", str);
        } else {
            Log.w("X509CertUtil", str);
        }
    }
}
