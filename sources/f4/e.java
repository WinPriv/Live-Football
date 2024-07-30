package f4;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import z3.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f28078s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f28079t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28080u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Runnable f28081v;

    public /* synthetic */ e(h hVar, z3.j jVar, int i10, Runnable runnable) {
        this.f28078s = hVar;
        this.f28079t = jVar;
        this.f28080u = i10;
        this.f28081v = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        s sVar = this.f28079t;
        int i10 = this.f28080u;
        Runnable runnable = this.f28081v;
        h hVar = this.f28078s;
        h4.b bVar = hVar.f;
        int i11 = 1;
        try {
            try {
                g4.d dVar = hVar.f28091c;
                Objects.requireNonNull(dVar);
                bVar.e(new b0.b(dVar, 3));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) hVar.f28089a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    bVar.e(new com.applovin.exoplayer2.a.s(i10, hVar, sVar, i11));
                } else {
                    hVar.a(sVar, i10);
                }
            } catch (h4.a unused) {
                hVar.f28092d.a(sVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
