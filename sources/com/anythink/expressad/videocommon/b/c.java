package com.anythink.expressad.videocommon.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.res.a.a;
import com.anythink.expressad.foundation.g.f.d.b;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12322a = "2000077";

    /* renamed from: b, reason: collision with root package name */
    protected static final String f12323b = "CampaignDownLoadTask";

    /* renamed from: d, reason: collision with root package name */
    private static final long f12324d = -510642107992871538L;

    /* renamed from: e, reason: collision with root package name */
    private static final int f12325e = 1;
    private static final int f = 2000;

    /* renamed from: h, reason: collision with root package name */
    private static final int f12326h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final int f12327i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f12328j = 3;

    /* renamed from: k, reason: collision with root package name */
    private static final int f12329k = 4;

    /* renamed from: l, reason: collision with root package name */
    private static final int f12330l = 5;

    /* renamed from: m, reason: collision with root package name */
    private static final String f12331m = "errorMsg";

    /* renamed from: p, reason: collision with root package name */
    private static final int f12332p = 10010;
    private Object A;
    private Class B;
    private Object C;
    private com.anythink.expressad.foundation.d.c D;
    private String E;
    private Context G;
    private long H;
    private String I;
    private String L;
    private long O;
    private com.anythink.expressad.videocommon.d.b P;
    private com.anythink.expressad.videocommon.d.b Q;
    private String U;
    private b.a V;
    private int Z;

    /* renamed from: c, reason: collision with root package name */
    b f12333c;
    private boolean o;

    /* renamed from: q, reason: collision with root package name */
    private int f12336q;

    /* renamed from: r, reason: collision with root package name */
    private String f12337r;

    /* renamed from: s, reason: collision with root package name */
    private String f12338s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f12339t;

    /* renamed from: w, reason: collision with root package name */
    private f f12342w;

    /* renamed from: x, reason: collision with root package name */
    private ExecutorService f12343x;
    private o y;

    /* renamed from: z, reason: collision with root package name */
    private Class f12344z;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12334g = false;

    /* renamed from: n, reason: collision with root package name */
    private int f12335n = 1;

    /* renamed from: u, reason: collision with root package name */
    private volatile int f12340u = 0;

    /* renamed from: v, reason: collision with root package name */
    private CopyOnWriteArrayList<f> f12341v = new CopyOnWriteArrayList<>();
    private boolean F = false;
    private long J = 0;
    private int K = 0;
    private boolean M = false;
    private boolean N = false;
    private int R = 100;
    private boolean S = false;
    private boolean T = false;
    private int W = 1;
    private f X = new f() { // from class: com.anythink.expressad.videocommon.b.c.1
        @Override // com.anythink.expressad.videocommon.b.f
        public final void a(long j10, int i10) {
            if (!c.this.F) {
                c.a(c.this, j10, i10);
            }
        }
    };
    private Handler Y = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.videocommon.b.c.2
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            c.this.f12340u = 5;
                            c.d(c.this);
                            c cVar = c.this;
                            c.a(cVar, cVar.J, c.this.f12340u);
                            return;
                        }
                        if (i10 != 5) {
                            if (i10 == c.f12332p && message.obj != null) {
                                c.s();
                                return;
                            }
                            return;
                        }
                        c.this.h();
                        return;
                    }
                    if (c.this.f12340u != 4 && c.this.f12340u != 2 && c.this.f12340u != 5) {
                        c.this.f12340u = 4;
                        c cVar2 = c.this;
                        c.a(cVar2, cVar2.J, c.this.f12340u);
                        return;
                    }
                    return;
                }
                if (c.this.f12340u != 2) {
                    c.this.f12340u = 2;
                    c cVar3 = c.this;
                    c.a(cVar3, cVar3.J, c.this.f12340u);
                    return;
                }
                return;
            }
            c cVar4 = c.this;
            c.a(cVar4, cVar4.J, c.this.f12340u);
        }
    };

    public c(Context context, com.anythink.expressad.foundation.d.c cVar, ExecutorService executorService, String str) {
        this.o = false;
        if (context == null && cVar == null) {
            return;
        }
        this.O = System.currentTimeMillis();
        this.G = com.anythink.expressad.foundation.b.a.b().d();
        this.D = cVar;
        this.E = str;
        this.f12343x = executorService;
        if (cVar != null) {
            this.I = cVar.S();
        }
        this.U = com.anythink.expressad.foundation.h.m.d(this.I);
        a.a();
        this.L = a.a(this.I);
        this.o = false;
        try {
            if (!TextUtils.isEmpty(this.I) && this.f12335n != 3) {
                x();
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.b(f12323b, e10.getMessage());
        }
    }

    private void A() {
        try {
            if (this.f12344z == null || this.A == null) {
                int i10 = com.anythink.expressad.reward.b.a.f10779a;
                this.f12344z = com.anythink.expressad.reward.b.a.class;
                this.A = com.anythink.expressad.reward.b.a.class.newInstance();
                this.f12344z.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.c.class).invoke(this.A, this.E, this.D);
            }
            if (this.B == null || this.C == null) {
                Class<?> cls = Class.forName("com.anythink.expressad.atnative.controller.NativeController");
                this.B = cls;
                this.C = cls.newInstance();
                this.B.getMethod("insertExcludeId", String.class, com.anythink.expressad.foundation.d.c.class).invoke(this.C, this.E, this.D);
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.d(f12323b, e10.getMessage());
        }
    }

    private void C() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f12332p;
        if (this.D != null && !TextUtils.isEmpty(this.E) && !TextUtils.isEmpty(this.D.Z()) && !TextUtils.isEmpty(this.D.S())) {
            str = "key=2000077&unit_id=" + this.E + "&request_id=" + this.D.Z() + "&request_id_notice=" + this.D.aa() + "&package_name=" + com.anythink.expressad.foundation.b.a.b().a() + "&app_id=" + com.anythink.expressad.foundation.b.a.b().e() + "&video_url=" + URLEncoder.encode(this.D.S()) + "&process_size=" + this.J + "&file_size=" + this.H + "&ready_rate=" + this.R + "&cd_rate=" + this.f12336q + "&cid=" + this.D.aZ() + "&type=" + this.f12340u;
        } else {
            str = "";
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    private static void D() {
        com.anythink.expressad.foundation.b.a.b().d();
    }

    private String E() {
        if (this.D != null && !TextUtils.isEmpty(this.E) && !TextUtils.isEmpty(this.D.Z()) && !TextUtils.isEmpty(this.D.S())) {
            return "key=2000077&unit_id=" + this.E + "&request_id=" + this.D.Z() + "&request_id_notice=" + this.D.aa() + "&package_name=" + com.anythink.expressad.foundation.b.a.b().a() + "&app_id=" + com.anythink.expressad.foundation.b.a.b().e() + "&video_url=" + URLEncoder.encode(this.D.S()) + "&process_size=" + this.J + "&file_size=" + this.H + "&ready_rate=" + this.R + "&cd_rate=" + this.f12336q + "&cid=" + this.D.aZ() + "&type=" + this.f12340u;
        }
        return "";
    }

    public static /* synthetic */ boolean d(c cVar) {
        cVar.f12334g = false;
        return false;
    }

    public static /* synthetic */ void s() {
        com.anythink.expressad.foundation.b.a.b().d();
    }

    private void t() {
        try {
            if (!TextUtils.isEmpty(this.I) && this.f12335n != 3) {
                x();
            }
        } catch (Exception e10) {
            com.anythink.expressad.foundation.h.o.b(f12323b, e10.getMessage());
        }
    }

    private void u() {
        if (this.f12333c == null) {
            b bVar = new b(this.I, this.R, this.W);
            this.f12333c = bVar;
            bVar.a(new a.AbstractC0083a() { // from class: com.anythink.expressad.videocommon.b.c.3
                @Override // com.anythink.core.common.res.a.a.AbstractC0083a
                public final boolean a(int i10, long j10, long j11) {
                    if (c.this.H != j11) {
                        c.this.H = j11;
                    }
                    c cVar = c.this;
                    c.a(cVar, j10, cVar.f12340u);
                    if (i10 < c.this.R) {
                        if (c.this.f12340u != 2 && c.this.f12340u != 4) {
                            return false;
                        }
                        int i11 = c.this.f12340u == 4 ? 3 : 2;
                        Message obtain = Message.obtain();
                        obtain.what = i11;
                        c.this.Y.sendMessage(obtain);
                        return true;
                    }
                    c.this.g();
                    c.this.q();
                    return true;
                }

                @Override // com.anythink.core.common.res.a.a.AbstractC0083a
                public final void a(String str, String str2) {
                    c.a(c.this, "errorCode:" + str + ",errorMsg:" + str2);
                }
            });
        }
    }

    private void v() {
        if (!this.S) {
            this.S = true;
            com.anythink.expressad.videocommon.d.b bVar = this.P;
            if (bVar != null) {
                bVar.a(this.I);
            }
            com.anythink.expressad.videocommon.d.b bVar2 = this.Q;
            if (bVar2 != null) {
                bVar2.a(this.I);
            }
        }
    }

    private boolean w() {
        return this.F;
    }

    private void x() {
        com.anythink.core.common.a.i a10;
        a.a();
        this.L = a.a(this.I);
        File file = new File(this.L);
        if (file.exists()) {
            this.J = file.length();
        } else {
            this.J = 0L;
        }
        if (this.H == 0 && (a10 = com.anythink.core.common.a.j.a().a(this.I)) != null) {
            this.H = a10.d();
        }
    }

    private f y() {
        return this.X;
    }

    public final void h() {
        if (TextUtils.isEmpty(this.I)) {
            return;
        }
        if (this.f12340u == 5) {
            v();
            return;
        }
        if (this.f12335n == 3) {
            g();
            return;
        }
        if (this.R == 0) {
            g();
            return;
        }
        x();
        u();
        if (this.f12333c != null) {
            this.f12340u = 1;
            this.F = true;
            this.f12333c.a();
        }
    }

    public final void i() {
        x();
        u();
        if (this.f12333c != null) {
            this.f12340u = 1;
            this.F = true;
            this.f12333c.b();
        }
    }

    public final void j() {
        A();
        this.f12340u = 4;
    }

    public final int k() {
        return this.f12340u;
    }

    public final void l() {
        this.f12340u = 0;
    }

    public final String m() {
        if (this.f12335n == 3) {
            return "";
        }
        File file = new File(this.L);
        try {
            if (file.exists()) {
                if (file.canRead()) {
                    if (file.length() > 0) {
                        return "";
                    }
                    return "file length is 0 ";
                }
                return "file can not read ";
            }
            return "file is not exist ";
        } catch (Throwable th) {
            String message = th.getMessage();
            if (com.anythink.expressad.a.f6552a) {
                th.printStackTrace();
                return message;
            }
            return message;
        }
    }

    public final com.anythink.expressad.foundation.d.c n() {
        return this.D;
    }

    public final void o() {
        if (this.f12341v != null) {
            this.f12341v = null;
        }
    }

    public final long p() {
        return this.J;
    }

    public final void q() {
        String str;
        Message obtain = Message.obtain();
        obtain.what = f12332p;
        if (this.D != null && !TextUtils.isEmpty(this.E) && !TextUtils.isEmpty(this.D.Z()) && !TextUtils.isEmpty(this.D.S())) {
            str = "key=2000077&unit_id=" + this.E + "&request_id=" + this.D.Z() + "&request_id_notice=" + this.D.aa() + "&package_name=" + com.anythink.expressad.foundation.b.a.b().a() + "&app_id=" + com.anythink.expressad.foundation.b.a.b().e() + "&video_url=" + URLEncoder.encode(this.D.S()) + "&process_size=" + this.J + "&file_size=" + this.H + "&ready_rate=" + this.R + "&cd_rate=" + this.f12336q + "&cid=" + this.D.aZ() + "&type=" + this.f12340u;
        } else {
            str = "";
        }
        obtain.obj = str;
        this.Y.sendMessage(obtain);
    }

    public final String r() {
        return this.f12337r;
    }

    public final void b(int i10) {
        this.f12336q = i10;
    }

    public final void c(int i10) {
        this.W = i10;
        com.anythink.expressad.foundation.h.o.b(f12323b, "mVideoCtnType:" + this.W);
    }

    public final boolean d() {
        return this.N;
    }

    public final String e() {
        return this.L;
    }

    public final long f() {
        return this.H;
    }

    public final void g() {
        Message obtain = Message.obtain();
        this.f12340u = 5;
        obtain.what = 4;
        this.Y.sendMessage(obtain);
    }

    public final boolean b() {
        return this.T;
    }

    public final void d(int i10) {
        this.R = i10;
        com.anythink.expressad.foundation.h.o.b(f12323b, "mReadyRate:" + this.R);
    }

    public final void e(int i10) {
        this.Z = i10;
    }

    public final void a(int i10) {
        this.f12335n = i10;
    }

    public final void b(boolean z10) {
        this.N = z10;
    }

    public final long c() {
        return this.O;
    }

    private void b(String str) {
        if (this.P != null) {
            com.anythink.expressad.foundation.h.o.d(f12323b, "video load retry fail");
            this.P.a(str, this.I);
        }
        com.anythink.expressad.videocommon.d.b bVar = this.Q;
        if (bVar != null) {
            bVar.a(str, this.I);
        }
        this.f12340u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    @SuppressLint({"MissingPermission"})
    private void c(String str) {
        this.K++;
        try {
            Context context = this.G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (this.K <= 1) {
            com.anythink.expressad.foundation.h.o.d(f12323b, "delFileAndDB");
            this.Y.sendEmptyMessageDelayed(5, 2000L);
            return;
        }
        A();
        if (this.P != null) {
            com.anythink.expressad.foundation.h.o.d(f12323b, "video load retry fail");
            this.P.a(str, this.I);
        }
        com.anythink.expressad.videocommon.d.b bVar = this.Q;
        if (bVar != null) {
            bVar.a(str, this.I);
        }
        this.f12340u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        this.Y.sendMessage(obtain);
    }

    public final String a() {
        return this.I;
    }

    public final void a(boolean z10) {
        if (!z10) {
            this.o = false;
        }
        this.T = z10;
    }

    private static double a(double d10, double d11, int i10) {
        if (i10 >= 0) {
            return new BigDecimal(Double.toString(d10)).divide(new BigDecimal(Double.toString(d11)), i10, 4).doubleValue();
        }
        throw new IllegalAccessException("精确度不能小于0");
    }

    public final void a(com.anythink.expressad.foundation.d.c cVar) {
        this.D = cVar;
    }

    public final void a(com.anythink.expressad.videocommon.d.b bVar) {
        this.P = bVar;
    }

    private void b(com.anythink.expressad.videocommon.d.b bVar) {
        this.Q = bVar;
    }

    public final void a(f fVar) {
        this.f12342w = fVar;
    }

    private void a(long j10, int i10) {
        this.J = j10;
        int i11 = this.R;
        if (100 * j10 >= i11 * this.H && !this.S && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f12340u = 5;
                return;
            }
            v();
        }
        if (this.F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f12341v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j10, i10);
                    }
                }
            }
            if (this.f12342w != null) {
                if (this.f12340u == 5 || this.f12340u == 4 || this.f12340u == 2 || this.f12340u == 6) {
                    this.f12342w.a(j10, i10);
                    this.f12342w = null;
                }
            }
        }
    }

    private void b(f fVar) {
        CopyOnWriteArrayList<f> copyOnWriteArrayList = this.f12341v;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(fVar);
        }
    }

    private static void B() {
    }

    private static void z() {
    }

    public final void a(String str) {
        this.f12337r = str;
    }

    public static /* synthetic */ void a(c cVar, long j10, int i10) {
        cVar.J = j10;
        int i11 = cVar.R;
        if (100 * j10 >= i11 * cVar.H && !cVar.S && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                cVar.f12340u = 5;
                return;
            }
            cVar.v();
        }
        if (cVar.F) {
            CopyOnWriteArrayList<f> copyOnWriteArrayList = cVar.f12341v;
            if (copyOnWriteArrayList != null) {
                Iterator<f> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    if (next != null) {
                        next.a(j10, i10);
                    }
                }
            }
            if (cVar.f12342w != null) {
                if (cVar.f12340u == 5 || cVar.f12340u == 4 || cVar.f12340u == 2 || cVar.f12340u == 6) {
                    cVar.f12342w.a(j10, i10);
                    cVar.f12342w = null;
                }
            }
        }
    }

    public static /* synthetic */ void a(c cVar, String str) {
        cVar.K++;
        try {
            Context context = cVar.G;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                if (connectivityManager != null && connectivityManager.getActiveNetworkInfo() != null) {
                    if (!connectivityManager.getActiveNetworkInfo().isAvailable()) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (cVar.K <= 1) {
            com.anythink.expressad.foundation.h.o.d(f12323b, "delFileAndDB");
            cVar.Y.sendEmptyMessageDelayed(5, 2000L);
            return;
        }
        cVar.A();
        if (cVar.P != null) {
            com.anythink.expressad.foundation.h.o.d(f12323b, "video load retry fail");
            cVar.P.a(str, cVar.I);
        }
        com.anythink.expressad.videocommon.d.b bVar = cVar.Q;
        if (bVar != null) {
            bVar.a(str, cVar.I);
        }
        cVar.f12340u = 4;
        Message obtain = Message.obtain();
        obtain.what = 3;
        cVar.Y.sendMessage(obtain);
    }
}
