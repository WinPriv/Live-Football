package ka;

import android.view.View;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class m9 extends o9 {
    public final a C;
    public long D;
    public int E;
    public boolean F;
    public long G;
    public int H;

    /* loaded from: classes2.dex */
    public interface a {
        void a(long j10, int i10);

        void b(long j10, int i10);

        void c();

        void d();
    }

    public m9(View view, a aVar) {
        super(view);
        this.D = 500L;
        this.E = 50;
        this.F = false;
        this.C = aVar;
        HashMap hashMap = com.huawei.openalliance.ad.ppskit.utils.d0.f22830a;
        this.G = System.currentTimeMillis();
    }

    private void f() {
        int i10;
        a aVar;
        if (!this.F) {
            return;
        }
        n7.e("PPSNativeViewMonitor", "viewShowEndRecord");
        this.F = false;
        long currentTimeMillis = System.currentTimeMillis() - this.G;
        if (n7.d()) {
            n7.c("PPSNativeViewMonitor", "max visible area percentage: %d duration: %d", Integer.valueOf(this.H), Long.valueOf(currentTimeMillis));
        }
        if (currentTimeMillis >= this.D && (i10 = this.H) >= this.E && (aVar = this.C) != null) {
            aVar.a(currentTimeMillis, i10);
        }
        this.H = 0;
    }

    @Override // ka.o9
    public final void a() {
        a aVar = this.C;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // ka.o9
    public final void b(int i10) {
        if (i10 > this.H) {
            this.H = i10;
        }
        if (i10 >= this.E) {
            if (!this.F) {
                n7.e("PPSNativeViewMonitor", "viewShowStartRecord");
                this.F = true;
                this.G = System.currentTimeMillis();
                a aVar = this.C;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            }
            return;
        }
        f();
    }

    @Override // ka.o9
    public final void c(long j10, int i10) {
        f();
        a aVar = this.C;
        if (aVar != null) {
            aVar.b(j10, i10);
        }
    }
}
