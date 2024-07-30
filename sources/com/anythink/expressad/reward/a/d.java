package com.anythink.expressad.reward.a;

import a3.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.common.b.n;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.d.r;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.t;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.reward.a.c;
import com.anythink.expressad.reward.a.e;
import com.anythink.expressad.reward.player.ATRewardVideoActivity;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.b.i;
import com.anythink.expressad.videocommon.b.l;
import com.anythink.expressad.videocommon.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d implements com.anythink.expressad.reward.a.a {
    private static final int L = 8;
    private static final int M = 9;
    private static final int N = 16;
    private static final int O = 17;
    private static final int P = 5000;
    private static final int Q = 30000;

    /* renamed from: a, reason: collision with root package name */
    public static final String f10650a = "APP ALREADY INSTALLED";

    /* renamed from: b, reason: collision with root package name */
    public static final String f10651b = "Offer list is empty";

    /* renamed from: d, reason: collision with root package name */
    public static final String f10652d = "1";

    /* renamed from: e, reason: collision with root package name */
    public static final String f10653e = "1";
    public static final int f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10654g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f10655h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final int f10656i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f10657j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f10658k = 6;

    /* renamed from: l, reason: collision with root package name */
    public static final int f10659l = 7;

    /* renamed from: u, reason: collision with root package name */
    private static final String f10660u = "RewardMVVideoAdapter";
    private int A;
    private int B;
    private boolean C;
    private String D;
    private String E;
    private com.anythink.expressad.video.bt.module.b.h F;
    private volatile com.anythink.expressad.reward.a.b G;
    private Runnable H;
    private com.anythink.expressad.videocommon.e.d I;
    private boolean T;
    private boolean U;
    private int W;
    private int X;
    private int Y;
    private com.anythink.expressad.foundation.d.d Z;

    /* renamed from: aa, reason: collision with root package name */
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f10661aa;
    private List<com.anythink.expressad.foundation.d.c> ag;
    private List<com.anythink.expressad.foundation.d.c> ah;

    /* renamed from: v, reason: collision with root package name */
    private Context f10673v;

    /* renamed from: w, reason: collision with root package name */
    private String f10674w;

    /* renamed from: x, reason: collision with root package name */
    private String f10675x;
    private int y;

    /* renamed from: z, reason: collision with root package name */
    private int f10676z;
    private boolean J = false;
    private boolean K = false;

    /* renamed from: c, reason: collision with root package name */
    public Object f10665c = new Object();
    private CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> R = new CopyOnWriteArrayList<>();
    private int S = 2;
    private String V = "";

    /* renamed from: ab, reason: collision with root package name */
    private boolean f10662ab = false;

    /* renamed from: m, reason: collision with root package name */
    public String f10666m = "";

    /* renamed from: n, reason: collision with root package name */
    public String f10667n = "";

    /* renamed from: ac, reason: collision with root package name */
    private long f10663ac = 0;

    /* renamed from: ad, reason: collision with root package name */
    private Handler f10664ad = new Handler(Looper.getMainLooper()) { // from class: com.anythink.expressad.reward.a.d.1
        /* JADX WARN: Removed duplicated region for block: B:103:0x0275 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:118:0x026e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01f9 A[Catch: Exception -> 0x0191, all -> 0x0520, TryCatch #0 {all -> 0x0520, blocks: (B:3:0x0008, B:14:0x0028, B:16:0x004e, B:18:0x005e, B:19:0x0067, B:21:0x006f, B:23:0x0075, B:29:0x008c, B:31:0x0094, B:33:0x00a6, B:35:0x00b2, B:38:0x00cb, B:40:0x00db, B:42:0x0100, B:46:0x0117, B:48:0x012e, B:49:0x0140, B:51:0x0146, B:53:0x0152, B:55:0x015e, B:56:0x0167, B:58:0x017a, B:60:0x0186, B:61:0x0191, B:63:0x0197, B:66:0x019f, B:70:0x01a9, B:72:0x01b7, B:74:0x01c1, B:76:0x01cb, B:78:0x01d9, B:80:0x01e1, B:82:0x01eb, B:84:0x01f9, B:87:0x0204, B:89:0x0230, B:92:0x0238, B:95:0x023e, B:98:0x024c, B:101:0x025c, B:119:0x026e, B:104:0x0275, B:109:0x0281, B:112:0x028b, B:134:0x0293, B:136:0x029b, B:138:0x02bc, B:140:0x02c8, B:142:0x02d1, B:144:0x02d5, B:146:0x02dd, B:147:0x02e6, B:149:0x02f4, B:152:0x0304, B:154:0x030c, B:156:0x0314, B:157:0x031d, B:159:0x032b, B:162:0x033b, B:164:0x0343, B:165:0x034c, B:167:0x0372, B:172:0x038c, B:174:0x0394, B:175:0x039d, B:177:0x03ba, B:181:0x03da, B:183:0x03e2, B:184:0x03f5, B:186:0x03fc, B:188:0x0420, B:191:0x0444, B:193:0x0449, B:195:0x046b, B:197:0x0471, B:204:0x047e, B:206:0x0489, B:210:0x048e, B:212:0x04ac, B:215:0x04b5, B:217:0x04bd, B:219:0x04c5, B:222:0x04d1, B:228:0x04df, B:230:0x04ea, B:233:0x04ee, B:235:0x04f6, B:237:0x0501, B:239:0x050d, B:241:0x051a), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0200  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r20) {
            /*
                Method dump skipped, instructions count: 1344
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.a.d.AnonymousClass1.handleMessage(android.os.Message):void");
        }
    };
    boolean o = false;
    private long ae = 0;

    /* renamed from: p, reason: collision with root package name */
    volatile boolean f10668p = false;

    /* renamed from: q, reason: collision with root package name */
    volatile boolean f10669q = false;

    /* renamed from: r, reason: collision with root package name */
    volatile boolean f10670r = false;

    /* renamed from: s, reason: collision with root package name */
    volatile boolean f10671s = false;

    /* renamed from: t, reason: collision with root package name */
    volatile boolean f10672t = false;
    private String af = "";

    /* renamed from: com.anythink.expressad.reward.a.d$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.d f10712a;

        public AnonymousClass5(com.anythink.expressad.foundation.d.d dVar) {
            this.f10712a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
            o.b(d.f10660u, "在子线程处理业务逻辑 开始");
            com.anythink.expressad.foundation.d.d dVar = this.f10712a;
            if (dVar != null && (arrayList = dVar.J) != null && arrayList.size() > 0) {
                d.a(d.this, this.f10712a.J);
            }
            o.b(d.f10660u, "在子线程处理业务逻辑 完成");
        }
    }

    /* loaded from: classes.dex */
    public static class a extends com.anythink.expressad.atsignalcommon.a.a {

        /* renamed from: b, reason: collision with root package name */
        private d f10714b;

        /* renamed from: c, reason: collision with root package name */
        private String f10715c;

        /* renamed from: d, reason: collision with root package name */
        private String f10716d;

        /* renamed from: e, reason: collision with root package name */
        private a.C0140a f10717e;
        private com.anythink.expressad.foundation.d.c f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f10718g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f10719h;

        /* renamed from: i, reason: collision with root package name */
        private g f10720i;

        /* renamed from: j, reason: collision with root package name */
        private Handler f10721j;

        public a(String str, String str2, a.C0140a c0140a, com.anythink.expressad.foundation.d.c cVar, d dVar, g gVar, Handler handler) {
            this.f10715c = str;
            this.f10716d = str2;
            this.f10717e = c0140a;
            if (dVar != null) {
                this.f10714b = dVar;
            }
            this.f = cVar;
            this.f10720i = gVar;
            this.f10721j = handler;
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final void a(String str, int i10, int i11) {
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f10718g) {
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.b(webView);
                this.f10718g = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            try {
                o.d("RVWindVaneWebView", "CampaignTPL TempalteWindVaneWebviewClient tempalte load failed");
                d dVar = this.f10714b;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d("RVWindVaneWebView", "CampaignTPL TempalteWindVaneWebviewClient tempalte load callback failed");
                        d.a(this.f10714b, str, str2);
                        this.f10714b = null;
                    }
                }
            } catch (Throwable th) {
                o.b("RVWindVaneWebView", th.getMessage(), th);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            Handler handler;
            if (!this.f10719h) {
                g gVar = this.f10720i;
                if (gVar != null && (handler = this.f10721j) != null) {
                    handler.removeCallbacks(gVar);
                }
                o.a("RVWindVaneWebView", "CampaignTPL templete preload readyState state = ".concat(String.valueOf(i10)));
                l.a().c(this.f10715c, true);
                a.C0140a c0140a = this.f10717e;
                if (c0140a != null) {
                    c0140a.a(true);
                }
                this.f10719h = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.a, com.anythink.expressad.atsignalcommon.windvane.c
        public final String a(String str) {
            return com.anythink.expressad.videocommon.b.i.a().c(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        private d f10724a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10725b;

        /* renamed from: c, reason: collision with root package name */
        private String f10726c;

        public c(d dVar, com.anythink.expressad.foundation.d.c cVar, String str) {
            this.f10724a = dVar;
            this.f10725b = cVar;
            this.f10726c = str;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }
    }

    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private String f10740b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10741c;

        /* renamed from: d, reason: collision with root package name */
        private String f10742d;

        /* renamed from: e, reason: collision with root package name */
        private String f10743e;
        private com.anythink.expressad.videocommon.e.d f;

        /* renamed from: g, reason: collision with root package name */
        private int f10744g;

        /* renamed from: h, reason: collision with root package name */
        private d f10745h;

        public g(String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar, int i10, d dVar2) {
            this.f10740b = str;
            this.f10741c = cVar;
            this.f10742d = str2;
            this.f10743e = str3;
            this.f = dVar;
            this.f10744g = i10;
            this.f10745h = dVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.video.signal.a.j jVar;
            try {
                o.b(d.f10660u, "retry load tpl url = " + this.f10742d);
                a.C0140a c0140a = new a.C0140a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(n.a().g());
                c0140a.a(windVaneWebView);
                com.anythink.expressad.video.bt.a.c.a();
                String b10 = com.anythink.expressad.video.bt.a.c.b();
                c0140a.a(b10);
                if (d.this.Z.J != null && d.this.Z.J.size() > 0) {
                    jVar = new com.anythink.expressad.video.signal.a.j(null, this.f10741c, d.this.Z.J);
                } else {
                    jVar = new com.anythink.expressad.video.signal.a.j(null, this.f10741c);
                }
                com.anythink.expressad.video.signal.a.j jVar2 = jVar;
                jVar2.a(this.f10744g);
                jVar2.a(this.f10743e);
                jVar2.c(b10);
                jVar2.a(this.f);
                jVar2.b(d.this.f10662ab);
                windVaneWebView.setWebViewListener(new a(this.f10742d, this.f10740b, c0140a, this.f10741c, this.f10745h, null, null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f10742d);
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            } catch (Throwable th) {
                o.a(d.f10660u, th.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private WindVaneWebView f10747b;

        /* renamed from: c, reason: collision with root package name */
        private String f10748c;

        /* renamed from: d, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10749d;

        /* renamed from: e, reason: collision with root package name */
        private List<com.anythink.expressad.foundation.d.c> f10750e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f10751g;

        /* renamed from: h, reason: collision with root package name */
        private com.anythink.expressad.videocommon.e.d f10752h;

        /* renamed from: i, reason: collision with root package name */
        private int f10753i;

        /* renamed from: j, reason: collision with root package name */
        private d f10754j;

        public h(WindVaneWebView windVaneWebView, String str, com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar, int i10, d dVar2) {
            this.f10747b = windVaneWebView;
            this.f10748c = str;
            this.f10749d = cVar;
            this.f10750e = list;
            this.f = str2;
            this.f10751g = str3;
            this.f10752h = dVar;
            this.f10753i = i10;
            this.f10754j = dVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.video.signal.a.j jVar;
            try {
                o.b(d.f10660u, "retry load template url = " + this.f);
                a.C0140a c0140a = new a.C0140a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(n.a().g());
                c0140a.a(windVaneWebView);
                List<com.anythink.expressad.foundation.d.c> list = this.f10750e;
                if (list != null && list.size() > 0) {
                    jVar = new com.anythink.expressad.video.signal.a.j(null, this.f10749d, this.f10750e);
                } else {
                    jVar = new com.anythink.expressad.video.signal.a.j(null, this.f10749d);
                }
                com.anythink.expressad.video.signal.a.j jVar2 = jVar;
                jVar2.a(this.f10753i);
                jVar2.a(this.f10751g);
                jVar2.a(this.f10752h);
                jVar2.b(d.this.f10662ab);
                windVaneWebView.setWebViewListener(new j(this.f10747b, this.f, this.f10748c, c0140a, this.f10749d, this.f10754j, null, null));
                windVaneWebView.setObject(jVar2);
                windVaneWebView.loadUrl(this.f);
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            } catch (Throwable th) {
                o.a(d.f10660u, th.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j extends com.anythink.expressad.atsignalcommon.a.b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10765a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10766b = 1;

        /* renamed from: c, reason: collision with root package name */
        private d f10767c;

        /* renamed from: e, reason: collision with root package name */
        private WindVaneWebView f10768e;
        private String f;

        /* renamed from: g, reason: collision with root package name */
        private String f10769g;

        /* renamed from: h, reason: collision with root package name */
        private a.C0140a f10770h;

        /* renamed from: i, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10771i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f10772j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f10773k;

        /* renamed from: l, reason: collision with root package name */
        private h f10774l;

        /* renamed from: m, reason: collision with root package name */
        private Handler f10775m;

        public j(WindVaneWebView windVaneWebView, String str, String str2, a.C0140a c0140a, com.anythink.expressad.foundation.d.c cVar, d dVar, h hVar, Handler handler) {
            this.f10768e = windVaneWebView;
            this.f = str;
            this.f10769g = str2;
            this.f10770h = c0140a;
            if (dVar != null) {
                this.f10767c = dVar;
            }
            this.f10771i = cVar;
            this.f10774l = hVar;
            this.f10775m = handler;
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f10772j) {
                com.anythink.expressad.atsignalcommon.windvane.j.a();
                com.anythink.expressad.atsignalcommon.windvane.j.b(webView);
                this.f10772j = true;
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            try {
                o.d("WindVaneWebView", "Tempalte TempalteWindVaneWebviewClient tempalte load failed");
                d dVar = this.f10767c;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d("WindVaneWebView", "Tempalte TempalteWindVaneWebviewClient tempalte load callback failed");
                        d.a(this.f10767c, str, str2);
                        this.f10767c = null;
                    }
                }
            } catch (Throwable th) {
                o.b("WindVaneWebView", th.getMessage(), th);
            }
        }

        @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
        public final void readyState(WebView webView, int i10) {
            Handler handler;
            if (!this.f10773k) {
                h hVar = this.f10774l;
                if (hVar != null && (handler = this.f10775m) != null) {
                    handler.removeCallbacks(hVar);
                }
                String str = this.f10769g + "_" + this.f;
                a.C0140a c0140a = this.f10770h;
                if (c0140a != null) {
                    c0140a.a(true);
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", 1);
                    jSONObject.put("id", str);
                    jSONObject.put("unitid", this.f10769g);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
                o.a("WindVaneWebView", "Tempalte templete preload readyState state = ".concat(String.valueOf(i10)));
                l.a().c(this.f, true);
                d dVar = this.f10767c;
                if (dVar != null && dVar.T) {
                    if (this.f10771i.A()) {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in bidIVCache ");
                        com.anythink.expressad.videocommon.a.a(com.anythink.expressad.foundation.g.a.aU, this.f10771i.aa(), this.f10770h);
                    } else {
                        o.a("WindVaneWebView", "Tempalte put templeteCache in iVCache ");
                    }
                } else if (this.f10771i.A()) {
                    o.a("WindVaneWebView", "Tempalte put templeteCache in bidRVCache ");
                    com.anythink.expressad.videocommon.a.a(94, this.f10771i.aa(), this.f10770h);
                } else {
                    o.a("WindVaneWebView", "Tempalte put templeteCache in rVCache ");
                }
                try {
                    o.d("WindVaneWebView", "Tempalte TempalteWindVaneWebviewClient tempalte load SUCCESS ");
                    d dVar2 = this.f10767c;
                    if (dVar2 != null) {
                        synchronized (dVar2) {
                            o.d("WindVaneWebView", "Tempalte adapter 341");
                            d dVar3 = this.f10767c;
                            if (dVar3 != null && dVar3.c()) {
                                o.d("WindVaneWebView", "Tempalte TempalteWindVaneWebviewClient tempalte load  callback success");
                                if (this.f10767c.f10664ad != null) {
                                    Message obtain = Message.obtain();
                                    obtain.what = 6;
                                    o.a("WindVaneWebView", "WHAT_ON_RES_LOAD_SUCCESS Template");
                                    obtain.obj = this.f10771i;
                                    this.f10767c.f10664ad.sendMessage(obtain);
                                    this.f10767c.f10664ad.removeMessages(5);
                                    this.f10767c = null;
                                }
                            }
                        }
                    } else {
                        o.d("WindVaneWebView", "Tempalte TempalteWindVaneWebviewClient tempalte load SUCCESS  mRewardMVVideoAdapter is null");
                    }
                } catch (Throwable th) {
                    o.b("WindVaneWebView", th.getMessage(), th);
                }
                this.f10773k = true;
            }
        }
    }

    public d(Context context, String str, String str2) {
        try {
            this.f10673v = context.getApplicationContext();
            this.f10674w = str2;
            this.f10675x = str;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void i() {
    }

    private static void j() {
    }

    private static void l() {
    }

    private static void m() {
    }

    private static void n() {
    }

    private static void o() {
    }

    private static void p() {
    }

    private void r() {
        try {
            if (w.b(this.f10674w)) {
                com.anythink.expressad.reward.b.a.a(this.f10674w, 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static String s() {
        try {
            if (!w.b(com.anythink.expressad.reward.b.a.f10780b)) {
                return "";
            }
            return com.anythink.expressad.reward.b.a.f10780b;
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static String t() {
        return "";
    }

    private static void u() {
        try {
            Map<String, Long> map = com.anythink.expressad.foundation.g.a.f.f9819h;
            if (map != null && map.size() > 0) {
                com.anythink.expressad.foundation.g.a.f.f9819h.clear();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.reward.a.a
    public final boolean a() {
        return false;
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void b() {
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void d() {
    }

    /* renamed from: com.anythink.expressad.reward.a.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130d implements i.b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10727a;

        /* renamed from: b, reason: collision with root package name */
        private String f10728b;

        /* renamed from: c, reason: collision with root package name */
        private com.anythink.expressad.videocommon.e.d f10729c;

        /* renamed from: d, reason: collision with root package name */
        private d f10730d;

        public C0130d(d dVar, com.anythink.expressad.foundation.d.c cVar, String str, com.anythink.expressad.videocommon.e.d dVar2) {
            this.f10727a = cVar;
            this.f10728b = str;
            this.f10729c = dVar2;
            this.f10730d = dVar;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            d dVar = this.f10730d;
            if (dVar != null) {
                dVar.a(this.f10727a, str, this.f10728b, this.f10729c);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            d dVar = this.f10730d;
            if (dVar != null) {
                d.a(dVar, "TemplateUrl source download failed", str);
            }
        }
    }

    private void g() {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.R;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        this.R.clear();
    }

    private int h() {
        return this.S;
    }

    private void k() {
        Handler handler = this.f10664ad;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    private int q() {
        try {
            int a10 = w.b(this.f10674w) ? com.anythink.expressad.reward.b.a.a(this.f10674w) : 0;
            com.anythink.expressad.videocommon.e.d dVar = this.I;
            if (dVar == null) {
                return 0;
            }
            if (a10 > dVar.D()) {
                return 0;
            }
            return a10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final String c(boolean z10) {
        List<com.anythink.expressad.foundation.d.c> a10;
        com.anythink.expressad.foundation.d.c cVar;
        if (z10) {
            if (TextUtils.isEmpty(this.f10667n) && (a10 = com.anythink.expressad.videocommon.b.e.a().a(this.f10674w)) != null && a10.size() > 0 && (cVar = a10.get(0)) != null) {
                this.f10667n = cVar.Z();
            }
            return this.f10667n;
        }
        return this.f10666m;
    }

    public final String e() {
        return this.f10674w;
    }

    public final boolean f(boolean z10) {
        if (z10) {
            List<com.anythink.expressad.foundation.d.c> list = this.ah;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (com.anythink.expressad.foundation.d.c cVar : this.ah) {
                if (cVar != null) {
                    cVar.l(1);
                    if (cVar.M() != null && !TextUtils.isEmpty(cVar.M().e())) {
                        l.a().c(this.f10674w + "_" + cVar.Z() + "_" + cVar.M().e(), true);
                    }
                }
            }
            return true;
        }
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        Iterator<com.anythink.expressad.foundation.d.c> it = this.f10661aa.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.c next = it.next();
            if (next != null) {
                next.l(1);
                if (next.M() != null && !TextUtils.isEmpty(next.M().e())) {
                    l.a().c(this.f10674w + "_" + next.Z() + "_" + next.M().e(), true);
                }
            }
        }
        return true;
    }

    private void h(List<com.anythink.expressad.foundation.d.c> list) {
        this.ah = list;
    }

    public final void b(boolean z10) {
        this.U = z10;
    }

    public final void d(boolean z10) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList;
        if (z10 || (copyOnWriteArrayList = this.f10661aa) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.anythink.expressad.videocommon.a.a.a();
    }

    public final void e(boolean z10) {
        if (z10) {
            List<com.anythink.expressad.foundation.d.c> list = this.ah;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (com.anythink.expressad.foundation.d.c cVar : this.ah) {
                if (cVar != null) {
                    cVar.l(0);
                    if (cVar.M() != null && !TextUtils.isEmpty(cVar.M().e())) {
                        l.a().c(this.f10674w + "_" + cVar.Z() + "_" + cVar.M().e(), false);
                    }
                }
            }
            return;
        }
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        Iterator<com.anythink.expressad.foundation.d.c> it = this.f10661aa.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.c next = it.next();
            if (next != null) {
                next.l(0);
                if (next.M() != null && !TextUtils.isEmpty(next.M().e())) {
                    l.a().c(this.f10674w + "_" + next.Z() + "_" + next.M().e(), false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<com.anythink.expressad.foundation.d.c> list, boolean z10, int i10) {
        if (list != null && list.size() > 0) {
            com.anythink.expressad.foundation.d.c cVar = list.get(0);
            if (com.anythink.expressad.videocommon.b.e.a().b(this.f10674w, this.U, list.size(), z10, i10, list)) {
                if (z10) {
                    if (cVar.j()) {
                        return true;
                    }
                    if (cVar.aB() != null && cVar.aB().size() > 0) {
                        if (cVar.aB().contains(3)) {
                            o.b(f10660u, "Is not check big template download status");
                            return true;
                        }
                        if (cVar.ar().equals(cVar.I()) && cVar.aB().contains(2)) {
                            o.b(f10660u, "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (l.a().d(this.f10674w + "_" + cVar.Z() + "_" + cVar.ar())) {
                        o.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (cVar != null && cVar.j()) {
                        return true;
                    }
                    if (cVar.aB() != null && cVar.aB().size() > 0 && cVar.aB().contains(1)) {
                        o.b(f10660u, "Is not check template download status");
                        return true;
                    }
                    if (cVar.M() != null && !TextUtils.isEmpty(cVar.M().e())) {
                        if (l.a().d(this.f10674w + "_" + cVar.Z() + "_" + cVar.M().e())) {
                            o.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        o.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            o.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    private void g(List<com.anythink.expressad.foundation.d.c> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.y += list.size();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        com.anythink.expressad.videocommon.e.d dVar = this.I;
        if (dVar == null || this.y > dVar.D()) {
            o.b(f10660u, "onload 重置offset为0");
            this.y = 0;
        }
        o.b(f10660u, "onload 算出 下次的offset是:" + this.y);
        if (w.b(this.f10674w)) {
            com.anythink.expressad.reward.b.a.a(this.f10674w, this.y);
        }
    }

    private void d(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null || TextUtils.isEmpty(cVar.ar())) {
            return;
        }
        String ar = cVar.ar();
        com.anythink.expressad.videocommon.b.i.a().b(ar, (i.a) new i(cVar, this, this.f10674w, 502, this.I, TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().c(ar))));
    }

    public final void a(boolean z10) {
        this.T = z10;
    }

    private void a(String str) {
        this.V = str;
    }

    /* loaded from: classes.dex */
    public static final class f implements i.b {

        /* renamed from: a, reason: collision with root package name */
        private d f10734a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10735b;

        /* renamed from: c, reason: collision with root package name */
        private long f10736c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private String f10737d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f10738e;

        public f(d dVar, com.anythink.expressad.foundation.d.c cVar, String str, boolean z10) {
            this.f10738e = true;
            this.f10737d = str;
            this.f10734a = dVar;
            this.f10735b = cVar;
            this.f10738e = z10;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            try {
                if (this.f10734a.f10664ad != null) {
                    o.d(d.f10660u, "H5SourceDownloadListener 源码下载成功 cid:" + this.f10735b.aZ() + "  url:" + str);
                    this.f10734a.f10664ad.removeMessages(5);
                    Message obtain = Message.obtain();
                    obtain.what = 8;
                    obtain.obj = this.f10735b;
                    this.f10734a.f10664ad.sendMessage(obtain);
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            try {
                o.d(d.f10660u, "H5SourceDownloadListener 源码下载失败 cid:" + this.f10735b.aZ() + "  url:" + str);
                d dVar = this.f10734a;
                if (dVar != null) {
                    d.a(dVar, "H5 code resource download failed ", str);
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }
    }

    public final void a(int i10) {
        this.S = i10;
    }

    private void a(String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar) {
        com.anythink.expressad.video.signal.a.j jVar;
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(n.a().g());
            c0140a.a(windVaneWebView);
            com.anythink.expressad.video.bt.a.c.a();
            String b10 = com.anythink.expressad.video.bt.a.c.b();
            c0140a.a(b10);
            com.anythink.expressad.foundation.d.d dVar2 = this.Z;
            if (dVar2 != null && (arrayList = dVar2.J) != null && arrayList.size() > 0) {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, this.Z.J);
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(this.S);
            jVar2.a(str3);
            jVar2.c(b10);
            jVar2.a(dVar);
            jVar2.b(this.f10662ab);
            g gVar = new g(str3, cVar, str2, str3, dVar, this.S, this);
            windVaneWebView.setWebViewListener(new a(str, str3, c0140a, cVar, this, gVar, this.f10664ad));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str2);
            this.f10664ad.postDelayed(gVar, com.anythink.expressad.exoplayer.f.f7962a);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            o.a(f10660u, th.getMessage());
        }
    }

    @Override // com.anythink.expressad.reward.a.a
    public final boolean c() {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return false;
        }
        return b(this.f10661aa, !TextUtils.isEmpty(r0.ar()), this.f10661aa.get(0).ap());
    }

    private void d(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (!TextUtils.isEmpty(cVar.bd())) {
                k.f().a(cVar.bd(), new c(this, cVar, this.f10674w));
            }
            if (!TextUtils.isEmpty(cVar.be())) {
                k.f().a(cVar.be(), new c(this, cVar, this.f10674w));
            }
        }
    }

    private void f(List<com.anythink.expressad.foundation.d.c> list) {
        try {
            o.b(f10660u, "===准备下载");
            if (list != null && list.size() > 0) {
                o.b(f10660u, "onload 开始下载视频素材 size:" + list.size());
                this.R.clear();
                this.R.addAll(list);
                l.a().a(list);
                if (com.anythink.expressad.videocommon.b.e.a() != null) {
                    com.anythink.expressad.videocommon.b.e.a().a(this.f10674w, list, 94, new b(this, list.get(0)));
                    com.anythink.expressad.videocommon.b.e.a().d(this.f10674w);
                    return;
                }
                return;
            }
            o.b(f10660u, "onload 不用下载视频素材 size为0");
        } catch (Exception e10) {
            o.b(f10660u, e10.getMessage(), e10);
        }
    }

    /* renamed from: com.anythink.expressad.reward.a.d$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass4 implements c.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f10704b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10705c;

        public AnonymousClass4(com.anythink.expressad.foundation.d.c cVar, boolean z10, int i10) {
            this.f10703a = cVar;
            this.f10704b = z10;
            this.f10705c = i10;
        }

        @Override // com.anythink.expressad.reward.a.c.i
        public final void a(final String str, final String str2, final String str3) {
            o.a(d.f10660u, "大模板业务，大模板下载成功");
            d.this.f10669q = true;
            if (d.this.f10668p && !d.this.f10670r && d.this.f10664ad != null) {
                o.a(d.f10660u, "大模板业务，大模板下载成功，Campaign 下载成功，开始预加载大模板");
                o.a("test_pre_load_tpl", "大模板下载成功，Campaign 下载成功，开始预加载大模板");
                synchronized (d.this.f10665c) {
                    if (d.this.f10670r) {
                        return;
                    }
                    d.this.f10670r = true;
                    d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.anythink.expressad.reward.a.c cVar = c.m.f10649a;
                            boolean z10 = d.this.f10662ab;
                            Handler handler = d.this.f10664ad;
                            boolean z11 = d.this.T;
                            boolean z12 = d.this.U;
                            String str4 = str3;
                            AnonymousClass4.this.f10703a.aa();
                            String str5 = str;
                            String str6 = str2;
                            String ar = AnonymousClass4.this.f10703a.ar();
                            int i10 = d.this.S;
                            AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                            cVar.a(z10, handler, z11, z12, str4, str5, str6, ar, i10, anonymousClass4.f10703a, d.this.f10661aa, com.anythink.expressad.videocommon.b.i.a().c(AnonymousClass4.this.f10703a.ar()), str2, d.this.I, new c.j() { // from class: com.anythink.expressad.reward.a.d.4.1.1
                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(String str7) {
                                    a3.l.C(str7, "模板加载成功 requestId ", "HBOPTIMIZE");
                                    d dVar = d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList = dVar.f10661aa;
                                    AnonymousClass4 anonymousClass42 = AnonymousClass4.this;
                                    if (dVar.a(copyOnWriteArrayList, anonymousClass42.f10704b, anonymousClass42.f10705c)) {
                                        o.a(d.f10660u, "大模板业务，大模板预加载成功，isReady true");
                                        String str8 = d.this.f10674w;
                                        List unused = d.this.ag;
                                        List list = d.this.ah;
                                        boolean unused2 = d.this.U;
                                        d.a(str8, list);
                                        if (d.this.f10664ad != null) {
                                            d.this.f10664ad.removeMessages(5);
                                        }
                                        if (d.this.G == null || d.this.f10671s) {
                                            return;
                                        }
                                        d.this.f10671s = true;
                                        TextUtils.isEmpty(d.this.f10674w);
                                        d.this.G.a();
                                        o.a(d.f10660u, "大模板业务，大模板预加载成功，isReady true onVideoLoadSuccess");
                                        return;
                                    }
                                    o.a(d.f10660u, "大模板业务，大模板预加载成功，isReady false");
                                    List unused3 = d.this.ag;
                                    boolean unused4 = d.this.U;
                                    if (d.this.f10664ad != null) {
                                        d.this.f10664ad.removeMessages(5);
                                    }
                                    if (d.this.G == null || d.this.f10672t) {
                                        return;
                                    }
                                    d.this.f10672t = true;
                                    d.this.G.a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                    o.a(d.f10660u, "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                                }

                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(String str7, String str8) {
                                    o.a(d.f10660u, "大模板业务，大模板预加载失败");
                                    o.d("HBOPTIMIZE", "模板加载失败 requestId ".concat(String.valueOf(str7)));
                                    List unused = d.this.ag;
                                    boolean unused2 = d.this.U;
                                    if (d.this.f10664ad != null) {
                                        d.this.f10664ad.removeMessages(5);
                                    }
                                    if (d.this.G == null || d.this.f10672t) {
                                        return;
                                    }
                                    d.this.f10672t = true;
                                    d.this.G.a("errorCode: 3303 errorMessage: tpl temp preload failed: ".concat(String.valueOf(str8)));
                                    o.a(d.f10660u, "大模板业务，大模板预加载失败 onVideoLoadFail");
                                }
                            });
                        }
                    });
                    return;
                }
            }
            o.a(d.f10660u, "大模板业务，大模板下载成功，Campaign 下载不成功，isCampaignsDownloadSuccess： " + d.this.f10668p + "  isCampaignTPLProLoad： " + d.this.f10670r);
        }

        @Override // com.anythink.expressad.reward.a.c.i
        public final void a(String str, String str2) {
            o.a(d.f10660u, "大模板业务，大模板下载失败");
            o.d("HBOPTIMIZE", "模板加载成功 requestId ".concat(String.valueOf(str2)));
            if (d.this.ag.get(0) != null) {
                d.this.ag.size();
            }
            if (this.f10703a.aB() != null && this.f10703a.aB().size() > 0) {
                if (this.f10703a.aB().contains(3)) {
                    o.b(d.f10660u, "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.f10703a.ar().equals(this.f10703a.I()) && this.f10703a.aB().contains(2)) {
                    o.b(d.f10660u, "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            d.this.f10669q = false;
            List unused = d.this.ag;
            boolean unused2 = d.this.U;
            if (d.this.f10664ad != null) {
                d.this.f10664ad.removeMessages(5);
            }
            if (d.this.G == null || d.this.f10672t) {
                return;
            }
            d.this.f10672t = true;
            d.this.G.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
            o.a(d.f10660u, "大模板业务，大模板下载失败 onVideoLoadFail");
        }
    }

    private void c(com.anythink.expressad.foundation.d.d dVar) {
        this.Z = dVar;
        o.a(f10660u, "Campaign 请求成功： " + dVar.J.size() + " 条");
        this.f10661aa = d(dVar);
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass5(dVar));
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            o.b(f10660u, "onload load成功 size:" + this.f10661aa.size());
            Handler handler = this.f10664ad;
            if (handler != null) {
                handler.sendEmptyMessage(3);
            }
            String c10 = dVar.c();
            if (w.b(c10)) {
                o.b(f10660u, "onload sessionId:".concat(String.valueOf(c10)));
                com.anythink.expressad.reward.b.a.f10780b = c10;
            }
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList2 = this.f10661aa;
            if (copyOnWriteArrayList2 != null) {
                try {
                    if (copyOnWriteArrayList2.size() > 0) {
                        this.y += copyOnWriteArrayList2.size();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            com.anythink.expressad.videocommon.e.d dVar2 = this.I;
            if (dVar2 == null || this.y > dVar2.D()) {
                o.b(f10660u, "onload 重置offset为0");
                this.y = 0;
            }
            o.b(f10660u, "onload 算出 下次的offset是:" + this.y);
            if (w.b(this.f10674w)) {
                com.anythink.expressad.reward.b.a.a(this.f10674w, this.y);
            }
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList3 = this.f10661aa;
            if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                o.b(f10660u, "#######onload 把广告存在本地 size:" + this.f10661aa.size());
            }
            final com.anythink.expressad.foundation.d.c cVar = this.f10661aa.get(0);
            final boolean z10 = !TextUtils.isEmpty(cVar.ar());
            final int ap = cVar.ap();
            this.f10668p = false;
            this.f10669q = false;
            synchronized (this.f10665c) {
                if (this.f10670r) {
                    this.f10670r = false;
                }
            }
            this.f10672t = false;
            this.f10671s = false;
            c.m.f10649a.a(this.f10673v, z10, ap, this.U, this.T ? com.anythink.expressad.foundation.g.a.aU : 94, this.f10675x, this.f10674w, cVar.Z(), this.f10661aa, new AnonymousClass2(z10, cVar, ap), new c.i() { // from class: com.anythink.expressad.reward.a.d.3
                @Override // com.anythink.expressad.reward.a.c.i
                public final void a(String str, String str2, String str3) {
                    o.a(d.f10660u, "template 下载成功： ");
                }

                @Override // com.anythink.expressad.reward.a.c.i
                public final void a(final String str, String str2) {
                    o.a(d.f10660u, "template 下载失败： ");
                    if (!z10 && d.this.G != null && d.this.f10664ad != null) {
                        o.a(d.f10660u, "播放模板下载失败，非大模板");
                        if (cVar.aB() == null || cVar.aB().size() <= 0 || !cVar.aB().contains(1)) {
                            d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    List unused = d.this.ag;
                                    boolean unused2 = d.this.U;
                                    if (d.this.f10664ad != null) {
                                        d.this.f10664ad.removeMessages(5);
                                    }
                                    if (!d.this.f10672t && d.this.G != null) {
                                        d.this.f10672t = true;
                                        d.this.G.a("errorCode: 3202 errorMessage: temp resource download failed");
                                        o.a(d.f10660u, "播放模板下载失败，非大模板 onVideoLoadFail");
                                    }
                                }
                            });
                            return;
                        } else {
                            o.b(d.f10660u, "template download fail but hit ignoreCheckRule");
                            return;
                        }
                    }
                    if (ap == 1) {
                        if (cVar.aB() != null && cVar.aB().size() > 0) {
                            if (cVar.aB().contains(3)) {
                                o.b(d.f10660u, "tpl download fail but hit ignoreCheckRule");
                                return;
                            } else if (cVar.ar().equals(cVar.I()) && cVar.aB().contains(2)) {
                                o.b(d.f10660u, "endcard download fail but hit ignoreCheckRule at 3203");
                                return;
                            }
                        }
                        if (d.this.G == null || d.this.f10664ad == null) {
                            return;
                        }
                        d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.3.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                List unused = d.this.ag;
                                boolean unused2 = d.this.U;
                                if (d.this.f10664ad != null) {
                                    d.this.f10664ad.removeMessages(5);
                                }
                                if (!d.this.f10672t && d.this.G != null) {
                                    d.this.f10672t = true;
                                    d.this.G.a("errorCode: 3203 errorMessage: tpl temp resource download failed");
                                    o.a(d.f10660u, "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
                                }
                            }
                        });
                    }
                }
            });
            if (z10) {
                c.m.f10649a.a(this.f10673v, cVar, this.f10675x, this.f10674w, cVar.Z(), new AnonymousClass4(cVar, z10, ap));
                return;
            }
            return;
        }
        o.b(f10660u, "onload load失败 返回的compaign 没有带视频素材");
        if (TextUtils.isEmpty(this.af)) {
            this.af = f10651b;
        }
        b(this.af);
    }

    private void e(List<com.anythink.expressad.foundation.d.c> list) {
        List<c.C0119c.a> f10;
        List<String> list2;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (com.anythink.expressad.foundation.d.c cVar : list) {
                        if (cVar.M() != null && cVar.M().f() != null && (f10 = cVar.M().f()) != null) {
                            for (c.C0119c.a aVar : f10) {
                                if (aVar != null && (list2 = aVar.f9536b) != null) {
                                    for (String str : list2) {
                                        if (w.b(str)) {
                                            com.anythink.expressad.foundation.g.d.b.a(n.a().g()).a(str, new e(this, cVar, this.f10674w));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f6552a) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        private d f10731a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10732b;

        /* renamed from: c, reason: collision with root package name */
        private String f10733c;

        public e(d dVar, com.anythink.expressad.foundation.d.c cVar, String str) {
            this.f10731a = dVar;
            this.f10732b = cVar;
            this.f10733c = str;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            try {
                l.a();
                l.c(str);
                o.d(d.f10660u, "DownTemplateImgCommonImageLoaderListener IMAGE SUCCESS".concat(String.valueOf(str)));
                d dVar = this.f10731a;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d(d.f10660u, "adapter 1433");
                        if (this.f10731a.c() && this.f10731a.f10664ad != null) {
                            Message obtain = Message.obtain();
                            o.a(d.f10660u, "WHAT_ON_RES_LOAD_SUCCESS DownTemplateImgCommonImageLoaderListener");
                            obtain.what = 6;
                            obtain.obj = this.f10732b;
                            this.f10731a.f10664ad.sendMessage(obtain);
                            this.f10731a.f10664ad.removeMessages(5);
                            this.f10731a = null;
                        }
                    }
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            try {
                d dVar = this.f10731a;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d(d.f10660u, "DownTemplateImgCommonImageLoaderListener IMAGE failed");
                        d.a(this.f10731a, str, str2);
                        this.f10731a = null;
                    }
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements com.anythink.expressad.videocommon.d.b {

        /* renamed from: a, reason: collision with root package name */
        private d f10722a;

        /* renamed from: b, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10723b;

        public b(d dVar, com.anythink.expressad.foundation.d.c cVar) {
            this.f10722a = dVar;
            this.f10723b = cVar;
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str) {
            try {
                l.a().a(str, true);
                o.d(d.f10660u, "CommonVideoDownloadListener VIDEO SUCCESS");
                d dVar = this.f10722a;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d(d.f10660u, "adapter 1613");
                        d dVar2 = this.f10722a;
                        if (dVar2 != null && dVar2.c()) {
                            o.d(d.f10660u, "CommonVideoDownloadListener VIDEO SUCCESS callback success");
                            if (this.f10722a.f10664ad != null) {
                                Message obtain = Message.obtain();
                                o.a(d.f10660u, "WHAT_ON_RES_LOAD_SUCCESS CommonVideoDownloadListener");
                                obtain.what = 6;
                                obtain.obj = this.f10723b;
                                this.f10722a.f10664ad.sendMessage(obtain);
                                this.f10722a.f10664ad.removeMessages(5);
                                this.f10722a = null;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }

        @Override // com.anythink.expressad.videocommon.d.b
        public final void a(String str, String str2) {
            try {
                d dVar = this.f10722a;
                if (dVar != null) {
                    synchronized (dVar) {
                        o.d(d.f10660u, "CommonVideoDownloadListener VIDEO failed");
                        d.a(this.f10722a, str, str2);
                        this.f10722a = null;
                    }
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }
    }

    private static void v() {
    }

    private static /* synthetic */ void w() {
    }

    private static /* synthetic */ void x() {
    }

    public final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> f() {
        return this.f10661aa;
    }

    private void b(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        try {
            this.Z = dVar;
            o.b(f10660u, "onLoadCompaginSuccess 数据刚请求回来");
            o.b("HBOPTIMIZE", "V3 数据刚请求回来 requestId " + this.Z.f());
            com.anythink.expressad.foundation.d.d dVar2 = this.Z;
            if (dVar2 != null && (arrayList = dVar2.J) != null) {
                arrayList.size();
            }
            c(this.Z);
            this.f10666m = this.Z.f();
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
            o.b(f10660u, "onLoadCompaginSuccess 数据刚请求失败");
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            List<com.anythink.expressad.foundation.d.c> list = this.ag;
            if (list != null) {
                list.clear();
            }
            this.f10668p = false;
            this.f10669q = false;
            synchronized (this.f10665c) {
                if (this.f10670r) {
                    this.f10670r = false;
                }
                this.f10672t = false;
                this.f10671s = false;
                b("exception after load success");
                r();
            }
        }
    }

    private void e(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.core.common.k.b.a.a().a(new AnonymousClass5(dVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x014a, code lost:
    
        if (com.anythink.expressad.foundation.h.w.a(r3.S()) != false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.concurrent.CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> d(com.anythink.expressad.foundation.d.d r10) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.reward.a.d.d(com.anythink.expressad.foundation.d.d):java.util.concurrent.CopyOnWriteArrayList");
    }

    private static boolean e(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            return cVar.J() == 2;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private void a(WindVaneWebView windVaneWebView, String str, com.anythink.expressad.foundation.d.c cVar, List<com.anythink.expressad.foundation.d.c> list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar) {
        com.anythink.expressad.video.signal.a.j jVar;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(n.a().g());
            c0140a.a(windVaneWebView2);
            if (list != null && list.size() > 0) {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, list);
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(this.S);
            jVar2.a(str3);
            jVar2.a(dVar);
            jVar2.b(this.f10662ab);
            h hVar = new h(windVaneWebView, str3, cVar, list, str2, str3, dVar, this.S, this);
            windVaneWebView2.setWebViewListener(new j(windVaneWebView, str, str3, c0140a, cVar, this, hVar, this.f10664ad));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            this.f10664ad.postDelayed(hVar, com.anythink.expressad.exoplayer.f.f7962a);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            o.a(f10660u, th.getMessage());
        }
    }

    /* loaded from: classes.dex */
    public static final class i implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f10755a = 497;

        /* renamed from: b, reason: collision with root package name */
        public static final int f10756b = 859;

        /* renamed from: c, reason: collision with root package name */
        public static final int f10757c = 313;

        /* renamed from: d, reason: collision with root package name */
        public static final int f10758d = 502;

        /* renamed from: e, reason: collision with root package name */
        private com.anythink.expressad.foundation.d.c f10759e;
        private d f;

        /* renamed from: g, reason: collision with root package name */
        private long f10760g = System.currentTimeMillis();

        /* renamed from: h, reason: collision with root package name */
        private String f10761h;

        /* renamed from: i, reason: collision with root package name */
        private int f10762i;

        /* renamed from: j, reason: collision with root package name */
        private com.anythink.expressad.videocommon.e.d f10763j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f10764k;

        public i(com.anythink.expressad.foundation.d.c cVar, d dVar, String str, int i10, com.anythink.expressad.videocommon.e.d dVar2, boolean z10) {
            this.f10762i = 0;
            this.f10764k = true;
            this.f10761h = str;
            this.f10759e = cVar;
            this.f10762i = i10;
            this.f10763j = dVar2;
            this.f = dVar;
            this.f10764k = z10;
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str, String str2) {
            Context context;
            a3.l.B(str2, "RewardZipDownloadListener ZIP failed:", d.f10660u);
            try {
                long currentTimeMillis = System.currentTimeMillis() - this.f10760g;
                int i10 = this.f10762i;
                if (i10 == 497) {
                    if (this.f10764k) {
                        r rVar = new r(r.f9709k, 3, String.valueOf(currentTimeMillis), str2, this.f10759e.aZ(), this.f10761h, "zip download failed", "1");
                        rVar.d(this.f10759e.Z());
                        rVar.e(this.f10759e.aa());
                        rVar.g(this.f10759e.aZ());
                        rVar.b(this.f10759e.f());
                        if (this.f10759e.w() == 287) {
                            rVar.a("3");
                        } else if (this.f10759e.w() == 94) {
                            rVar.a("1");
                        }
                    }
                } else if (i10 == 859) {
                    r rVar2 = new r();
                    rVar2.h(r.f9711m);
                    d dVar = this.f;
                    if (dVar != null && (context = dVar.f10673v) != null) {
                        context.getApplicationContext();
                        rVar2.c(com.anythink.expressad.foundation.h.k.a());
                    }
                    rVar2.d(3);
                    com.anythink.expressad.foundation.d.c cVar = this.f10759e;
                    if (cVar != null) {
                        rVar2.g(cVar.aZ());
                        rVar2.d(this.f10759e.Z());
                        rVar2.e(this.f10759e.aa());
                    }
                    rVar2.b(str2);
                    rVar2.i(str);
                    rVar2.f(this.f10761h);
                } else if (i10 == 313) {
                    return;
                }
                if (this.f != null) {
                    o.d(d.f10660u, "RewardZipDownloadListener ZIP failed:".concat(String.valueOf(str2)));
                    d.a(this.f, str, str2);
                }
            } catch (Exception e10) {
                try {
                    d dVar2 = this.f;
                    if (dVar2 != null) {
                        dVar2.b("clear error info failed");
                    }
                } catch (Throwable th) {
                    o.b(d.f10660u, th.getMessage(), th);
                }
                o.b(d.f10660u, e10.getMessage(), e10);
            }
            if (this.f != null) {
                this.f = null;
            }
        }

        @Override // com.anythink.expressad.videocommon.b.i.a
        public final void a(String str) {
            Context context;
            try {
                l.a().b(str, true);
                long currentTimeMillis = System.currentTimeMillis() - this.f10760g;
                int i10 = this.f10762i;
                if (i10 == 497) {
                    if (this.f10764k) {
                        r rVar = new r(r.f9709k, 14, String.valueOf(currentTimeMillis), str, this.f10759e.aZ(), this.f10761h, "", "1");
                        rVar.d(this.f10759e.Z());
                        rVar.e(this.f10759e.aa());
                        rVar.g(this.f10759e.aZ());
                        rVar.b(this.f10759e.f());
                        if (this.f10759e.w() == 287) {
                            rVar.a("3");
                        } else if (this.f10759e.w() == 94) {
                            rVar.a("1");
                        }
                    }
                } else if (i10 == 859) {
                    o.a(d.f10660u, "模板资源下载成功");
                    r rVar2 = new r();
                    rVar2.h(r.f9711m);
                    if (this.f != null) {
                        if (TextUtils.isEmpty(this.f10759e.ar())) {
                            this.f.a(this.f10759e, str, this.f10761h, this.f10763j);
                        }
                        Context context2 = this.f.f10673v;
                        if (context2 != null) {
                            context2.getApplicationContext();
                            rVar2.c(com.anythink.expressad.foundation.h.k.a());
                        }
                    }
                    rVar2.d(1);
                    com.anythink.expressad.foundation.d.c cVar = this.f10759e;
                    if (cVar != null) {
                        rVar2.g(cVar.aZ());
                        rVar2.d(this.f10759e.Z());
                        rVar2.e(this.f10759e.aa());
                    }
                    rVar2.b(str);
                    rVar2.i("");
                    rVar2.f(this.f10761h);
                } else if (i10 == 502) {
                    o.a(d.f10660u, "大模板下载成功");
                    r rVar3 = new r();
                    rVar3.h(r.f9711m);
                    d dVar = this.f;
                    if (dVar != null && (context = dVar.f10673v) != null) {
                        context.getApplicationContext();
                        rVar3.c(com.anythink.expressad.foundation.h.k.a());
                    }
                    rVar3.d(1);
                    com.anythink.expressad.foundation.d.c cVar2 = this.f10759e;
                    if (cVar2 != null) {
                        rVar3.g(cVar2.aZ());
                        rVar3.d(this.f10759e.Z());
                        rVar3.e(this.f10759e.aa());
                    }
                    rVar3.b(str);
                    rVar3.i("");
                    rVar3.f(this.f10761h);
                } else if (i10 == 313) {
                    return;
                }
                o.d(d.f10660u, "RewardZipDownloadListener ZIP SUCCESS:".concat(String.valueOf(str)));
                d dVar2 = this.f;
                if (dVar2 != null) {
                    synchronized (dVar2) {
                        o.d(d.f10660u, "adapter 1286");
                        if (this.f.c() && this.f.f10664ad != null) {
                            o.a(d.f10660u, "WHAT_ON_RES_LOAD_SUCCESS RewardZipDownloadListener");
                            this.f.f10664ad.sendEmptyMessage(6);
                            this.f.f10664ad.removeMessages(5);
                            this.f = null;
                        }
                    }
                }
            } catch (Throwable th) {
                o.b(d.f10660u, th.getMessage(), th);
            }
        }
    }

    /* renamed from: com.anythink.expressad.reward.a.d$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements c.InterfaceC0126c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f10678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.expressad.foundation.d.c f10679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10680c;

        public AnonymousClass2(boolean z10, com.anythink.expressad.foundation.d.c cVar, int i10) {
            this.f10678a = z10;
            this.f10679b = cVar;
            this.f10680c = i10;
        }

        @Override // com.anythink.expressad.reward.a.c.InterfaceC0126c
        public final void a(final String str, final String str2, final String str3, final CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList) {
            o.a(d.f10660u, "Campaign 下载成功： " + copyOnWriteArrayList.size());
            d.this.f10668p = true;
            copyOnWriteArrayList.size();
            if (!this.f10678a) {
                o.a(d.f10660u, "Campaign 下载成功： 非大模板");
                Iterator<com.anythink.expressad.foundation.d.c> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    final com.anythink.expressad.foundation.d.c next = it.next();
                    if (next != null && next.M() != null && !TextUtils.isEmpty(next.M().e()) && !next.M().e().contains(com.anythink.expressad.foundation.d.c.f9463d) && d.this.f10664ad != null) {
                        o.a(d.f10660u, "Campaign 下载成功： 非大模板，开始预加载播放模板");
                        d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.anythink.expressad.reward.a.c cVar = c.m.f10649a;
                                boolean z10 = d.this.f10662ab;
                                Handler handler = d.this.f10664ad;
                                boolean z11 = d.this.T;
                                boolean z12 = d.this.U;
                                String e10 = next.M().e();
                                int i10 = d.this.S;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                com.anythink.expressad.foundation.d.c cVar2 = anonymousClass2.f10679b;
                                CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList2 = d.this.f10661aa;
                                String c10 = com.anythink.expressad.videocommon.b.i.a().c(next.M().e());
                                String str4 = str;
                                String str5 = str2;
                                String str6 = str3;
                                next.aa();
                                cVar.a(z10, handler, z11, z12, (WindVaneWebView) null, e10, i10, cVar2, copyOnWriteArrayList2, c10, str4, str5, str6, d.this.I, new c.j() { // from class: com.anythink.expressad.reward.a.d.2.1.1
                                    @Override // com.anythink.expressad.reward.a.c.j
                                    public final void a(String str7) {
                                        o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功");
                                        o.a("HBOPTIMIZE", "模板加载成功 requestId ".concat(String.valueOf(str7)));
                                        d dVar = d.this;
                                        CopyOnWriteArrayList copyOnWriteArrayList3 = dVar.f10661aa;
                                        AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                        if (dVar.a(copyOnWriteArrayList3, anonymousClass22.f10678a, anonymousClass22.f10680c)) {
                                            String str8 = d.this.f10674w;
                                            List list = d.this.ah;
                                            boolean unused = d.this.U;
                                            d.a(str8, list);
                                            o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay true");
                                            if (d.this.f10664ad != null) {
                                                d.this.f10664ad.removeMessages(5);
                                            }
                                            if (d.this.G == null || d.this.f10671s) {
                                                return;
                                            }
                                            d.this.f10671s = true;
                                            TextUtils.isEmpty(d.this.f10674w);
                                            o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay true onVideoLoadSuccess");
                                            d.this.G.a();
                                            return;
                                        }
                                        o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false");
                                        List unused2 = d.this.ag;
                                        boolean unused3 = d.this.U;
                                        if (d.this.f10664ad != null) {
                                            d.this.f10664ad.removeMessages(5);
                                        }
                                        if (d.this.G == null || d.this.f10672t) {
                                            return;
                                        }
                                        d.this.f10672t = true;
                                        TextUtils.isEmpty(d.this.f10674w);
                                        d.this.G.a("errorCode: 3502 errorMessage: temp preload success but isReady false");
                                        o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                                    }

                                    @Override // com.anythink.expressad.reward.a.c.j
                                    public final void a(String str7, String str8) {
                                        o.a(d.f10660u, "Campaign 下载失败： 非大模板，播放模板预加载失败");
                                        o.d("HBOPTIMIZE", "模板加载失败 requestId ".concat(String.valueOf(str7)));
                                        if (AnonymousClass2.this.f10679b.aB() == null || AnonymousClass2.this.f10679b.aB().size() <= 0 || !AnonymousClass2.this.f10679b.aB().contains(1)) {
                                            List unused = d.this.ag;
                                            boolean unused2 = d.this.U;
                                            if (d.this.f10664ad != null) {
                                                d.this.f10664ad.removeMessages(5);
                                            }
                                            if (d.this.G == null || d.this.f10672t) {
                                                return;
                                            }
                                            d.this.f10672t = true;
                                            TextUtils.isEmpty(d.this.f10674w);
                                            d.this.G.a("errorCode: 3301 errorMessage: temp preload failed: ".concat(String.valueOf(str8)));
                                            o.a(d.f10660u, "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                                            return;
                                        }
                                        o.b(d.f10660u, "template preload fail but hit ignoreCheckRule");
                                    }
                                });
                            }
                        });
                    } else {
                        o.a(d.f10660u, "Campaign 下载成功： 非大模板，不存在播放模板");
                        d dVar = d.this;
                        if (dVar.a(dVar.f10661aa, this.f10678a, this.f10680c)) {
                            o.a(d.f10660u, "Campaign 下载成功： 非大模板，不存在播放模板,isReay true");
                            o.a("HBOPTIMIZE", "模板加载成功 requestId " + copyOnWriteArrayList.get(0).Z());
                            String str4 = d.this.f10674w;
                            List list = d.this.ah;
                            boolean unused = d.this.U;
                            d.a(str4, list);
                            if (d.this.f10664ad != null) {
                                d.this.f10664ad.removeMessages(5);
                            }
                            if (d.this.G != null && !d.this.f10671s) {
                                d.this.f10671s = true;
                                TextUtils.isEmpty(d.this.f10674w);
                                d.this.G.a();
                                o.a(d.f10660u, "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay true onVideoLoadSuccess");
                            }
                        } else {
                            o.a(d.f10660u, "Campaign 下载成功： 非大模板，不存在播放模板,isReay false");
                            o.d("HBOPTIMIZE", "模板加载失败 requestId " + copyOnWriteArrayList.get(0).Z());
                            List unused2 = d.this.ag;
                            boolean unused3 = d.this.U;
                            if (d.this.f10664ad != null) {
                                d.this.f10664ad.removeMessages(5);
                            }
                            if (d.this.G != null && !d.this.f10672t) {
                                d.this.f10672t = true;
                                if (!TextUtils.isEmpty(d.this.f10674w) && next != null && !TextUtils.isEmpty(next.aa())) {
                                    next.aa();
                                }
                                d.this.G.a("errorCode: 3503 errorMessage: have no temp but isReady false");
                                o.a(d.f10660u, "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                            }
                        }
                    }
                }
                return;
            }
            o.a(d.f10660u, "Campaign 下载成功： 大模板");
            if (d.this.f10669q && !d.this.f10670r && d.this.f10664ad != null) {
                o.a(d.f10660u, "Campaign 下载成功： 大模板，大模板下载成功，开始预加载大模板");
                synchronized (d.this.f10665c) {
                    if (d.this.f10670r) {
                        return;
                    }
                    d.this.f10670r = true;
                    o.a("test_pre_load_tpl", "Campaign 下载成功，大模板下载成功，开始预加载大模板");
                    d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.anythink.expressad.reward.a.c cVar = c.m.f10649a;
                            boolean z10 = d.this.f10662ab;
                            Handler handler = d.this.f10664ad;
                            boolean z11 = d.this.T;
                            boolean z12 = d.this.U;
                            String str5 = str3;
                            AnonymousClass2.this.f10679b.aa();
                            String str6 = d.this.f10675x;
                            String str7 = str2;
                            String ar = AnonymousClass2.this.f10679b.ar();
                            int i10 = d.this.S;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            cVar.a(z10, handler, z11, z12, str5, str6, str7, ar, i10, anonymousClass2.f10679b, d.this.f10661aa, com.anythink.expressad.videocommon.b.i.a().c(AnonymousClass2.this.f10679b.ar()), str2, d.this.I, new c.j() { // from class: com.anythink.expressad.reward.a.d.2.2.1
                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(String str8) {
                                    try {
                                        o.a("HBOPTIMIZE", "模板加载成功 requestId ".concat(String.valueOf(str8)));
                                    } catch (Exception unused4) {
                                    }
                                    o.a(d.f10660u, "Campaign 下载成功： 大模板预加载成功");
                                    d dVar2 = d.this;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = dVar2.f10661aa;
                                    AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                                    if (dVar2.a(copyOnWriteArrayList2, anonymousClass22.f10678a, anonymousClass22.f10680c)) {
                                        o.a(d.f10660u, "Campaign 下载成功： 大模板预加载成功,isReady true");
                                        String str9 = d.this.f10674w;
                                        List list2 = d.this.ah;
                                        boolean unused5 = d.this.U;
                                        d.a(str9, list2);
                                        if (d.this.f10664ad != null) {
                                            d.this.f10664ad.removeMessages(5);
                                        }
                                        if (d.this.G == null || d.this.f10671s) {
                                            return;
                                        }
                                        d.this.f10671s = true;
                                        TextUtils.isEmpty(d.this.f10674w);
                                        d.this.G.a();
                                        o.a(d.f10660u, "Campaign 下载成功： 大模板预加载成功,isReady true onVideoLoadSuccess");
                                        return;
                                    }
                                    o.a(d.f10660u, "Campaign 下载成功： 大模板预加载成功,isReady false");
                                    List unused6 = d.this.ag;
                                    boolean unused7 = d.this.U;
                                    if (d.this.f10664ad != null) {
                                        d.this.f10664ad.removeMessages(5);
                                    }
                                    if (d.this.G == null || d.this.f10672t) {
                                        return;
                                    }
                                    d.this.f10672t = true;
                                    TextUtils.isEmpty(d.this.f10674w);
                                    d.this.G.a("errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                                    o.a(d.f10660u, "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                                }

                                @Override // com.anythink.expressad.reward.a.c.j
                                public final void a(String str8, String str9) {
                                    o.a(d.f10660u, "Campaign 下载成功： 大模板预加载失败");
                                    o.d("HBOPTIMIZE", "模板加载失败 requestId ".concat(String.valueOf(str8)));
                                    if (AnonymousClass2.this.f10679b.aB() == null || AnonymousClass2.this.f10679b.aB().size() <= 0 || !AnonymousClass2.this.f10679b.aB().contains(3)) {
                                        List unused4 = d.this.ag;
                                        boolean unused5 = d.this.U;
                                        if (d.this.f10664ad != null) {
                                            d.this.f10664ad.removeMessages(5);
                                        }
                                        if (d.this.G == null || d.this.f10672t) {
                                            return;
                                        }
                                        d.this.f10672t = true;
                                        d.this.G.a("errorCode: 3303 errorMessage: tpl temp preload failed: ".concat(String.valueOf(str9)));
                                        o.a(d.f10660u, "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                                        return;
                                    }
                                    o.b(d.f10660u, "template download fail but hit ignoreCheckRule");
                                }
                            });
                        }
                    });
                    return;
                }
            }
            o.a(d.f10660u, "Campaign 下载成功： 大模板，大模板下载不成功： isCampaignTPLDownloadSuccess： " + d.this.f10669q + "  isCampaignTPLProLoad： " + d.this.f10670r);
        }

        @Override // com.anythink.expressad.reward.a.c.InterfaceC0126c
        public final void a(final String str, String str2, CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList) {
            o.a(d.f10660u, "Campaign 下载失败： " + copyOnWriteArrayList.size());
            o.d("HBOPTIMIZE", "模板加载失败 requestId ".concat(String.valueOf(str2)));
            d.this.f10668p = false;
            copyOnWriteArrayList.size();
            if (d.this.G == null || d.this.f10664ad == null) {
                return;
            }
            d.this.f10664ad.post(new Runnable() { // from class: com.anythink.expressad.reward.a.d.2.3
                @Override // java.lang.Runnable
                public final void run() {
                    List unused = d.this.ag;
                    boolean unused2 = d.this.U;
                    if (d.this.f10664ad != null) {
                        d.this.f10664ad.removeMessages(5);
                    }
                    if (!d.this.f10672t && d.this.G != null) {
                        d.this.f10672t = true;
                        TextUtils.isEmpty(d.this.f10674w);
                        d.this.G.a("errorCode: 3201 errorMessage: campaign resource download failed");
                        o.a(d.f10660u, "Campaign 下载失败：onVideoLoadFail");
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f10664ad != null) {
            if (TextUtils.isEmpty(str)) {
                this.f10664ad.sendEmptyMessage(4);
                return;
            }
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            if (str.contains(com.anythink.expressad.foundation.d.f.f9575i)) {
                this.f10664ad.sendMessageAtFrontOfQueue(obtain);
            } else {
                this.f10664ad.sendMessage(obtain);
            }
        }
    }

    public final void a(com.anythink.expressad.videocommon.e.d dVar) {
        try {
            this.I = dVar;
            if (dVar == null || dVar.V() * 1000 == com.anythink.expressad.foundation.g.a.cq) {
                return;
            }
            com.anythink.expressad.foundation.g.a.cq = this.I.V() * 1000;
        } catch (Throwable th) {
            o.b(f10660u, th.getMessage(), th);
        }
    }

    public final boolean a(List<com.anythink.expressad.foundation.d.c> list, boolean z10, int i10) {
        return b(list, z10, i10);
    }

    private void c(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(cVar.P())) {
            com.anythink.expressad.videocommon.b.i.a().b(cVar.P());
        }
        if (cVar.M() != null) {
            c.C0119c M2 = cVar.M();
            if (!TextUtils.isEmpty(M2.d())) {
                if (M2.d().contains(".zip")) {
                    o.a(f10660u, "下载 paused url zip");
                    com.anythink.expressad.videocommon.b.i.a().b(M2.d(), (i.a) new i(cVar, this, this.f10674w, 313, this.I, false));
                } else {
                    o.a(f10660u, "下载 paused url h5");
                    com.anythink.expressad.videocommon.b.i.a().b(M2.d(), (i.a) null);
                }
            }
            if (TextUtils.isEmpty(M2.e()) || M2.e().contains(com.anythink.expressad.foundation.d.c.f9463d)) {
                return;
            }
            if (M2.e().contains(".zip")) {
                o.a(f10660u, "下载 template zip");
                com.anythink.expressad.videocommon.b.i.a().b(M2.e(), (i.a) new i(cVar, this, this.f10674w, 859, this.I, false));
            } else {
                o.a(f10660u, "下载 template h5");
                com.anythink.expressad.videocommon.b.i.a().b(M2.e(), new C0130d(this, cVar, this.f10674w, this.I));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.content.Context] */
    public final void a(Activity activity, com.anythink.expressad.video.bt.module.b.h hVar, String str, String str2, int i10, String str3, com.anythink.core.common.e.j jVar) {
        try {
            this.F = hVar;
            o.b(f10660u, "show 进来");
            if (this.f10673v != null && !w.a(this.f10674w)) {
                ?? r52 = this.f10673v;
                if (activity == null || activity.isFinishing()) {
                    Log.i("anythink_BaseAdActivity", "Activity is null");
                    activity = r52;
                }
                o.b(f10660u, "show isReady true 打开播放器页面");
                Intent intent = new Intent(activity, (Class<?>) ATRewardVideoActivity.class);
                if (!(activity instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra(ATRewardVideoActivity.f10831a, this.f10674w);
                intent.putExtra(com.anythink.expressad.a.y, this.f10675x);
                intent.putExtra(ATRewardVideoActivity.f10833c, str);
                intent.putExtra(ATRewardVideoActivity.f10834d, i10);
                intent.putExtra(ATRewardVideoActivity.f10835e, this.T);
                intent.putExtra(ATRewardVideoActivity.f, this.U);
                intent.putExtra(ATRewardVideoActivity.f10841l, str3);
                intent.putExtra(ATRewardVideoActivity.f10842m, jVar);
                List<com.anythink.expressad.foundation.d.c> a10 = com.anythink.expressad.videocommon.b.e.a().a(this.f10674w);
                StringBuilder sb2 = new StringBuilder("当前展示的Offer requestId");
                boolean z10 = false;
                sb2.append(a10.get(0).Z());
                o.d("HBOPTIMIZE", sb2.toString());
                if (a10.size() > 0) {
                    o.a(f10660u, "可以 show 的数据： " + a10.size());
                    com.anythink.expressad.foundation.d.c cVar = a10.get(0);
                    if (cVar != null) {
                        this.f10667n = cVar.Z();
                    }
                    if (cVar != null && !TextUtils.isEmpty(cVar.ar())) {
                        z10 = true;
                    }
                } else {
                    o.a(f10660u, "可以 show 的数据： 0");
                    com.anythink.expressad.video.bt.module.b.h hVar2 = this.F;
                    if (hVar2 != null) {
                        hVar2.a("load failed");
                        return;
                    }
                }
                intent.putExtra(ATRewardVideoActivity.f10836g, z10);
                if (this.T) {
                    intent.putExtra(ATRewardVideoActivity.f10838i, this.W);
                    intent.putExtra(ATRewardVideoActivity.f10839j, this.X);
                    intent.putExtra(ATRewardVideoActivity.f10840k, this.Y);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(ATRewardVideoActivity.f10832b, str2);
                }
                e.a.f10778a.a(this.f10675x, this.f10674w, this.I);
                activity.startActivity(intent);
                return;
            }
            com.anythink.expressad.video.bt.module.b.h hVar3 = this.F;
            if (hVar3 != null) {
                hVar3.a("context or unitid is null");
            }
            o.b(f10660u, "show context munitid null");
        } catch (Exception e10) {
            e10.printStackTrace();
            com.anythink.expressad.video.bt.module.b.h hVar4 = this.F;
            if (hVar4 != null) {
                hVar4.a("show failed, exception is " + e10.getMessage());
            }
        }
    }

    private boolean b(com.anythink.expressad.foundation.d.c cVar) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            Iterator<com.anythink.expressad.foundation.d.c> it = this.f10661aa.iterator();
            while (it.hasNext()) {
                if (it.next().aZ().equals(cVar.aZ())) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void b(String str, List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        o.a("test_isReay_db", "标记缓存数据 ： " + list.size());
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (cVar.M() != null && !TextUtils.isEmpty(cVar.M().e())) {
                StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "_");
                l10.append(cVar.aZ());
                l10.append("_");
                l10.append(cVar.Z());
                l10.append("_");
                l10.append(cVar.M().e());
                com.anythink.expressad.videocommon.a.b(l10.toString());
                com.anythink.expressad.videocommon.a.b(cVar.w(), cVar);
            }
        }
    }

    private void b(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            if (cVar != null) {
                if (!TextUtils.isEmpty(cVar.P())) {
                    com.anythink.expressad.videocommon.b.i.a().b(cVar.P());
                }
                if (cVar.M() != null) {
                    c.C0119c M2 = cVar.M();
                    if (!TextUtils.isEmpty(M2.d())) {
                        if (M2.d().contains(".zip")) {
                            o.a(f10660u, "下载 paused url zip");
                            com.anythink.expressad.videocommon.b.i.a().b(M2.d(), (i.a) new i(cVar, this, this.f10674w, 313, this.I, false));
                        } else {
                            o.a(f10660u, "下载 paused url h5");
                            com.anythink.expressad.videocommon.b.i.a().b(M2.d(), (i.a) null);
                        }
                    }
                    if (!TextUtils.isEmpty(M2.e()) && !M2.e().contains(com.anythink.expressad.foundation.d.c.f9463d)) {
                        if (M2.e().contains(".zip")) {
                            o.a(f10660u, "下载 template zip");
                            com.anythink.expressad.videocommon.b.i.a().b(M2.e(), (i.a) new i(cVar, this, this.f10674w, 859, this.I, false));
                        } else {
                            o.a(f10660u, "下载 template h5");
                            com.anythink.expressad.videocommon.b.i.a().b(M2.e(), new C0130d(this, cVar, this.f10674w, this.I));
                        }
                    }
                }
            }
        }
    }

    private void c(List<com.anythink.expressad.foundation.d.c> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (com.anythink.expressad.foundation.d.c cVar : list) {
            String I = cVar.I();
            if (!TextUtils.isEmpty(I) && !cVar.H()) {
                if (I.contains(".zip") && I.contains(m.f12391b)) {
                    o.a(f10660u, "下载 endcard zip");
                    com.anythink.expressad.videocommon.b.i.a().b(I, (i.a) new i(cVar, this, this.f10674w, 497, this.I, TextUtils.isEmpty(com.anythink.expressad.videocommon.b.i.a().c(I))));
                } else {
                    o.a(f10660u, "下载 endcard h5");
                    com.anythink.expressad.videocommon.b.i.a().b(I, new f(this, cVar, this.f10674w, TextUtils.isEmpty(com.anythink.expressad.videocommon.b.j.a().b(I))));
                }
            }
        }
    }

    private static void c(String str) {
        if (w.b(str)) {
            o.b(f10660u, "onload sessionId:".concat(String.valueOf(str)));
            com.anythink.expressad.reward.b.a.f10780b = str;
        }
    }

    private void b(com.anythink.expressad.foundation.d.c cVar, String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Object[] objArr = new Object[5];
            if (!str.contains("zip") || this.f10664ad == null) {
                return;
            }
            String c10 = com.anythink.expressad.videocommon.b.i.a().c(str);
            o.a(f10660u, "寻找到的大模板： ".concat(String.valueOf(c10)));
            Message obtain = Message.obtain();
            obtain.what = 17;
            objArr[0] = cVar;
            objArr[1] = c10;
            objArr[2] = str2;
            objArr[3] = dVar;
            objArr[4] = str;
            obtain.obj = objArr;
            this.f10664ad.sendMessage(obtain);
        } catch (Exception unused) {
        }
    }

    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        this.f10676z = 1;
        this.B = 8;
        this.C = true;
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList = this.f10661aa;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        List<com.anythink.expressad.foundation.d.c> list = this.ag;
        if (list != null) {
            list.clear();
        }
        this.f10668p = false;
        this.f10669q = false;
        synchronized (this.f10665c) {
            if (this.f10670r) {
                this.f10670r = false;
            }
        }
        this.f10672t = false;
        this.f10671s = false;
        if (this.f10673v == null) {
            b("Context is null");
            return;
        }
        if (w.a(this.f10674w)) {
            b("UnitId is null");
            return;
        }
        if (this.I == null) {
            b("RewardUnitSetting is null");
            return;
        }
        try {
            Map<String, Long> map = com.anythink.expressad.foundation.g.a.f.f9819h;
            if (map != null && map.size() > 0) {
                com.anythink.expressad.foundation.g.a.f.f9819h.clear();
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
        o.b(f10660u, "load 开始清除过期数据");
        try {
            this.Z = dVar;
            o.b(f10660u, "onLoadCompaginSuccess 数据刚请求回来");
            o.b("HBOPTIMIZE", "V3 数据刚请求回来 requestId " + this.Z.f());
            com.anythink.expressad.foundation.d.d dVar2 = this.Z;
            if (dVar2 != null && (arrayList = dVar2.J) != null) {
                arrayList.size();
            }
            c(this.Z);
            this.f10666m = this.Z.f();
        } catch (Exception e11) {
            if (com.anythink.expressad.a.f6552a) {
                e11.printStackTrace();
            }
            o.b(f10660u, "onLoadCompaginSuccess 数据刚请求失败");
            CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList2 = this.f10661aa;
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.clear();
            }
            List<com.anythink.expressad.foundation.d.c> list2 = this.ag;
            if (list2 != null) {
                list2.clear();
            }
            this.f10668p = false;
            this.f10669q = false;
            synchronized (this.f10665c) {
                if (this.f10670r) {
                    this.f10670r = false;
                }
                this.f10672t = false;
                this.f10671s = false;
                b("exception after load success");
                r();
            }
        }
    }

    private void a(List<com.anythink.expressad.foundation.d.c> list) {
        o.b(f10660u, "onload 开始 更新本机已安装广告列表");
        if (this.f10673v != null && list != null && list.size() != 0) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.anythink.expressad.foundation.d.c cVar = list.get(i10);
                if (cVar != null && t.a(this.f10673v, cVar.ba())) {
                    z10 = true;
                }
            }
            if (z10) {
                o.b(f10660u, "更新安装列表");
                return;
            }
            return;
        }
        o.b(f10660u, "onload 列表为空 不做更新本机已安装广告列表");
    }

    private static boolean a(com.anythink.expressad.foundation.d.c cVar) {
        try {
            if (com.anythink.expressad.videocommon.a.a.a() == null) {
                return true;
            }
            com.anythink.expressad.videocommon.a.a.a();
            return com.anythink.expressad.videocommon.a.a.a(cVar);
        } catch (Exception e10) {
            e10.printStackTrace();
            return true;
        }
    }

    @Override // com.anythink.expressad.reward.a.a
    public final void a(com.anythink.expressad.reward.a.b bVar) {
        if (bVar != null) {
            o.b(f10660u, "======set listener is not null");
        } else {
            o.b(f10660u, "======set listener is  null");
        }
        this.G = bVar;
    }

    private void a(Runnable runnable) {
        this.H = runnable;
    }

    private void a(String str, String str2) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList;
        List<String> list;
        try {
            o.d(f10660u, "====delCampaignFromDownLoadCampaignListByUrld");
            if (this.R != null && !TextUtils.isEmpty(str2)) {
                Iterator<com.anythink.expressad.foundation.d.c> it = this.R.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.anythink.expressad.foundation.d.c next = it.next();
                    if (next != null) {
                        String S = next.S();
                        if (!TextUtils.isEmpty(S) && str2.equals(S)) {
                            this.R.remove(next);
                            break;
                        }
                        String I = next.I();
                        if (!TextUtils.isEmpty(I) && str2.equals(I)) {
                            this.R.remove(next);
                            break;
                        }
                        c.C0119c M2 = next.M();
                        if (M2 != null) {
                            List<c.C0119c.a> f10 = M2.f();
                            if (f10 != null) {
                                Iterator<c.C0119c.a> it2 = f10.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    c.C0119c.a next2 = it2.next();
                                    if (next2 != null && (list = next2.f9536b) != null && list.contains(str2)) {
                                        this.R.remove(next);
                                        break;
                                    }
                                }
                            }
                            String e10 = M2.e();
                            if (!TextUtils.isEmpty(e10) && str2.equals(e10)) {
                                this.R.remove(next);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (this.G == null || (copyOnWriteArrayList = this.R) == null || copyOnWriteArrayList.size() != 0) {
                    return;
                }
                Handler handler = this.f10664ad;
                if (handler != null) {
                    handler.removeMessages(5);
                }
                o.d(f10660u, "====del campaign and callback failed");
                b(str);
                this.G.a(str);
                return;
            }
            if (this.G != null) {
                Handler handler2 = this.f10664ad;
                if (handler2 != null) {
                    handler2.removeMessages(5);
                }
                o.d(f10660u, "====del campaign and callback failed");
                b(str);
                this.G.a(str);
            }
        } catch (Throwable th) {
            o.b(f10660u, th.getMessage(), th);
            try {
                if (this.G != null) {
                    Handler handler3 = this.f10664ad;
                    if (handler3 != null) {
                        handler3.removeMessages(5);
                    }
                    o.d(f10660u, "====del campaign and callback failed");
                    b(str);
                }
            } catch (Throwable th2) {
                o.b(f10660u, th2.getMessage(), th2);
            }
        }
    }

    private void a(List<com.anythink.expressad.foundation.d.c> list, com.anythink.expressad.videocommon.e.d dVar) {
        if (list != null) {
            try {
                Iterator<com.anythink.expressad.foundation.d.c> it = list.iterator();
                while (it.hasNext()) {
                    com.anythink.expressad.foundation.d.c next = it.next();
                    boolean z10 = true;
                    boolean z11 = next != null;
                    if (next.M() == null) {
                        z10 = false;
                    }
                    if ((z10 & z11) && !TextUtils.isEmpty(next.M().e())) {
                        a(next, next.M().e(), this.f10674w, dVar);
                    }
                    if (!TextUtils.isEmpty(next.ar())) {
                        a(next, next.ar(), this.f10674w, dVar);
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.anythink.expressad.foundation.d.c cVar, String str, String str2, com.anythink.expressad.videocommon.e.d dVar) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String c10 = com.anythink.expressad.videocommon.b.i.a().c(str);
            Message obtain = Message.obtain();
            obtain.what = 16;
            obtain.obj = new Object[]{cVar, c10, str2, dVar, str};
            Handler handler = this.f10664ad;
            if (handler != null) {
                handler.sendMessage(obtain);
            }
        } catch (Exception unused) {
        }
    }

    public final void a(int i10, int i11, int i12) {
        this.W = i10;
        this.X = i11;
        this.Y = i12;
    }

    public static /* synthetic */ void a(String str, List list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        o.a("test_isReay_db", "标记缓存数据 ： " + list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) it.next();
            if (cVar.M() != null && !TextUtils.isEmpty(cVar.M().e())) {
                StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, "_");
                l10.append(cVar.aZ());
                l10.append("_");
                l10.append(cVar.Z());
                l10.append("_");
                l10.append(cVar.M().e());
                com.anythink.expressad.videocommon.a.b(l10.toString());
                com.anythink.expressad.videocommon.a.b(cVar.w(), cVar);
            }
        }
    }

    public static /* synthetic */ void a(d dVar, WindVaneWebView windVaneWebView, String str, com.anythink.expressad.foundation.d.c cVar, List list, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar2) {
        com.anythink.expressad.video.signal.a.j jVar;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(n.a().g());
            c0140a.a(windVaneWebView2);
            if (list != null && list.size() > 0) {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, list);
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(dVar.S);
            jVar2.a(str3);
            jVar2.a(dVar2);
            jVar2.b(dVar.f10662ab);
            h hVar = new h(windVaneWebView, str3, cVar, list, str2, str3, dVar2, dVar.S, dVar);
            windVaneWebView2.setWebViewListener(new j(windVaneWebView, str, str3, c0140a, cVar, dVar, hVar, dVar.f10664ad));
            windVaneWebView2.setObject(jVar2);
            windVaneWebView2.loadUrl(str2);
            dVar.f10664ad.postDelayed(hVar, com.anythink.expressad.exoplayer.f.f7962a);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            o.a(f10660u, th.getMessage());
        }
    }

    public static /* synthetic */ void a(d dVar, String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, com.anythink.expressad.videocommon.e.d dVar2) {
        com.anythink.expressad.video.signal.a.j jVar;
        ArrayList<com.anythink.expressad.foundation.d.c> arrayList;
        try {
            a.C0140a c0140a = new a.C0140a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(n.a().g());
            c0140a.a(windVaneWebView);
            com.anythink.expressad.video.bt.a.c.a();
            String b10 = com.anythink.expressad.video.bt.a.c.b();
            c0140a.a(b10);
            com.anythink.expressad.foundation.d.d dVar3 = dVar.Z;
            if (dVar3 != null && (arrayList = dVar3.J) != null && arrayList.size() > 0) {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar, dVar.Z.J);
            } else {
                jVar = new com.anythink.expressad.video.signal.a.j(null, cVar);
            }
            com.anythink.expressad.video.signal.a.j jVar2 = jVar;
            jVar2.a(dVar.S);
            jVar2.a(str3);
            jVar2.c(b10);
            jVar2.a(dVar2);
            jVar2.b(dVar.f10662ab);
            g gVar = new g(str3, cVar, str2, str3, dVar2, dVar.S, dVar);
            windVaneWebView.setWebViewListener(new a(str, str3, c0140a, cVar, dVar, gVar, dVar.f10664ad));
            windVaneWebView.setObject(jVar2);
            windVaneWebView.loadUrl(str2);
            dVar.f10664ad.postDelayed(gVar, com.anythink.expressad.exoplayer.f.f7962a);
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (Throwable th) {
            o.a(f10660u, th.getMessage());
        }
    }

    public static /* synthetic */ void a(d dVar, String str, String str2) {
        CopyOnWriteArrayList<com.anythink.expressad.foundation.d.c> copyOnWriteArrayList;
        List<String> list;
        try {
            o.d(f10660u, "====delCampaignFromDownLoadCampaignListByUrld");
            if (dVar.R != null && !TextUtils.isEmpty(str2)) {
                Iterator<com.anythink.expressad.foundation.d.c> it = dVar.R.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.anythink.expressad.foundation.d.c next = it.next();
                    if (next != null) {
                        String S = next.S();
                        if (!TextUtils.isEmpty(S) && str2.equals(S)) {
                            dVar.R.remove(next);
                            break;
                        }
                        String I = next.I();
                        if (!TextUtils.isEmpty(I) && str2.equals(I)) {
                            dVar.R.remove(next);
                            break;
                        }
                        c.C0119c M2 = next.M();
                        if (M2 != null) {
                            List<c.C0119c.a> f10 = M2.f();
                            if (f10 != null) {
                                Iterator<c.C0119c.a> it2 = f10.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    c.C0119c.a next2 = it2.next();
                                    if (next2 != null && (list = next2.f9536b) != null && list.contains(str2)) {
                                        dVar.R.remove(next);
                                        break;
                                    }
                                }
                            }
                            String e10 = M2.e();
                            if (!TextUtils.isEmpty(e10) && str2.equals(e10)) {
                                dVar.R.remove(next);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (dVar.G == null || (copyOnWriteArrayList = dVar.R) == null || copyOnWriteArrayList.size() != 0) {
                    return;
                }
                Handler handler = dVar.f10664ad;
                if (handler != null) {
                    handler.removeMessages(5);
                }
                o.d(f10660u, "====del campaign and callback failed");
                dVar.b(str);
                dVar.G.a(str);
                return;
            }
            if (dVar.G != null) {
                Handler handler2 = dVar.f10664ad;
                if (handler2 != null) {
                    handler2.removeMessages(5);
                }
                o.d(f10660u, "====del campaign and callback failed");
                dVar.b(str);
                dVar.G.a(str);
            }
        } catch (Throwable th) {
            o.b(f10660u, th.getMessage(), th);
            try {
                if (dVar.G != null) {
                    Handler handler3 = dVar.f10664ad;
                    if (handler3 != null) {
                        handler3.removeMessages(5);
                    }
                    o.d(f10660u, "====del campaign and callback failed");
                    dVar.b(str);
                }
            } catch (Throwable th2) {
                o.b(f10660u, th2.getMessage(), th2);
            }
        }
    }

    public static /* synthetic */ void a(d dVar, List list) {
        o.b(f10660u, "onload 开始 更新本机已安装广告列表");
        if (dVar.f10673v != null && list != null && list.size() != 0) {
            boolean z10 = false;
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.anythink.expressad.foundation.d.c cVar = (com.anythink.expressad.foundation.d.c) list.get(i10);
                if (cVar != null && t.a(dVar.f10673v, cVar.ba())) {
                    z10 = true;
                }
            }
            if (z10) {
                o.b(f10660u, "更新安装列表");
                return;
            }
            return;
        }
        o.b(f10660u, "onload 列表为空 不做更新本机已安装广告列表");
    }
}
