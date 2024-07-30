package b0;

import android.view.Display;
import b5.q;
import com.applovin.exoplayer2.c.i;
import com.applovin.exoplayer2.m.m;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.c;
import d6.o;
import e6.j;
import h4.b;
import java.util.Iterator;
import java.util.regex.Pattern;
import k4.e1;
import k4.i0;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.NodeVisitor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements i.a, m.b.a, b.a, o.a, q.f, j.b.a, o0.k, OnCompleteListener, NodeVisitor {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2699s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2700t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f2699s = i10;
        this.f2700t = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r5 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r1 != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r1 != false) goto L11;
     */
    @Override // o0.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r7) {
        /*
            r6 = this;
            java.lang.Object r7 = r6.f2700t
            com.google.android.material.bottomsheet.BottomSheetDragHandleView r7 = (com.google.android.material.bottomsheet.BottomSheetDragHandleView) r7
            boolean r0 = r7.f20578x
            if (r0 != 0) goto La
            r7 = 0
            goto L2a
        La:
            com.google.android.material.bottomsheet.BottomSheetBehavior<?> r0 = r7.f20576v
            boolean r1 = r0.f20537b
            r2 = 1
            r1 = r1 ^ r2
            int r3 = r0.L
            r4 = 3
            r5 = 4
            if (r3 != r5) goto L19
            if (r1 == 0) goto L25
            goto L1d
        L19:
            if (r3 != r4) goto L1f
            if (r1 == 0) goto L26
        L1d:
            r5 = 6
            goto L26
        L1f:
            boolean r7 = r7.y
            if (r7 == 0) goto L24
            goto L25
        L24:
            r4 = r5
        L25:
            r5 = r4
        L26:
            r0.C(r5)
            r7 = r2
        L2a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.b.a(android.view.View):boolean");
    }

    @Override // h4.b.a
    public final Object execute() {
        int i10 = this.f2699s;
        Object obj = this.f2700t;
        switch (i10) {
            case 3:
                return Integer.valueOf(((g4.d) obj).o());
            default:
                f4.j jVar = (f4.j) obj;
                Iterator<z3.s> it = jVar.f28105b.v().iterator();
                while (it.hasNext()) {
                    jVar.f28106c.a(it.next(), 1);
                }
                return null;
        }
    }

    @Override // b5.q.f
    public final int getScore(Object obj) {
        boolean z10;
        i0 i0Var = (i0) this.f2700t;
        b5.m mVar = (b5.m) obj;
        Pattern pattern = b5.q.f2985a;
        mVar.getClass();
        String str = i0Var.D;
        String str2 = mVar.f2946b;
        if (!str2.equals(str) && !str2.equals(b5.q.b(i0Var))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !mVar.c(i0Var, false)) {
            return 0;
        }
        return 1;
    }

    @Override // org.jsoup.select.NodeVisitor
    public final void head(Node node, int i10) {
        Element.p(node, (StringBuilder) this.f2700t);
    }

    @Override // d6.o.a
    public final void invoke(Object obj) {
        int i10 = this.f2699s;
        Object obj2 = this.f2700t;
        switch (i10) {
            case 6:
                ((e1.c) obj).d0((k4.l) obj2);
                return;
            default:
                ((e1.c) obj).a((e6.n) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        c.a aVar = (c.a) this.f2700t;
        int i10 = com.google.firebase.messaging.b.f21302b;
        aVar.f21311b.trySetResult(null);
    }

    @Override // com.applovin.exoplayer2.m.m.b.a
    public final void onDefaultDisplayChanged(Display display) {
        int i10 = this.f2699s;
        Object obj = this.f2700t;
        switch (i10) {
            case 2:
                ((com.applovin.exoplayer2.m.m) obj).a(display);
                return;
            default:
                e6.j jVar = (e6.j) obj;
                jVar.getClass();
                if (display != null) {
                    long refreshRate = (long) (1.0E9d / display.getRefreshRate());
                    jVar.f27819k = refreshRate;
                    jVar.f27820l = (refreshRate * 80) / 100;
                    return;
                } else {
                    d6.p.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                    jVar.f27819k = com.anythink.expressad.exoplayer.b.f7291b;
                    jVar.f27820l = com.anythink.expressad.exoplayer.b.f7291b;
                    return;
                }
        }
    }

    @Override // com.applovin.exoplayer2.c.i.a
    public final void releaseOutputBuffer(com.applovin.exoplayer2.c.i iVar) {
        com.applovin.exoplayer2.i.c.a((com.applovin.exoplayer2.i.c) this.f2700t, (com.applovin.exoplayer2.i.k) iVar);
    }
}
