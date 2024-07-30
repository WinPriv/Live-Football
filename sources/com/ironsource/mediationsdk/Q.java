package com.ironsource.mediationsdk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.environment.NetworkStateReceiver;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class Q implements com.ironsource.environment.j {
    public static Q y;

    /* renamed from: b, reason: collision with root package name */
    public int f24909b;

    /* renamed from: c, reason: collision with root package name */
    public int f24910c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24912e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24913g;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f24915i;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicBoolean f24917k;

    /* renamed from: l, reason: collision with root package name */
    public NetworkStateReceiver f24918l;

    /* renamed from: m, reason: collision with root package name */
    public CountDownTimer f24919m;
    public String o;

    /* renamed from: p, reason: collision with root package name */
    public String f24921p;

    /* renamed from: q, reason: collision with root package name */
    public com.ironsource.mediationsdk.utils.l f24922q;

    /* renamed from: s, reason: collision with root package name */
    public String f24924s;

    /* renamed from: t, reason: collision with root package name */
    public com.ironsource.mediationsdk.sdk.i f24925t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24926u;

    /* renamed from: v, reason: collision with root package name */
    public long f24927v;

    /* renamed from: w, reason: collision with root package name */
    public final com.ironsource.sdk.controller.u f24928w;

    /* renamed from: a, reason: collision with root package name */
    public final String f24908a = Q.class.getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    public boolean f24914h = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f24916j = false;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f24920n = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final c f24929x = new c();

    /* renamed from: r, reason: collision with root package name */
    public f f24923r = f.NOT_INIT;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static int f24930a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static int f24931b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static int f24932c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static int f24933d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static int f24934e = 4;
    }

    /* loaded from: classes2.dex */
    public class c extends g {
        public c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:128:0x0056 A[Catch: Exception -> 0x02eb, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0051 A[Catch: Exception -> 0x02eb, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a2 A[Catch: Exception -> 0x02eb, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b3 A[Catch: Exception -> 0x02eb, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8 A[Catch: Exception -> 0x02eb, TRY_ENTER, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0268 A[Catch: Exception -> 0x02eb, TryCatch #0 {Exception -> 0x02eb, blocks: (B:3:0x0002, B:6:0x001c, B:9:0x002a, B:11:0x0030, B:15:0x003d, B:16:0x0048, B:17:0x004b, B:19:0x0051, B:20:0x008f, B:22:0x00a2, B:23:0x00ab, B:25:0x00b3, B:26:0x00be, B:29:0x00e8, B:31:0x00f3, B:33:0x010e, B:34:0x0125, B:37:0x0157, B:39:0x017a, B:41:0x0184, B:42:0x018f, B:44:0x0195, B:47:0x019a, B:49:0x01a5, B:51:0x01a9, B:53:0x01b1, B:54:0x01b6, B:56:0x01bc, B:58:0x01c0, B:60:0x01c8, B:61:0x01cd, B:63:0x01d3, B:64:0x01d8, B:66:0x01de, B:67:0x01e3, B:68:0x01e7, B:70:0x01ed, B:72:0x01fd, B:74:0x0201, B:76:0x020b, B:78:0x0213, B:79:0x021a, B:81:0x0226, B:87:0x0154, B:88:0x0247, B:90:0x024b, B:91:0x0256, B:93:0x025c, B:97:0x0268, B:99:0x026d, B:100:0x0273, B:102:0x0279, B:104:0x0283, B:106:0x0287, B:108:0x028d, B:110:0x029d, B:111:0x02a3, B:113:0x02a7, B:115:0x02e5, B:117:0x02ad, B:119:0x02b1, B:121:0x02bb, B:122:0x02bf, B:123:0x02c3, B:125:0x02c9, B:127:0x02d5, B:128:0x0056, B:131:0x0083, B:132:0x008a, B:133:0x006d, B:136:0x0086, B:138:0x0042, B:141:0x0019, B:5:0x000a, B:36:0x0146), top: B:2:0x0002, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 752
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.Q.c.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* loaded from: classes2.dex */
        public class a extends CountDownTimer {
            public a() {
                super(60000L, 15000L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                Q q10 = Q.this;
                if (!q10.f24914h) {
                    q10.f24914h = true;
                    Iterator it = q10.f24920n.iterator();
                    while (it.hasNext()) {
                        ((com.ironsource.mediationsdk.utils.i) it.next()).a(IronSourceConstants.FALSE_AVAILABILITY_REASON_NO_INTERNET);
                    }
                    IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Mediation availability false reason: No internet connection", 1);
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j10) {
                if (j10 <= 45000) {
                    Q q10 = Q.this;
                    q10.f24926u = true;
                    Iterator it = q10.f24920n.iterator();
                    while (it.hasNext()) {
                        ((com.ironsource.mediationsdk.utils.i) it.next()).f();
                    }
                }
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Q.this.f24919m = new a().start();
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24938a;

        static {
            int[] iArr = new int[f.values().length];
            f24938a = iArr;
            try {
                iArr[f.INIT_IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24938a[f.NOT_INIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24938a[f.INITIATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum f {
        NOT_INIT,
        INIT_IN_PROGRESS,
        INIT_FAILED,
        INITIATED
    }

    /* loaded from: classes2.dex */
    public abstract class g implements Runnable {

        /* renamed from: t, reason: collision with root package name */
        public String f24945t;

        /* renamed from: s, reason: collision with root package name */
        public boolean f24944s = true;

        /* renamed from: u, reason: collision with root package name */
        public final a f24946u = new a();

        /* loaded from: classes2.dex */
        public class a implements L.a {
            public a() {
            }

            @Override // com.ironsource.mediationsdk.L.a
            public final void a(String str) {
                g gVar = g.this;
                gVar.f24944s = false;
                gVar.f24945t = str;
            }
        }
    }

    public Q() {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        this.f24915i = new Handler(handlerThread.getLooper());
        this.f24909b = 1;
        this.f24910c = 0;
        this.f24911d = 62;
        this.f24912e = 12;
        this.f = 5;
        this.f24917k = new AtomicBoolean(true);
        this.f24913g = false;
        this.f24926u = false;
        this.f24928w = new com.ironsource.sdk.controller.u();
    }

    public static synchronized Q a() {
        Q q10;
        synchronized (Q.class) {
            if (y == null) {
                y = new Q();
            }
            q10 = y;
        }
        return q10;
    }

    public final synchronized void b(f fVar) {
        IronLog.INTERNAL.verbose("old status: " + this.f24923r + ", new status: " + fVar + ")");
        this.f24923r = fVar;
    }

    public final synchronized boolean c() {
        return this.f24926u;
    }

    public final void a(Context context, com.ironsource.mediationsdk.utils.l lVar) {
        String b10 = lVar.a().b();
        com.ironsource.sdk.controller.u uVar = this.f24928w;
        uVar.e(b10);
        uVar.a(lVar.a().a());
        com.ironsource.mediationsdk.model.c cVar = lVar.f25936c.f25678e;
        uVar.f(cVar.f25644i.a());
        uVar.b(cVar.f25639c.f25956c);
        uVar.a(Boolean.valueOf(IronSourceUtils.getFirstSession(context)));
    }

    public final synchronized f b() {
        return this.f24923r;
    }

    public final synchronized void a(Context context, String str, String str2) {
        AtomicBoolean atomicBoolean;
        try {
            atomicBoolean = this.f24917k;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(true, false)) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, this.f24908a + ": Multiple calls to init are not allowed", 2);
            return;
        }
        b(f.INIT_IN_PROGRESS);
        this.o = str2;
        this.f24921p = str;
        if (IronSourceUtils.isNetworkConnected(context)) {
            this.f24915i.post(this.f24929x);
        } else {
            this.f24916j = true;
            if (this.f24918l == null) {
                this.f24918l = new NetworkStateReceiver(context, this);
            }
            context.registerReceiver(this.f24918l, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            com.ironsource.environment.e.c.f24668a.c(new d());
        }
    }

    public final void b(boolean z10) {
        Map<String, String> a10;
        if (z10 && TextUtils.isEmpty(L.a().o) && (a10 = this.f24922q.f25936c.f25678e.f25642g.a()) != null && !a10.isEmpty()) {
            for (String str : a10.keySet()) {
                if (IronSourceUtils.doesClassExist(str)) {
                    String str2 = a10.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    L.a().d(str);
                    return;
                }
            }
        }
    }

    public final void a(com.ironsource.mediationsdk.utils.i iVar) {
        if (iVar == null) {
            return;
        }
        this.f24920n.add(iVar);
    }

    public final synchronized void a(com.ironsource.mediationsdk.utils.l lVar) {
        int i10;
        int i11 = lVar != null ? lVar.f25938e : l.a.f25941a;
        f fVar = this.f24923r;
        if (i11 == l.a.f25942b) {
            i10 = b.f24932c;
        } else {
            int i12 = e.f24938a[fVar.ordinal()];
            i10 = i12 != 1 ? i12 != 2 ? i12 != 3 ? b.f24930a : b.f24931b : b.f24934e : b.f24933d;
        }
        this.f24928w.a(i10);
    }

    @Override // com.ironsource.environment.j
    public final void a(boolean z10) {
        if (this.f24916j && z10) {
            CountDownTimer countDownTimer = this.f24919m;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f24916j = false;
            this.f24913g = true;
            this.f24915i.post(this.f24929x);
        }
    }
}
