package ka;

import android.content.Context;

/* loaded from: classes2.dex */
public final class li implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f31433s;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a0.a.J0(li.this.f31433s);
        }
    }

    public li(Context context) {
        this.f31433s = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.huawei.openalliance.ad.ppskit.utils.p2.d(new a());
    }
}
