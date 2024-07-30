package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class ac {

    /* renamed from: b, reason: collision with root package name */
    public static ac f30930b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f30931c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final Context f30932a;

    public ac(Context context) {
        this.f30932a = context.getApplicationContext();
    }

    public static ac a(Context context) {
        ac acVar;
        synchronized (f30931c) {
            if (f30930b == null) {
                f30930b = new ac(context);
            }
            acVar = f30930b;
        }
        return acVar;
    }
}
