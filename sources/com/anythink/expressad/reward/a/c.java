package com.anythink.expressad.reward.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.video.bt.module.AnythinkBTLayout;
import com.anythink.expressad.video.bt.module.AnythinkBTRootLayout;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.i;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10508a = "RewardCampaignsResourceManager";

    /* renamed from: d, reason: collision with root package name */
    private static Map<String, a> f10509d = null;
    private static final int f = 100;

    /* renamed from: g, reason: collision with root package name */
    private static final int f10510g = 200;

    /* renamed from: h, reason: collision with root package name */
    private static final int f10511h = 101;

    /* renamed from: i, reason: collision with root package name */
    private static final int f10512i = 201;

    /* renamed from: j, reason: collision with root package name */
    private static final int f10513j = 102;

    /* renamed from: k, reason: collision with root package name */
    private static final int f10514k = 202;

    /* renamed from: l, reason: collision with root package name */
    private static final int f10515l = 103;

    /* renamed from: m, reason: collision with root package name */
    private static final int f10516m = 203;

    /* renamed from: n, reason: collision with root package name */
    private static final int f10517n = 104;
    private static final int o = 204;

    /* renamed from: p, reason: collision with root package name */
    private static final int f10518p = 105;

    /* renamed from: q, reason: collision with root package name */
    private static final int f10519q = 205;

    /* renamed from: r, reason: collision with root package name */
    private static final int f10520r = 0;

    /* renamed from: s, reason: collision with root package name */
    private static final int f10521s = 1;

    /* renamed from: b, reason: collision with root package name */
    private final h f10522b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, List<com.anythink.expressad.foundation.d.c>> f10523c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10524e;

    /* renamed from: t, reason: collision with root package name */
    private volatile List<WindVaneWebView> f10525t;

    /* renamed from: com.anythink.expressad.reward.a.c$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f10539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10540c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f10541d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f10542e;
        final /* synthetic */ com.anythink.expressad.videocommon.e.d f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f10543g;

        public AnonymousClass3(boolean z10, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.c cVar, List list, String str, com.anythink.expressad.videocommon.e.d dVar, String str2) {
            this.f10538a = z10;
            this.f10539b = windVaneWebView;
            this.f10540c = cVar;
            this.f10541d = list;
            this.f10542e = str;
            this.f = dVar;
            this.f10543g = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o.a("RewardCampaignsResourceManager_test", "开始预加载播放模板 55");
            c.a(this.f10538a, this.f10539b, this.f10540c.M().e(), this.f10540c, this.f10541d, com.anythink.expressad.videocommon.b.i.a().c(this.f10540c.M().e()), this.f10542e, this.f, this.f10543g, c.this.f10524e);
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f10545a;

        /* renamed from: b, reason: collision with root package name */
        boolean f10546b;

        /* renamed from: c, reason: collision with root package name */
        int f10547c;

        /* renamed from: d, reason: collision with root package name */
        int f10548d;

        /* renamed from: e, reason: collision with root package name */
        String f10549e;
        String f;

        /* renamed from: g, reason: collision with root package name */
        int f10550g;

        /* renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10551h;

        /* renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10552i;

        public a(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList) {
            this.f10545a = z10;
            this.f10546b = z11;
            this.f10547c = i10;
            this.f10548d = i11;
            this.f10549e = str;
            this.f = str2;
            this.f10550g = i12;
            this.f10551h = copyOnWriteArrayList;
            this.f10552i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends com.anythink.expressad.atsignalcommon.a.a {

        /* renamed from: b, reason: collision with root package name */
        private final Handler f10553b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f10554c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f10555d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f10556e;
        private int f;

        /* renamed from: g, reason: collision with root package name */
        private String f10557g;

        /* renamed from: h, reason: collision with root package name */
        private String f10558h;

        /* renamed from: i, reason: collision with root package name */
        private String f10559i;

        /* renamed from: j, reason: collision with root package name */
        private String f10560j;

        /* renamed from: k, reason: collision with root package name */
        private a.C0140a f10561k;

        /* renamed from: l, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10562l;

        /* renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10563m;

        /* renamed from: n, reason: collision with root package name */
        private com.anythink.expressad.videocommon.e.d f10564n;
        private final j o;

        /* renamed from: q, reason: collision with root package name */
        private boolean f10566q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f10567r;

        /* renamed from: t, reason: collision with root package name */
        private boolean f10569t;

        /* renamed from: u, reason: collision with root package name */
        private long f10570u;

        /* renamed from: s, reason: collision with root package name */
        private int f10568s = 0;

        /* renamed from: p, reason: collision with root package name */
        private boolean f10565p = false;

        public b(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0140a c0140a, com.anythink.expressad.foundation.d.c cVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList, com.anythink.expressad.videocommon.e.d dVar, j jVar, long j10) {
            this.f10553b = handler;
            this.f10554c = runnable;
            this.f10555d = z11;
            this.f10556e = z12;
            this.f = i10;
            this.f10557g = str;
            this.f10559i = str2;
            this.f10558h = str3;
            this.f10560j = str4;
            this.f10561k = c0140a;
            this.f10562l = cVar;
            this.f10563m = copyOnWriteArrayList;
            this.f10564n = dVar;
            this.o = jVar;
            this.f10569t = z10;
            this.f10570u = j10;
            o.a("RewardCampaignsResourceManager_test", "开始预加载大模板");
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final void a(String str, int i10, int i11) {
            o.a("RVWindVaneWebView", "loadAds: unitID " + str + " type " + i10 + " adType " + i11);
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            o.a("RewardCampaignsResourceManager_test", "onPageFinished");
            if (!this.f10566q) {
                if (!str.contains("wfr=1")) {
                    o.a("RVWindVaneWebView", "CampaignTPLWindVaneWebviewClient templete preload wfr=1 不包含 ");
                    com.anythink.expressad.videocommon.b.l.a().c(this.f10558h + "_" + this.f10560j + "_" + this.f10557g, true);
                    Handler handler = this.f10553b;
                    if (handler != null && (runnable = this.f10554c) != null) {
                        handler.removeCallbacks(runnable);
                    }
                    a.C0140a c0140a = this.f10561k;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    if (this.o != null) {
                        o.a(c.f10508a, "CampaignTPLWindVaneWebviewClient rewardTemplatePreLoadListener.onPreLoadSuccess ");
                        this.o.a(this.f10560j);
                    }
                }
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.b(webView);
                this.f10566q = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            o.a("RewardCampaignsResourceManager_test", "onReceivedError： " + i10 + "  " + str);
            com.anythink.expressad.videocommon.b.l.a().c(this.f10558h + "_" + this.f10560j + "_" + this.f10557g, false);
            if (this.o != null) {
                a.C0140a c0140a = this.f10561k;
                if (c0140a != null) {
                    c0140a.a(false);
                }
                this.o.a(this.f10560j, str);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            Runnable runnable;
            a3.l.u(i10, "收到大模板 readyState 回调: ", "RewardCampaignsResourceManager_test");
            if (!this.f10567r) {
                StringBuilder n10 = a3.k.n("CampaignTPLWindVaneWebviewClient 开始预加载大模板资源 readyState： ", i10, " isCache: ");
                n10.append(this.f10565p);
                o.a("test_pre_load_tpl", n10.toString());
                if (i10 == 1) {
                    a3.l.u(i10, "CampaignTPLWindVaneWebviewClient templete preload readyState state = ", "RVWindVaneWebView");
                    if (this.f10565p) {
                        com.anythink.expressad.videocommon.a.e(this.f10558h + "_" + this.f10560j);
                    } else {
                        com.anythink.expressad.videocommon.a.d(this.f10558h + "_" + this.f10560j);
                    }
                    o.a("test_pre_load_tpl", "添加大模板： " + this.f10558h + "_" + this.f10560j + "_" + this.f10557g);
                    com.anythink.expressad.videocommon.a.a(this.f10558h + "_" + this.f10560j + "_" + this.f10557g, this.f10561k, true, this.f10565p);
                    Handler handler = this.f10553b;
                    if (handler != null && (runnable = this.f10554c) != null) {
                        handler.removeCallbacks(runnable);
                    }
                    com.anythink.expressad.videocommon.b.l.a().c(this.f10558h + "_" + this.f10560j + "_" + this.f10557g, true);
                    a.C0140a c0140a = this.f10561k;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    if (this.o != null) {
                        o.a("RVWindVaneWebView", "CampaignTPLWindVaneWebviewClient rewardTemplatePreLoadListener.onPreLoadSuccess ");
                        this.o.a(this.f10560j);
                    }
                } else {
                    com.anythink.expressad.videocommon.b.l.a().c(this.f10558h + "_" + this.f10560j + "_" + this.f10557g, false);
                    a.C0140a c0140a2 = this.f10561k;
                    if (c0140a2 != null) {
                        c0140a2.a(false);
                    }
                    j jVar = this.o;
                    if (jVar != null) {
                        jVar.a(this.f10560j, "state 2");
                    }
                }
                this.f10567r = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final String a(String str) {
            return com.anythink.expressad.videocommon.b.i.a().c(str);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:15|(3:18|19|(3:24|(3:26|27|28)(2:36|(1:41)(1:40))|29))|46|47|48|29) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0139, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
        
            if (com.anythink.expressad.a.f6552a != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x013e, code lost:
        
            com.anythink.expressad.foundation.h.o.d(com.anythink.expressad.reward.a.c.f10508a, r0.getLocalizedMessage());
         */
        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 363
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.a.c.b.a(java.lang.Object, java.lang.String):void");
        }
    }

    /* renamed from: com.anythink.expressad.reward.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0126c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList);

        void a(String str, String str2, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList);
    }

    /* loaded from: classes.dex */
    public static final class d implements i.b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10571a = 497;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10572b = 313;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10573c = 859;

        /* renamed from: e, reason: collision with root package name */
        private int f10575e;
        private final String f;

        /* renamed from: g, reason: collision with root package name */
        private final String f10576g;

        /* renamed from: h, reason: collision with root package name */
        private final String f10577h;

        /* renamed from: i, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10578i;

        /* renamed from: j, reason: collision with root package name */
        private i f10579j;

        /* renamed from: k, reason: collision with root package name */
        private Handler f10580k;

        /* renamed from: l, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.c> f10581l;

        /* renamed from: d, reason: collision with root package name */
        private boolean f10574d = false;

        /* renamed from: m, reason: collision with root package name */
        private final long f10582m = System.currentTimeMillis();

        public d(int i10, String str, String str2, String str3, com.anythink.expressad.foundation.d.c cVar, i iVar, Handler handler, List<com.anythink.expressad.foundation.d.c> list) {
            this.f10575e = i10;
            this.f = str;
            this.f10576g = str2;
            this.f10577h = str3;
            this.f10578i = cVar;
            this.f10579j = iVar;
            this.f10580k = handler;
            this.f10581l = list;
        }

        public final void a(boolean z10) {
            this.f10574d = z10;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            com.anythink.expressad.videocommon.b.l.a().b(str, true);
            int i10 = this.f10575e;
            if (i10 == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f10576g);
                bundle.putString(com.anythink.expressad.a.y, this.f);
                bundle.putString("request_id", this.f10577h);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f10580k.sendMessage(obtain);
                return;
            }
            if (i10 == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f10576g);
                bundle2.putString(com.anythink.expressad.a.y, this.f);
                bundle2.putString("request_id", this.f10577h);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f10580k.sendMessage(obtain2);
                if (this.f10574d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f10576g);
            bundle3.putString(com.anythink.expressad.a.y, this.f);
            bundle3.putString("request_id", this.f10577h);
            obtain3.setData(bundle3);
            this.f10580k.sendMessage(obtain3);
            i iVar = this.f10579j;
            if (iVar != null) {
                iVar.a(this.f, this.f10576g, this.f10577h);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().b(str, false);
            int i10 = this.f10575e;
            if (i10 == 313) {
                Message obtain = Message.obtain();
                obtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f10576g);
                bundle.putString(com.anythink.expressad.a.y, this.f);
                bundle.putString("request_id", this.f10577h);
                bundle.putString("url", str);
                bundle.putString(CrashHianalyticsData.MESSAGE, str2);
                obtain.setData(bundle);
                this.f10580k.sendMessage(obtain);
                return;
            }
            if (i10 == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f10576g);
                bundle2.putString(com.anythink.expressad.a.y, this.f);
                bundle2.putString("request_id", this.f10577h);
                bundle2.putString("url", str);
                bundle2.putString(CrashHianalyticsData.MESSAGE, str2);
                obtain2.setData(bundle2);
                this.f10580k.sendMessage(obtain2);
                if (this.f10574d) {
                    System.currentTimeMillis();
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = c.f10519q;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f10576g);
            bundle3.putString(com.anythink.expressad.a.y, this.f);
            bundle3.putString("request_id", this.f10577h);
            bundle3.putString(CrashHianalyticsData.MESSAGE, str2);
            obtain3.setData(bundle3);
            this.f10580k.sendMessage(obtain3);
            i iVar = this.f10579j;
            if (iVar != null) {
                iVar.a(this.f10576g, this.f10577h);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10594a = 497;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10595b = 859;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10596c = 313;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10597d = 502;
        private Context f;

        /* renamed from: g, reason: collision with root package name */
        private String f10599g;

        /* renamed from: h, reason: collision with root package name */
        private String f10600h;

        /* renamed from: i, reason: collision with root package name */
        private String f10601i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10602j;

        /* renamed from: k, reason: collision with root package name */
        private int f10603k;

        /* renamed from: l, reason: collision with root package name */
        private Handler f10604l;

        /* renamed from: m, reason: collision with root package name */
        private i f10605m;

        /* renamed from: n, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.c> f10606n;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10598e = false;
        private long o = System.currentTimeMillis();

        public g(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.c cVar, int i10, Handler handler, i iVar, List<com.anythink.expressad.foundation.d.c> list) {
            this.f = context;
            this.f10600h = str;
            this.f10599g = str2;
            this.f10601i = str3;
            this.f10602j = cVar;
            this.f10603k = i10;
            this.f10604l = handler;
            this.f10605m = iVar;
            this.f10606n = list;
        }

        public final void a(boolean z10) {
            this.f10598e = z10;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            com.anythink.expressad.videocommon.b.l.a().b(str, true);
            System.currentTimeMillis();
            int i10 = this.f10603k;
            if (i10 == 313) {
                o.a(c.f10508a, "zip pause download success");
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f10599g);
                bundle.putString(com.anythink.expressad.a.y, this.f10600h);
                bundle.putString("request_id", this.f10601i);
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.f10604l.sendMessage(obtain);
                return;
            }
            if (i10 == 497) {
                o.a(c.f10508a, "zip endcard download success");
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f10599g);
                bundle2.putString(com.anythink.expressad.a.y, this.f10600h);
                bundle2.putString("request_id", this.f10601i);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f10604l.sendMessage(obtain2);
                return;
            }
            if (i10 != 859) {
                return;
            }
            o.a(c.f10508a, "zip template download success");
            Message obtain3 = Message.obtain();
            obtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f10599g);
            bundle3.putString(com.anythink.expressad.a.y, this.f10600h);
            bundle3.putString("request_id", this.f10601i);
            obtain3.setData(bundle3);
            this.f10604l.sendMessage(obtain3);
            i iVar = this.f10605m;
            if (iVar != null) {
                iVar.a(this.f10600h, this.f10599g, this.f10601i);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            com.anythink.expressad.videocommon.b.l.a().b(str2, false);
            System.currentTimeMillis();
            int i10 = this.f10603k;
            if (i10 == 313) {
                o.a(c.f10508a, "zip pause download failed");
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", this.f10599g);
                bundle.putString(com.anythink.expressad.a.y, this.f10600h);
                bundle.putString("request_id", this.f10601i);
                bundle.putString("url", str2);
                bundle.putString(CrashHianalyticsData.MESSAGE, str);
                obtain.setData(bundle);
                this.f10604l.sendMessage(obtain);
                return;
            }
            if (i10 == 497) {
                o.a(c.f10508a, "zip endcard download failed:  ".concat(String.valueOf(str)));
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString("unit_id", this.f10599g);
                bundle2.putString(com.anythink.expressad.a.y, this.f10600h);
                bundle2.putString("request_id", this.f10601i);
                bundle2.putString("url", str2);
                bundle2.putString(CrashHianalyticsData.MESSAGE, str);
                obtain2.setData(bundle2);
                this.f10604l.sendMessage(obtain2);
                return;
            }
            if (i10 != 859) {
                return;
            }
            o.a(c.f10508a, "zip template download failed");
            Message obtain3 = Message.obtain();
            obtain3.what = c.f10516m;
            Bundle bundle3 = new Bundle();
            bundle3.putString("unit_id", this.f10599g);
            bundle3.putString(com.anythink.expressad.a.y, this.f10600h);
            bundle3.putString("request_id", this.f10601i);
            bundle3.putString("url", str2);
            bundle3.putString(CrashHianalyticsData.MESSAGE, str);
            obtain3.setData(bundle3);
            this.f10604l.sendMessage(obtain3);
            i iVar = this.f10605m;
            if (iVar != null) {
                iVar.a(this.f10599g, this.f10601i);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f10607a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0126c f10608b;

        /* renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, InterfaceC0126c> f10609c;

        /* renamed from: d, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c>> f10610d;

        public h(Looper looper) {
            super(looper);
            this.f10609c = new ConcurrentHashMap<>();
            this.f10610d = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, InterfaceC0126c interfaceC0126c) {
            this.f10609c.put(str + "_" + str2, interfaceC0126c);
        }

        /* JADX WARN: Removed duplicated region for block: B:202:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r22) {
            /*
                Method dump skipped, instructions count: 1064
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.a.c.h.handleMessage(android.os.Message):void");
        }

        public final void a(Context context) {
            this.f10607a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList) {
            this.f10610d.put(str, copyOnWriteArrayList);
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        void a(String str, String str2);

        void a(String str, String str2, String str3);
    }

    /* loaded from: classes.dex */
    public interface j {
        void a(String str);

        void a(String str, String str2);
    }

    /* loaded from: classes.dex */
    public static class k extends com.anythink.expressad.atsignalcommon.a.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f10611a;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f10612b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f10613c;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f10614e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private final j f10615g;

        /* renamed from: h, reason: collision with root package name */
        private final WindVaneWebView f10616h;

        /* renamed from: i, reason: collision with root package name */
        private final String f10617i;

        /* renamed from: j, reason: collision with root package name */
        private final String f10618j;

        /* renamed from: k, reason: collision with root package name */
        private final String f10619k;

        /* renamed from: l, reason: collision with root package name */
        private final a.C0140a f10620l;

        /* renamed from: m, reason: collision with root package name */
        private final com.anythink.expressad.foundation.d.c f10621m;

        /* renamed from: n, reason: collision with root package name */
        private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10622n;
        private long o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f10623p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f10624q;

        /* renamed from: r, reason: collision with root package name */
        private final Runnable f10625r;

        /* renamed from: s, reason: collision with root package name */
        private final Runnable f10626s;

        public k(Handler handler, Runnable runnable, boolean z10, boolean z11, final String str, final j jVar, WindVaneWebView windVaneWebView, final String str2, final String str3, final String str4, final a.C0140a c0140a, com.anythink.expressad.foundation.d.c cVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList, long j10) {
            this.f10611a = handler;
            this.f10612b = runnable;
            this.f10613c = z10;
            this.f10614e = z11;
            this.f = str;
            this.f10615g = jVar;
            this.f10616h = windVaneWebView;
            this.f10617i = str2;
            this.f10618j = str4;
            this.f10619k = str3;
            this.f10620l = c0140a;
            this.f10621m = cVar;
            this.f10622n = copyOnWriteArrayList;
            this.o = j10;
            Runnable runnable2 = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a10;
                    a.C0140a c0140a2;
                    o.a("WindVaneWebView", "WebView onPageFinish timeout exception after 5s");
                    if (jVar != null && (c0140a2 = c0140a) != null) {
                        c0140a2.a(true);
                        com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str + "_" + str2, true);
                        jVar.a(str);
                    }
                    a.C0140a c0140a3 = c0140a;
                    if (c0140a3 != null && (a10 = c0140a3.a()) != null) {
                        try {
                            a10.release();
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.f10626s = runnable2;
            this.f10625r = new Runnable() { // from class: com.anythink.expressad.reward.a.c.k.2
                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a10;
                    a.C0140a c0140a2;
                    o.a("WindVaneWebView", "WebView readyState timeout exception after 5s");
                    if (jVar != null && (c0140a2 = c0140a) != null) {
                        c0140a2.a(true);
                        com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str + "_" + str2, true);
                        jVar.a(str);
                    }
                    a.C0140a c0140a3 = c0140a;
                    if (c0140a3 != null && (a10 = c0140a3.a()) != null) {
                        try {
                            a10.release();
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(runnable2, com.anythink.expressad.exoplayer.f.f7962a);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            o.a("WindVaneWebView", "TempalteWindVaneWebviewClient preLoadTemplate onPageFinished: ");
            Handler handler2 = this.f10611a;
            if (handler2 != null && (runnable2 = this.f10626s) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (!this.f10623p) {
                if (!str.contains("wfr=1")) {
                    com.anythink.expressad.videocommon.b.l.a().c(this.f10618j + "_" + this.f + "_" + this.f10617i, true);
                    Runnable runnable3 = this.f10612b;
                    if (runnable3 != null && (handler = this.f10611a) != null) {
                        handler.removeCallbacks(runnable3);
                    }
                    a.C0140a c0140a = this.f10620l;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    if (this.f10613c) {
                        if (this.f10621m.A()) {
                            o.a("WindVaneWebView", "TempalteWindVaneWebviewClient Tempalte put templeteCache in bidIVCache ");
                            com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU, this.f10621m.aa(), this.f10620l);
                        } else {
                            o.a("WindVaneWebView", "TempalteWindVaneWebviewClient Tempalte put templeteCache in iVCache ");
                            com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.f10621m.aa(), this.f10620l);
                        }
                    } else if (this.f10621m.A()) {
                        o.a("WindVaneWebView", "TempalteWindVaneWebviewClient Tempalte put templeteCache in bidRVCache ");
                        com.anythink.expressad.videocommon.a.a(94, this.f10621m.aa(), this.f10620l);
                    } else {
                        o.a("WindVaneWebView", "TempalteWindVaneWebviewClient Tempalte put templeteCache in rVCache ");
                        com.anythink.expressad.videocommon.a.b(94, this.f10621m.aa(), this.f10620l);
                    }
                    j jVar = this.f10615g;
                    if (jVar != null) {
                        jVar.a(this.f);
                    }
                } else {
                    Handler handler3 = this.f10611a;
                    if (handler3 != null && (runnable = this.f10625r) != null) {
                        handler3.postDelayed(runnable, com.anythink.expressad.exoplayer.f.f7962a);
                    }
                }
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.b(webView);
                this.f10623p = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            o.a("WindVaneWebView", "TempalteWindVaneWebviewClient preLoadTemplate onReceivedError: ".concat(String.valueOf(str)));
            com.anythink.expressad.videocommon.b.l.a().c(this.f10618j + "_" + this.f + "_" + this.f10617i, false);
            Handler handler = this.f10611a;
            if (handler != null) {
                if (this.f10625r != null) {
                    handler.removeCallbacks(this.f10626s);
                }
                Runnable runnable = this.f10625r;
                if (runnable != null) {
                    this.f10611a.removeCallbacks(runnable);
                }
            }
            try {
                a.C0140a c0140a = this.f10620l;
                if (c0140a != null) {
                    c0140a.a(false);
                }
                j jVar = this.f10615g;
                if (jVar != null) {
                    jVar.a(this.f, str);
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Object valueOf;
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            StringBuilder sb2 = new StringBuilder("TempalteWindVaneWebviewClient preLoadTemplate onReceivedSslError: ");
            String str = "";
            if (sslError == null) {
                valueOf = "";
            } else {
                valueOf = Integer.valueOf(sslError.getPrimaryError());
            }
            sb2.append(valueOf);
            o.a("WindVaneWebView", sb2.toString());
            com.anythink.expressad.videocommon.b.l.a().c(this.f10618j + "_" + this.f + "_" + this.f10617i, false);
            Handler handler = this.f10611a;
            if (handler != null) {
                if (this.f10625r != null) {
                    handler.removeCallbacks(this.f10626s);
                }
                Runnable runnable = this.f10625r;
                if (runnable != null) {
                    this.f10611a.removeCallbacks(runnable);
                }
            }
            try {
                a.C0140a c0140a = this.f10620l;
                if (c0140a != null) {
                    c0140a.a(false);
                }
                j jVar = this.f10615g;
                if (jVar != null) {
                    String str2 = this.f;
                    if (sslError != null) {
                        str = Integer.toString(sslError.getPrimaryError());
                    }
                    jVar.a(str2, str);
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.readyState(webView, i10);
            Handler handler2 = this.f10611a;
            if (handler2 != null && (runnable2 = this.f10625r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f10611a;
            if (handler3 != null && (runnable = this.f10626s) != null) {
                handler3.removeCallbacks(runnable);
            }
            if (!this.f10624q) {
                if (i10 == 1) {
                    a3.l.u(i10, "TempalteWindVaneWebviewClient template 预加载成功 state ：", "WindVaneWebView");
                    Runnable runnable3 = this.f10612b;
                    if (runnable3 != null && (handler = this.f10611a) != null) {
                        handler.removeCallbacks(runnable3);
                    }
                    com.anythink.expressad.videocommon.b.l.a().c(this.f10618j + "_" + this.f + "_" + this.f10617i, true);
                    a.C0140a c0140a = this.f10620l;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    if (this.f10613c) {
                        if (this.f10614e) {
                            o.a("WindVaneWebView", "put templeteCache in bidIVCache ");
                            com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU, this.f10621m.aa(), this.f10620l);
                        } else {
                            o.a("WindVaneWebView", "put templeteCache in iVCache ");
                            com.anythink.expressad.videocommon.a.b(com.anythink.expressad.foundation.g.a.aU, this.f10621m.aa(), this.f10620l);
                        }
                    } else if (this.f10614e) {
                        o.a("WindVaneWebView", "put templeteCache in bidRVCache ");
                        com.anythink.expressad.videocommon.a.a(94, this.f10621m.aa(), this.f10620l);
                    } else {
                        o.a("WindVaneWebView", "put templeteCache in rVCache ");
                        com.anythink.expressad.videocommon.a.b(94, this.f10621m.aa(), this.f10620l);
                    }
                    j jVar = this.f10615g;
                    if (jVar != null) {
                        jVar.a(this.f);
                    }
                } else {
                    j jVar2 = this.f10615g;
                    if (jVar2 != null) {
                        jVar2.a(this.f, "state ".concat(String.valueOf(i10)));
                    }
                }
                this.f10624q = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class l extends com.anythink.expressad.atsignalcommon.a.b {

        /* renamed from: a, reason: collision with root package name */
        private String f10639a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f10640b = false;

        /* renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f10641c;

        /* renamed from: e, reason: collision with root package name */
        private final String f10642e;
        private final String f;

        /* renamed from: g, reason: collision with root package name */
        private final a.C0140a f10643g;

        /* renamed from: h, reason: collision with root package name */
        private final com.anythink.expressad.foundation.d.c f10644h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f10645i;

        /* renamed from: j, reason: collision with root package name */
        private String f10646j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f10647k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f10648l;

        public l(String str, WindVaneWebView windVaneWebView, String str2, String str3, a.C0140a c0140a, com.anythink.expressad.foundation.d.c cVar, boolean z10, String str4) {
            this.f10641c = windVaneWebView;
            this.f10642e = str2;
            this.f = str3;
            this.f10643g = c0140a;
            this.f10644h = cVar;
            this.f10639a = str;
            this.f10645i = z10;
            this.f10646j = str4;
            o.a("WindVaneWebView", "TempalteWindVaneWebviewClientForTPL init");
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            o.a("WindVaneWebView", "TempalteWindVaneWebviewClientForTPL preLoadTemplate onPageFinished: ");
            if (!this.f10647k) {
                if (!str.contains("wfr=1")) {
                    if (this.f10641c != null) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("id", this.f10639a);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("result", 1);
                            jSONObject2.put("error", "");
                            jSONObject.put("data", jSONObject2);
                            com.anythink.expressad.atsignalcommon.windvane.j.a();
                            com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f10641c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        } catch (Exception e10) {
                            if (com.anythink.expressad.a.f6552a) {
                                o.d("WindVaneWebView", e10.getLocalizedMessage());
                            }
                        }
                    }
                    com.anythink.expressad.videocommon.b.l.a().c(this.f + "_" + this.f10646j + "_" + this.f10642e, true);
                    a.C0140a c0140a = this.f10643g;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    String str2 = this.f + "_" + this.f10644h.aZ() + "_" + this.f10644h.Z() + "_" + this.f10642e;
                    if (this.f10640b) {
                        if (this.f10644h.A()) {
                            o.a("WindVaneWebView", "Tempalte put templeteCache in bidIVCache ");
                            com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU, this.f10644h.aa(), this.f10643g);
                        } else {
                            o.a("WindVaneWebView", "Tempalte put templeteCache in iVCache ");
                            com.anythink.expressad.videocommon.a.a(str2, this.f10643g, false, this.f10645i);
                        }
                    } else if (this.f10644h.A()) {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in bidRVCache ");
                        com.anythink.expressad.videocommon.a.a(94, this.f10644h.aa(), this.f10643g);
                    } else {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in rVCache ");
                        com.anythink.expressad.videocommon.a.a(str2, this.f10643g, false, this.f10645i);
                    }
                }
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.b(webView);
                this.f10647k = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            o.a("WindVaneWebView", "TempalteWindVaneWebviewClientForTPL preLoadTemplate onReceivedError: ".concat(String.valueOf(str)));
            com.anythink.expressad.videocommon.b.l.a().c(this.f + "_" + this.f10646j + "_" + this.f10642e, false);
            a.C0140a c0140a = this.f10643g;
            if (c0140a != null) {
                c0140a.a(false);
            }
            if (this.f10641c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f10639a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.anythink.expressad.atsignalcommon.windvane.j.a();
                    com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f10641c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (com.anythink.expressad.a.f6552a) {
                        o.d("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            a3.l.u(i10, "收到大模板 播放模板 readyState 回调: ", "RewardCampaignsResourceManager_test");
            if (!this.f10648l) {
                if (this.f10641c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f10639a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", i10);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) this.f10641c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f6552a) {
                            o.d("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                String str = this.f + "_" + this.f10644h.aZ() + "_" + this.f10644h.Z() + "_" + this.f10642e;
                if (i10 == 1) {
                    com.anythink.expressad.videocommon.b.l.a().c(this.f + "_" + this.f10646j + "_" + this.f10642e, true);
                    a.C0140a c0140a = this.f10643g;
                    if (c0140a != null) {
                        c0140a.a(true);
                    }
                    if (this.f10640b) {
                        if (this.f10644h.A()) {
                            o.a("WindVaneWebView", "Tempalte put templeteCache in bidIVCache ");
                            com.anythink.expressad.videocommon.a.a(str, this.f10643g, false, this.f10645i);
                        } else {
                            o.a("WindVaneWebView", "Tempalte put templeteCache in iVCache ");
                            com.anythink.expressad.videocommon.a.a(str, this.f10643g, false, this.f10645i);
                        }
                    } else if (this.f10644h.A()) {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in bidRVCache ");
                        com.anythink.expressad.videocommon.a.a(str, this.f10643g, false, this.f10645i);
                    } else {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in rVCache ");
                        com.anythink.expressad.videocommon.a.a(str, this.f10643g, false, this.f10645i);
                    }
                } else {
                    com.anythink.expressad.videocommon.b.l.a().c(this.f + "_" + this.f10646j + "_" + this.f10642e, false);
                    a.C0140a c0140a2 = this.f10643g;
                    if (c0140a2 != null) {
                        c0140a2.a(false);
                    }
                }
                this.f10648l = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        private static final c f10649a = new c(0);

        private m() {
        }
    }

    public /* synthetic */ c(byte b10) {
        this();
    }

    private static String c(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            o.d(f10508a, "code to string is error");
            return "";
        }
    }

    private synchronized WindVaneWebView d() {
        return null;
    }

    private c() {
        this.f10525t = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f10509d = new HashMap();
        handlerThread.start();
        this.f10522b = new h(handlerThread.getLooper());
        this.f10523c = new ConcurrentHashMap<>();
    }

    public static c a() {
        return m.f10649a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized String b(int i10) {
        synchronized (c.class) {
            return i10 != 200 ? i10 != 201 ? i10 != f10516m ? i10 != f10519q ? "unknown" : "tpl" : "temp" : "zip/html" : "video";
        }
    }

    public final synchronized void a(final Context context, boolean z10, int i10, boolean z11, final int i11, final String str, final String str2, final String str3, final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList, InterfaceC0126c interfaceC0126c, final i iVar) {
        String str4 = str2 + "_" + str3;
        f10509d.put(str4, new a(z10, z11, i10, copyOnWriteArrayList.size(), str2, str3, i11, copyOnWriteArrayList));
        this.f10522b.a(str2, str3, interfaceC0126c);
        this.f10522b.a(context);
        this.f10522b.a(str4, copyOnWriteArrayList);
        this.f10522b.post(new Runnable() { // from class: com.anythink.expressad.reward.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:132:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0160  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x017b  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01e5  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x028a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 740
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.a.c.AnonymousClass1.run():void");
            }
        });
    }

    private synchronized void c() {
    }

    /* loaded from: classes.dex */
    public static final class e implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10583a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10584b = 1;

        /* renamed from: c, reason: collision with root package name */
        private Handler f10585c;

        /* renamed from: d, reason: collision with root package name */
        private int f10586d;

        /* renamed from: e, reason: collision with root package name */
        private String f10587e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f10588g;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10589h;

        public e(Handler handler, int i10, String str, String str2, String str3, com.anythink.expressad.foundation.d.c cVar) {
            this.f10585c = handler;
            this.f10586d = i10;
            this.f = str;
            this.f10587e = str2;
            this.f10588g = str3;
            this.f10589h = cVar;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            com.anythink.expressad.videocommon.b.l.a();
            com.anythink.expressad.videocommon.b.l.c(str);
            Message obtain = Message.obtain();
            obtain.what = this.f10586d == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f10587e);
            bundle.putString(com.anythink.expressad.a.y, this.f);
            bundle.putString("request_id", this.f10588g);
            obtain.setData(bundle);
            this.f10585c.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.f10586d == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f10587e);
            bundle.putString(com.anythink.expressad.a.y, this.f);
            bundle.putString("request_id", this.f10588g);
            obtain.setData(bundle);
            this.f10585c.sendMessage(obtain);
        }
    }

    private void a(Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.c cVar, String str4, i iVar, List<com.anythink.expressad.foundation.d.c> list) {
        if (TextUtils.isEmpty(str4) || cVar.H()) {
            return;
        }
        if (str4.contains(".zip") && str4.contains(com.anythink.expressad.videocommon.b.m.f12391b)) {
            boolean isEmpty = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().c(str4));
            try {
                g gVar = new g(context, str, str2, str3, cVar, 497, this.f10522b, iVar, list);
                gVar.a(isEmpty);
                com.anythink.expressad.videocommon.b.i.a().b(str4, (i.a) gVar);
                return;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.j.a().b(str4));
        try {
            d dVar = new d(497, str, str2, str3, cVar, iVar, this.f10522b, list);
            dVar.a(isEmpty2);
            com.anythink.expressad.videocommon.b.i.a().b(str4, dVar);
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10508a, e11.getLocalizedMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements com.anythink.expressad.videocommon.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f10590a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10591b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10592c;

        /* renamed from: d, reason: collision with root package name */
        private final String f10593d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f10590a = handler;
            this.f10592c = str;
            this.f10591b = str2;
            this.f10593d = str3;
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str, String str2) {
            StringBuilder s10 = a3.l.s("Video 下载失败： ", str, " ");
            s10.append(this.f10593d);
            o.d(c.f10508a, s10.toString());
            com.anythink.expressad.videocommon.b.l.a().a(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f10591b);
            bundle.putString(com.anythink.expressad.a.y, this.f10592c);
            bundle.putString("request_id", this.f10593d);
            bundle.putString("url", str2);
            bundle.putString(CrashHianalyticsData.MESSAGE, str);
            obtain.setData(bundle);
            this.f10590a.sendMessage(obtain);
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str) {
            o.d(c.f10508a, "Video 下载成功: " + this.f10593d);
            com.anythink.expressad.videocommon.b.l.a().a(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString("unit_id", this.f10591b);
            bundle.putString(com.anythink.expressad.a.y, this.f10592c);
            bundle.putString("request_id", this.f10593d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f10590a.sendMessage(obtain);
        }
    }

    public final synchronized void a(Context context, com.anythink.expressad.foundation.d.c cVar, final String str, final String str2, final String str3, final i iVar) {
        this.f10522b.a(context);
        if (cVar != null) {
            String ar = cVar.ar();
            if (cVar.j()) {
                com.anythink.expressad.videocommon.b.l.a().b(ar, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString("unit_id", str2);
                bundle.putString(com.anythink.expressad.a.y, str);
                bundle.putString("request_id", str3);
                bundle.putString("url", ar);
                obtain.setData(bundle);
                this.f10522b.sendMessage(obtain);
                iVar.a(str, str2, str3);
                return;
            }
        }
        if (cVar != null && !TextUtils.isEmpty(cVar.ar())) {
            try {
                com.anythink.expressad.videocommon.b.i.a().b(cVar.ar(), (i.a) new i.d() { // from class: com.anythink.expressad.reward.a.c.2
                    @Override // com.anythink.expressad.videocommon.b.i.a
                    public final void a(String str4) {
                        try {
                            o.a(c.f10508a, "zip btl template download success");
                            com.anythink.expressad.videocommon.b.l.a().b(str4, true);
                            Message obtain2 = Message.obtain();
                            obtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("unit_id", str2);
                            bundle2.putString(com.anythink.expressad.a.y, str);
                            bundle2.putString("request_id", str3);
                            bundle2.putString("url", str4);
                            obtain2.setData(bundle2);
                            c.this.f10522b.sendMessage(obtain2);
                            i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.a(str, str2, str3);
                            }
                        } catch (Exception e10) {
                            com.anythink.expressad.videocommon.b.l.a().b(str4, false);
                            Message obtain3 = Message.obtain();
                            obtain3.what = c.f10519q;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("unit_id", str2);
                            bundle3.putString(com.anythink.expressad.a.y, str);
                            bundle3.putString("request_id", str3);
                            bundle3.putString("url", str4);
                            obtain3.setData(bundle3);
                            c.this.f10522b.sendMessage(obtain3);
                            i iVar3 = iVar;
                            if (iVar3 != null) {
                                String str5 = str2;
                                String str6 = str3;
                                e10.getLocalizedMessage();
                                iVar3.a(str5, str6);
                            }
                        }
                    }

                    @Override // com.anythink.expressad.videocommon.b.i.a
                    public final void a(String str4, String str5) {
                        o.a(c.f10508a, "zip btl template download failed");
                        try {
                            com.anythink.expressad.videocommon.b.l.a().b(str5, false);
                            Message obtain2 = Message.obtain();
                            obtain2.what = c.f10519q;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("unit_id", str2);
                            bundle2.putString(com.anythink.expressad.a.y, str);
                            bundle2.putString("request_id", str3);
                            bundle2.putString("url", str5);
                            bundle2.putString(CrashHianalyticsData.MESSAGE, str4);
                            obtain2.setData(bundle2);
                            c.this.f10522b.sendMessage(obtain2);
                            i iVar2 = iVar;
                            if (iVar2 != null) {
                                iVar2.a(str2, str3);
                            }
                        } catch (Exception e10) {
                            com.anythink.expressad.videocommon.b.l.a().b(str5, false);
                            Message obtain3 = Message.obtain();
                            obtain3.what = 105;
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("unit_id", str2);
                            bundle3.putString(com.anythink.expressad.a.y, str);
                            bundle3.putString("request_id", str3);
                            bundle3.putString("url", str5);
                            bundle3.putString(CrashHianalyticsData.MESSAGE, e10.getMessage());
                            obtain3.setData(bundle3);
                            c.this.f10522b.sendMessage(obtain3);
                            i iVar3 = iVar;
                            if (iVar3 != null) {
                                iVar3.a(str2, str3);
                            }
                            if (com.anythink.expressad.a.f6552a) {
                                o.d(c.f10508a, e10.getLocalizedMessage());
                            }
                        }
                    }
                });
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e10.getLocalizedMessage());
                }
            }
        }
    }

    public final synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, com.anythink.expressad.foundation.d.c cVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList, String str2, String str3, String str4, String str5, com.anythink.expressad.videocommon.e.d dVar, j jVar) {
        String str6;
        WindVaneWebView windVaneWebView2;
        com.anythink.expressad.video.signal.a.j jVar2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            if (t.e(str)) {
                jVar.a(str5);
                return;
            }
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView d10 = m.f10649a.d();
            if (d10 == null) {
                try {
                    windVaneWebView2 = new WindVaneWebView(n.a().g());
                } catch (Exception unused) {
                    c0140a.a(true);
                    com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str5 + "_" + str, true);
                    jVar.a(str5);
                    return;
                } catch (Throwable unused2) {
                    c0140a.a(true);
                    com.anythink.expressad.videocommon.b.l.a().c(str4 + "_" + str5 + "_" + str, true);
                    jVar.a(str5);
                    return;
                }
            } else {
                windVaneWebView2 = d10;
            }
            c0140a.a(windVaneWebView2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, cVar, copyOnWriteArrayList);
            } else {
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar3 = jVar2;
            jVar3.a(i10);
            jVar3.a(str4);
            jVar3.a(dVar);
            jVar3.b(z10);
            WindVaneWebView windVaneWebView3 = windVaneWebView2;
            try {
                windVaneWebView3.setWebViewListener(new k(handler, null, z11, z12, str5, jVar, windVaneWebView, str, str3, str4, c0140a, cVar, copyOnWriteArrayList, currentTimeMillis));
                windVaneWebView3.setObject(jVar3);
                windVaneWebView3.loadUrl(str2);
                str6 = str5;
            } catch (Exception e10) {
                e = e10;
                str6 = str5;
            }
            try {
                windVaneWebView3.setRid(str6);
            } catch (Exception e11) {
                e = e11;
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e.getLocalizedMessage());
                }
                jVar.a(str6, e.getLocalizedMessage());
            }
        } catch (Exception e12) {
            e = e12;
            str6 = str5;
        }
    }

    public final synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, int i10, com.anythink.expressad.foundation.d.c cVar, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList, String str5, String str6, com.anythink.expressad.videocommon.e.d dVar, j jVar) {
        String str7;
        WindVaneWebView windVaneWebView;
        String b10;
        String b11;
        com.anythink.expressad.video.signal.a.j jVar2;
        this.f10524e = false;
        long currentTimeMillis = System.currentTimeMillis();
        this.f10524e = false;
        if (t.e(str4)) {
            jVar.a(str);
            return;
        }
        try {
            o.a(f10508a, "开始预加载大模板资源");
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView d10 = m.f10649a.d();
            if (d10 == null) {
                d10 = new WindVaneWebView(n.a().g());
            }
            windVaneWebView = d10;
            c0140a.a(windVaneWebView);
            com.anythink.expressad.video.bt.a.c.a();
            b10 = com.anythink.expressad.video.bt.a.c.b();
            com.anythink.expressad.video.bt.a.c.a();
            b11 = com.anythink.expressad.video.bt.a.c.b();
            c0140a.a(b11);
            o.a(f10508a, "preload BT wraper.setTag ".concat(String.valueOf(b11)));
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                List<com.anythink.expressad.foundation.d.c> a10 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a10 != null && a10.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        com.anythink.expressad.foundation.d.c cVar2 = copyOnWriteArrayList.get(i11);
                        for (com.anythink.expressad.foundation.d.c cVar3 : a10) {
                            List<com.anythink.expressad.foundation.d.c> list = a10;
                            if (cVar3.aZ().equals(cVar2.aZ()) && cVar3.Z().equals(cVar2.Z())) {
                                o.a(f10508a, "设置 Campaign 的 isReady： true");
                                cVar2.au();
                                copyOnWriteArrayList.set(i11, cVar2);
                            }
                            a10 = list;
                        }
                    }
                }
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, cVar, copyOnWriteArrayList);
            } else {
                jVar2 = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar3 = jVar2;
            jVar3.a(i10);
            jVar3.a(str6);
            jVar3.c(b11);
            jVar3.d(b10);
            jVar3.p();
            jVar3.a(dVar);
            jVar3.b(z10);
            try {
                windVaneWebView.setWebViewListener(new b(z10, handler, null, z11, z12, i10, str4, str2, str3, str, c0140a, cVar, copyOnWriteArrayList, dVar, jVar, currentTimeMillis));
                windVaneWebView.setObject(jVar3);
                windVaneWebView.loadUrl(str5);
                str7 = str;
            } catch (Exception e10) {
                e = e10;
                str7 = str;
            }
        } catch (Exception e11) {
            e = e11;
            str7 = str;
        }
        try {
            windVaneWebView.setRid(str7);
            AnythinkBTRootLayout anythinkBTRootLayout = new AnythinkBTRootLayout(n.a().g());
            anythinkBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTRootLayout.setInstanceId(b10);
            anythinkBTRootLayout.setUnitId(str3);
            AnythinkBTLayout anythinkBTLayout = new AnythinkBTLayout(n.a().g());
            anythinkBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            anythinkBTLayout.setInstanceId(b11);
            anythinkBTLayout.setUnitId(str3);
            anythinkBTLayout.setWebView(windVaneWebView);
            AbstractMap b12 = com.anythink.expressad.video.bt.a.c.a().b(str3, str7);
            b12.put(b11, anythinkBTLayout);
            b12.put(b10, anythinkBTRootLayout);
            anythinkBTRootLayout.addView(anythinkBTLayout, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e12) {
            e = e12;
            jVar.a(str7, e.getMessage());
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10508a, e.getLocalizedMessage());
            }
        }
    }

    private void a(boolean z10, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list, com.anythink.expressad.videocommon.e.d dVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (cVar != null && dVar != null && cVar.M() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(cVar.M().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f6552a) {
                            o.d(f10508a, e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(cVar.M().e()) && cVar.M().e().contains(com.anythink.expressad.foundation.d.c.f9463d)) {
                    o.a(f10508a, "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass3(z10, windVaneWebView, cVar, list, str, dVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e11.getLocalizedMessage());
                }
            }
        }
    }

    private static void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar, String str4, boolean z11) {
        com.anythink.expressad.video.signal.a.j jVar;
        String Z;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView d10 = m.f10649a.d();
            if (d10 == null) {
                d10 = new WindVaneWebView(n.a().g());
            }
            WindVaneWebView windVaneWebView2 = d10;
            c0140a.a(windVaneWebView2);
            if (list != null && list.size() > 0) {
                List<com.anythink.expressad.foundation.d.c> a10 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a10 != null && a10.size() > 0) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        com.anythink.expressad.foundation.d.c cVar2 = list.get(i11);
                        for (com.anythink.expressad.foundation.d.c cVar3 : a10) {
                            if (cVar3.aZ().equals(cVar2.aZ()) && cVar3.Z().equals(cVar2.Z())) {
                                cVar2.au();
                                list.set(i11, cVar2);
                            }
                        }
                    }
                }
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, list);
                Z = list.get(0).Z();
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
                Z = cVar.Z();
            }
            String str5 = Z;
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(i10);
            jVar2.a(str3);
            jVar2.c(str4);
            jVar2.a(dVar);
            jVar2.b(z10);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, c0140a, cVar, z11, str5));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10508a, e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void a(c cVar, Context context, String str, String str2, String str3, com.anythink.expressad.foundation.d.c cVar2, String str4, i iVar, List list) {
        if (TextUtils.isEmpty(str4) || cVar2.H()) {
            return;
        }
        if (str4.contains(".zip") && str4.contains(com.anythink.expressad.videocommon.b.m.f12391b)) {
            boolean isEmpty = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().c(str4));
            try {
                g gVar = new g(context, str, str2, str3, cVar2, 497, cVar.f10522b, iVar, list);
                gVar.a(isEmpty);
                com.anythink.expressad.videocommon.b.i.a().b(str4, (i.a) gVar);
                return;
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(com.anythink.expressad.videocommon.b.j.a().b(str4));
        try {
            d dVar = new d(497, str, str2, str3, cVar2, iVar, cVar.f10522b, list);
            dVar.a(isEmpty2);
            com.anythink.expressad.videocommon.b.i.a().b(str4, dVar);
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10508a, e11.getLocalizedMessage());
            }
        }
    }

    private static /* synthetic */ void a(c cVar, boolean z10, WindVaneWebView windVaneWebView, com.anythink.expressad.foundation.d.c cVar2, List list, com.anythink.expressad.videocommon.e.d dVar, String str, String str2, int i10) {
        if (windVaneWebView != null) {
            if (cVar2 != null && dVar != null && cVar2.M() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(cVar2.M().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.anythink.expressad.atsignalcommon.windvane.j.a();
                        com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (com.anythink.expressad.a.f6552a) {
                            o.d(f10508a, e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(cVar2.M().e()) && cVar2.M().e().contains(com.anythink.expressad.foundation.d.c.f9463d)) {
                    o.a(f10508a, "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new AnonymousClass3(z10, windVaneWebView, cVar2, list, str, dVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (com.anythink.expressad.a.f6552a) {
                    o.d(f10508a, e11.getLocalizedMessage());
                }
            }
        }
    }

    public static /* synthetic */ void a(boolean z10, WindVaneWebView windVaneWebView, String str, com.anythink.expressad.foundation.d.c cVar, List list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar, String str4, boolean z11) {
        com.anythink.expressad.video.signal.a.j jVar;
        String Z;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView d10 = m.f10649a.d();
            if (d10 == null) {
                d10 = new WindVaneWebView(n.a().g());
            }
            WindVaneWebView windVaneWebView2 = d10;
            c0140a.a(windVaneWebView2);
            if (list != null && list.size() > 0) {
                List<com.anythink.expressad.foundation.d.c> a10 = com.anythink.expressad.videocommon.b.e.a().a(str3);
                if (a10 != null && a10.size() > 0) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        com.anythink.expressad.foundation.d.c cVar2 = (com.anythink.expressad.foundation.d.c) list.get(i10);
                        for (com.anythink.expressad.foundation.d.c cVar3 : a10) {
                            if (cVar3.aZ().equals(cVar2.aZ()) && cVar3.Z().equals(cVar2.Z())) {
                                cVar2.au();
                                list.set(i10, cVar2);
                            }
                        }
                    }
                }
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, list);
                Z = ((com.anythink.expressad.foundation.d.c) list.get(0)).Z();
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
                Z = cVar.Z();
            }
            String str5 = Z;
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(0);
            jVar2.a(str3);
            jVar2.c(str4);
            jVar2.a(dVar);
            jVar2.b(z10);
            windVaneWebView2.setWebViewListener(new l(str4, windVaneWebView, str, str3, c0140a, cVar, z11, str5));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                o.d(f10508a, e10.getLocalizedMessage());
            }
        }
    }
}
