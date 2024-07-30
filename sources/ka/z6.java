package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class z6 extends c7 {

    /* renamed from: k, reason: collision with root package name */
    public static z6 f32237k;

    /* renamed from: l, reason: collision with root package name */
    public static final byte[] f32238l = new byte[0];

    public z6(Context context) {
        super(context);
    }

    public static z6 m(Context context) {
        z6 z6Var;
        synchronized (f32238l) {
            if (f32237k == null) {
                f32237k = new z6(context);
            }
            z6Var = f32237k;
        }
        return z6Var;
    }

    @Override // ka.c7, ka.x6
    public final String b() {
        return "HmsApiServiceManager";
    }

    @Override // ka.c7, ka.x6
    public final String f() {
        return com.huawei.openalliance.ad.ppskit.utils.o2.h(this.f32164d);
    }
}
