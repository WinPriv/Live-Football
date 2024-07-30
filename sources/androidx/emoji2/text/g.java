package androidx.emoji2.text;

import android.util.Pair;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import com.applovin.exoplayer2.b.e0;
import com.applovin.exoplayer2.b.g;
import com.applovin.exoplayer2.d.g;
import com.applovin.exoplayer2.v;
import d6.g0;
import e6.m;
import j5.u;
import java.util.concurrent.ThreadPoolExecutor;
import k4.i0;
import k4.y0;
import m4.k;
import t7.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1635s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1636t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1637u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f1638v;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f1635s = i10;
        this.f1636t = obj;
        this.f1637u = obj2;
        this.f1638v = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1635s) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f1636t;
                f.h hVar = (f.h) this.f1637u;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f1638v;
                bVar.getClass();
                try {
                    l a10 = c.a(bVar.f1612a);
                    if (a10 != null) {
                        l.b bVar2 = (l.b) a10.f1630a;
                        synchronized (bVar2.f1660d) {
                            bVar2.f = threadPoolExecutor;
                        }
                        a10.f1630a.a(new h(hVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                ((g.a) this.f1636t).b((v) this.f1637u, (com.applovin.exoplayer2.c.h) this.f1638v);
                return;
            case 2:
                ((g.a) this.f1636t).a((com.applovin.exoplayer2.d.g) this.f1637u, (Exception) this.f1638v);
                return;
            case 3:
                y0.a aVar = (y0.a) this.f1636t;
                Pair pair = (Pair) this.f1637u;
                aVar.f30846t.f30840h.N(((Integer) pair.first).intValue(), (u.b) pair.second, (Exception) this.f1638v);
                return;
            case 4:
                k.a aVar2 = (k.a) this.f1636t;
                i0 i0Var = (i0) this.f1637u;
                n4.i iVar = (n4.i) this.f1638v;
                aVar2.getClass();
                int i10 = g0.f27302a;
                m4.k kVar = aVar2.f32748b;
                kVar.getClass();
                kVar.e(i0Var, iVar);
                return;
            case 5:
                m.a aVar3 = (m.a) this.f1636t;
                i0 i0Var2 = (i0) this.f1637u;
                n4.i iVar2 = (n4.i) this.f1638v;
                aVar3.getClass();
                int i11 = g0.f27302a;
                e6.m mVar = aVar3.f27841b;
                mVar.getClass();
                mVar.t(i0Var2, iVar2);
                return;
            default:
                t7.g gVar = (t7.g) this.f1636t;
                Runnable runnable = (Runnable) this.f1637u;
                h.b bVar3 = (h.b) this.f1638v;
                gVar.getClass();
                gVar.f35539s.execute(new e0(11, runnable, bVar3));
                return;
        }
    }
}
