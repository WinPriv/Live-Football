package com.anythink.expressad.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.ae;
import com.anythink.expressad.exoplayer.e;
import com.anythink.expressad.exoplayer.h.af;
import com.anythink.expressad.exoplayer.h.r;
import com.anythink.expressad.exoplayer.h.s;
import com.anythink.expressad.exoplayer.i.h;
import com.anythink.expressad.exoplayer.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
final class k implements Handler.Callback, e.a, r.a, s.b, h.a, x.a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8951a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f8952b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8953c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final String f8954d = "ExoPlayerImplInternal";

    /* renamed from: e, reason: collision with root package name */
    private static final int f8955e = 0;
    private static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f8956g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f8957h = 3;

    /* renamed from: i, reason: collision with root package name */
    private static final int f8958i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f8959j = 5;

    /* renamed from: k, reason: collision with root package name */
    private static final int f8960k = 6;

    /* renamed from: l, reason: collision with root package name */
    private static final int f8961l = 7;

    /* renamed from: m, reason: collision with root package name */
    private static final int f8962m = 8;

    /* renamed from: n, reason: collision with root package name */
    private static final int f8963n = 9;
    private static final int o = 10;

    /* renamed from: p, reason: collision with root package name */
    private static final int f8964p = 11;

    /* renamed from: q, reason: collision with root package name */
    private static final int f8965q = 12;

    /* renamed from: r, reason: collision with root package name */
    private static final int f8966r = 13;

    /* renamed from: s, reason: collision with root package name */
    private static final int f8967s = 14;

    /* renamed from: t, reason: collision with root package name */
    private static final int f8968t = 15;

    /* renamed from: u, reason: collision with root package name */
    private static final int f8969u = 10;

    /* renamed from: v, reason: collision with root package name */
    private static final int f8970v = 10;

    /* renamed from: w, reason: collision with root package name */
    private static final int f8971w = 1000;

    /* renamed from: x, reason: collision with root package name */
    private static final long f8972x = 500;
    private final com.anythink.expressad.exoplayer.i.h A;
    private final com.anythink.expressad.exoplayer.i.i B;
    private final p C;
    private final com.anythink.expressad.exoplayer.k.k D;
    private final HandlerThread E;
    private final Handler F;
    private final h G;
    private final ae.b H;
    private final ae.a I;
    private final e L;
    private final ArrayList<b> N;
    private final com.anythink.expressad.exoplayer.k.c O;
    private u R;
    private com.anythink.expressad.exoplayer.h.s S;
    private y[] T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private boolean Y;
    private int Z;

    /* renamed from: aa, reason: collision with root package name */
    private d f8973aa;

    /* renamed from: ab, reason: collision with root package name */
    private long f8974ab;

    /* renamed from: ac, reason: collision with root package name */
    private int f8975ac;
    private final y[] y;

    /* renamed from: z, reason: collision with root package name */
    private final z[] f8976z;
    private final s P = new s();
    private final long J = 0;
    private final boolean K = false;
    private ac Q = ac.f7265e;
    private final c M = new c(0);

    /* renamed from: com.anythink.expressad.exoplayer.k$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f8977a;

        public AnonymousClass1(x xVar) {
            this.f8977a = xVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                k.f(this.f8977a);
            } catch (g e10) {
                Log.e(k.f8954d, "Unexpected error delivering message on external thread.", e10);
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final com.anythink.expressad.exoplayer.h.s f8979a;

        /* renamed from: b, reason: collision with root package name */
        public final ae f8980b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f8981c;

        public a(com.anythink.expressad.exoplayer.h.s sVar, ae aeVar, Object obj) {
            this.f8979a = sVar;
            this.f8980b = aeVar;
            this.f8981c = obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private u f9013a;

        /* renamed from: b, reason: collision with root package name */
        private int f9014b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9015c;

        /* renamed from: d, reason: collision with root package name */
        private int f9016d;

        private c() {
        }

        public /* synthetic */ c(byte b10) {
            this();
        }

        public final boolean a(u uVar) {
            return uVar != this.f9013a || this.f9014b > 0 || this.f9015c;
        }

        public final void b(u uVar) {
            this.f9013a = uVar;
            this.f9014b = 0;
            this.f9015c = false;
        }

        public final void a(int i10) {
            this.f9014b += i10;
        }

        public final void b(int i10) {
            if (this.f9015c && this.f9016d != 4) {
                com.anythink.expressad.exoplayer.k.a.a(i10 == 4);
            } else {
                this.f9015c = true;
                this.f9016d = i10;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final ae f9026a;

        /* renamed from: b, reason: collision with root package name */
        public final int f9027b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9028c;

        public d(ae aeVar, int i10, long j10) {
            this.f9026a = aeVar;
            this.f9027b = i10;
            this.f9028c = j10;
        }
    }

    public k(y[] yVarArr, com.anythink.expressad.exoplayer.i.h hVar, com.anythink.expressad.exoplayer.i.i iVar, p pVar, boolean z10, int i10, boolean z11, Handler handler, h hVar2, com.anythink.expressad.exoplayer.k.c cVar) {
        this.y = yVarArr;
        this.A = hVar;
        this.B = iVar;
        this.C = pVar;
        this.V = z10;
        this.X = i10;
        this.Y = z11;
        this.F = handler;
        this.G = hVar2;
        this.O = cVar;
        this.R = new u(ae.f7271a, com.anythink.expressad.exoplayer.b.f7291b, af.f8255a, iVar);
        this.f8976z = new z[yVarArr.length];
        for (int i11 = 0; i11 < yVarArr.length; i11++) {
            yVarArr[i11].a(i11);
            this.f8976z[i11] = yVarArr[i11].b();
        }
        this.L = new e(this, cVar);
        this.N = new ArrayList<>();
        this.T = new y[0];
        this.H = new ae.b();
        this.I = new ae.a();
        hVar.a((h.a) this);
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.E = handlerThread;
        handlerThread.start();
        this.D = cVar.a(handlerThread.getLooper(), this);
    }

    private void d(boolean z10) {
        u uVar = this.R;
        if (uVar.f9340g != z10) {
            this.R = uVar.a(z10);
        }
    }

    private void e(boolean z10) {
        this.W = false;
        this.V = z10;
        if (!z10) {
            f();
            g();
            return;
        }
        int i10 = this.R.f;
        if (i10 == 3) {
            e();
            this.D.b(2);
        } else if (i10 == 2) {
            this.D.b(2);
        }
    }

    private void f(boolean z10) {
        this.Y = z10;
        if (this.P.a(z10)) {
            return;
        }
        g(true);
    }

    private void g(boolean z10) {
        s.a aVar = this.P.c().f9285h.f9292a;
        long a10 = a(aVar, this.R.f9343j, true);
        if (a10 != this.R.f9343j) {
            u uVar = this.R;
            this.R = uVar.a(aVar, a10, uVar.f9339e);
            if (z10) {
                this.M.b(4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            Method dump skipped, instructions count: 777
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.h():void");
    }

    private void i() {
        a(true, true, true);
        this.C.c();
        b(1);
        this.E.quitSafely();
        synchronized (this) {
            this.U = true;
            notifyAll();
        }
    }

    private int j() {
        ae aeVar = this.R.f9335a;
        if (aeVar.a()) {
            return 0;
        }
        return aeVar.a(aeVar.b(this.Y), this.H, false).f;
    }

    private void k() {
        for (int size = this.N.size() - 1; size >= 0; size--) {
            if (!a(this.N.get(size))) {
                this.N.get(size).f9006a.a(false);
                this.N.remove(size);
            }
        }
        Collections.sort(this.N);
    }

    private void l() {
        boolean z10;
        if (!this.P.f()) {
            return;
        }
        float f10 = this.L.e().f9346b;
        q d10 = this.P.d();
        boolean z11 = true;
        for (q c10 = this.P.c(); c10 != null && c10.f; c10 = c10.f9286i) {
            if (!c10.a(f10)) {
                if (c10 == d10) {
                    z11 = false;
                }
            } else {
                if (z11) {
                    q c11 = this.P.c();
                    boolean a10 = this.P.a(c11);
                    boolean[] zArr = new boolean[this.y.length];
                    long a11 = c11.a(this.R.f9343j, a10, zArr);
                    a(c11.f9288k);
                    u uVar = this.R;
                    if (uVar.f != 4 && a11 != uVar.f9343j) {
                        u uVar2 = this.R;
                        this.R = uVar2.a(uVar2.f9337c, a11, uVar2.f9339e);
                        this.M.b(4);
                        a(a11);
                    }
                    boolean[] zArr2 = new boolean[this.y.length];
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        y[] yVarArr = this.y;
                        if (i10 >= yVarArr.length) {
                            break;
                        }
                        y yVar = yVarArr[i10];
                        if (yVar.a_() != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        zArr2[i10] = z10;
                        com.anythink.expressad.exoplayer.h.y yVar2 = c11.f9281c[i10];
                        if (yVar2 != null) {
                            i11++;
                        }
                        if (z10) {
                            if (yVar2 != yVar.f()) {
                                b(yVar);
                            } else if (zArr[i10]) {
                                yVar.a(this.f8974ab);
                            }
                        }
                        i10++;
                    }
                    this.R = this.R.a(c11.f9287j, c11.f9288k);
                    a(zArr2, i11);
                } else {
                    this.P.a(c10);
                    if (c10.f) {
                        c10.b(Math.max(c10.f9285h.f9293b, this.f8974ab - c10.f9283e));
                        a(c10.f9288k);
                    }
                }
                if (this.R.f != 4) {
                    r();
                    g();
                    this.D.b(2);
                    return;
                }
                return;
            }
        }
    }

    private boolean m() {
        q c10 = this.P.c();
        long j10 = c10.f9285h.f9296e;
        if (j10 != com.anythink.expressad.exoplayer.b.f7291b && this.R.f9343j >= j10) {
            q qVar = c10.f9286i;
            if (qVar != null) {
                if (!qVar.f && !qVar.f9285h.f9292a.a()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    private void n() {
        q b10 = this.P.b();
        q d10 = this.P.d();
        if (b10 != null && !b10.f) {
            if (d10 == null || d10.f9286i == b10) {
                for (y yVar : this.T) {
                    if (!yVar.g()) {
                        return;
                    }
                }
                b10.f9279a.a();
            }
        }
    }

    private void o() {
        b(4);
        a(false, true, false);
    }

    private void p() {
        boolean z10;
        boolean z11;
        int i10;
        com.anythink.expressad.exoplayer.h.s sVar = this.S;
        if (sVar == null) {
            return;
        }
        if (this.Z > 0) {
            sVar.b();
            return;
        }
        this.P.a(this.f8974ab);
        if (this.P.a()) {
            r a10 = this.P.a(this.f8974ab, this.R);
            if (a10 == null) {
                this.S.b();
            } else {
                this.P.a(this.f8976z, this.A, this.C.d(), this.S, this.R.f9335a.a(a10.f9292a.f8484a, this.I, true).f7273b, a10).a(this, a10.f9293b);
                d(true);
            }
        }
        q b10 = this.P.b();
        int i11 = 0;
        if (b10 != null && !b10.a()) {
            if (!this.R.f9340g) {
                r();
            }
        } else {
            d(false);
        }
        if (!this.P.f()) {
            return;
        }
        q c10 = this.P.c();
        q d10 = this.P.d();
        boolean z12 = false;
        while (this.V && c10 != d10 && this.f8974ab >= c10.f9286i.f9283e) {
            if (z12) {
                d();
            }
            if (c10.f9285h.f) {
                i10 = 0;
            } else {
                i10 = 3;
            }
            q h10 = this.P.h();
            a(c10);
            u uVar = this.R;
            r rVar = h10.f9285h;
            this.R = uVar.a(rVar.f9292a, rVar.f9293b, rVar.f9295d);
            this.M.b(i10);
            g();
            z12 = true;
            c10 = h10;
        }
        if (d10.f9285h.f9297g) {
            while (true) {
                y[] yVarArr = this.y;
                if (i11 < yVarArr.length) {
                    y yVar = yVarArr[i11];
                    com.anythink.expressad.exoplayer.h.y yVar2 = d10.f9281c[i11];
                    if (yVar2 != null && yVar.f() == yVar2 && yVar.g()) {
                        yVar.h();
                    }
                    i11++;
                } else {
                    return;
                }
            }
        } else {
            q qVar = d10.f9286i;
            if (qVar != null && qVar.f) {
                int i12 = 0;
                while (true) {
                    y[] yVarArr2 = this.y;
                    if (i12 < yVarArr2.length) {
                        y yVar3 = yVarArr2[i12];
                        com.anythink.expressad.exoplayer.h.y yVar4 = d10.f9281c[i12];
                        if (yVar3.f() == yVar4) {
                            if (yVar4 == null || yVar3.g()) {
                                i12++;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        com.anythink.expressad.exoplayer.i.i iVar = d10.f9288k;
                        q g6 = this.P.g();
                        com.anythink.expressad.exoplayer.i.i iVar2 = g6.f9288k;
                        if (g6.f9279a.c() != com.anythink.expressad.exoplayer.b.f7291b) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i13 = 0;
                        while (true) {
                            y[] yVarArr3 = this.y;
                            if (i13 < yVarArr3.length) {
                                y yVar5 = yVarArr3[i13];
                                if (iVar.a(i13)) {
                                    if (!z10) {
                                        if (!yVar5.i()) {
                                            com.anythink.expressad.exoplayer.i.f a11 = iVar2.f8689c.a(i13);
                                            boolean a12 = iVar2.a(i13);
                                            if (this.f8976z[i13].a() == 5) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            aa aaVar = iVar.f8688b[i13];
                                            aa aaVar2 = iVar2.f8688b[i13];
                                            if (a12 && aaVar2.equals(aaVar) && !z11) {
                                                yVar5.a(a(a11), g6.f9281c[i13], g6.f9283e);
                                            }
                                        }
                                    }
                                    yVar5.h();
                                }
                                i13++;
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private void q() {
        this.P.a(this.f8974ab);
        if (this.P.a()) {
            r a10 = this.P.a(this.f8974ab, this.R);
            if (a10 == null) {
                this.S.b();
                return;
            }
            this.P.a(this.f8976z, this.A, this.C.d(), this.S, this.R.f9335a.a(a10.f9292a.f8484a, this.I, true).f7273b, a10).a(this, a10.f9293b);
            d(true);
        }
    }

    private void r() {
        q b10 = this.P.b();
        long b11 = b10.b();
        if (b11 == Long.MIN_VALUE) {
            d(false);
            return;
        }
        boolean a10 = this.C.a(b11 - (this.f8974ab - b10.f9283e), this.L.e().f9346b);
        d(a10);
        if (a10) {
            b10.a(this.f8974ab);
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.z.a
    public final /* synthetic */ void a(com.anythink.expressad.exoplayer.h.r rVar) {
        this.D.a(10, rVar).sendToTarget();
    }

    public final void c(boolean z10) {
        this.D.a(6, z10 ? 1 : 0).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:516:0x0839, code lost:
    
        if (r13 == false) goto L438;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b7 A[Catch: all -> 0x0532, TryCatch #9 {all -> 0x0532, blocks: (B:239:0x04a9, B:241:0x04ad, B:246:0x04b7, B:252:0x04c0, B:254:0x04ca, B:258:0x04d6, B:259:0x04e0, B:261:0x04f0, B:266:0x050d, B:269:0x0518, B:273:0x051c), top: B:238:0x04a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x052e A[Catch: RuntimeException -> 0x0906, IOException -> 0x090a, g -> 0x090f, TryCatch #23 {RuntimeException -> 0x0906, blocks: (B:11:0x08f7, B:56:0x00f5, B:57:0x0108, B:58:0x010f, B:60:0x0114, B:63:0x011f, B:65:0x0127, B:67:0x012b, B:69:0x0131, B:72:0x0135, B:74:0x0139, B:71:0x013e, B:80:0x0141, B:81:0x016f, B:83:0x0175, B:84:0x0151, B:86:0x015a, B:90:0x0187, B:92:0x0193, B:93:0x019f, B:95:0x01ab, B:97:0x0208, B:98:0x0218, B:99:0x021d, B:101:0x0227, B:103:0x0246, B:105:0x0254, B:109:0x0262, B:111:0x0277, B:127:0x027a, B:130:0x0283, B:133:0x028b, B:135:0x028f, B:137:0x0298, B:140:0x029d, B:143:0x02be, B:145:0x02c8, B:147:0x02d0, B:149:0x02d6, B:150:0x02db, B:153:0x0306, B:155:0x0316, B:157:0x0324, B:159:0x032a, B:162:0x033b, B:164:0x0345, B:166:0x034d, B:167:0x0359, B:169:0x0360, B:171:0x0366, B:172:0x036b, B:176:0x0372, B:178:0x0396, B:179:0x03a2, B:181:0x03a6, B:188:0x03ae, B:184:0x03b9, B:191:0x03c2, B:194:0x03ca, B:204:0x03eb, B:205:0x03f3, B:207:0x03fd, B:209:0x0409, B:212:0x0411, B:214:0x0421, B:218:0x0357, B:225:0x0431, B:227:0x0436, B:230:0x043d, B:232:0x0443, B:233:0x044b, B:234:0x0456, B:236:0x0466, B:248:0x0520, B:250:0x052e, B:251:0x0507, B:262:0x04f4, B:264:0x0504, B:275:0x0533, B:277:0x0544, B:280:0x0547, B:287:0x0555, B:288:0x0475, B:291:0x0495, B:292:0x049d, B:298:0x0560, B:300:0x056a, B:302:0x056e, B:303:0x0573, B:305:0x0582, B:307:0x058e, B:308:0x0594, B:309:0x05cc, B:311:0x05d4, B:314:0x05db, B:316:0x05e1, B:317:0x05e9, B:319:0x05f1, B:320:0x05fe, B:323:0x0604, B:326:0x0610, B:327:0x0613, B:331:0x061c, B:335:0x064e, B:338:0x0655, B:340:0x065a, B:342:0x0662, B:344:0x0668, B:346:0x066e, B:348:0x0671, B:353:0x0674, B:355:0x0678, B:359:0x067f, B:361:0x0684, B:364:0x0692, B:369:0x069a, B:373:0x069d, B:377:0x06ba, B:379:0x06bf, B:382:0x06c9, B:384:0x06cf, B:387:0x06e7, B:389:0x06f1, B:392:0x06f9, B:397:0x0707, B:394:0x070a, B:414:0x0718, B:416:0x0722, B:417:0x072a, B:419:0x0755, B:421:0x075e, B:424:0x0767, B:426:0x076d, B:428:0x0773, B:430:0x077d, B:432:0x0781, B:439:0x0792, B:444:0x079c, B:452:0x07a3, B:453:0x07a6, B:457:0x07b5, B:459:0x07bd, B:461:0x07c3, B:462:0x0846, B:464:0x084d, B:466:0x0853, B:468:0x085b, B:470:0x085f, B:472:0x086d, B:473:0x0886, B:474:0x0866, B:476:0x0873, B:480:0x087b, B:481:0x0881, B:482:0x07cc, B:484:0x07d3, B:486:0x07d8, B:488:0x081a, B:490:0x0822, B:492:0x07df, B:495:0x07e5, B:498:0x07f4, B:500:0x07fe, B:505:0x0826, B:507:0x082d, B:509:0x0832, B:512:0x083b, B:514:0x0840, B:515:0x0843, B:517:0x088b, B:523:0x0895, B:525:0x0899, B:526:0x08a0, B:528:0x08a7, B:530:0x08ad, B:533:0x08b4, B:543:0x08c6, B:546:0x08d1, B:549:0x08d8, B:551:0x08e9), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04c0 A[Catch: all -> 0x0532, TryCatch #9 {all -> 0x0532, blocks: (B:239:0x04a9, B:241:0x04ad, B:246:0x04b7, B:252:0x04c0, B:254:0x04ca, B:258:0x04d6, B:259:0x04e0, B:261:0x04f0, B:266:0x050d, B:269:0x0518, B:273:0x051c), top: B:238:0x04a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05f1 A[Catch: RuntimeException -> 0x0906, IOException -> 0x090a, g -> 0x090f, TryCatch #23 {RuntimeException -> 0x0906, blocks: (B:11:0x08f7, B:56:0x00f5, B:57:0x0108, B:58:0x010f, B:60:0x0114, B:63:0x011f, B:65:0x0127, B:67:0x012b, B:69:0x0131, B:72:0x0135, B:74:0x0139, B:71:0x013e, B:80:0x0141, B:81:0x016f, B:83:0x0175, B:84:0x0151, B:86:0x015a, B:90:0x0187, B:92:0x0193, B:93:0x019f, B:95:0x01ab, B:97:0x0208, B:98:0x0218, B:99:0x021d, B:101:0x0227, B:103:0x0246, B:105:0x0254, B:109:0x0262, B:111:0x0277, B:127:0x027a, B:130:0x0283, B:133:0x028b, B:135:0x028f, B:137:0x0298, B:140:0x029d, B:143:0x02be, B:145:0x02c8, B:147:0x02d0, B:149:0x02d6, B:150:0x02db, B:153:0x0306, B:155:0x0316, B:157:0x0324, B:159:0x032a, B:162:0x033b, B:164:0x0345, B:166:0x034d, B:167:0x0359, B:169:0x0360, B:171:0x0366, B:172:0x036b, B:176:0x0372, B:178:0x0396, B:179:0x03a2, B:181:0x03a6, B:188:0x03ae, B:184:0x03b9, B:191:0x03c2, B:194:0x03ca, B:204:0x03eb, B:205:0x03f3, B:207:0x03fd, B:209:0x0409, B:212:0x0411, B:214:0x0421, B:218:0x0357, B:225:0x0431, B:227:0x0436, B:230:0x043d, B:232:0x0443, B:233:0x044b, B:234:0x0456, B:236:0x0466, B:248:0x0520, B:250:0x052e, B:251:0x0507, B:262:0x04f4, B:264:0x0504, B:275:0x0533, B:277:0x0544, B:280:0x0547, B:287:0x0555, B:288:0x0475, B:291:0x0495, B:292:0x049d, B:298:0x0560, B:300:0x056a, B:302:0x056e, B:303:0x0573, B:305:0x0582, B:307:0x058e, B:308:0x0594, B:309:0x05cc, B:311:0x05d4, B:314:0x05db, B:316:0x05e1, B:317:0x05e9, B:319:0x05f1, B:320:0x05fe, B:323:0x0604, B:326:0x0610, B:327:0x0613, B:331:0x061c, B:335:0x064e, B:338:0x0655, B:340:0x065a, B:342:0x0662, B:344:0x0668, B:346:0x066e, B:348:0x0671, B:353:0x0674, B:355:0x0678, B:359:0x067f, B:361:0x0684, B:364:0x0692, B:369:0x069a, B:373:0x069d, B:377:0x06ba, B:379:0x06bf, B:382:0x06c9, B:384:0x06cf, B:387:0x06e7, B:389:0x06f1, B:392:0x06f9, B:397:0x0707, B:394:0x070a, B:414:0x0718, B:416:0x0722, B:417:0x072a, B:419:0x0755, B:421:0x075e, B:424:0x0767, B:426:0x076d, B:428:0x0773, B:430:0x077d, B:432:0x0781, B:439:0x0792, B:444:0x079c, B:452:0x07a3, B:453:0x07a6, B:457:0x07b5, B:459:0x07bd, B:461:0x07c3, B:462:0x0846, B:464:0x084d, B:466:0x0853, B:468:0x085b, B:470:0x085f, B:472:0x086d, B:473:0x0886, B:474:0x0866, B:476:0x0873, B:480:0x087b, B:481:0x0881, B:482:0x07cc, B:484:0x07d3, B:486:0x07d8, B:488:0x081a, B:490:0x0822, B:492:0x07df, B:495:0x07e5, B:498:0x07f4, B:500:0x07fe, B:505:0x0826, B:507:0x082d, B:509:0x0832, B:512:0x083b, B:514:0x0840, B:515:0x0843, B:517:0x088b, B:523:0x0895, B:525:0x0899, B:526:0x08a0, B:528:0x08a7, B:530:0x08ad, B:533:0x08b4, B:543:0x08c6, B:546:0x08d1, B:549:0x08d8, B:551:0x08e9), top: B:5:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0792 A[Catch: RuntimeException -> 0x0906, IOException -> 0x090a, g -> 0x090f, TryCatch #23 {RuntimeException -> 0x0906, blocks: (B:11:0x08f7, B:56:0x00f5, B:57:0x0108, B:58:0x010f, B:60:0x0114, B:63:0x011f, B:65:0x0127, B:67:0x012b, B:69:0x0131, B:72:0x0135, B:74:0x0139, B:71:0x013e, B:80:0x0141, B:81:0x016f, B:83:0x0175, B:84:0x0151, B:86:0x015a, B:90:0x0187, B:92:0x0193, B:93:0x019f, B:95:0x01ab, B:97:0x0208, B:98:0x0218, B:99:0x021d, B:101:0x0227, B:103:0x0246, B:105:0x0254, B:109:0x0262, B:111:0x0277, B:127:0x027a, B:130:0x0283, B:133:0x028b, B:135:0x028f, B:137:0x0298, B:140:0x029d, B:143:0x02be, B:145:0x02c8, B:147:0x02d0, B:149:0x02d6, B:150:0x02db, B:153:0x0306, B:155:0x0316, B:157:0x0324, B:159:0x032a, B:162:0x033b, B:164:0x0345, B:166:0x034d, B:167:0x0359, B:169:0x0360, B:171:0x0366, B:172:0x036b, B:176:0x0372, B:178:0x0396, B:179:0x03a2, B:181:0x03a6, B:188:0x03ae, B:184:0x03b9, B:191:0x03c2, B:194:0x03ca, B:204:0x03eb, B:205:0x03f3, B:207:0x03fd, B:209:0x0409, B:212:0x0411, B:214:0x0421, B:218:0x0357, B:225:0x0431, B:227:0x0436, B:230:0x043d, B:232:0x0443, B:233:0x044b, B:234:0x0456, B:236:0x0466, B:248:0x0520, B:250:0x052e, B:251:0x0507, B:262:0x04f4, B:264:0x0504, B:275:0x0533, B:277:0x0544, B:280:0x0547, B:287:0x0555, B:288:0x0475, B:291:0x0495, B:292:0x049d, B:298:0x0560, B:300:0x056a, B:302:0x056e, B:303:0x0573, B:305:0x0582, B:307:0x058e, B:308:0x0594, B:309:0x05cc, B:311:0x05d4, B:314:0x05db, B:316:0x05e1, B:317:0x05e9, B:319:0x05f1, B:320:0x05fe, B:323:0x0604, B:326:0x0610, B:327:0x0613, B:331:0x061c, B:335:0x064e, B:338:0x0655, B:340:0x065a, B:342:0x0662, B:344:0x0668, B:346:0x066e, B:348:0x0671, B:353:0x0674, B:355:0x0678, B:359:0x067f, B:361:0x0684, B:364:0x0692, B:369:0x069a, B:373:0x069d, B:377:0x06ba, B:379:0x06bf, B:382:0x06c9, B:384:0x06cf, B:387:0x06e7, B:389:0x06f1, B:392:0x06f9, B:397:0x0707, B:394:0x070a, B:414:0x0718, B:416:0x0722, B:417:0x072a, B:419:0x0755, B:421:0x075e, B:424:0x0767, B:426:0x076d, B:428:0x0773, B:430:0x077d, B:432:0x0781, B:439:0x0792, B:444:0x079c, B:452:0x07a3, B:453:0x07a6, B:457:0x07b5, B:459:0x07bd, B:461:0x07c3, B:462:0x0846, B:464:0x084d, B:466:0x0853, B:468:0x085b, B:470:0x085f, B:472:0x086d, B:473:0x0886, B:474:0x0866, B:476:0x0873, B:480:0x087b, B:481:0x0881, B:482:0x07cc, B:484:0x07d3, B:486:0x07d8, B:488:0x081a, B:490:0x0822, B:492:0x07df, B:495:0x07e5, B:498:0x07f4, B:500:0x07fe, B:505:0x0826, B:507:0x082d, B:509:0x0832, B:512:0x083b, B:514:0x0840, B:515:0x0843, B:517:0x088b, B:523:0x0895, B:525:0x0899, B:526:0x08a0, B:528:0x08a7, B:530:0x08ad, B:533:0x08b4, B:543:0x08c6, B:546:0x08d1, B:549:0x08d8, B:551:0x08e9), top: B:5:0x0014 }] */
    /* JADX WARN: Type inference failed for: r2v162 */
    /* JADX WARN: Type inference failed for: r2v163 */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r32) {
        /*
            Method dump skipped, instructions count: 2442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.handleMessage(android.os.Message):boolean");
    }

    public final void b(boolean z10) {
        this.D.a(13, z10 ? 1 : 0).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.i.h.a
    public final void c() {
        this.D.b(11);
    }

    /* loaded from: classes.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final x f9006a;

        /* renamed from: b, reason: collision with root package name */
        public int f9007b;

        /* renamed from: c, reason: collision with root package name */
        public long f9008c;

        /* renamed from: d, reason: collision with root package name */
        public Object f9009d;

        public b(x xVar) {
            this.f9006a = xVar;
        }

        public final void a(int i10, long j10, Object obj) {
            this.f9007b = i10;
            this.f9008c = j10;
            this.f9009d = obj;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(b bVar) {
            boolean z10;
            boolean z11;
            b bVar2 = bVar;
            Object obj = this.f9009d;
            if (obj == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (bVar2.f9009d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                if (obj == null) {
                    return 1;
                }
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f9007b - bVar2.f9007b;
            if (i10 != 0) {
                return i10;
            }
            return com.anythink.expressad.exoplayer.k.af.b(this.f9008c, bVar2.f9008c);
        }

        private int a(b bVar) {
            Object obj = this.f9009d;
            if ((obj == null) != (bVar.f9009d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f9007b - bVar.f9007b;
            return i10 != 0 ? i10 : com.anythink.expressad.exoplayer.k.af.b(this.f9008c, bVar.f9008c);
        }
    }

    private void c(int i10) {
        this.X = i10;
        if (this.P.a(i10)) {
            return;
        }
        g(true);
    }

    private void d() {
        if (this.M.a(this.R)) {
            this.F.obtainMessage(0, this.M.f9014b, this.M.f9015c ? this.M.f9016d : -1, this.R).sendToTarget();
            this.M.b(this.R);
        }
    }

    public final void a(com.anythink.expressad.exoplayer.h.s sVar, boolean z10, boolean z11) {
        this.D.a(z10 ? 1 : 0, z11 ? 1 : 0, sVar).sendToTarget();
    }

    public final void b(v vVar) {
        this.D.a(4, vVar).sendToTarget();
    }

    private void f() {
        this.L.b();
        for (y yVar : this.T) {
            a(yVar);
        }
    }

    public final Looper b() {
        return this.E.getLooper();
    }

    private void b(com.anythink.expressad.exoplayer.h.r rVar) {
        this.D.a(10, rVar).sendToTarget();
    }

    private void b(int i10) {
        u uVar = this.R;
        if (uVar.f != i10) {
            this.R = uVar.b(i10);
        }
    }

    private void c(v vVar) {
        this.L.a(vVar);
    }

    public final void a(boolean z10) {
        this.D.a(1, z10 ? 1 : 0).sendToTarget();
    }

    private void c(x xVar) {
        if (xVar.f() == com.anythink.expressad.exoplayer.b.f7291b) {
            d(xVar);
            return;
        }
        if (this.S != null && this.Z <= 0) {
            b bVar = new b(xVar);
            if (a(bVar)) {
                this.N.add(bVar);
                Collections.sort(this.N);
                return;
            } else {
                xVar.a(false);
                return;
            }
        }
        this.N.add(new b(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(x xVar) {
        if (xVar.j()) {
            return;
        }
        try {
            xVar.b().a(xVar.c(), xVar.d());
        } finally {
            xVar.a(true);
        }
    }

    public final void a(int i10) {
        this.D.a(12, i10).sendToTarget();
    }

    private void b(com.anythink.expressad.exoplayer.h.s sVar, boolean z10, boolean z11) {
        this.Z++;
        a(true, z10, z11);
        this.C.a();
        this.S = sVar;
        b(2);
        sVar.a(this.G, true, this);
        this.D.b(2);
    }

    private void g() {
        long a10;
        if (this.P.f()) {
            q c10 = this.P.c();
            long c11 = c10.f9279a.c();
            if (c11 != com.anythink.expressad.exoplayer.b.f7291b) {
                a(c11);
                if (c11 != this.R.f9343j) {
                    u uVar = this.R;
                    this.R = uVar.a(uVar.f9337c, c11, uVar.f9339e);
                    this.M.b(4);
                }
            } else {
                long c12 = this.L.c();
                this.f8974ab = c12;
                long j10 = c12 - c10.f9283e;
                b(this.R.f9343j, j10);
                this.R.f9343j = j10;
            }
            u uVar2 = this.R;
            if (this.T.length == 0) {
                a10 = c10.f9285h.f9296e;
            } else {
                a10 = c10.a(true);
            }
            uVar2.f9344k = a10;
        }
    }

    public final void a(ae aeVar, int i10, long j10) {
        this.D.a(3, new d(aeVar, i10, j10)).sendToTarget();
    }

    private void e() {
        this.W = false;
        this.L.a();
        for (y yVar : this.T) {
            yVar.b_();
        }
    }

    public final void a(ac acVar) {
        this.D.a(5, acVar).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.x.a
    public final synchronized void a(x xVar) {
        if (this.U) {
            Log.w(f8954d, "Ignoring messages sent after release.");
            xVar.a(false);
        } else {
            this.D.a(14, xVar).sendToTarget();
        }
    }

    private void d(x xVar) {
        if (xVar.e().getLooper() == this.D.a()) {
            f(xVar);
            int i10 = this.R.f;
            if (i10 == 3 || i10 == 2) {
                this.D.b(2);
                return;
            }
            return;
        }
        this.D.a(15, xVar).sendToTarget();
    }

    private void e(x xVar) {
        xVar.e().post(new AnonymousClass1(xVar));
    }

    private void b(ac acVar) {
        this.Q = acVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x006b, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0034, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(long r7, long r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.b(long, long):void");
    }

    private void c(com.anythink.expressad.exoplayer.h.r rVar) {
        if (this.P.a(rVar)) {
            q b10 = this.P.b();
            float f10 = this.L.e().f9346b;
            b10.f = true;
            b10.f9287j = b10.f9279a.b();
            b10.a(f10);
            long b11 = b10.b(b10.f9285h.f9293b);
            long j10 = b10.f9283e;
            r rVar2 = b10.f9285h;
            b10.f9283e = (rVar2.f9293b - b11) + j10;
            b10.f9285h = new r(rVar2.f9292a, b11, rVar2.f9294c, rVar2.f9295d, rVar2.f9296e, rVar2.f, rVar2.f9297g);
            a(b10.f9288k);
            if (!this.P.f()) {
                a(this.P.h().f9285h.f9293b);
                a((q) null);
            }
            r();
        }
    }

    private void d(com.anythink.expressad.exoplayer.h.r rVar) {
        if (this.P.a(rVar)) {
            this.P.a(this.f8974ab);
            r();
        }
    }

    public final synchronized void a() {
        if (!this.U && this.E.isAlive()) {
            this.D.b(7);
            long j10 = 500;
            long a10 = this.O.a() + 500;
            boolean z10 = false;
            while (!this.U && j10 > 0) {
                try {
                    wait(j10);
                } catch (InterruptedException unused) {
                    z10 = true;
                }
                j10 = a10 - this.O.a();
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // com.anythink.expressad.exoplayer.h.s.b
    public final void a(com.anythink.expressad.exoplayer.h.s sVar, ae aeVar, Object obj) {
        this.D.a(8, new a(sVar, aeVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.anythink.expressad.exoplayer.h.r.a
    public final void a(com.anythink.expressad.exoplayer.h.r rVar) {
        this.D.a(9, rVar).sendToTarget();
    }

    @Override // com.anythink.expressad.exoplayer.e.a
    public final void a(v vVar) {
        this.F.obtainMessage(1, vVar).sendToTarget();
        float f10 = vVar.f9346b;
        for (q e10 = this.P.e(); e10 != null; e10 = e10.f9286i) {
            com.anythink.expressad.exoplayer.i.i iVar = e10.f9288k;
            if (iVar != null) {
                for (com.anythink.expressad.exoplayer.i.f fVar : iVar.f8689c.a()) {
                    if (fVar != null) {
                        fVar.a(f10);
                    }
                }
            }
        }
    }

    private boolean c(y yVar) {
        q qVar = this.P.d().f9286i;
        return qVar != null && qVar.f && yVar.g();
    }

    private void b(y yVar) {
        this.L.b(yVar);
        a(yVar);
        yVar.l();
    }

    private void a(long j10, long j11) {
        this.D.b();
        this.D.a(j10 + j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.anythink.expressad.exoplayer.k.d r21) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.k.a(com.anythink.expressad.exoplayer.k$d):void");
    }

    private long a(s.a aVar, long j10) {
        return a(aVar, j10, this.P.c() != this.P.d());
    }

    private long a(s.a aVar, long j10, boolean z10) {
        f();
        this.W = false;
        b(2);
        q c10 = this.P.c();
        q qVar = c10;
        while (true) {
            if (qVar == null) {
                break;
            }
            if (a(aVar, j10, qVar)) {
                this.P.a(qVar);
                break;
            }
            qVar = this.P.h();
        }
        if (c10 != qVar || z10) {
            for (y yVar : this.T) {
                b(yVar);
            }
            this.T = new y[0];
            c10 = null;
        }
        if (qVar != null) {
            a(c10);
            if (qVar.f9284g) {
                long b10 = qVar.f9279a.b(j10);
                qVar.f9279a.a(b10 - this.J, this.K);
                j10 = b10;
            }
            a(j10);
            r();
        } else {
            this.P.b(true);
            a(j10);
        }
        this.D.b(2);
        return j10;
    }

    private boolean a(s.a aVar, long j10, q qVar) {
        if (aVar.equals(qVar.f9285h.f9292a) && qVar.f) {
            this.R.f9335a.a(qVar.f9285h.f9292a.f8484a, this.I, false);
            int b10 = this.I.b(j10);
            if (b10 == -1 || this.I.a(b10) == qVar.f9285h.f9294c) {
                return true;
            }
        }
        return false;
    }

    private void a(long j10) {
        if (this.P.f()) {
            j10 += this.P.c().f9283e;
        }
        this.f8974ab = j10;
        this.L.a(j10);
        for (y yVar : this.T) {
            yVar.a(this.f8974ab);
        }
    }

    private void a(boolean z10, boolean z11) {
        a(true, z10, z10);
        this.M.a(this.Z + (z11 ? 1 : 0));
        this.Z = 0;
        this.C.b();
        b(1);
    }

    private void a(boolean z10, boolean z11, boolean z12) {
        com.anythink.expressad.exoplayer.h.s sVar;
        this.D.b();
        this.W = false;
        this.L.b();
        this.f8974ab = 0L;
        for (y yVar : this.T) {
            try {
                b(yVar);
            } catch (g | RuntimeException e10) {
                Log.e(f8954d, "Stop failed.", e10);
            }
        }
        this.T = new y[0];
        this.P.b(!z11);
        d(false);
        if (z11) {
            this.f8973aa = null;
        }
        if (z12) {
            this.P.a(ae.f7271a);
            Iterator<b> it = this.N.iterator();
            while (it.hasNext()) {
                it.next().f9006a.a(false);
            }
            this.N.clear();
            this.f8975ac = 0;
        }
        ae aeVar = z12 ? ae.f7271a : this.R.f9335a;
        Object obj = z12 ? null : this.R.f9336b;
        s.a aVar = z11 ? new s.a(j()) : this.R.f9337c;
        long j10 = com.anythink.expressad.exoplayer.b.f7291b;
        long j11 = z11 ? -9223372036854775807L : this.R.f9343j;
        if (!z11) {
            j10 = this.R.f9339e;
        }
        long j12 = j10;
        u uVar = this.R;
        this.R = new u(aeVar, obj, aVar, j11, j12, uVar.f, false, z12 ? af.f8255a : uVar.f9341h, z12 ? this.B : uVar.f9342i);
        if (!z10 || (sVar = this.S) == null) {
            return;
        }
        sVar.a(this);
        this.S = null;
    }

    private boolean h(boolean z10) {
        if (this.T.length == 0) {
            return m();
        }
        if (!z10) {
            return false;
        }
        if (!this.R.f9340g) {
            return true;
        }
        q b10 = this.P.b();
        long a10 = b10.a(!b10.f9285h.f9297g);
        return a10 == Long.MIN_VALUE || this.C.a(a10 - (this.f8974ab - b10.f9283e), this.L.e().f9346b, this.W);
    }

    private boolean a(b bVar) {
        Object obj = bVar.f9009d;
        if (obj == null) {
            Pair<Integer, Long> a10 = a(new d(bVar.f9006a.a(), bVar.f9006a.g(), com.anythink.expressad.exoplayer.b.b(bVar.f9006a.f())), false);
            if (a10 == null) {
                return false;
            }
            bVar.a(((Integer) a10.first).intValue(), ((Long) a10.second).longValue(), this.R.f9335a.a(((Integer) a10.first).intValue(), this.I, true).f7273b);
        } else {
            int a11 = this.R.f9335a.a(obj);
            if (a11 == -1) {
                return false;
            }
            bVar.f9007b = a11;
        }
        return true;
    }

    private static void a(y yVar) {
        if (yVar.a_() == 2) {
            yVar.k();
        }
    }

    private void a(com.anythink.expressad.exoplayer.i.i iVar) {
        this.C.a(this.y, iVar.f8689c);
    }

    private void a(float f10) {
        for (q e10 = this.P.e(); e10 != null; e10 = e10.f9286i) {
            com.anythink.expressad.exoplayer.i.i iVar = e10.f9288k;
            if (iVar != null) {
                for (com.anythink.expressad.exoplayer.i.f fVar : iVar.f8689c.a()) {
                    if (fVar != null) {
                        fVar.a(f10);
                    }
                }
            }
        }
    }

    private void a(a aVar) {
        if (aVar.f8979a != this.S) {
            return;
        }
        ae aeVar = this.R.f9335a;
        ae aeVar2 = aVar.f8980b;
        Object obj = aVar.f8981c;
        this.P.a(aeVar2);
        this.R = this.R.a(aeVar2, obj);
        for (int size = this.N.size() - 1; size >= 0; size--) {
            if (!a(this.N.get(size))) {
                this.N.get(size).f9006a.a(false);
                this.N.remove(size);
            }
        }
        Collections.sort(this.N);
        int i10 = this.Z;
        if (i10 > 0) {
            this.M.a(i10);
            this.Z = 0;
            d dVar = this.f8973aa;
            if (dVar != null) {
                Pair<Integer, Long> a10 = a(dVar, true);
                this.f8973aa = null;
                if (a10 == null) {
                    o();
                    return;
                }
                int intValue = ((Integer) a10.first).intValue();
                long longValue = ((Long) a10.second).longValue();
                s.a a11 = this.P.a(intValue, longValue);
                this.R = this.R.a(a11, a11.a() ? 0L : longValue, longValue);
                return;
            }
            if (this.R.f9338d == com.anythink.expressad.exoplayer.b.f7291b) {
                if (aeVar2.a()) {
                    o();
                    return;
                }
                Pair<Integer, Long> a12 = a(aeVar2, aeVar2.b(this.Y));
                int intValue2 = ((Integer) a12.first).intValue();
                long longValue2 = ((Long) a12.second).longValue();
                s.a a13 = this.P.a(intValue2, longValue2);
                this.R = this.R.a(a13, a13.a() ? 0L : longValue2, longValue2);
                return;
            }
            return;
        }
        u uVar = this.R;
        int i11 = uVar.f9337c.f8484a;
        long j10 = uVar.f9339e;
        if (aeVar.a()) {
            if (aeVar2.a()) {
                return;
            }
            s.a a14 = this.P.a(i11, j10);
            this.R = this.R.a(a14, a14.a() ? 0L : j10, j10);
            return;
        }
        q e10 = this.P.e();
        int a15 = aeVar2.a(e10 == null ? aeVar.a(i11, this.I, true).f7273b : e10.f9280b);
        if (a15 == -1) {
            int a16 = a(i11, aeVar, aeVar2);
            if (a16 == -1) {
                o();
                return;
            }
            Pair<Integer, Long> a17 = a(aeVar2, aeVar2.a(a16, this.I, false).f7274c);
            int intValue3 = ((Integer) a17.first).intValue();
            long longValue3 = ((Long) a17.second).longValue();
            s.a a18 = this.P.a(intValue3, longValue3);
            aeVar2.a(intValue3, this.I, true);
            if (e10 != null) {
                Object obj2 = this.I.f7273b;
                e10.f9285h = e10.f9285h.a();
                while (true) {
                    e10 = e10.f9286i;
                    if (e10 == null) {
                        break;
                    } else if (e10.f9280b.equals(obj2)) {
                        e10.f9285h = this.P.a(e10.f9285h, intValue3);
                    } else {
                        e10.f9285h = e10.f9285h.a();
                    }
                }
            }
            this.R = this.R.a(a18, a(a18, a18.a() ? 0L : longValue3), longValue3);
            return;
        }
        if (a15 != i11) {
            this.R = this.R.a(a15);
        }
        s.a aVar2 = this.R.f9337c;
        if (aVar2.a()) {
            s.a a19 = this.P.a(a15, j10);
            if (!a19.equals(aVar2)) {
                this.R = this.R.a(a19, a(a19, a19.a() ? 0L : j10), j10);
                return;
            }
        }
        if (this.P.a(aVar2, this.f8974ab)) {
            return;
        }
        g(false);
    }

    private int a(int i10, ae aeVar, ae aeVar2) {
        int c10 = aeVar.c();
        int i11 = i10;
        int i12 = -1;
        for (int i13 = 0; i13 < c10 && i12 == -1; i13++) {
            i11 = aeVar.a(i11, this.I, this.H, this.X, this.Y);
            if (i11 == -1) {
                break;
            }
            i12 = aeVar2.a(aeVar.a(i11, this.I, true).f7273b);
        }
        return i12;
    }

    private Pair<Integer, Long> a(d dVar, boolean z10) {
        int a10;
        ae aeVar = this.R.f9335a;
        ae aeVar2 = dVar.f9026a;
        if (aeVar.a()) {
            return null;
        }
        if (aeVar2.a()) {
            aeVar2 = aeVar;
        }
        try {
            Pair<Integer, Long> a11 = aeVar2.a(this.H, this.I, dVar.f9027b, dVar.f9028c);
            if (aeVar == aeVar2) {
                return a11;
            }
            int a12 = aeVar.a(aeVar2.a(((Integer) a11.first).intValue(), this.I, true).f7273b);
            if (a12 != -1) {
                return Pair.create(Integer.valueOf(a12), (Long) a11.second);
            }
            if (!z10 || (a10 = a(((Integer) a11.first).intValue(), aeVar2, aeVar)) == -1) {
                return null;
            }
            return a(aeVar, aeVar.a(a10, this.I, false).f7274c);
        } catch (IndexOutOfBoundsException unused) {
            throw new o(aeVar, dVar.f9027b, dVar.f9028c);
        }
    }

    private Pair<Integer, Long> a(ae aeVar, int i10) {
        return aeVar.a(this.H, this.I, i10, com.anythink.expressad.exoplayer.b.f7291b);
    }

    private void a(q qVar) {
        q c10 = this.P.c();
        if (c10 == null || qVar == c10) {
            return;
        }
        boolean[] zArr = new boolean[this.y.length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            y[] yVarArr = this.y;
            if (i10 < yVarArr.length) {
                y yVar = yVarArr[i10];
                zArr[i10] = yVar.a_() != 0;
                if (c10.f9288k.a(i10)) {
                    i11++;
                }
                if (zArr[i10] && (!c10.f9288k.a(i10) || (yVar.i() && yVar.f() == qVar.f9281c[i10]))) {
                    b(yVar);
                }
                i10++;
            } else {
                this.R = this.R.a(c10.f9287j, c10.f9288k);
                a(zArr, i11);
                return;
            }
        }
    }

    private void a(boolean[] zArr, int i10) {
        this.T = new y[i10];
        q c10 = this.P.c();
        int i11 = 0;
        for (int i12 = 0; i12 < this.y.length; i12++) {
            if (c10.f9288k.a(i12)) {
                a(i12, zArr[i12], i11);
                i11++;
            }
        }
    }

    private void a(int i10, boolean z10, int i11) {
        q c10 = this.P.c();
        y yVar = this.y[i10];
        this.T[i11] = yVar;
        if (yVar.a_() == 0) {
            com.anythink.expressad.exoplayer.i.i iVar = c10.f9288k;
            aa aaVar = iVar.f8688b[i10];
            m[] a10 = a(iVar.f8689c.a(i10));
            boolean z11 = this.V && this.R.f == 3;
            yVar.a(aaVar, a10, c10.f9281c[i10], this.f8974ab, !z10 && z11, c10.f9283e);
            this.L.a(yVar);
            if (z11) {
                yVar.b_();
            }
        }
    }

    private static m[] a(com.anythink.expressad.exoplayer.i.f fVar) {
        int g6 = fVar != null ? fVar.g() : 0;
        m[] mVarArr = new m[g6];
        for (int i10 = 0; i10 < g6; i10++) {
            mVarArr[i10] = fVar.a(i10);
        }
        return mVarArr;
    }
}
