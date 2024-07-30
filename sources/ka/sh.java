package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class sh extends xh {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(Context context, int i10) {
        super(context);
        this.f31853c = i10;
    }

    @Override // ka.gi
    public final int a() {
        switch (this.f31853c) {
            case 0:
                return -1;
            default:
                return 7;
        }
    }

    @Override // ka.gi
    public final long a(String str) {
        switch (this.f31853c) {
            case 0:
                return 604800000L;
            default:
                return com.huawei.openalliance.ad.ppskit.handlers.l.d(this.f32202b).H(str);
        }
    }
}
