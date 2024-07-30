package ka;

import android.content.Context;
import com.huawei.hms.support.log.KitLog;

/* loaded from: classes2.dex */
public final class o7 {

    /* renamed from: b, reason: collision with root package name */
    public static volatile o7 f31594b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f31595c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final KitLog f31596a;

    public o7() {
        if (androidx.transition.n.W("com.huawei.hms.support.log.KitLog")) {
            this.f31596a = new KitLog();
        }
    }

    public static o7 a() {
        if (f31594b == null) {
            synchronized (f31595c) {
                if (f31594b == null) {
                    f31594b = new o7();
                }
            }
        }
        return f31594b;
    }

    public final void b(String str, String str2) {
        KitLog kitLog = this.f31596a;
        if (kitLog != null) {
            kitLog.i(str, str2);
        }
    }

    public final void c(Context context, int i10) {
        KitLog kitLog = this.f31596a;
        if (kitLog != null) {
            kitLog.init(context.getApplicationContext(), i10, "HiAd");
        }
    }
}
