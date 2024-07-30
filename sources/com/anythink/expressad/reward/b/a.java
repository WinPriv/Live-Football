package com.anythink.expressad.reward.b;

import a3.k;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.n;
import com.anythink.expressad.foundation.h.m;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.video.bt.module.b.h;
import com.anythink.expressad.videocommon.b.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements g {
    private static final int A = 9;
    private static final int E = 16;
    private static final int F = 18;
    private static final int G = 17;
    private static final int H = 1001001;
    private static final int I = 1001002;

    /* renamed from: a, reason: collision with root package name */
    public static final int f10779a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static String f10780b = null;

    /* renamed from: i, reason: collision with root package name */
    private static final String f10782i = "RewardVideoController";

    /* renamed from: j, reason: collision with root package name */
    private static final int f10783j = 8;

    /* renamed from: z, reason: collision with root package name */
    private static final int f10784z = 8;
    private int B;
    private int C;
    private int D;
    private boolean N;
    private Queue<Integer> V;
    private String W;
    private List<com.anythink.expressad.foundation.d.c> af;
    private List<com.anythink.expressad.foundation.d.c> ag;

    /* renamed from: k, reason: collision with root package name */
    private Context f10793k;

    /* renamed from: l, reason: collision with root package name */
    private int f10794l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.expressad.reward.a.d f10795m;

    /* renamed from: n, reason: collision with root package name */
    private com.anythink.expressad.videocommon.e.d f10796n;
    private com.anythink.expressad.videocommon.e.a o;

    /* renamed from: p, reason: collision with root package name */
    private volatile com.anythink.expressad.videocommon.d.a f10797p;

    /* renamed from: q, reason: collision with root package name */
    private volatile c f10798q;

    /* renamed from: r, reason: collision with root package name */
    private String f10799r;

    /* renamed from: s, reason: collision with root package name */
    private String f10800s;

    /* renamed from: t, reason: collision with root package name */
    private volatile String f10801t;

    /* renamed from: u, reason: collision with root package name */
    private String f10802u;

    /* renamed from: v, reason: collision with root package name */
    private String f10803v;
    private static Map<String, Integer> T = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Map<String, d> f10781c = new HashMap();
    private static ConcurrentHashMap<String, String> U = new ConcurrentHashMap<>();

    /* renamed from: w, reason: collision with root package name */
    private int f10804w = 0;
    private int y = 2;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean O = false;
    private ArrayList<Integer> P = new ArrayList<>(7);
    private boolean Q = false;
    private volatile boolean R = false;
    private final Object S = new Object();
    private com.anythink.expressad.foundation.c.c X = null;
    private volatile boolean Y = true;
    private volatile boolean Z = false;

    /* renamed from: aa, reason: collision with root package name */
    private volatile boolean f10785aa = false;

    /* renamed from: ab, reason: collision with root package name */
    private volatile boolean f10786ab = false;

    /* renamed from: ac, reason: collision with root package name */
    private volatile boolean f10787ac = false;

    /* renamed from: ad, reason: collision with root package name */
    private volatile boolean f10788ad = false;
    private volatile boolean ae = false;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f10789d = false;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f10790e = false;
    volatile boolean f = false;

    /* renamed from: g, reason: collision with root package name */
    volatile boolean f10791g = false;

    /* renamed from: h, reason: collision with root package name */
    volatile boolean f10792h = false;

    /* renamed from: x, reason: collision with root package name */
    private Handler f10805x = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.reward.b.a.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z10;
            int i10;
            String str;
            int i11 = message.what;
            if (i11 != 8) {
                if (i11 != 9) {
                    if (i11 != a.I) {
                        switch (i11) {
                            case 16:
                            case 18:
                                if (a.this.f10797p != null && a.this.N) {
                                    Object obj = message.obj;
                                    if (obj instanceof String) {
                                        str = obj.toString();
                                    } else {
                                        str = "";
                                    }
                                    com.anythink.expressad.videocommon.a.c(a.this.f10800s);
                                    com.anythink.expressad.videocommon.a.b();
                                    try {
                                        if (a.this.K) {
                                            a.b();
                                        }
                                        a.this.f10797p.a(str);
                                        return;
                                    } catch (Exception e10) {
                                        if (com.anythink.expressad.a.f6552a) {
                                            e10.printStackTrace();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            case 17:
                                if (a.this.f10797p != null && a.this.N) {
                                    Bundle data = message.getData();
                                    if (data != null && data.containsKey(com.anythink.expressad.a.y)) {
                                        TextUtils.isEmpty(data.getString(com.anythink.expressad.a.y));
                                    }
                                    try {
                                        if (a.this.K) {
                                            a.b();
                                        }
                                        a.this.f10797p.a();
                                        return;
                                    } catch (Exception e11) {
                                        if (com.anythink.expressad.a.f6552a) {
                                            e11.printStackTrace();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            default:
                                return;
                        }
                    }
                    if (a.this.f10796n != null) {
                        i10 = a.this.f10796n.S();
                    } else {
                        i10 = 0;
                    }
                    if (a.this.f10795m != null) {
                        if (a.this.f10795m.c()) {
                            if (a.this.f10798q != null) {
                                o.a(a.f10782i, "load timeout task called for onVideoLoadSuccess by isReady exception");
                                try {
                                    CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f = a.this.f10795m.f();
                                    if (f != null) {
                                        f.size();
                                    }
                                } catch (Throwable th) {
                                    o.d(a.f10782i, th.getMessage());
                                }
                                c.b(a.this.f10798q, a.this.f10801t, a.this.f10800s);
                                return;
                            }
                            return;
                        }
                        if (a.this.f10795m.f(false)) {
                            if (a.this.f10795m.c()) {
                                if (a.this.f10798q != null) {
                                    o.a(a.f10782i, "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                    a.this.f10795m.d(false);
                                    try {
                                        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10 = a.this.f10795m.f();
                                        if (f10 != null) {
                                            f10.size();
                                        }
                                    } catch (Throwable th2) {
                                        o.d(a.f10782i, th2.getMessage());
                                    }
                                    c.b(a.this.f10798q, a.this.f10801t, a.this.f10800s);
                                    return;
                                }
                                return;
                            }
                            a.this.f10795m.e(false);
                            if (a.this.f10795m.f(true)) {
                                if (a.this.f10795m.c()) {
                                    if (a.this.f10798q != null) {
                                        o.a(a.f10782i, "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState exception");
                                        a.this.f10795m.d(true);
                                        try {
                                            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f11 = a.this.f10795m.f();
                                            if (f11 != null) {
                                                f11.size();
                                            }
                                        } catch (Throwable th3) {
                                            o.d(a.f10782i, th3.getMessage());
                                        }
                                        c.b(a.this.f10798q, a.this.f10801t, a.this.f10800s);
                                        return;
                                    }
                                    return;
                                }
                                if (a.this.f10798q != null) {
                                    o.a(a.f10782i, "load timeout task called for onVideoLoadFail after " + i10 + "s exception");
                                }
                                a.this.f10795m.e(true);
                                return;
                            }
                            if (a.this.f10798q != null) {
                                o.a(a.f10782i, "load timeout task called for onVideoLoadFail after " + i10 + "s exception");
                                return;
                            }
                            return;
                        }
                        if (a.this.f10795m.f(true)) {
                            if (a.this.f10795m.c()) {
                                if (a.this.f10798q != null) {
                                    o.a(a.f10782i, "load timeout task called for onVideoLoadSuccess by isReady but updateCampaignsLoadTimeoutState");
                                    a.this.f10795m.d(true);
                                    try {
                                        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f12 = a.this.f10795m.f();
                                        if (f12 != null) {
                                            f12.size();
                                        }
                                    } catch (Throwable th4) {
                                        o.d(a.f10782i, th4.getMessage());
                                    }
                                    c.b(a.this.f10798q, a.this.f10801t, a.this.f10800s);
                                    return;
                                }
                                return;
                            }
                            if (a.this.f10798q != null) {
                                o.a(a.f10782i, "load timeout task called for onVideoLoadFail after " + i10 + " s");
                            }
                            a.this.f10795m.e(true);
                            return;
                        }
                        if (a.this.f10798q != null) {
                            o.a(a.f10782i, "load timeout task called for onVideoLoadFail after " + i10 + " s");
                            return;
                        }
                        return;
                    }
                    if (a.this.f10798q != null) {
                        o.a(a.f10782i, "load timeout task called for onVideoLoadFail by mRewardMvVideoAdapter is null exception");
                        return;
                    }
                    return;
                }
                if (a.this.f10797p != null && a.this.N) {
                    Bundle data2 = message.getData();
                    if (data2 != null && data2.containsKey(com.anythink.expressad.a.y)) {
                        TextUtils.isEmpty(data2.getString(com.anythink.expressad.a.y));
                    }
                    try {
                        if (a.this.K) {
                            a.b();
                        }
                        a.this.f10797p.b();
                        return;
                    } catch (Exception e12) {
                        if (com.anythink.expressad.a.f6552a) {
                            e12.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (a.this.af != null && a.this.af.size() > 0) {
                if (a.this.ag != null && a.this.ag.size() > 0) {
                    z10 = !TextUtils.isEmpty(((com.anythink.expressad.foundation.d.c) a.this.ag.get(0)).ar());
                } else {
                    z10 = false;
                }
                int ap = ((com.anythink.expressad.foundation.d.c) a.this.af.get(0)).ap();
                if (a.this.f10795m != null && a.this.f10795m.a(a.this.af, z10, ap)) {
                    if (a.this.f10798q != null && a.this.N) {
                        c.a(a.this.f10798q, a.this.f10801t, a.this.f10800s);
                        return;
                    }
                    return;
                }
                if (a.this.f10798q != null && a.this.N) {
                    com.anythink.expressad.videocommon.a.c(a.this.f10800s);
                    com.anythink.expressad.videocommon.a.b();
                    c.a(a.this.f10798q, "load timeout");
                }
            }
        }
    };

    /* renamed from: com.anythink.expressad.reward.b.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0131a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.a f10808b;

        /* renamed from: c, reason: collision with root package name */
        private int f10809c = 1;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10810d = true;

        public RunnableC0131a(com.anythink.expressad.reward.a.a aVar) {
            this.f10808b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.d(a.f10782i, "adSource=" + this.f10809c + " CommonCancelTimeTask mIsDevCall：" + this.f10810d);
            a.this.b("v3 is timeout");
        }
    }

    /* loaded from: classes.dex */
    public class b implements com.anythink.expressad.reward.a.b {

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.reward.a.a f10812b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10813c = true;

        /* renamed from: d, reason: collision with root package name */
        private Runnable f10814d;

        public b(com.anythink.expressad.reward.a.a aVar) {
            this.f10812b = aVar;
        }

        private Runnable c() {
            return this.f10814d;
        }

        public final void a(Runnable runnable) {
            this.f10814d = runnable;
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void b() {
            if (this.f10814d != null) {
                a.this.f10805x.removeCallbacks(this.f10814d);
            }
            if (a.this.f10798q != null) {
                c.c(a.this.f10798q, a.this.f10801t, a.this.f10800s);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a() {
            if (this.f10814d != null) {
                a.this.f10805x.removeCallbacks(this.f10814d);
            }
            if (a.this.f10798q != null) {
                c.a(a.this.f10798q, a.this.f10801t, a.this.f10800s);
            }
        }

        @Override // com.anythink.expressad.reward.a.b
        public final void a(String str) {
            if (this.f10814d != null) {
                a.this.f10805x.removeCallbacks(this.f10814d);
            }
            com.anythink.expressad.reward.a.a aVar = this.f10812b;
            if (aVar != null) {
                aVar.a(null);
                this.f10812b = null;
            }
            if (a.this.f10798q != null) {
                c.a(a.this.f10798q, str);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private static final String f10815b = "RewardVideoController_Listener";

        /* renamed from: d, reason: collision with root package name */
        private static final int f10816d = 0;

        /* renamed from: e, reason: collision with root package name */
        private static final int f10817e = 1;
        private static final int f = 2;

        /* renamed from: g, reason: collision with root package name */
        private static final int f10818g = 3;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<com.anythink.expressad.videocommon.d.a> f10820c;

        /* renamed from: h, reason: collision with root package name */
        private volatile AtomicInteger f10821h;

        /* renamed from: i, reason: collision with root package name */
        private Handler f10822i;

        /* renamed from: j, reason: collision with root package name */
        private String f10823j;

        /* renamed from: k, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.c> f10824k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f10825l;

        public /* synthetic */ c(a aVar, com.anythink.expressad.videocommon.d.a aVar2, Handler handler, String str, byte b10) {
            this(aVar2, handler, str);
        }

        private int a() {
            return this.f10821h.get();
        }

        private void b(String str, String str2) {
            StringBuilder sb2 = new StringBuilder("收到 onCampaignLoadSuccessForCache，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledCampaignLoadSuccess: ");
            sb2.append(a.this.f10785aa);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null || this.f10822i == null) {
                return;
            }
            if (!a.this.f10785aa) {
                StringBuilder sb3 = new StringBuilder("收到 onCampaignLoadSuccessForCache，当前状态： ");
                k.x(this.f10821h, sb3, " hasCalledCampaignLoadSuccess: ");
                sb3.append(a.this.f10785aa);
                sb3.append(" 响应");
                o.d(f10815b, sb3.toString());
                a.o(a.this);
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(com.anythink.expressad.a.y, str);
                bundle.putString("unit_id", str2);
                obtain.setData(bundle);
                obtain.obj = str2;
                obtain.what = 17;
                this.f10822i.sendMessage(obtain);
                return;
            }
            StringBuilder sb4 = new StringBuilder("收到 onCampaignLoadSuccessForCache，当前状态： ");
            k.x(this.f10821h, sb4, " hasCalledCampaignLoadSuccess: ");
            sb4.append(a.this.f10785aa);
            sb4.append(" 无需响应");
            o.a(f10815b, sb4.toString());
        }

        private void d(String str, String str2) {
            Handler handler = this.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledVideoLoadSuccess: ");
            sb2.append(a.this.f10786ab);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f10821h.get() == 1 || this.f10821h.get() == 3) && this.f10822i != null) {
                if (this.f10821h.get() == 1) {
                    this.f10821h.set(3);
                }
                if (!a.this.f10786ab) {
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
                    k.x(this.f10821h, sb3, " hasCalledVideoLoadSuccess: ");
                    sb3.append(a.this.f10786ab);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.q(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    this.f10822i.sendMessage(obtain);
                    if (a.this.f10787ac) {
                        this.f10821h.set(2);
                        return;
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
                k.x(this.f10821h, sb4, " hasCalledVideoLoadSuccess: ");
                sb4.append(a.this.f10786ab);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void e(String str) {
            com.anythink.expressad.videocommon.d.a aVar;
            a.l(a.this);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.b(str);
            }
        }

        private c(com.anythink.expressad.videocommon.d.a aVar, Handler handler, String str) {
            this.f10820c = new WeakReference<>(aVar);
            this.f10821h = new AtomicInteger(0);
            this.f10822i = handler;
            this.f10823j = str;
        }

        private void a(int i10) {
            this.f10821h.set(i10);
        }

        private void c(String str, String str2) {
            Handler handler = this.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledVideoLoadSuccess: ");
            sb2.append(a.this.f10786ab);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f10821h.get() == 1 || this.f10821h.get() == 3) && this.f10822i != null) {
                this.f10821h.set(2);
                if (!a.this.f10786ab) {
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
                    k.x(this.f10821h, sb3, " hasCalledVideoLoadSuccess: ");
                    sb3.append(a.this.f10786ab);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.q(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    this.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
                k.x(this.f10821h, sb4, " hasCalledVideoLoadSuccess: ");
                sb4.append(a.this.f10786ab);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledCampaignLoadSuccess: ");
            sb2.append(a.this.f10785aa);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f10821h.get() == 1 || this.f10821h.get() == 3) && this.f10822i != null) {
                if (!a.this.f10785aa) {
                    StringBuilder sb3 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
                    k.x(this.f10821h, sb3, " hasCalledCampaignLoadSuccess: ");
                    sb3.append(a.this.f10785aa);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.o(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    this.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
                k.x(this.f10821h, sb4, " hasCalledCampaignLoadSuccess: ");
                sb4.append(a.this.f10785aa);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void b(String str) {
            this.f10821h.set(2);
            if (this.f10822i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.f10822i.sendMessage(obtain);
            }
        }

        private void a(String str) {
            Handler handler = this.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledVideoLoadFail: ");
            sb2.append(a.this.f10787ac);
            sb2.append(" ");
            sb2.append(str);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f10821h.get() == 1 || this.f10821h.get() == 3) && this.f10822i != null) {
                a.s(a.this);
                if (!a.this.ae || str.contains("resource load timeout")) {
                    a.u(a.this);
                }
                if (a.this.f10786ab) {
                    this.f10821h.set(2);
                }
                if (a.this.f10787ac && a.this.f10788ad && !a.this.f10786ab) {
                    this.f10821h.set(2);
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
                    k.x(this.f10821h, sb3, " hasCalledVideoLoadFail: ");
                    sb3.append(a.this.f10787ac);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    this.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
                k.x(this.f10821h, sb4, " hasCalledVideoLoadFail: ");
                sb4.append(a.this.f10787ac);
                sb4.append(" ");
                sb4.append(str);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void c(String str) {
            if (this.f10822i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                this.f10822i.sendMessage(obtain);
            }
        }

        private void b() {
            com.anythink.expressad.videocommon.d.a aVar;
            a.l(a.this);
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.c();
        }

        private void d(String str) {
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadFailForCache，当前状态： ");
            k.x(this.f10821h, sb2, " hasCalledVideoLoadFailedForCache: ");
            sb2.append(a.this.f10788ad);
            sb2.append(" ");
            sb2.append(str);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((this.f10821h.get() == 1 || this.f10821h.get() == 3) && this.f10822i != null) {
                a.u(a.this);
                if (str.contains("resource load timeout")) {
                    a.s(a.this);
                }
                if (a.this.f10788ad && a.this.f10787ac && !a.this.f10786ab) {
                    this.f10821h.set(2);
                    StringBuilder sb3 = new StringBuilder("收到 hasCalledVideoLoadFailedForCache，当前状态： ");
                    k.x(this.f10821h, sb3, " hasCalledVideoLoadFailedForCache: ");
                    sb3.append(a.this.f10788ad);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    this.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadFailForCache，当前状态： ");
                k.x(this.f10821h, sb4, " hasCalledVideoLoadFailedForCache: ");
                sb4.append(a.this.f10788ad);
                sb4.append(" ");
                sb4.append(str);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        public static /* synthetic */ void b(c cVar, String str, String str2) {
            Handler handler = cVar.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
            k.x(cVar.f10821h, sb2, " hasCalledVideoLoadSuccess: ");
            sb2.append(a.this.f10786ab);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f10821h.get() == 1 || cVar.f10821h.get() == 3) && cVar.f10822i != null) {
                if (cVar.f10821h.get() == 1) {
                    cVar.f10821h.set(3);
                }
                if (!a.this.f10786ab) {
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
                    k.x(cVar.f10821h, sb3, " hasCalledVideoLoadSuccess: ");
                    sb3.append(a.this.f10786ab);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.q(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    cVar.f10822i.sendMessage(obtain);
                    if (a.this.f10787ac) {
                        cVar.f10821h.set(2);
                        return;
                    }
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadSuccessForCache，当前状态： ");
                k.x(cVar.f10821h, sb4, " hasCalledVideoLoadSuccess: ");
                sb4.append(a.this.f10786ab);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void c() {
            com.anythink.expressad.videocommon.d.a aVar;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.f();
        }

        public static /* synthetic */ void c(c cVar, String str, String str2) {
            StringBuilder sb2 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
            k.x(cVar.f10821h, sb2, " hasCalledCampaignLoadSuccess: ");
            sb2.append(a.this.f10785aa);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f10821h.get() == 1 || cVar.f10821h.get() == 3) && cVar.f10822i != null) {
                if (!a.this.f10785aa) {
                    StringBuilder sb3 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
                    k.x(cVar.f10821h, sb3, " hasCalledCampaignLoadSuccess: ");
                    sb3.append(a.this.f10785aa);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.o(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 17;
                    cVar.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onCampaignLoadSuccess，当前状态： ");
                k.x(cVar.f10821h, sb4, " hasCalledCampaignLoadSuccess: ");
                sb4.append(a.this.f10785aa);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        private void a(boolean z10, String str, float f10) {
            com.anythink.expressad.videocommon.d.a aVar;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            if (a.this.K) {
                a.b();
                a.this.a();
            }
            aVar.a(z10, str, f10);
        }

        private void d() {
            com.anythink.expressad.videocommon.d.a aVar;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.d();
        }

        private void a(com.anythink.expressad.foundation.d.c cVar) {
            com.anythink.expressad.videocommon.d.a aVar;
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = this.f10820c;
            if (weakReference == null || (aVar = weakReference.get()) == null) {
                return;
            }
            aVar.a(cVar);
        }

        private void a(List<com.anythink.expressad.foundation.d.c> list) {
            this.f10824k = list;
        }

        private void a(boolean z10) {
            this.f10825l = z10;
        }

        public static /* synthetic */ void b(c cVar, String str) {
            cVar.f10821h.set(2);
            if (cVar.f10822i != null) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                obtain.what = 18;
                cVar.f10822i.sendMessage(obtain);
            }
        }

        public static /* synthetic */ void a(c cVar, String str, String str2) {
            Handler handler = cVar.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
            k.x(cVar.f10821h, sb2, " hasCalledVideoLoadSuccess: ");
            sb2.append(a.this.f10786ab);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f10821h.get() == 1 || cVar.f10821h.get() == 3) && cVar.f10822i != null) {
                cVar.f10821h.set(2);
                if (!a.this.f10786ab) {
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
                    k.x(cVar.f10821h, sb3, " hasCalledVideoLoadSuccess: ");
                    sb3.append(a.this.f10786ab);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    a.q(a.this);
                    Message obtain = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putString(com.anythink.expressad.a.y, str);
                    bundle.putString("unit_id", str2);
                    obtain.setData(bundle);
                    obtain.obj = str2;
                    obtain.what = 9;
                    cVar.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadSuccess，当前状态： ");
                k.x(cVar.f10821h, sb4, " hasCalledVideoLoadSuccess: ");
                sb4.append(a.this.f10786ab);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        public static /* synthetic */ void b(c cVar) {
            cVar.f10821h.set(1);
        }

        public static /* synthetic */ void a(c cVar, String str) {
            Handler handler = cVar.f10822i;
            if (handler != null) {
                handler.removeMessages(a.I);
            }
            StringBuilder sb2 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
            k.x(cVar.f10821h, sb2, " hasCalledVideoLoadFail: ");
            sb2.append(a.this.f10787ac);
            sb2.append(" ");
            sb2.append(str);
            o.a(f10815b, sb2.toString());
            WeakReference<com.anythink.expressad.videocommon.d.a> weakReference = cVar.f10820c;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            if ((cVar.f10821h.get() == 1 || cVar.f10821h.get() == 3) && cVar.f10822i != null) {
                a.s(a.this);
                if (!a.this.ae || str.contains("resource load timeout")) {
                    a.u(a.this);
                }
                if (a.this.f10786ab) {
                    cVar.f10821h.set(2);
                }
                if (a.this.f10787ac && a.this.f10788ad && !a.this.f10786ab) {
                    cVar.f10821h.set(2);
                    StringBuilder sb3 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
                    k.x(cVar.f10821h, sb3, " hasCalledVideoLoadFail: ");
                    sb3.append(a.this.f10787ac);
                    sb3.append(" ");
                    sb3.append(str);
                    sb3.append(" 响应");
                    o.d(f10815b, sb3.toString());
                    Message obtain = Message.obtain();
                    obtain.obj = str;
                    obtain.what = 16;
                    cVar.f10822i.sendMessage(obtain);
                    return;
                }
                StringBuilder sb4 = new StringBuilder("收到 onVideoLoadFail，当前状态： ");
                k.x(cVar.f10821h, sb4, " hasCalledVideoLoadFail: ");
                sb4.append(a.this.f10787ac);
                sb4.append(" ");
                sb4.append(str);
                sb4.append(" 无需响应");
                o.a(f10815b, sb4.toString());
            }
        }

        public static /* synthetic */ int a(c cVar) {
            return cVar.f10821h.get();
        }
    }

    /* loaded from: classes.dex */
    public final class d implements h {

        /* renamed from: b, reason: collision with root package name */
        private a f10827b;

        /* renamed from: c, reason: collision with root package name */
        private int f10828c;

        /* renamed from: d, reason: collision with root package name */
        private Handler f10829d;

        /* renamed from: e, reason: collision with root package name */
        private int f10830e;

        public /* synthetic */ d(a aVar, a aVar2, Handler handler) {
            this(aVar2, handler, (byte) 0);
        }

        private void d() {
            a.this.P.clear();
            this.f10827b = null;
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void a() {
            a.l(a.this);
            o.a(a.f10782i, "=====================onAdShow=====================");
            try {
                a aVar = this.f10827b;
                if (aVar != null) {
                    aVar.Q = true;
                    if (this.f10827b.f10795m != null) {
                        this.f10827b.f10795m.f10667n = "";
                    }
                    if (this.f10827b.f10797p != null) {
                        if (a.this.K) {
                            a.b();
                        }
                        this.f10827b.f10797p.c();
                        this.f10830e = 2;
                    }
                }
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f6552a) {
                    th.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void b() {
            o.a(a.f10782i, "=====================onVideoComplete=====================");
            o.a(a.f10782i, "onVideoComplete start");
            try {
                a aVar = this.f10827b;
                if (aVar != null && aVar.f10797p != null) {
                    try {
                        this.f10827b.f10797p.d();
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f6552a) {
                            e10.printStackTrace();
                        }
                    }
                    this.f10830e = 5;
                    o.a(a.f10782i, "onEndcardShow callback");
                }
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void c() {
            o.a(a.f10782i, "=====================onEndcardShow=====================");
            o.a(a.f10782i, "onEndcardShow start");
            try {
                a aVar = this.f10827b;
                if (aVar != null && aVar.f10797p != null) {
                    try {
                        this.f10827b.f10797p.f();
                        com.anythink.expressad.foundation.f.b.a().b("_2", 2);
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f6552a) {
                            e10.printStackTrace();
                        }
                    }
                    this.f10830e = 6;
                    o.a(a.f10782i, "onEndcardShow callback");
                }
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }

        private d(a aVar, Handler handler, byte b10) {
            this.f10830e = 0;
            this.f10827b = aVar;
            this.f10828c = 1;
            this.f10829d = handler;
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z10, com.anythink.expressad.videocommon.c.c cVar) {
            o.a(a.f10782i, "=====================onAdClose=====================");
            try {
                a aVar = this.f10827b;
                if (aVar == null || aVar.f10797p == null) {
                    return;
                }
                if (cVar == null) {
                    cVar = com.anythink.expressad.videocommon.c.c.b(this.f10827b.f10803v);
                }
                if (a.this.K) {
                    a.b();
                    a.this.a();
                }
                this.f10827b.f10797p.a(z10, cVar.a(), cVar.b());
                this.f10830e = 7;
                o.a(a.f10782i, "onAdClose start release");
                this.f10827b.Q = false;
                a.this.P.clear();
                this.f10827b = null;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void a(String str) {
            a.l(a.this);
            o.a(a.f10782i, "=====================onShowFail=====================");
            try {
                if (this.f10827b != null) {
                    if (a.this.K) {
                        a.b();
                    }
                    this.f10827b.Q = false;
                    if (this.f10827b.f10797p != null) {
                        try {
                            if (a.this.af != null) {
                                a.this.af.size();
                            }
                        } catch (Exception unused) {
                        }
                        try {
                            this.f10827b.f10797p.b(str);
                        } catch (Exception e10) {
                            if (com.anythink.expressad.a.f6552a) {
                                e10.printStackTrace();
                            }
                        }
                        this.f10830e = 4;
                    }
                }
            } catch (Exception e11) {
                this.f10830e = 0;
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            o.a(a.f10782i, "=====================onVideoAdClicked=====================");
            try {
                a aVar = this.f10827b;
                if (aVar == null || aVar.f10797p == null) {
                    return;
                }
                try {
                    if (a.this.K) {
                        a.b();
                    }
                    this.f10827b.f10797p.a(cVar);
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f6552a) {
                        e10.printStackTrace();
                    }
                }
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }

        @Override // com.anythink.expressad.video.bt.module.b.h
        public final void a(boolean z10, int i10) {
            o.a(a.f10782i, "=====================onAdCloseWithIVReward=====================");
            o.a(a.f10782i, "onAdCloseWithIVReward start");
            try {
                a aVar = this.f10827b;
                if (aVar == null || aVar.f10797p == null) {
                    return;
                }
                this.f10827b.Q = false;
                try {
                    com.anythink.expressad.videocommon.d.a unused = this.f10827b.f10797p;
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f6552a) {
                        e10.printStackTrace();
                    }
                }
                o.a(a.f10782i, "onAdCloseWithIVReward callback");
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }
    }

    public static /* synthetic */ void b() {
    }

    private static void c() {
    }

    public static /* synthetic */ boolean l(a aVar) {
        aVar.R = false;
        return false;
    }

    public static /* synthetic */ boolean o(a aVar) {
        aVar.f10785aa = true;
        return true;
    }

    public static /* synthetic */ boolean q(a aVar) {
        aVar.f10786ab = true;
        return true;
    }

    public static /* synthetic */ boolean s(a aVar) {
        aVar.f10787ac = true;
        return true;
    }

    public static /* synthetic */ boolean u(a aVar) {
        aVar.f10788ad = true;
        return true;
    }

    @Override // com.anythink.core.common.a.g
    public boolean isReady() {
        try {
            j();
            if (this.K) {
                return false;
            }
            if (this.f10795m == null) {
                i();
            }
            com.anythink.expressad.reward.a.d dVar = this.f10795m;
            if (dVar == null) {
                return false;
            }
            return dVar.c();
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private String d() {
        com.anythink.expressad.reward.a.d dVar = this.f10795m;
        return dVar != null ? dVar.c(this.Q) : "";
    }

    private static void e() {
        m.a();
    }

    private void f() {
        try {
            List<com.anythink.expressad.videocommon.c.b> I2 = this.f10796n.I();
            if (I2 == null || I2.size() <= 0) {
                return;
            }
            for (int i10 = 0; i10 < I2.size(); i10++) {
                com.anythink.expressad.videocommon.c.b bVar = I2.get(i10);
                v.a(this.f10793k, this.f10801t + "_" + bVar.a(), 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean g() {
        int i10;
        try {
            List<com.anythink.expressad.videocommon.c.b> I2 = this.f10796n.I();
            if (this.o == null) {
                this.o = com.anythink.expressad.videocommon.e.c.a().b();
            }
            Map<String, Integer> i11 = this.o.i();
            if (I2 == null || I2.size() <= 0) {
                return true;
            }
            for (int i12 = 0; i12 < I2.size(); i12++) {
                com.anythink.expressad.videocommon.c.b bVar = I2.get(i12);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(bVar.a());
                if (i11.containsKey(sb2.toString())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(bVar.a());
                    i10 = i11.get(sb3.toString()).intValue();
                } else {
                    i10 = 0;
                }
                Object b10 = v.b(this.f10793k, this.f10801t + "_" + bVar.a(), 0);
                if ((b10 != null ? ((Integer) b10).intValue() : 0) < i10) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            o.d(f10782i, e10.getMessage());
            return true;
        }
    }

    private boolean h() {
        if (this.f10795m == null) {
            i();
        }
        com.anythink.expressad.reward.a.d dVar = this.f10795m;
        if (dVar != null) {
            return dVar.c();
        }
        return false;
    }

    private void i() {
        com.anythink.expressad.reward.a.d dVar = new com.anythink.expressad.reward.a.d(this.f10793k, this.f10801t, this.f10800s);
        this.f10795m = dVar;
        dVar.a(this.J);
        this.f10795m.b(this.K);
        if (this.J) {
            this.f10795m.a(this.B, this.C, this.D);
        }
        this.f10795m.a(this.f10796n);
    }

    private boolean j() {
        try {
            if (this.X != null) {
                return false;
            }
            this.X = com.anythink.expressad.foundation.c.c.a(n.a().g());
            return false;
        } catch (Throwable unused) {
            o.d(f10782i, "cap check error");
            return false;
        }
    }

    private void b(boolean z10) {
        this.K = z10;
    }

    private void c(boolean z10) {
        this.O = z10;
    }

    private static void b(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = U) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        U.put(str, str2);
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        try {
            o.a(f10782i, "开始从 SOURCE_MBAPI 请求新的 offer: 8");
            com.anythink.expressad.reward.a.d dVar2 = this.f10795m;
            if (dVar2 == null || !this.f10800s.equals(dVar2.e())) {
                com.anythink.expressad.reward.a.d dVar3 = new com.anythink.expressad.reward.a.d(this.f10793k, this.f10801t, this.f10800s);
                this.f10795m = dVar3;
                dVar3.a(this.J);
                this.f10795m.b(this.K);
            }
            if (this.J) {
                this.f10795m.a(this.B, this.C, this.D);
            }
            this.f10795m.a(this.y);
            this.f10795m.a(this.f10796n);
            RunnableC0131a runnableC0131a = new RunnableC0131a(this.f10795m);
            b bVar = new b(this.f10795m);
            bVar.a(runnableC0131a);
            this.f10795m.a(bVar);
            this.f10795m.a(dVar);
        } catch (Exception e10) {
            b(e10.getMessage());
        }
    }

    public final void a(boolean z10) {
        this.J = z10;
    }

    public final void a(int i10) {
        this.y = i10;
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            v.a(this.f10793k, "Anythink_ConfirmTitle" + this.f10800s, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            v.a(this.f10793k, "Anythink_ConfirmContent" + this.f10800s, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            v.a(this.f10793k, "Anythink_CancelText" + this.f10800s, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        v.a(this.f10793k, "Anythink_ConfirmText" + this.f10800s, str3.trim());
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        try {
            c(dVar);
        } catch (Exception e10) {
            try {
                b("load mv api error:" + e10.getMessage());
            } catch (Exception e11) {
                b(com.anythink.expressad.foundation.g.b.b.f9832b);
                if (com.anythink.expressad.a.f6552a) {
                    e11.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f10798q != null) {
            this.f10788ad = true;
            c.a(this.f10798q, str);
        }
    }

    private void a(int i10, int i11, int i12) {
        this.B = i10;
        this.C = i11;
        if (i11 == com.anythink.expressad.foundation.g.a.cu) {
            this.D = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.anythink.expressad.foundation.g.a.ct) {
            this.D = i12 < 0 ? 80 : i12;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i10 == com.anythink.expressad.foundation.g.a.cr ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i11 == com.anythink.expressad.foundation.g.a.ct ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i12);
            com.anythink.expressad.d.b.a();
            com.anythink.expressad.d.b.e(this.f10800s, jSONObject.toString());
        } catch (Exception unused) {
            o.d(f10782i, "setIVRewardEnable to SP was ERROR");
        }
    }

    private com.anythink.expressad.videocommon.c.b b(int i10) {
        com.anythink.expressad.videocommon.e.d dVar = this.f10796n;
        com.anythink.expressad.videocommon.c.b bVar = null;
        if (dVar != null) {
            int size = dVar.I().size();
            for (int i11 = 0; i11 < size; i11++) {
                if (this.f10796n.I().get(i11).a() == i10) {
                    bVar = this.f10796n.I().get(i11);
                }
            }
        }
        return bVar;
    }

    public static void a(String str, int i10) {
        try {
            if (T == null || !w.b(str)) {
                return;
            }
            T.put(str, Integer.valueOf(i10));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (!w.b(str) || (map = T) == null || !map.containsKey(str) || (num = T.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final void a() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.Q || (concurrentHashMap = U) == null || concurrentHashMap.containsKey(d())) {
            return;
        }
        U.remove(d());
    }

    public final void a(com.anythink.expressad.videocommon.d.a aVar) {
        this.f10797p = aVar;
        this.f10798q = new c(this, aVar, this.f10805x, this.f10800s, (byte) 0);
    }

    public final void a(String str, String str2) {
        try {
            this.f10793k = n.a().g();
            this.f10800s = str2;
            this.f10801t = str;
            this.o = com.anythink.expressad.videocommon.e.c.a().b();
            m.b();
            com.anythink.expressad.videocommon.b.m.a().b();
            j.a().b();
            com.anythink.expressad.videocommon.e.c.a().a(this.f10800s, this.J);
            if (this.X == null) {
                this.X = com.anythink.expressad.foundation.c.c.a(n.a().g());
            }
        } catch (Throwable th) {
            o.b(f10782i, th.getMessage(), th);
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        if (dVar == null) {
            o.d(f10782i, com.anythink.expressad.foundation.g.b.b.f);
            c.b(this.f10798q, com.anythink.expressad.foundation.g.b.b.f);
            return;
        }
        if (this.f10798q != null && c.a(this.f10798q) == 3) {
            this.Y = false;
        } else {
            this.Y = true;
            c.b(this.f10798q);
        }
        this.N = true;
        this.f10805x.removeMessages(H);
        this.f10786ab = false;
        this.f10785aa = false;
        this.f10787ac = false;
        this.f10788ad = false;
        com.anythink.expressad.reward.a.c.a();
        try {
            this.f10796n = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), this.f10800s, this.J);
            if (!TextUtils.isEmpty(this.f10801t)) {
                this.f10796n.b(this.f10801t);
            }
            int S = this.f10796n.S() * 1000;
            if (this.f10805x != null) {
                o.a(f10782i, "start load timeout for " + S + " ms");
                this.f10805x.sendEmptyMessageDelayed(I, (long) S);
            }
            this.V = this.f10796n.Q();
            try {
                if (g()) {
                    o.a(f10782i, "当前 cap 全满，清除所有的 cap");
                    f();
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            }
            try {
                c(dVar);
            } catch (Exception e11) {
                try {
                    b("load mv api error:" + e11.getMessage());
                } catch (Exception e12) {
                    b(com.anythink.expressad.foundation.g.b.b.f9832b);
                    if (com.anythink.expressad.a.f6552a) {
                        e12.printStackTrace();
                    }
                }
            }
        } catch (Exception e13) {
            if (this.f10798q != null) {
                c.a(this.f10798q, "load exception");
            }
            if (com.anythink.expressad.a.f6552a) {
                e13.printStackTrace();
            }
        }
    }

    private static List<com.anythink.expressad.foundation.d.c> a(String str, List<com.anythink.expressad.foundation.d.c> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (com.anythink.expressad.foundation.d.c cVar : list) {
                if (cVar != null && str.equals(cVar.B())) {
                    arrayList.add(cVar);
                }
            }
        }
        return arrayList;
    }

    private void a(Activity activity, String str, com.anythink.core.common.e.j jVar) {
        Map<String, Integer> i10;
        try {
            com.anythink.expressad.videocommon.e.a aVar = this.o;
            int intValue = (aVar == null || (i10 = aVar.i()) == null || !i10.containsKey("1")) ? 0 : i10.get("1").intValue();
            if (v.b(this.f10793k, this.f10801t + "_1", 0) != null) {
                this.f10794l = ((Integer) v.b(this.f10793k, this.f10801t + "_1", 0)).intValue();
            }
            if (this.f10795m == null) {
                i();
            }
            if (this.f10795m != null) {
                o.d(f10782i, "controller 819");
                if (this.f10795m.c()) {
                    if (this.f10794l >= intValue && intValue > 0) {
                        this.R = false;
                        return;
                    }
                    o.b(f10782i, "invoke adapter show isReady");
                    d dVar = new d(this, this, this.f10805x);
                    f10781c.put(this.f10800s, dVar);
                    this.f10795m.a(activity, dVar, str, this.f10799r, this.y, this.f10802u, jVar);
                    return;
                }
            }
            this.R = false;
            if (this.f10797p != null) {
                try {
                    this.f10797p.b("can't show because load is failed");
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f6552a) {
                        e10.printStackTrace();
                    }
                }
            }
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10782i, e11.getLocalizedMessage());
            }
            if (this.f10797p != null) {
                try {
                    this.f10797p.b("show exception");
                } catch (Exception unused) {
                    if (com.anythink.expressad.a.f6552a) {
                        e11.printStackTrace();
                    }
                }
            }
            this.R = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.anythink.core.common.e.j r14) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.b.a.a(android.app.Activity, java.lang.String, java.lang.String, java.lang.String, com.anythink.core.common.e.j):void");
    }

    private static void a(boolean z10, boolean z11) {
        try {
            Map<String, d> map = f10781c;
            if (map != null) {
                map.clear();
            }
            if (z10) {
                if (z11) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU);
                }
            } else if (z11) {
                com.anythink.expressad.videocommon.a.a(94);
            } else {
                com.anythink.expressad.videocommon.a.b(94);
            }
            com.anythink.expressad.videocommon.a.a();
            com.anythink.expressad.videocommon.a.b();
        } catch (Throwable unused) {
            o.d(f10782i, "destory failed");
        }
    }

    private static void a(boolean z10, boolean z11, String str) {
        try {
            Map<String, d> map = f10781c;
            if (map != null) {
                map.clear();
            }
            if (z10) {
                if (z11) {
                    com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU);
                } else {
                    com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU);
                }
            } else if (z11) {
                com.anythink.expressad.videocommon.a.a(94);
            } else {
                com.anythink.expressad.videocommon.a.b(94);
            }
            com.anythink.expressad.videocommon.a.c(str);
            com.anythink.expressad.videocommon.a.b();
        } catch (Throwable unused) {
            o.d(f10782i, "destory failed");
        }
    }
}
