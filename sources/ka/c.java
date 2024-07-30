package ka;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.inner.CountryCodeBean;

/* loaded from: classes2.dex */
public final class c extends j1.a {

    /* renamed from: w, reason: collision with root package name */
    public static c f31010w;

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f31011x = new byte[0];

    /* renamed from: v, reason: collision with root package name */
    public final CountryCodeBean f31012v;

    public c(Context context) {
        super(context);
        this.f31012v = new CountryCodeBean(context);
    }

    public static c o(Context context) {
        c cVar;
        synchronized (f31011x) {
            if (f31010w == null) {
                f31010w = new c(context);
            }
            cVar = f31010w;
        }
        return cVar;
    }

    @Override // ka.l
    public final boolean c() {
        return "CN".equalsIgnoreCase(this.f31012v.a());
    }

    @Override // ka.l
    public final boolean d() {
        return c();
    }
}
