package ha;

import android.content.ComponentName;
import android.content.Context;
import gb.b0;

/* loaded from: classes2.dex */
public final class e extends i {

    /* renamed from: j, reason: collision with root package name */
    public static e f28809j;

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f28810k = new byte[0];

    public e(Context context) {
        super(context);
    }

    public static e g(Context context) {
        e eVar;
        synchronized (f28810k) {
            if (f28809j == null) {
                f28809j = new e(context);
            }
            eVar = f28809j;
        }
        return eVar;
    }

    @Override // ha.i, ha.d
    public final String c() {
        return "ExPPSApiServiceManager";
    }

    @Override // ha.i
    public final String f() {
        return b0.g(this.f28804d);
    }

    @Override // ha.i, ha.d
    public final void a(ComponentName componentName) {
    }
}
