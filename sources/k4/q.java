package k4;

import android.content.Context;
import j5.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q implements i7.m {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f30742s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f30743t;

    public /* synthetic */ q(Object obj, int i10) {
        this.f30742s = i10;
        this.f30743t = obj;
    }

    @Override // i7.m
    public final Object get() {
        int i10 = this.f30742s;
        Object obj = this.f30743t;
        switch (i10) {
            case 0:
                return new b6.e((Context) obj);
            default:
                try {
                    return (u.a) ((Class) obj).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e10) {
                    throw new IllegalStateException(e10);
                }
        }
    }
}
