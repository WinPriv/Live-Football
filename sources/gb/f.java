package gb;

import android.content.Context;
import com.huawei.hms.ads.ex;

/* loaded from: classes2.dex */
public final class f implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f28580s;

    public f(Context context) {
        this.f28580s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            e.h(this.f28580s);
        } catch (Throwable th) {
            ex.Z("LocationUtils", "loc_tag asyncLocation exception: ".concat(th.getClass().getSimpleName()));
        }
    }
}
