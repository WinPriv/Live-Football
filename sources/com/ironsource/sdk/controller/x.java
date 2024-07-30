package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.huawei.hms.ads.ep;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.bj;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ka.p4;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class x extends WebView implements DownloadListener, com.ironsource.sdk.controller.m, com.ironsource.sdk.k.f {

    /* renamed from: b, reason: collision with root package name */
    public static String f26246b = "is_store";

    /* renamed from: c, reason: collision with root package name */
    public static String f26247c = "external_url";

    /* renamed from: d, reason: collision with root package name */
    public static String f26248d = "secondary_web_view";

    /* renamed from: r0, reason: collision with root package name */
    public static int f26249r0;
    public boolean A;
    public u B;
    public boolean C;
    public CountDownTimer D;
    public int E;
    public int F;
    public String G;
    public final t H;
    public View I;
    public final FrameLayout J;
    public WebChromeClient.CustomViewCallback K;
    public final FrameLayout L;
    public g M;
    public String N;
    public com.ironsource.sdk.j.a.d O;
    public com.ironsource.sdk.j.a.c P;
    public com.ironsource.sdk.j.e Q;
    public com.ironsource.sdk.j.a.b R;
    public Boolean S;
    public final String T;
    public final com.ironsource.sdk.controller.f U;
    public ControllerActivity V;
    public com.ironsource.sdk.g.b W;

    /* renamed from: c0, reason: collision with root package name */
    public final Object f26250c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f26251d0;

    /* renamed from: e0, reason: collision with root package name */
    public final com.ironsource.sdk.controller.j f26252e0;
    public CountDownTimer f;

    /* renamed from: f0, reason: collision with root package name */
    public com.ironsource.sdk.controller.q f26253f0;

    /* renamed from: g0, reason: collision with root package name */
    public com.ironsource.sdk.controller.r f26254g0;

    /* renamed from: h0, reason: collision with root package name */
    public com.ironsource.sdk.controller.v f26255h0;

    /* renamed from: i0, reason: collision with root package name */
    public com.ironsource.sdk.controller.k f26256i0;

    /* renamed from: j0, reason: collision with root package name */
    public com.ironsource.sdk.controller.a f26257j0;

    /* renamed from: k0, reason: collision with root package name */
    public com.ironsource.sdk.controller.h f26258k0;

    /* renamed from: l0, reason: collision with root package name */
    public a f26259l0;

    /* renamed from: m0, reason: collision with root package name */
    public final wb.a f26260m0;

    /* renamed from: n0, reason: collision with root package name */
    public final k f26261n0;

    /* renamed from: o0, reason: collision with root package name */
    public JSONObject f26262o0;

    /* renamed from: p0, reason: collision with root package name */
    public final com.ironsource.sdk.controller.c f26263p0;

    /* renamed from: q0, reason: collision with root package name */
    public com.ironsource.sdk.j.g f26264q0;

    /* renamed from: s, reason: collision with root package name */
    public final com.ironsource.environment.e.a f26265s;

    /* renamed from: t, reason: collision with root package name */
    public final String f26266t;

    /* renamed from: u, reason: collision with root package name */
    public final String f26267u;

    /* renamed from: v, reason: collision with root package name */
    public String f26268v;

    /* renamed from: w, reason: collision with root package name */
    public String f26269w;

    /* renamed from: x, reason: collision with root package name */
    public Map<String, String> f26270x;
    public final com.ironsource.sdk.k.d y;

    /* renamed from: z, reason: collision with root package name */
    public final JSONObject f26271z;

    /* loaded from: classes2.dex */
    public class a implements z {
        public a() {
        }

        @Override // com.ironsource.sdk.controller.z
        public final void a(String str, JSONObject jSONObject) {
            x.this.b(x.b(str, jSONObject.toString()));
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JSONObject f26273s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26274t;

        public b(JSONObject jSONObject, String str) {
            this.f26273s = jSONObject;
            this.f26274t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = x.f26249r0;
            if (this.f26273s.optBoolean("inspectWebview")) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
            x xVar = x.this;
            x.p(xVar, com.anythink.core.common.res.d.f6477a);
            x.p(xVar, this.f26274t);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends CountDownTimer {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f26276a;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.f26260m0.a("controller html - failed to load into web-view");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10) {
            super(50000L, 1000L);
            this.f26276a = i10;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "Loading Controller Timer Finish");
            int i10 = this.f26276a;
            if (i10 == 3) {
                xVar.m(new a());
            } else {
                xVar.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            Logger.i(x.this.f26266t, "Loading Controller Timer Tick " + j10);
        }
    }

    /* loaded from: classes2.dex */
    public class d {

        /* loaded from: classes2.dex */
        public class a {
            public a() {
            }

            public final void a(boolean z10, String str, com.ironsource.sdk.g.f fVar) {
                int i10 = x.f26249r0;
                fVar.a(z10 ? "success" : bj.b.S, str);
                x.e(x.this, fVar.toString(), z10, null, null);
            }

            public final void a(boolean z10, String str, JSONObject jSONObject) {
                String str2;
                try {
                    if (z10) {
                        int i10 = x.f26249r0;
                        str2 = "success";
                    } else {
                        int i11 = x.f26249r0;
                        str2 = bj.b.S;
                    }
                    jSONObject.put(str2, str);
                    x.e(x.this, jSONObject.toString(), z10, null, null);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    e10.getMessage();
                }
            }
        }

        /* loaded from: classes2.dex */
        public class a0 implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26281s;

            public a0(String str) {
                this.f26281s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                Log.d(x.this.f26266t, "onInterstitialInitSuccess()");
                x.this.P.a(d.e.Interstitial, this.f26281s, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                Log.d(x.this.f26266t, "onOfferWallInitSuccess()");
                x.this.Q.onOfferwallInitSuccess();
            }
        }

        /* loaded from: classes2.dex */
        public class b0 implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26284s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26285t;

            public b0(String str, String str2) {
                this.f26284s = str;
                this.f26285t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26284s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                d dVar = d.this;
                Log.d(x.this.f26266t, "onInterstitialInitFail(message:" + str + ")");
                x.this.P.a(d.e.Interstitial, this.f26285t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class c implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26287s;

            public c(String str) {
                this.f26287s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26287s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                d dVar = d.this;
                Log.d(x.this.f26266t, "onOfferWallInitFail(message:" + str + ")");
                x.this.Q.onOfferwallInitFail(str);
            }
        }

        /* loaded from: classes2.dex */
        public class c0 implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.ironsource.sdk.j.a.a f26289s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ d.e f26290t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f26291u;

            public c0(com.ironsource.sdk.j.a.a aVar, d.e eVar, String str) {
                this.f26289s = aVar;
                this.f26290t = eVar;
                this.f26291u = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26289s.b(this.f26290t, this.f26291u);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$d, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0337d implements Runnable {
            public RunnableC0337d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.j();
            }
        }

        /* loaded from: classes2.dex */
        public class d0 implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26293s;

            public d0(String str) {
                this.f26293s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                com.ironsource.sdk.j.a.c cVar = x.this.P;
                d.e eVar = d.e.Interstitial;
                String str = this.f26293s;
                cVar.c(eVar, str);
                x.this.P.d(str);
            }
        }

        /* loaded from: classes2.dex */
        public class e implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26295s;

            public e(String str) {
                this.f26295s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.P.c(this.f26295s);
            }
        }

        /* loaded from: classes2.dex */
        public class f implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26297s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26298t;

            public f(String str, String str2) {
                this.f26297s = str;
                this.f26298t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26297s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.P.b(this.f26298t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class g implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26300s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26301t;

            public g(String str, String str2) {
                this.f26300s = str;
                this.f26301t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26300s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.P.c(this.f26301t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class h implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26303s;

            public h(String str) {
                this.f26303s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                Log.d(x.this.f26266t, "onBannerInitSuccess()");
                x.this.R.a(d.e.Banner, this.f26303s, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes2.dex */
        public class i implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26305s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26306t;

            public i(String str, String str2) {
                this.f26305s = str;
                this.f26306t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26305s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                d dVar = d.this;
                Log.d(x.this.f26266t, "onBannerInitFail(message:" + str + ")");
                x.this.R.a(d.e.Banner, this.f26306t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class j implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26308s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.ironsource.sdk.c.a f26309t;

            public j(String str, com.ironsource.sdk.c.a aVar) {
                this.f26308s = str;
                this.f26309t = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                Log.d(x.this.f26266t, "onBannerLoadSuccess()");
                x.this.R.a(this.f26308s, this.f26309t);
            }
        }

        /* loaded from: classes2.dex */
        public class k implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26311s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26312t;

            public k(String str, String str2) {
                this.f26311s = str;
                this.f26312t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                Log.d(x.this.f26266t, "onLoadBannerFail()");
                String str = this.f26311s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.R.d(this.f26312t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class l implements Runnable {
            public l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.k();
            }
        }

        /* loaded from: classes2.dex */
        public class m implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26315s;

            public m(String str) {
                this.f26315s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26315s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.Q.onGetOWCreditsFailed(str);
            }
        }

        /* loaded from: classes2.dex */
        public class n implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d.e f26317s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26318t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ String f26319u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ JSONObject f26320v;

            public n(d.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f26317s = eVar;
                this.f26318t = str;
                this.f26319u = str2;
                this.f26320v = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.e eVar = d.e.Interstitial;
                JSONObject jSONObject = this.f26320v;
                String str = this.f26319u;
                d dVar = d.this;
                d.e eVar2 = this.f26317s;
                if (eVar2 != eVar && eVar2 != d.e.RewardedVideo && eVar2 != d.e.Banner) {
                    if (eVar2 == d.e.OfferWall) {
                        x.this.Q.onOfferwallEventNotificationReceived(str, jSONObject);
                    }
                } else {
                    x xVar = x.this;
                    int i10 = x.f26249r0;
                    com.ironsource.sdk.j.a.a j10 = xVar.j(eVar2);
                    if (j10 != null) {
                        j10.a(eVar2, this.f26318t, str, jSONObject);
                    }
                }
            }
        }

        /* loaded from: classes2.dex */
        public class o implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26322s;

            public o(String str) {
                this.f26322s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26322s;
                d dVar = d.this;
                try {
                    Logger.i(x.this.f26266t, "omidAPI(" + str + ")");
                    x.this.f26253f0.a(new com.ironsource.sdk.g.f(str).toString(), new a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Logger.i(x.this.f26266t, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* loaded from: classes2.dex */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.removeJavascriptInterface("GenerateTokenForMessaging");
            }
        }

        /* loaded from: classes2.dex */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.getSettings().setMixedContentMode(0);
            }
        }

        /* loaded from: classes2.dex */
        public class r implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f26326s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26327t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ com.ironsource.sdk.g.a f26328u;

            public r(int i10, String str, com.ironsource.sdk.g.a aVar) {
                this.f26326s = i10;
                this.f26327t = str;
                this.f26328u = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i10 = this.f26326s;
                String str = this.f26327t;
                d dVar = d.this;
                if (i10 > 0) {
                    Log.d(x.this.f26266t, "onRVInitSuccess()");
                    x.this.O.a(d.e.RewardedVideo, str, this.f26328u);
                } else {
                    x.this.O.b(str);
                }
            }
        }

        /* loaded from: classes2.dex */
        public class s implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26330s;

            public s(String str) {
                this.f26330s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                try {
                    x.this.f26258k0.b(new JSONObject(this.f26330s), new a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Logger.i(x.this.f26266t, "fileSystemAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* loaded from: classes2.dex */
        public class t implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26332s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26333t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ int f26334u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ boolean f26335v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ int f26336w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ boolean f26337x;
            public final /* synthetic */ String y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ String f26338z;

            public t(String str, String str2, int i10, boolean z10, int i11, boolean z11, String str3, String str4) {
                this.f26332s = str;
                this.f26333t = str2;
                this.f26334u = i10;
                this.f26335v = z10;
                this.f26336w = i11;
                this.f26337x = z11;
                this.y = str3;
                this.f26338z = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String obj = d.e.RewardedVideo.toString();
                String str = this.f26332s;
                boolean equalsIgnoreCase = str.equalsIgnoreCase(obj);
                int i10 = this.f26334u;
                d dVar = d.this;
                if (equalsIgnoreCase) {
                    x.this.O.a(this.f26333t, i10);
                    return;
                }
                if (str.equalsIgnoreCase(d.e.OfferWall.toString()) && this.f26335v && x.this.Q.onOWAdCredited(i10, this.f26336w, this.f26337x)) {
                    String str2 = this.y;
                    if (!TextUtils.isEmpty(str2)) {
                        com.ironsource.sdk.utils.b a10 = com.ironsource.sdk.utils.b.a();
                        x xVar = x.this;
                        boolean a11 = a10.a(str2, xVar.f26268v, xVar.f26269w);
                        String str3 = this.f26338z;
                        if (a11) {
                            x.e(x.this, str3, true, null, null);
                        } else {
                            x.e(x.this, str3, false, "Time Stamp could not be stored", null);
                        }
                    }
                }
            }
        }

        /* loaded from: classes2.dex */
        public class u implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26339s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ int f26340t;

            public u(String str, int i10) {
                this.f26339s = str;
                this.f26340t = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.P.b(this.f26339s, this.f26340t);
            }
        }

        /* loaded from: classes2.dex */
        public class v implements Runnable {
            public v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                xVar.setOnTouchListener(new ViewOnTouchListenerC0339x());
            }
        }

        /* loaded from: classes2.dex */
        public class w implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26343s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26344t;

            public w(String str, String str2) {
                this.f26343s = str;
                this.f26344t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26343s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                d dVar = d.this;
                Log.d(x.this.f26266t, "onRVInitFail(message:" + str + ")");
                x.this.O.a(d.e.RewardedVideo, this.f26344t, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$x, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0338x implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26346s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f26347t;

            public RunnableC0338x(String str, String str2) {
                this.f26346s = str;
                this.f26347t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str;
                String str2 = this.f26346s;
                if (str2 == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                } else {
                    str = str2;
                }
                d dVar = d.this;
                Log.d(x.this.f26266t, "onRVShowFail(message:" + str2 + ")");
                x.this.O.a(this.f26347t, str);
            }
        }

        /* loaded from: classes2.dex */
        public class y implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26349s;

            public y(String str) {
                this.f26349s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.Q.onOWShowSuccess(this.f26349s);
            }
        }

        /* loaded from: classes2.dex */
        public class z implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f26351s;

            public z(String str) {
                this.f26351s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f26351s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.Q.onOWShowFail(str);
            }
        }

        public d() {
        }

        public final void a(String str, boolean z10) {
            com.ironsource.sdk.g.c a10 = x.this.f26252e0.a(d.e.Interstitial, str);
            if (a10 != null) {
                a10.f = z10;
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            d.e o6 = x.o(d10);
            com.ironsource.sdk.j.a.a j10 = xVar.j(o6);
            if (o6 != null && j10 != null) {
                xVar.m(new c0(j10, o6, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void adCredited(String str) {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            String str2;
            com.ironsource.sdk.g.c a10;
            x xVar = x.this;
            Log.d(xVar.f26267u, "adCredited(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("credits");
            boolean z12 = false;
            if (d10 != null) {
                i10 = Integer.parseInt(d10);
            } else {
                i10 = 0;
            }
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d11 = fVar.d("productType");
            if (TextUtils.isEmpty(d11)) {
                Log.d(xVar.f26267u, "adCredited | product type is missing");
            }
            d.e eVar = d.e.Interstitial;
            if (eVar.toString().equalsIgnoreCase(d11)) {
                if (xVar.i(eVar.toString()) && (a10 = xVar.f26252e0.a(eVar, fetchDemandSourceId)) != null) {
                    Map<String, String> map = a10.f26487d;
                    if (map != null && map.containsKey("rewarded")) {
                        z12 = Boolean.parseBoolean(a10.f26487d.get("rewarded"));
                    }
                    if (z12) {
                        xVar.m(new u(fetchDemandSourceId, i10));
                        return;
                    }
                    return;
                }
                return;
            }
            String d12 = fVar.d("total");
            if (d12 != null) {
                i11 = Integer.parseInt(d12);
            } else {
                i11 = 0;
            }
            if (d.e.OfferWall.toString().equalsIgnoreCase(d11)) {
                if (!fVar.b("signature") && !fVar.b("timestamp") && !fVar.b("totalCreditsFlag")) {
                    String d13 = fVar.d("signature");
                    StringBuilder j10 = com.ironsource.adapters.facebook.a.j(d12);
                    j10.append(xVar.f26268v);
                    j10.append(xVar.f26269w);
                    if (d13.equalsIgnoreCase(SDKUtils.getMD5(j10.toString()))) {
                        z12 = true;
                    } else {
                        x.e(xVar, str, false, "Controller signature is not equal to SDK signature", null);
                    }
                    boolean e10 = fVar.e("totalCreditsFlag");
                    str2 = fVar.d("timestamp");
                    z11 = e10;
                    z10 = z12;
                } else {
                    x.e(xVar, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", null);
                    return;
                }
            } else {
                z10 = false;
                z11 = false;
                str2 = null;
            }
            if (xVar.i(d11)) {
                xVar.m(new t(d11, fetchDemandSourceId, i10, z10, i11, z11, str2, str));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.f26470c) {
                x.e(xVar, str, false, "Num Of Ad Units Do Not Exist", null);
                return;
            }
            x.e(xVar, str, true, null, null);
            String str2 = aVar.f26468a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str2) && xVar.i(str2)) {
                xVar.m(new r(Integer.parseInt(aVar.f26469b), fetchDemandSourceId, aVar));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "adViewAPI(" + str + ")");
                xVar.f26257j0.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e10) {
                e10.printStackTrace();
                Logger.i(xVar.f26266t, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.i(x.this.f26266t, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            d.e o6;
            LinkedHashMap c10;
            com.ironsource.sdk.g.c cVar;
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId) && (o6 = x.o(d10)) != null) {
                    com.ironsource.sdk.controller.j jVar = xVar.f26252e0;
                    if (!TextUtils.isEmpty(fetchDemandSourceId) && (c10 = jVar.c(o6)) != null && (cVar = (com.ironsource.sdk.g.c) c10.remove(fetchDemandSourceId)) != null) {
                        cVar.f26489g = null;
                        Map<String, String> map = cVar.f26487d;
                        if (map != null) {
                            map.clear();
                        }
                        cVar.f26487d = null;
                    }
                }
            } catch (Exception e10) {
                x.e(xVar, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            x xVar = x.this;
            try {
                com.ironsource.sdk.utils.b a10 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a10.f26568a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a10.f26568a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                x.e(xVar, fVar.toString(), true, null, null);
            } catch (Exception e10) {
                x.e(xVar, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("file");
                String d11 = fVar.d("path");
                if (d11 != null && !TextUtils.isEmpty(d10)) {
                    com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(xVar.T, d11), d10);
                    IronSourceStorageUtils.ensurePathSafety(cVar, xVar.T);
                    if (!cVar.exists()) {
                        x.e(xVar, str, false, "File not exist", "1");
                        return;
                    } else {
                        x.e(xVar, str, IronSourceStorageUtils.deleteFile(cVar), null, null);
                        return;
                    }
                }
                x.e(xVar, str, false, "Missing parameters for file", "1");
            } catch (Exception e10) {
                x.e(xVar, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "deleteFolder(" + str + ")");
                String d10 = new com.ironsource.sdk.g.f(str).d("path");
                if (d10 == null) {
                    x.e(xVar, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(xVar.T, d10));
                IronSourceStorageUtils.ensurePathSafety(cVar, xVar.T);
                if (!cVar.exists()) {
                    x.e(xVar, str, false, "Folder not exist", "1");
                } else {
                    x.e(xVar, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), null, null);
                }
            } catch (Exception e10) {
                x.e(xVar, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.k kVar = xVar.f26256i0;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                String optString = jSONObject.optString("deviceDataFunction");
                jSONObject.optJSONObject("deviceDataParams");
                String optString2 = jSONObject.optString("success");
                jSONObject.optString(bj.b.S);
                if ("getDeviceData".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                    String encodeString = SDKUtils.encodeString("totalDeviceRAM");
                    Context context = kVar.f26199a;
                    Context context2 = kVar.f26199a;
                    fVar3.a(encodeString, SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d(context))));
                    fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(context2))));
                    fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(context2))));
                    fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(context2))));
                    fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(context2))));
                    aVar.a(true, optString2, fVar3);
                    return;
                }
                Logger.i("k", "unhandled API request " + fVar2);
            } catch (Exception e10) {
                e10.printStackTrace();
                Logger.i(xVar.f26266t, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
        
            if (r4 > 0) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
        
            if (r2 <= 0) goto L22;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void displayWebView(java.lang.String r17) {
            /*
                Method dump skipped, instructions count: 527
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.displayWebView(java.lang.String):void");
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "fileSystemAPI(" + str + ")");
            s sVar = new s(str);
            com.ironsource.environment.e.a aVar = xVar.f26265s;
            if (aVar != null) {
                aVar.b(sVar);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0153, code lost:
        
            if (android.text.TextUtils.isEmpty(r1) == false) goto L63;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getApplicationInfo(java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            String str2;
            x xVar = x.this;
            Logger.i(xVar.f26266t, "getCachedFilesMap(" + str + ")");
            String k10 = x.k(str);
            if (!TextUtils.isEmpty(k10)) {
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!fVar.a("path")) {
                    str2 = "path key does not exist";
                } else {
                    String str3 = (String) fVar.c("path");
                    String str4 = xVar.T;
                    if (!IronSourceStorageUtils.isPathExist(str4, str3)) {
                        str2 = "path file does not exist on disk";
                    } else {
                        xVar.b(x.b(k10, IronSourceStorageUtils.getCachedFilesMap(str4, str3), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                        return;
                    }
                }
                x.e(xVar, str, false, str2, null);
            }
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String b10;
            x xVar = x.this;
            Logger.i(xVar.f26266t, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            int i10 = x.f26249r0;
            String d10 = fVar.d("success");
            String d11 = fVar.d(bj.b.S);
            JSONObject jSONObject = new JSONObject();
            k kVar = xVar.f26261n0;
            if (kVar != null) {
                jSONObject = kVar.f26539a.c(xVar.getContext());
            }
            if (jSONObject.length() > 0) {
                b10 = x.b(d10, jSONObject.toString());
            } else {
                b10 = x.b(d11, x.a("errMsg", "failed to retrieve connection info", null, null, null, null, null, null, null, false));
            }
            xVar.b(b10);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:3|4|5|(1:7)(1:34)|8|(3:12|13|(2:15|(6:17|(2:19|20)|23|24|25|26)))|33|(0)|23|24|25|26) */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getControllerConfig(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = r0.f26266t
                java.lang.String r2 = r0.f26266t
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "getControllerConfig("
                r3.<init>(r4)
                r3.append(r9)
                java.lang.String r4 = ")"
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.ironsource.sdk.utils.Logger.i(r1, r3)
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r9)
                int r9 = com.ironsource.sdk.controller.x.f26249r0
                java.lang.String r9 = "success"
                java.lang.String r9 = r1.d(r9)
                boolean r1 = android.text.TextUtils.isEmpty(r9)
                if (r1 != 0) goto Le1
                org.json.JSONObject r1 = com.ironsource.sdk.utils.SDKUtils.getControllerConfigAsJSONObject()
                com.ironsource.sdk.controller.FeaturesManager r3 = com.ironsource.sdk.controller.FeaturesManager.getInstance()     // Catch: java.lang.Exception -> L5a
                r3.getClass()     // Catch: java.lang.Exception -> L5a
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5a
                com.ironsource.sdk.controller.FeaturesManager$a r5 = r3.f26082b     // Catch: java.lang.Exception -> L5a
                r4.<init>(r5)     // Catch: java.lang.Exception -> L5a
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Exception -> L5a
                if (r4 == 0) goto L48
                goto L76
            L48:
                java.lang.String r4 = "nativeFeatures"
                org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L5a
                java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L5a
                com.ironsource.sdk.controller.FeaturesManager$a r3 = r3.f26082b     // Catch: java.lang.Exception -> L5a
                r6.<init>(r3)     // Catch: java.lang.Exception -> L5a
                r5.<init>(r6)     // Catch: java.lang.Exception -> L5a
                r1.put(r4, r5)     // Catch: java.lang.Exception -> L5a
                goto L76
            L5a:
                r3 = move-exception
                com.ironsource.sdk.a.a r4 = new com.ironsource.sdk.a.a
                r4.<init>()
                java.lang.String r5 = "callfailreason"
                java.lang.String r3 = r3.getMessage()
                com.ironsource.sdk.a.a r3 = r4.a(r5, r3)
                com.ironsource.sdk.a.f$a r4 = com.ironsource.sdk.a.f.o
                java.util.HashMap<java.lang.String, java.lang.Object> r3 = r3.f25984a
                com.ironsource.sdk.a.d.a(r4, r3)
                java.lang.String r3 = "getControllerConfig Error while adding supported features data from FeaturesManager"
                com.ironsource.sdk.utils.Logger.d(r2, r3)
            L76:
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.getTesterParameters()
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                java.lang.String r5 = "testFriendlyName"
                java.lang.String r6 = "testerABGroup"
                if (r4 != 0) goto Lab
                java.lang.String r4 = "-1"
                boolean r4 = r3.contains(r4)
                if (r4 != 0) goto Lab
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> La7
                r4.<init>(r3)     // Catch: org.json.JSONException -> La7
                java.lang.String r7 = r4.getString(r6)     // Catch: org.json.JSONException -> La7
                boolean r7 = r7.isEmpty()     // Catch: org.json.JSONException -> La7
                if (r7 != 0) goto Lab
                java.lang.String r4 = r4.getString(r5)     // Catch: org.json.JSONException -> La7
                boolean r4 = r4.isEmpty()     // Catch: org.json.JSONException -> La7
                if (r4 != 0) goto Lab
                r4 = 1
                goto Lac
            La7:
                r4 = move-exception
                r4.printStackTrace()
            Lab:
                r4 = 0
            Lac:
                if (r4 == 0) goto Lc7
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc2
                r4.<init>(r3)     // Catch: org.json.JSONException -> Lc2
                java.lang.Object r3 = r4.get(r6)     // Catch: org.json.JSONException -> Lc2
                r1.putOpt(r6, r3)     // Catch: org.json.JSONException -> Lc2
                java.lang.Object r3 = r4.get(r5)     // Catch: org.json.JSONException -> Lc2
                r1.putOpt(r5, r3)     // Catch: org.json.JSONException -> Lc2
                goto Lc7
            Lc2:
                java.lang.String r3 = "getControllerConfig Error while parsing Tester AB Group parameters"
                com.ironsource.sdk.utils.Logger.d(r2, r3)
            Lc7:
                java.lang.String r2 = "controllerSourceData"
                com.ironsource.sdk.controller.f r3 = r0.U     // Catch: java.lang.Exception -> Ld6
                r3.getClass()     // Catch: java.lang.Exception -> Ld6
                com.ironsource.sdk.controller.e r4 = new com.ironsource.sdk.controller.e     // Catch: java.lang.Exception -> Ld6
                r4.<init>(r3)     // Catch: java.lang.Exception -> Ld6
                r1.put(r2, r4)     // Catch: java.lang.Exception -> Ld6
            Ld6:
                java.lang.String r1 = r1.toString()
                java.lang.String r9 = com.ironsource.sdk.controller.x.b(r9, r1)
                r0.b(r9)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getControllerConfig(java.lang.String):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:6:0x0034, B:8:0x003a, B:10:0x0052, B:14:0x005c, B:15:0x0073, B:17:0x007d, B:23:0x0068), top: B:5:0x0034 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDemandSourceState(java.lang.String r10) {
            /*
                r9 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = r0.f26266t
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "getMediationState("
                r2.<init>(r3)
                r2.append(r10)
                java.lang.String r3 = ")"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.ironsource.sdk.utils.Logger.i(r1, r2)
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r10)
                java.lang.String r2 = "demandSourceName"
                java.lang.String r3 = r1.d(r2)
                java.lang.String r4 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r1)
                java.lang.String r5 = "productType"
                java.lang.String r1 = r1.d(r5)
                if (r1 == 0) goto L91
                if (r3 == 0) goto L91
                r6 = 0
                com.ironsource.sdk.g.d$e r7 = com.ironsource.sdk.utils.SDKUtils.getProductType(r1)     // Catch: java.lang.Exception -> L85
                if (r7 == 0) goto L91
                com.ironsource.sdk.controller.j r8 = r0.f26252e0     // Catch: java.lang.Exception -> L85
                com.ironsource.sdk.g.c r7 = r8.a(r7, r4)     // Catch: java.lang.Exception -> L85
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L85
                r8.<init>()     // Catch: java.lang.Exception -> L85
                r8.put(r5, r1)     // Catch: java.lang.Exception -> L85
                r8.put(r2, r3)     // Catch: java.lang.Exception -> L85
                java.lang.String r1 = "demandSourceId"
                r8.put(r1, r4)     // Catch: java.lang.Exception -> L85
                if (r7 == 0) goto L68
                int r1 = r7.f26486c     // Catch: java.lang.Exception -> L85
                r2 = -1
                if (r1 != r2) goto L59
                r1 = 1
                goto L5a
            L59:
                r1 = r6
            L5a:
                if (r1 != 0) goto L68
                java.lang.String r1 = com.ironsource.sdk.controller.x.k(r10)     // Catch: java.lang.Exception -> L85
                java.lang.String r2 = "state"
                int r3 = r7.f26486c     // Catch: java.lang.Exception -> L85
                r8.put(r2, r3)     // Catch: java.lang.Exception -> L85
                goto L73
            L68:
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f     // Catch: java.lang.Exception -> L85
                r1.<init>(r10)     // Catch: java.lang.Exception -> L85
                java.lang.String r2 = "fail"
                java.lang.String r1 = r1.d(r2)     // Catch: java.lang.Exception -> L85
            L73:
                java.lang.String r2 = r8.toString()     // Catch: java.lang.Exception -> L85
                boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L85
                if (r3 != 0) goto L91
                java.lang.String r1 = com.ironsource.sdk.controller.x.b(r1, r2)     // Catch: java.lang.Exception -> L85
                r0.b(r1)     // Catch: java.lang.Exception -> L85
                goto L91
            L85:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.x.e(r0, r10, r6, r2, r3)
                r1.printStackTrace()
            L91:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:77:0x0331, code lost:
        
            if (android.text.TextUtils.isEmpty(r1) == false) goto L85;
         */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0325  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x033b  */
        /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x032d  */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void getDeviceStatus(java.lang.String r14) {
            /*
                Method dump skipped, instructions count: 839
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "getDeviceVolume(" + str + ")");
            try {
                com.ironsource.sdk.utils.a.a(xVar.f26263p0.a());
                float b10 = com.ironsource.sdk.utils.a.b(xVar.f26263p0.a());
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b10));
                x.e(xVar, fVar.toString(), true, null, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getInitSummery(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "getInitSummery(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            fVar.a("recoveryInfo", xVar.f26262o0);
            x.e(xVar, fVar.toString(), true, null, null);
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            x xVar = x.this;
            Activity a10 = xVar.f26263p0.a();
            if (a10 != null) {
                String k10 = x.k(str);
                String jSONObject = SDKUtils.getOrientation(a10).toString();
                if (!TextUtils.isEmpty(k10)) {
                    xVar.b(x.b(k10, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
                }
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "getUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                x.e(xVar, str, false, "key does not exist", null);
                return;
            }
            String k10 = x.k(str);
            String d10 = fVar.d("key");
            String string = com.ironsource.sdk.utils.b.a().f26568a.getString(d10, null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            xVar.b(x.b(k10, x.a(d10, string, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            JSONObject b10;
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.v vVar = xVar.f26255h0;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                String optString = jSONObject.optString("functionName");
                JSONObject optJSONObject = jSONObject.optJSONObject("functionParams");
                String optString2 = jSONObject.optString("success");
                String optString3 = jSONObject.optString(bj.b.S);
                if ("updateToken".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = vVar.f26243b;
                        com.ironsource.mediationsdk.adunit.a.a.a("ctgp", optJSONObject);
                        vVar.f26242a.a(optJSONObject);
                        aVar.a(true, optString2, fVar3);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Logger.i("v", "updateToken exception " + e10.getMessage());
                        aVar.a(false, optString3, fVar3);
                        return;
                    }
                }
                if ("getToken".equals(optString)) {
                    try {
                        if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken")) {
                            b10 = vVar.f26245d.a();
                            Iterator<String> keys = b10.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                Object obj = b10.get(next);
                                if (obj instanceof String) {
                                    b10.put(next, a.AnonymousClass1.a((String) obj));
                                }
                            }
                        } else {
                            b10 = vVar.f26242a.b(vVar.f26244c);
                        }
                        aVar.a(true, optString2, b10);
                        return;
                    } catch (Exception e11) {
                        String message = e11.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        int i10 = x.f26249r0;
                        fVar4.a(bj.b.S, optString3);
                        fVar4.a("data", message);
                        x.e(x.this, fVar4.toString(), false, null, null);
                        return;
                    }
                }
                Logger.i("v", "unhandled API request " + fVar2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                Logger.i(xVar.f26266t, "iabTokenAPI failed with exception " + e12.getMessage());
            }
            e12.printStackTrace();
            Logger.i(xVar.f26266t, "iabTokenAPI failed with exception " + e12.getMessage());
        }

        @JavascriptInterface
        public void initController(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            CountDownTimer countDownTimer = xVar.f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                xVar.f = null;
            }
            if (fVar.a("stage")) {
                String d10 = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d10)) {
                    xVar.A = true;
                    xVar.f26260m0.b();
                    return;
                }
                if ("loaded".equalsIgnoreCase(d10)) {
                    xVar.f26260m0.a();
                    return;
                }
                if ("failed".equalsIgnoreCase(d10)) {
                    String d11 = fVar.d("errMsg");
                    xVar.f26260m0.a("controller js failed to initialize : " + d11);
                    return;
                }
                Logger.i(xVar.f26266t, "No STAGE mentioned! should not get here!");
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            x.this.f(new o(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onAdWindowsClosed(" + str + ")");
            com.ironsource.sdk.g.b bVar = xVar.W;
            bVar.f26475e = -1;
            bVar.f26473c = null;
            xVar.B = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            d.e o6 = x.o(d10);
            Log.d(xVar.f26267u, "onAdClosed() with type " + o6);
            if (xVar.i(d10)) {
                xVar.m(new wb.f(xVar, o6, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            Logger.i(x.this.f26266t, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetApplicationInfoFail(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetApplicationInfoSuccess(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetCachedFilesMapFail(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetCachedFilesMapSuccess(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetDeviceStatusFail(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetDeviceStatusSuccess(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onGetUserCreditsFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (xVar.i(d.e.OfferWall.toString())) {
                xVar.m(new m(d10));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(xVar.f26266t, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = xVar.f26252e0;
            d.e eVar = d.e.Banner;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (xVar.i(eVar.toString())) {
                xVar.m(new i(d10, fetchDemandSourceId));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitBannerSuccess()");
            x.l(xVar, "onInitBannerSuccess", ep.Code);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(xVar.f26266t, "onInitBannerSuccess failed with no demand source");
            } else if (xVar.i(d.e.Banner.toString())) {
                xVar.m(new h(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(xVar.f26266t, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = xVar.f26252e0;
            d.e eVar = d.e.Interstitial;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (xVar.i(eVar.toString())) {
                xVar.m(new b0(d10, fetchDemandSourceId));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitInterstitialSuccess()");
            x.l(xVar, "onInitInterstitialSuccess", ep.Code);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(xVar.f26266t, "onInitInterstitialSuccess failed with no demand source");
            } else if (xVar.i(d.e.Interstitial.toString())) {
                xVar.m(new a0(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitOfferWallFail(" + str + ")");
            xVar.W.f26478i = false;
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            com.ironsource.sdk.g.b bVar = xVar.W;
            if (bVar.f26477h) {
                bVar.f26477h = false;
                if (xVar.i(d.e.OfferWall.toString())) {
                    xVar.m(new c(d10));
                }
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            x xVar = x.this;
            x.l(xVar, "onInitOfferWallSuccess", ep.Code);
            com.ironsource.sdk.g.b bVar = xVar.W;
            bVar.f26478i = true;
            if (bVar.f26477h) {
                bVar.f26477h = false;
                if (xVar.i(d.e.OfferWall.toString())) {
                    xVar.m(new b());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            com.ironsource.sdk.controller.j jVar = xVar.f26252e0;
            d.e eVar = d.e.RewardedVideo;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (xVar.i(eVar.toString())) {
                xVar.m(new w(d10, fetchDemandSourceId));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.e(xVar, str, true, null, null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && xVar.i(d.e.Banner.toString())) {
                xVar.m(new k(d10, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d10 = fVar.d("adViewId");
            x.e(xVar, str, true, null, null);
            com.ironsource.sdk.c.e a10 = com.ironsource.sdk.c.d.a().a(d10);
            if (a10 == null) {
                xVar.R.d(fetchDemandSourceId, "not found view for the current adViewId= " + d10);
                return;
            }
            if (a10 instanceof com.ironsource.sdk.c.a) {
                com.ironsource.sdk.c.a aVar = (com.ironsource.sdk.c.a) a10;
                if (xVar.i(d.e.Banner.toString())) {
                    xVar.m(new j(fetchDemandSourceId, aVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.e(xVar, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (xVar.i(d.e.Interstitial.toString())) {
                xVar.m(new f(d10, fetchDemandSourceId));
            }
            x.l(xVar, "onLoadInterstitialFail", ep.Code);
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onLoadInterstitialSuccess(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            x.e(xVar, str, true, null, null);
            if (xVar.i(d.e.Interstitial.toString())) {
                xVar.m(new e(fetchDemandSourceId));
            }
            x.l(xVar, "onLoadInterstitialSuccess", ep.Code);
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            Logger.i(x.this.f26266t, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.e(xVar, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (xVar.i(d.e.Interstitial.toString())) {
                xVar.m(new g(d10, fetchDemandSourceId));
            }
            x.l(xVar, "onShowInterstitialFail", str);
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowInterstitialSuccess(" + str + ")");
            x.e(xVar, str, true, null, null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(xVar.f26266t, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.ironsource.sdk.g.b bVar = xVar.W;
            d.e eVar = d.e.Interstitial;
            bVar.f26475e = eVar.ordinal();
            xVar.W.f26473c = fetchDemandSourceId;
            if (xVar.i(eVar.toString())) {
                xVar.m(new d0(fetchDemandSourceId));
                x.l(xVar, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowOfferWallFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (xVar.i(d.e.OfferWall.toString())) {
                xVar.m(new z(d10));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowOfferWallSuccess(" + str + ")");
            com.ironsource.sdk.g.b bVar = xVar.W;
            d.e eVar = d.e.OfferWall;
            bVar.f26475e = eVar.ordinal();
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (xVar.i(eVar.toString())) {
                xVar.m(new y(valueFromJsonObject));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (xVar.i(d.e.RewardedVideo.toString())) {
                xVar.m(new RunnableC0338x(d10, fetchDemandSourceId));
            }
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "onShowRewardedVideoSuccess(" + str + ")");
            x.e(xVar, str, true, null, null);
            x.l(xVar, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            x xVar = x.this;
            Log.d(xVar.f26266t, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            if (xVar.V != null && !TextUtils.isEmpty(d10)) {
                String d11 = fVar.d("status");
                if ("started".equalsIgnoreCase(d11)) {
                    xVar.V.onVideoStarted();
                    return;
                }
                if ("paused".equalsIgnoreCase(d11)) {
                    xVar.V.onVideoPaused();
                    return;
                }
                if ("playing".equalsIgnoreCase(d11)) {
                    xVar.V.onVideoResumed();
                    return;
                }
                if ("ended".equalsIgnoreCase(d11)) {
                    xVar.V.onVideoEnded();
                    return;
                }
                if ("stopped".equalsIgnoreCase(d11)) {
                    xVar.V.onVideoStopped();
                    return;
                }
                Logger.i(xVar.f26266t, "onVideoStatusChanged: unknown status: " + d11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:3:0x0038, B:15:0x007a, B:19:0x0092, B:21:0x00ac, B:23:0x0052, B:26:0x005c, B:29:0x0066), top: B:2:0x0038 }] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void openUrl(java.lang.String r11) {
            /*
                r10 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = r0.f26266t
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "openUrl("
                r2.<init>(r3)
                r2.append(r11)
                java.lang.String r3 = ")"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.ironsource.sdk.utils.Logger.i(r1, r2)
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r11)
                java.lang.String r2 = "url"
                java.lang.String r2 = r1.d(r2)
                java.lang.String r3 = "method"
                java.lang.String r3 = r1.d(r3)
                java.lang.String r4 = "package_name"
                java.lang.String r1 = r1.d(r4)
                com.ironsource.sdk.controller.c r4 = r0.f26263p0
                android.app.Activity r4 = r4.a()
                r5 = 0
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lb0
                int r6 = r3.hashCode()     // Catch: java.lang.Exception -> Lb0
                r7 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                r8 = 2
                r9 = 1
                if (r6 == r7) goto L66
                r7 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r6 == r7) goto L5c
                r7 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r6 == r7) goto L52
                goto L70
            L52:
                java.lang.String r6 = "webview"
                boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> Lb0
                if (r3 == 0) goto L70
                r3 = r9
                goto L71
            L5c:
                java.lang.String r6 = "store"
                boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> Lb0
                if (r3 == 0) goto L70
                r3 = r8
                goto L71
            L66:
                java.lang.String r6 = "external_browser"
                boolean r3 = r3.equals(r6)     // Catch: java.lang.Exception -> Lb0
                if (r3 == 0) goto L70
                r3 = r5
                goto L71
            L70:
                r3 = -1
            L71:
                if (r3 == 0) goto Lac
                java.lang.Class<com.ironsource.sdk.controller.OpenUrlActivity> r1 = com.ironsource.sdk.controller.OpenUrlActivity.class
                if (r3 == r9) goto L92
                if (r3 == r8) goto L7a
                goto L91
            L7a:
                android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> Lb0
                r3.<init>(r4, r1)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = com.ironsource.sdk.controller.x.f26247c     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = com.ironsource.sdk.controller.x.f26246b     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = com.ironsource.sdk.controller.x.f26248d     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb0
                r4.startActivity(r3)     // Catch: java.lang.Exception -> Lb0
            L91:
                return
            L92:
                android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> Lb0
                r3.<init>(r4, r1)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = com.ironsource.sdk.controller.x.f26247c     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = com.ironsource.sdk.controller.x.f26248d     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r9)     // Catch: java.lang.Exception -> Lb0
                java.lang.String r1 = "immersive"
                boolean r2 = r0.f26251d0     // Catch: java.lang.Exception -> Lb0
                r3.putExtra(r1, r2)     // Catch: java.lang.Exception -> Lb0
                r4.startActivity(r3)     // Catch: java.lang.Exception -> Lb0
                goto Lbc
            Lac:
                com.ironsource.environment.a.AnonymousClass1.a(r4, r2, r1)     // Catch: java.lang.Exception -> Lb0
                goto Lbc
            Lb0:
                r1 = move-exception
                java.lang.String r2 = r1.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.x.e(r0, r11, r5, r2, r3)
                r1.printStackTrace()
            Lbc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.openUrl(java.lang.String):void");
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            x.this.f(new RunnableC0337d());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.r rVar = xVar.f26254g0;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                String optString = jSONObject.optString("functionName");
                JSONObject optJSONObject = jSONObject.optJSONObject("functionParams");
                String optString2 = jSONObject.optString("success");
                String optString3 = jSONObject.optString(bj.b.S);
                if ("getPermissions".equals(optString)) {
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        fVar3.a("permissions", com.ironsource.environment.c.a(rVar.f26239a, optJSONObject.getJSONArray("permissions")));
                        aVar.a(true, optString2, fVar3);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Logger.i("r", "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
                        fVar3.a("errMsg", e10.getMessage());
                        aVar.a(false, optString3, fVar3);
                        return;
                    }
                }
                if ("isPermissionGranted".equals(optString)) {
                    com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                    try {
                        String string = optJSONObject.getString("permission");
                        fVar4.a("permission", string);
                        if (com.ironsource.environment.c.a(rVar.f26239a, string)) {
                            fVar4.a("status", String.valueOf(com.ironsource.environment.c.b(rVar.f26239a, string)));
                            aVar.a(true, optString2, fVar4);
                            return;
                        } else {
                            fVar4.a("status", "unhandledPermission");
                            aVar.a(false, optString3, fVar4);
                            return;
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        fVar4.a("errMsg", e11.getMessage());
                        aVar.a(false, optString3, fVar4);
                        return;
                    }
                }
                Logger.i("r", "PermissionsJSAdapter unhandled API request " + fVar2);
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                Logger.i(xVar.f26266t, "permissionsAPI failed with exception " + e12.getMessage());
            }
            e12.printStackTrace();
            Logger.i(xVar.f26266t, "permissionsAPI failed with exception " + e12.getMessage());
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            String str2;
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("eventName");
                if (TextUtils.isEmpty(d10)) {
                    x.e(xVar, str, false, "eventName does not exist", null);
                    return;
                }
                String d11 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                    str2 = fetchDemandSourceId;
                } else {
                    str2 = d11;
                }
                JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d12 = fVar.d("productType");
                d.e o6 = x.o(d12);
                if (xVar.i(d12)) {
                    String k10 = x.k(str);
                    if (!TextUtils.isEmpty(k10)) {
                        xVar.b(x.b(k10, x.a("productType", d12, "eventName", d10, "demandSourceName", d11, "demandSourceId", str2, null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                    }
                    xVar.m(new n(o6, str2, d10, jSONObject));
                    return;
                }
                x.e(xVar, str, false, "productType does not exist", null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "removeCloseEventHandler(" + str + ")");
            CountDownTimer countDownTimer = xVar.D;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            xVar.C = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            x.this.f(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            Logger.i(x.this.f26266t, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            x.this.f(new l());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            x xVar = x.this;
            try {
                Logger.i(xVar.f26266t, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("path");
                String d11 = fVar.d("file");
                if (TextUtils.isEmpty(d11)) {
                    x.e(xVar, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(xVar.T, d10), SDKUtils.getFileName(d11));
                IronSourceStorageUtils.ensurePathSafety(cVar, xVar.T);
                if (com.ironsource.environment.h.a(xVar.T) <= 0) {
                    x.e(xVar, str, false, "no_disk_space", null);
                    return;
                }
                if (!SDKUtils.isExternalStorageAvailable()) {
                    x.e(xVar, str, false, "storage_unavailable", null);
                    return;
                }
                if (cVar.exists()) {
                    x.e(xVar, str, false, "file_already_exist", null);
                    return;
                }
                if (!a.AnonymousClass1.b(xVar.getContext())) {
                    x.e(xVar, str, false, "no_network_connection", null);
                    return;
                }
                x.e(xVar, str, true, null, null);
                int a10 = fVar.a("connectionTimeout", 0);
                int a11 = fVar.a("readTimeout", 0);
                com.ironsource.sdk.k.d dVar = xVar.y;
                dVar.a(cVar, d11, a10, a11, dVar.f26532a).start();
            } catch (Exception e10) {
                x.e(xVar, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            Logger.i(x.this.f26266t, "setBackButtonState(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("state");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f26568a.edit();
            edit.putString("back_button_state", d10);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d(ContentRecord.WIDTH);
            String d11 = fVar.d(ContentRecord.HEIGHT);
            xVar.E = Integer.parseInt(d10);
            xVar.F = Integer.parseInt(d11);
            xVar.G = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "setMixedContentAlwaysAllow(" + str + ")");
            xVar.f(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "setOrientation(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("orientation");
            xVar.N = d10;
            com.ironsource.sdk.j.g gVar = xVar.f26264q0;
            if (gVar != null) {
                gVar.onOrientationChanged(d10, com.ironsource.environment.h.k(xVar.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            Logger.i(x.this.f26266t, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f26568a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            x xVar = x.this;
            Logger.i(xVar.f26266t, "removeCloseEventHandler(" + str + ")");
            xVar.f(new v());
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2;
            x xVar = x.this;
            Logger.i(xVar.f26266t, "setUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                str2 = "key does not exist";
            } else if (!fVar.a("value")) {
                str2 = "value does not exist";
            } else {
                String d10 = fVar.d("key");
                String d11 = fVar.d("value");
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f26568a.edit();
                edit.putString(d10, d11);
                edit.apply();
                xVar.b(x.b(x.k(str), x.a(d10, d11, null, null, null, null, null, null, null, false)));
                return;
            }
            x.e(xVar, str, false, str2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.ironsource.sdk.controller.x] */
        /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.webkit.WebView] */
        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            int i10;
            ?? r02 = x.this;
            Logger.i(r02.f26266t, "setWebviewBackgroundColor(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d(com.anythink.expressad.foundation.h.i.f10126d);
            String d11 = fVar.d("adViewId");
            if (!"transparent".equalsIgnoreCase(d10)) {
                i10 = Color.parseColor(d10);
            } else {
                i10 = 0;
            }
            if (d11 == null || (r02 = com.ironsource.sdk.c.d.a().a(d11).a()) != 0) {
                r02.setBackgroundColor(i10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements w {
        public e() {
        }

        @Override // com.ironsource.sdk.controller.x.w
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.d(x.this, cVar, eVar, str);
        }
    }

    /* loaded from: classes2.dex */
    public class f implements w {
        public f() {
        }

        @Override // com.ironsource.sdk.controller.x.w
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.d(x.this, cVar, eVar, str);
        }
    }

    /* loaded from: classes2.dex */
    public enum g {
        Display,
        Gone
    }

    /* loaded from: classes2.dex */
    public class h implements w {
        public h() {
        }

        @Override // com.ironsource.sdk.controller.x.w
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.d(x.this, cVar, eVar, str);
        }
    }

    /* loaded from: classes2.dex */
    public class i implements w {
        public i() {
        }

        @Override // com.ironsource.sdk.controller.x.w
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.d(x.this, cVar, eVar, str);
        }
    }

    /* loaded from: classes2.dex */
    public class j implements w {
        public j() {
        }

        @Override // com.ironsource.sdk.controller.x.w
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.d(x.this, cVar, eVar, str);
        }
    }

    /* loaded from: classes2.dex */
    public class l implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d.e f26362s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.c f26363t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f26364u;

        public l(com.ironsource.sdk.g.c cVar, d.e eVar, String str) {
            this.f26362s = eVar;
            this.f26363t = cVar;
            this.f26364u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = d.e.RewardedVideo;
            String str = this.f26364u;
            x xVar = x.this;
            d.e eVar2 = this.f26362s;
            if (eVar != eVar2 && d.e.Interstitial != eVar2 && d.e.Banner != eVar2) {
                if (d.e.OfferWall == eVar2) {
                    xVar.Q.onOfferwallInitFail(str);
                    return;
                } else {
                    if (d.e.OfferWallCredits == eVar2) {
                        xVar.Q.onGetOWCreditsFailed(str);
                        return;
                    }
                    return;
                }
            }
            com.ironsource.sdk.g.c cVar = this.f26363t;
            if (cVar != null && !TextUtils.isEmpty(cVar.f26485b)) {
                int i10 = x.f26249r0;
                com.ironsource.sdk.j.a.a j10 = xVar.j(eVar2);
                Log.d(xVar.f26266t, "onAdProductInitFailed (message:" + str + ")(" + eVar2 + ")");
                if (j10 != null) {
                    j10.a(eVar2, cVar.f26485b, str);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public class m implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f26366s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26367t;

        public m(StringBuilder sb2, String str) {
            this.f26366s = sb2;
            this.f26367t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x xVar = x.this;
            try {
                Boolean bool = xVar.S;
                String str = this.f26367t;
                StringBuilder sb2 = this.f26366s;
                if (bool != null) {
                    if (bool.booleanValue()) {
                        xVar.evaluateJavascript(sb2.toString(), null);
                    } else {
                        xVar.loadUrl(str);
                    }
                } else {
                    try {
                        xVar.evaluateJavascript(sb2.toString(), null);
                        xVar.S = Boolean.TRUE;
                    } catch (Throwable th) {
                        Logger.e(xVar.f26266t, "evaluateJavascript Exception: SDK version=" + Build.VERSION.SDK_INT + " " + th);
                        xVar.loadUrl(str);
                        xVar.S = Boolean.FALSE;
                    }
                }
            } catch (Throwable th2) {
                Logger.e(xVar.f26266t, "injectJavascript: " + th2.toString());
            }
        }
    }

    /* loaded from: classes2.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes2.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes2.dex */
    public class p implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.ironsource.sdk.g.e f26371s;

        public p(com.ironsource.sdk.g.e eVar) {
            this.f26371s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.f26260m0.a("controller html - failed to download - " + this.f26371s.f26515a);
        }
    }

    /* loaded from: classes2.dex */
    public class q implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f26373s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f26374t;

        public q(String str, String str2) {
            this.f26373s = str;
            this.f26374t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (x.b() == d.EnumC0343d.MODE_3.f26508d) {
                Toast.makeText(x.this.f26263p0.a(), this.f26373s + " : " + this.f26374t, 1).show();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class r implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f26376s;

        public r(Context context) {
            this.f26376s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x xVar = x.this;
            Context context = this.f26376s;
            int i10 = x.f26249r0;
            try {
                k kVar = xVar.f26261n0;
                if (kVar != null) {
                    kVar.f26539a.a(context);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class s implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Context f26378s;

        public s(Context context) {
            this.f26378s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x xVar = x.this;
            Context context = this.f26378s;
            int i10 = x.f26249r0;
            try {
                k kVar = xVar.f26261n0;
                if (kVar != null) {
                    kVar.f26539a.b(context);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class t extends WebChromeClient {
        public t() {
        }

        @Override // android.webkit.WebChromeClient
        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(x.this.f26263p0.a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new v());
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            x xVar = x.this;
            View view = xVar.I;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            xVar.J.removeView(xVar.I);
            xVar.I = null;
            xVar.J.setVisibility(8);
            xVar.K.onCustomViewHidden();
            xVar.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            x xVar = x.this;
            xVar.setVisibility(8);
            if (xVar.I != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            xVar.J.addView(view);
            xVar.I = view;
            xVar.K = customViewCallback;
            xVar.J.setVisibility(0);
        }
    }

    /* loaded from: classes2.dex */
    public static class u {

        /* renamed from: a, reason: collision with root package name */
        public final d.e f26381a;

        /* renamed from: b, reason: collision with root package name */
        public final String f26382b;

        public u(d.e eVar, String str) {
            this.f26381a = eVar;
            this.f26382b = str;
        }
    }

    /* loaded from: classes2.dex */
    public class v extends WebViewClient {
        public v() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            String str = x.this.f26266t;
            StringBuilder sb2 = new StringBuilder("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Logger.e(str, sb2.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a10 = x.this.f26263p0.a();
            Intent intent = new Intent(a10, (Class<?>) OpenUrlActivity.class);
            intent.putExtra(x.f26247c, str);
            intent.putExtra(x.f26248d, false);
            a10.startActivity(intent);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public interface w {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    /* renamed from: com.ironsource.sdk.controller.x$x, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class ViewOnTouchListenerC0339x implements View.OnTouchListener {

        /* renamed from: com.ironsource.sdk.controller.x$x$a */
        /* loaded from: classes2.dex */
        public class a extends CountDownTimer {
            public a() {
                super(2000L, 500L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                ViewOnTouchListenerC0339x viewOnTouchListenerC0339x = ViewOnTouchListenerC0339x.this;
                Logger.i(x.this.f26266t, "Close Event Timer Finish");
                x xVar = x.this;
                if (xVar.C) {
                    xVar.C = false;
                } else {
                    xVar.e("forceClose");
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j10) {
                Logger.i(x.this.f26266t, "Close Event Timer Tick " + j10);
            }
        }

        public ViewOnTouchListenerC0339x() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                x xVar = x.this;
                String str = xVar.f26266t;
                StringBuilder sb2 = new StringBuilder("X:");
                int i10 = (int) x10;
                sb2.append(i10);
                sb2.append(" Y:");
                int i11 = (int) y;
                sb2.append(i11);
                Logger.i(str, sb2.toString());
                int m10 = com.ironsource.environment.h.m();
                int n10 = com.ironsource.environment.h.n();
                Logger.i(xVar.f26266t, "Width:" + m10 + " Height:" + n10);
                int dpToPx = SDKUtils.dpToPx((long) xVar.E);
                int dpToPx2 = SDKUtils.dpToPx((long) xVar.F);
                if ("top-right".equalsIgnoreCase(xVar.G)) {
                    i10 = m10 - i10;
                } else if (!"top-left".equalsIgnoreCase(xVar.G)) {
                    if ("bottom-right".equalsIgnoreCase(xVar.G)) {
                        i10 = m10 - i10;
                    } else if (!"bottom-left".equalsIgnoreCase(xVar.G)) {
                        i10 = 0;
                        i11 = 0;
                    }
                    i11 = n10 - i11;
                }
                if (i10 <= dpToPx && i11 <= dpToPx2) {
                    xVar.C = false;
                    CountDownTimer countDownTimer = xVar.D;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    xVar.D = new a().start();
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class y extends WebViewClient {
        public y() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                x.this.b(x.n("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            wb.a aVar;
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && (aVar = x.this.f26260m0) != null) {
                aVar.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            boolean didCrash2;
            String str;
            x xVar = x.this;
            String str2 = xVar.f26266t;
            StringBuilder sb2 = new StringBuilder("Chromium process crashed - detail.didCrash(): ");
            didCrash = renderProcessGoneDetail.didCrash();
            sb2.append(didCrash);
            Log.e(str2, sb2.toString());
            didCrash2 = renderProcessGoneDetail.didCrash();
            if (didCrash2) {
                str = "Render process was observed to crash";
            } else {
                str = "Render process was killed by the system";
            }
            wb.a aVar = xVar.f26260m0;
            if (aVar != null) {
                aVar.b(str);
            }
            if (xVar.B != null) {
                com.ironsource.sdk.j.g gVar = xVar.f26264q0;
                if (gVar != null) {
                    gVar.onCloseRequested();
                }
                u uVar = xVar.B;
                d.e eVar = uVar.f26381a;
                if (xVar.i(eVar.toString())) {
                    xVar.m(new wb.f(xVar, eVar, uVar.f26382b));
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z10;
            Logger.i("shouldInterceptRequest", str);
            try {
                z10 = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z10 = false;
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder(Advertisement.FILE_SCHEME);
                sb2.append(x.this.T);
                String p10 = a3.l.p(sb2, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(p10));
                    return new WebResourceResponse("text/javascript", "UTF-8", y.class.getResourceAsStream(p10));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            x xVar = x.this;
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (xVar.f(str)) {
                    xVar.h();
                    return true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public x(Context context, com.ironsource.sdk.controller.j jVar, com.ironsource.sdk.controller.c cVar, wb.a aVar, com.ironsource.environment.e.a aVar2, int i10, JSONObject jSONObject) {
        super(context);
        this.f26266t = "x";
        this.f26267u = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
        this.E = 50;
        this.F = 50;
        this.G = "top-right";
        this.S = null;
        this.f26250c0 = new Object();
        this.f26251d0 = false;
        Logger.i("x", "C'tor");
        this.f26263p0 = cVar;
        this.f26260m0 = aVar;
        this.f26265s = aVar2;
        String networkStorageDir = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.T = networkStorageDir;
        this.f26252e0 = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.L = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.J = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(this);
        frameLayout.addView(frameLayout2, layoutParams);
        frameLayout.addView(frameLayout3);
        this.W = new com.ironsource.sdk.g.b();
        this.f26262o0 = new JSONObject();
        this.f26271z = jSONObject;
        com.ironsource.sdk.k.d a10 = com.ironsource.sdk.k.d.a(networkStorageDir, aVar2, jSONObject);
        this.y = a10;
        a10.f26532a.f26530a = this;
        this.U = new com.ironsource.sdk.controller.f(SDKUtils.getNetworkConfiguration(), networkStorageDir, SDKUtils.getControllerUrl(), a10);
        t tVar = new t();
        this.H = tVar;
        setWebViewClient(new y());
        setWebChromeClient(tVar);
        com.ironsource.sdk.utils.d.a(this);
        p4 p4Var = new p4(UUID.randomUUID().toString(), 1);
        addJavascriptInterface(new wb.d(new com.ironsource.sdk.controller.d(new d()), p4Var), "Android");
        addJavascriptInterface(new wb.e(p4Var), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.f26261n0 = new k(SDKUtils.getControllerConfigAsJSONObject(), context);
        a(context);
        f26249r0 = i10;
    }

    public static String b(String str, String str2, String str3, String str4) {
        return a3.l.q(a3.k.o("SSA_CORE.SDKController.runFunction('", str, "?parameters=", str2, "','"), str3, "','", str4, "');");
    }

    public static /* synthetic */ void d(x xVar, com.ironsource.sdk.g.c cVar, d.e eVar, String str) {
        if (xVar.i(eVar.toString())) {
            xVar.m(new l(cVar, eVar, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void e(com.ironsource.sdk.controller.x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = "success"
            java.lang.String r1 = r0.d(r1)
            java.lang.String r2 = "fail"
            java.lang.String r0 = r0.d(r2)
            if (r5 == 0) goto L1a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L22
            goto L23
        L1a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L22
            r1 = r0
            goto L23
        L22:
            r1 = 0
        L23:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L5a
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L3e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3e
            r5.<init>(r4)     // Catch: org.json.JSONException -> L3e
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch: org.json.JSONException -> L3e
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L3e
        L3e:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L53
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L53
            r5.<init>(r4)     // Catch: org.json.JSONException -> L53
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch: org.json.JSONException -> L53
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L53
        L53:
            java.lang.String r4 = b(r1, r4)
            r3.b(r4)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.e(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ String k(String str) {
        return new com.ironsource.sdk.g.f(str).d("success");
    }

    public static /* synthetic */ void l(x xVar, String str, String str2) {
        String d10 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (!TextUtils.isEmpty(d10)) {
            xVar.f(new q(str, d10));
        }
    }

    public static String n(String str) {
        return a3.k.l("SSA_CORE.SDKController.runFunction('", str, "');");
    }

    public static d.e o(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d.e eVar = d.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        d.e eVar4 = d.e.Banner;
        if (!str.equalsIgnoreCase(eVar4.toString())) {
            return null;
        }
        return eVar4;
    }

    public static /* synthetic */ void p(x xVar, String str) {
        try {
            Logger.i(xVar.f26266t, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            Logger.e(xVar.f26266t, "WebViewController::load: " + th);
        }
    }

    public final String a(d.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a10 = this.f26252e0.a(eVar, fetchDemandSourceId);
        if (a10 != null) {
            Map<String, String> map = a10.f26487d;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> map2 = eVar == d.e.OfferWall ? this.f26270x : null;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0342a a11 = a.C0342a.a(eVar);
        return b(a11.f26463a, flatMapToJsonAsString, a11.f26464b, a11.f26465c);
    }

    @Override // android.webkit.WebView, com.ironsource.sdk.controller.m
    public void destroy() {
        super.destroy();
        com.ironsource.sdk.k.d dVar = this.y;
        if (dVar != null) {
            dVar.a();
        }
        k kVar = this.f26261n0;
        if (kVar != null) {
            kVar.f26539a.a();
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void f(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f26265s;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }

    public final void g(String str, String str2, d.e eVar, com.ironsource.sdk.g.c cVar, w wVar) {
        String str3;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            wVar.a("User id or Application key are missing", eVar, cVar);
            return;
        }
        d.e eVar2 = d.e.RewardedVideo;
        String b10 = null;
        if (eVar == eVar2 || eVar == d.e.Interstitial || eVar == d.e.OfferWall || eVar == d.e.Banner) {
            HashMap hashMap = new HashMap();
            hashMap.put("applicationKey", this.f26268v);
            hashMap.put("applicationUserId", this.f26269w);
            if (cVar != null) {
                Map<String, String> map = cVar.f26487d;
                if (map != null) {
                    hashMap.putAll(map);
                    com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f26546a;
                    hashMap.put("loadStartTime", String.valueOf(com.ironsource.sdk.service.a.a(cVar.f26485b)));
                }
                hashMap.put("demandSourceName", cVar.f26484a);
                hashMap.put("demandSourceId", cVar.f26485b);
            }
            d.e eVar3 = d.e.OfferWall;
            Map<String, String> map2 = eVar == eVar3 ? this.f26270x : null;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
            a.C0342a c0342a = new a.C0342a();
            if (eVar == eVar2) {
                c0342a.f26463a = "initRewardedVideo";
                c0342a.f26464b = "onInitRewardedVideoSuccess";
                str3 = "onInitRewardedVideoFail";
            } else if (eVar == d.e.Interstitial) {
                c0342a.f26463a = "initInterstitial";
                c0342a.f26464b = "onInitInterstitialSuccess";
                str3 = "onInitInterstitialFail";
            } else if (eVar == eVar3) {
                c0342a.f26463a = "initOfferWall";
                c0342a.f26464b = "onInitOfferWallSuccess";
                str3 = "onInitOfferWallFail";
            } else {
                if (eVar == d.e.Banner) {
                    c0342a.f26463a = "initBanner";
                    c0342a.f26464b = "onInitBannerSuccess";
                    str3 = "onInitBannerFail";
                }
                b10 = b(c0342a.f26463a, flatMapToJsonAsString, c0342a.f26464b, c0342a.f26465c);
            }
            c0342a.f26465c = str3;
            b10 = b(c0342a.f26463a, flatMapToJsonAsString, c0342a.f26464b, c0342a.f26465c);
        } else if (eVar == d.e.OfferWallCredits) {
            b10 = b("getUserCredits", a("productType", "OfferWall", "applicationKey", this.f26268v, "applicationUserId", this.f26269w, null, null, null, false), "null", "onGetUserCreditsFail");
        }
        b(b10);
    }

    public final void h(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a("file", str, "path", q(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception unused) {
        }
    }

    public final boolean i(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = this.f26266t;
        boolean z10 = false;
        if (isEmpty) {
            Logger.d(str2, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.Interstitial.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.Banner.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.Q != null : this.R != null : this.O != null : this.P != null) {
            z10 = true;
        }
        if (!z10) {
            Logger.d(str2, "Trying to trigger a listener - no listener was found for product ".concat(str));
        }
        return z10;
    }

    public final com.ironsource.sdk.j.a.a j(d.e eVar) {
        if (eVar == d.e.Interstitial) {
            return this.P;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.O;
        }
        if (eVar == d.e.Banner) {
            return this.R;
        }
        return null;
    }

    public final void m(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f26265s;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        Logger.i(this.f26266t, str + " " + str4);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        com.ironsource.sdk.j.g gVar;
        if (i10 == 4 && (gVar = this.f26264q0) != null && gVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final String q(String str) {
        String str2 = this.T + File.separator;
        if (str.contains(str2)) {
            return str.substring(str2.length());
        }
        return str;
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }

    /* loaded from: classes2.dex */
    public class k extends com.ironsource.sdk.service.Connectivity.b {
        public k(JSONObject jSONObject, Context context) {
            super(context, jSONObject);
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a() {
            x xVar = x.this;
            if (xVar.A) {
                xVar.d("none");
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str) {
            x xVar = x.this;
            if (xVar.A) {
                xVar.d(str);
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str, JSONObject jSONObject) {
            if (jSONObject != null) {
                x xVar = x.this;
                if (xVar.A) {
                    try {
                        jSONObject.put("connectionType", str);
                        Logger.i(xVar.f26266t, "device connection info changed: " + jSONObject.toString());
                        xVar.b(x.b("connectionInfoChanged", x.a("connectionInfo", jSONObject.toString(), null, null, null, null, null, null, null, false)));
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Web;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        b(n("enterForeground"));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        b(n("enterBackground"));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        a(this.W);
    }

    public final void h() {
        b(n("interceptedUrlToStore"));
    }

    public final void j() {
        try {
            onPause();
        } catch (Throwable th) {
            Logger.i(this.f26266t, "WebViewController: onPause() - " + th);
        }
    }

    public final void k() {
        try {
            onResume();
        } catch (Throwable th) {
            Logger.i(this.f26266t, "WebViewController: onResume() - " + th);
        }
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        com.ironsource.sdk.g.c a10 = this.f26252e0.a(d.e.Interstitial, str);
        return a10 != null && a10.f;
    }

    public final void d(String str) {
        Logger.i(this.f26266t, "device status changed, connection type " + str);
        com.ironsource.sdk.a.b.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    public final void e(String str) {
        com.ironsource.sdk.j.g gVar;
        if (str.equals("forceClose") && (gVar = this.f26264q0) != null) {
            gVar.onCloseRequested();
        }
        b(b("engageEnd", a("action", str, null, null, null, null, null, null, null, false)));
    }

    public final boolean f(String str) {
        List<String> b10 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b10.isEmpty()) {
                return false;
            }
            Iterator<String> it = b10.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    a.AnonymousClass1.a(this.f26263p0.a(), str, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.ironsource.sdk.controller.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r8 = this;
            java.lang.String r0 = "next_mobileController.html"
            com.ironsource.sdk.a.a r1 = new com.ironsource.sdk.a.a
            r1.<init>()
            com.ironsource.sdk.controller.f r2 = r8.U
            int r3 = r2.f26103b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "generalmessage"
            r1.a(r4, r3)
            com.ironsource.sdk.a.f$a r3 = com.ironsource.sdk.a.f.f26014t
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r1.f25984a
            com.ironsource.sdk.a.d.a(r3, r1)
            long r3 = java.lang.System.currentTimeMillis()
            r2.f26102a = r3
            int[] r1 = com.ironsource.sdk.controller.f.c.f26119a
            int r3 = r2.f26104c
            r4 = 1
            int r3 = r3 - r4
            r1 = r1[r3]
            java.lang.String r3 = r2.f
            java.lang.String r5 = r2.f26106e
            if (r1 == r4) goto Lde
            r6 = 2
            if (r1 == r6) goto Ld1
            r6 = 3
            if (r1 == r6) goto L37
            goto Lf1
        L37:
            com.ironsource.sdk.h.c r1 = r2.c()     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r6 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            r6.<init>(r5, r0)     // Catch: java.lang.Exception -> Lf1
            boolean r7 = r6.exists()     // Catch: java.lang.Exception -> Lf1
            if (r7 != 0) goto L57
            boolean r7 = r1.exists()     // Catch: java.lang.Exception -> Lf1
            if (r7 != 0) goto L57
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)     // Catch: java.lang.Exception -> Lf1
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
            goto Lcd
        L57:
            boolean r7 = r6.exists()     // Catch: java.lang.Exception -> Lf1
            if (r7 != 0) goto L74
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> Lf1
            if (r1 == 0) goto L74
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER     // Catch: java.lang.Exception -> Lf1
            r2.f26105d = r0     // Catch: java.lang.Exception -> Lf1
            r2.a(r0)     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> Lf1
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
            goto Lbf
        L74:
            r2.e()     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r1 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            r1.<init>(r5, r0)     // Catch: java.lang.Exception -> Lf1
            java.lang.String r0 = r1.getPath()     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r1 = r2.c()     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Exception -> Lf1
            boolean r0 = com.ironsource.sdk.utils.IronSourceStorageUtils.renameFile(r0, r1)     // Catch: java.lang.Exception -> Lf1
            if (r0 == 0) goto La9
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.PREPARED_CONTROLLER_LOADED     // Catch: java.lang.Exception -> Lf1
            r2.f26105d = r0     // Catch: java.lang.Exception -> Lf1
            r2.a(r0)     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = "fallback_mobileController.html"
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(r0)     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> Lf1
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
            goto Lbf
        La9:
            boolean r0 = r2.d()     // Catch: java.lang.Exception -> Lf1
            if (r0 == 0) goto Lc4
            com.ironsource.sdk.controller.f$b r0 = com.ironsource.sdk.controller.f.b.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER     // Catch: java.lang.Exception -> Lf1
            r2.f26105d = r0     // Catch: java.lang.Exception -> Lf1
            r2.a(r0)     // Catch: java.lang.Exception -> Lf1
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Exception -> Lf1
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
        Lbf:
            r2.b(r0)     // Catch: java.lang.Exception -> Lf1
            r0 = r4
            goto Lf2
        Lc4:
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c     // Catch: java.lang.Exception -> Lf1
            java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)     // Catch: java.lang.Exception -> Lf1
            r0.<init>(r5, r1)     // Catch: java.lang.Exception -> Lf1
        Lcd:
            r2.b(r0)     // Catch: java.lang.Exception -> Lf1
            goto Lf1
        Ld1:
            r2.e()
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c
            java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)
            r0.<init>(r5, r1)
            goto Lee
        Lde:
            com.ironsource.sdk.h.c r0 = r2.c()
            com.ironsource.sdk.utils.IronSourceStorageUtils.deleteFile(r0)
            com.ironsource.sdk.h.c r0 = new com.ironsource.sdk.h.c
            java.lang.String r1 = com.ironsource.sdk.utils.SDKUtils.getFileName(r3)
            r0.<init>(r5, r1)
        Lee:
            r2.b(r0)
        Lf1:
            r0 = 0
        Lf2:
            if (r0 == 0) goto Lf7
            r8.a(r4)
        Lf7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.g():void");
    }

    public final void a(int i10) {
        com.ironsource.sdk.controller.f fVar = this.U;
        if (!(fVar.f26105d != f.b.NONE)) {
            Logger.i(this.f26266t, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb2.append("SDKVersion=");
            sb2.append(sDKVersion);
            sb2.append(ContainerUtils.FIELD_DELIMITER);
        }
        String str = a10.f26564c;
        if (!TextUtils.isEmpty(str)) {
            sb2.append("deviceOs=");
            sb2.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + com.huawei.openalliance.ad.constant.w.bE;
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + com.huawei.openalliance.ad.constant.w.bE + port;
            }
            e0.i.o(sb2, "&protocol=", str2, "&domain=", host);
            if (controllerConfigAsJSONObject.keys().hasNext()) {
                try {
                    String jSONObject = new JSONObject(controllerConfigAsJSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject)) {
                        sb2.append("&controllerConfig");
                        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb2.append(jSONObject);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            sb2.append("&debug=");
            sb2.append(f26249r0);
        }
        String sb3 = sb2.toString();
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            sb3 = String.format("%s&sessionid=%s", sb3, initSDKParams.get("sessionid"));
        }
        this.f26265s.a(new b(controllerConfigAsJSONObject, e0.i.f(fVar.c().toURI().toString(), "?", sb3)));
        this.f = new c(i10).start();
    }

    public static int b() {
        return f26249r0;
    }

    public static String b(String str, String str2) {
        return e0.i.g("SSA_CORE.SDKController.runFunction('", str, "?parameters=", str2, "');");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        r rVar = new r(context);
        com.ironsource.environment.e.a aVar = this.f26265s;
        if (aVar != null) {
            aVar.b(rVar);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        s sVar = new s(context);
        com.ironsource.environment.e.a aVar = this.f26265s;
        if (aVar != null) {
            aVar.b(sVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.ironsource.sdk.g.b r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.a(com.ironsource.sdk.g.b):void");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        b(a(d.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()}))));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar) {
        b(b("destroyBanner", SDKUtils.flatMapToJsonAsString(cVar.a()), "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i10 = f26249r0;
        String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        if (i10 != d.EnumC0343d.MODE_0.f26508d && (i10 < d.EnumC0343d.MODE_1.f26508d || i10 > d.EnumC0343d.MODE_3.f26508d)) {
            str2 = "empty";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("try{");
        sb2.append(str);
        sb2.append("}catch(e){");
        sb2.append(str2);
        sb2.append("}");
        String str3 = "javascript:" + sb2.toString();
        Logger.i(this.f26266t, str3);
        f(new m(sb2, str3));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(b("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f26262o0 = jSONObject;
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        this.W.a(cVar.f26485b, true);
        b(b("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    @Override // com.ironsource.sdk.k.f
    public final void a(com.ironsource.sdk.h.c cVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            String name = cVar.getName();
            String parent = cVar.getParent();
            try {
                b(b("assetCached", a("file", name, "path", q(parent), null, null, null, null, null, false)));
                return;
            } catch (Exception e10) {
                h(name, parent, e10.getMessage());
                return;
            }
        }
        n nVar = new n();
        com.ironsource.sdk.controller.f fVar = this.U;
        if (fVar.f26105d != f.b.NONE) {
            return;
        }
        if (fVar.f26104c == f.a.f26109b) {
            IronSourceStorageUtils.deleteFile(new com.ironsource.sdk.h.c(fVar.f26106e, "fallback_mobileController.html"));
        }
        f.b bVar = f.b.CONTROLLER_FROM_SERVER;
        fVar.f26105d = bVar;
        fVar.a(bVar);
        nVar.run();
    }

    @Override // com.ironsource.sdk.k.f
    public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            h(cVar.getName(), cVar.getParent(), eVar.f26515a);
            return;
        }
        o oVar = new o();
        p pVar = new p(eVar);
        com.ironsource.sdk.controller.f fVar = this.U;
        if (fVar.f26105d != f.b.NONE) {
            return;
        }
        if (fVar.f26104c == f.a.f26109b && fVar.d()) {
            f.b bVar = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.f26105d = bVar;
            fVar.a(bVar);
            oVar.run();
            return;
        }
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.f26103b));
        if (fVar.f26102a > 0) {
            a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f26102a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f26016v, a10.f25984a);
        pVar.run();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.W.a(str, true);
        b(b("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.f26268v = str;
        this.f26269w = str2;
        this.R = bVar;
        g(str, str2, d.e.Banner, cVar, new j());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.f26268v = str;
        this.f26269w = str2;
        this.P = cVar2;
        com.ironsource.sdk.g.b bVar = this.W;
        bVar.f = str;
        bVar.f26476g = str2;
        g(str, str2, d.e.Interstitial, cVar, new f());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.f26268v = str;
        this.f26269w = str2;
        this.O = dVar;
        com.ironsource.sdk.g.b bVar = this.W;
        bVar.f26471a = str;
        bVar.f26472b = str2;
        g(str, str2, d.e.RewardedVideo, cVar, new e());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f26268v = str;
        this.f26269w = str2;
        this.Q = eVar;
        g(str, str2, d.e.OfferWallCredits, null, new i());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26268v = str;
        this.f26269w = str2;
        this.f26270x = map;
        this.Q = eVar;
        com.ironsource.sdk.g.b bVar = this.W;
        bVar.f26479j = map;
        bVar.f26477h = true;
        g(str, str2, d.e.OfferWall, null, new h());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f26270x = map;
        b("SSA_CORE.SDKController.runFunction('showOfferWall','onShowOfferWallSuccess','onShowOfferWallFail');");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        b(a(d.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        b(a(d.e.RewardedVideo, jSONObject));
    }

    public final void a(boolean z10, String str) {
        b(b("viewableChange", a("webview", str, null, null, null, null, null, null, "isViewable", z10)));
    }
}
