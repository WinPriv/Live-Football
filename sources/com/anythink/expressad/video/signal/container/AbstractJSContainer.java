package com.anythink.expressad.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.video.signal.b;
import com.anythink.expressad.video.signal.e;
import com.anythink.expressad.video.signal.factory.IJSFactory;
import com.anythink.expressad.video.signal.factory.a;
import com.anythink.expressad.video.signal.g;
import com.anythink.expressad.video.signal.i;
import com.anythink.expressad.videocommon.a;
import com.anythink.expressad.videocommon.c.c;
import com.anythink.expressad.videocommon.e.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* renamed from: k, reason: collision with root package name */
    protected static final String f12252k = "AbstractJSContainer";

    /* renamed from: a, reason: collision with root package name */
    private int f12253a;

    /* renamed from: b, reason: collision with root package name */
    private int f12254b;

    /* renamed from: l, reason: collision with root package name */
    protected Activity f12255l;

    /* renamed from: m, reason: collision with root package name */
    protected String f12256m;

    /* renamed from: n, reason: collision with root package name */
    protected String f12257n;
    protected d o;

    /* renamed from: p, reason: collision with root package name */
    protected String f12258p;

    /* renamed from: q, reason: collision with root package name */
    protected c f12259q;

    /* renamed from: r, reason: collision with root package name */
    protected String f12260r;

    /* renamed from: s, reason: collision with root package name */
    protected int f12261s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f12262t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f12263u;

    /* renamed from: v, reason: collision with root package name */
    protected int f12264v;

    /* renamed from: w, reason: collision with root package name */
    protected int f12265w;

    /* renamed from: x, reason: collision with root package name */
    protected int f12266x;
    protected boolean y;

    /* renamed from: z, reason: collision with root package name */
    protected IJSFactory f12267z;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f12253a = 0;
        this.f12254b = 1;
        this.f12261s = 2;
        this.f12262t = false;
        this.f12263u = false;
        this.y = false;
        this.f12267z = new a();
    }

    private static void b(Object obj, String str) {
        j.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public final void a(Object obj) {
        j.a().a(obj, a(this.f12253a));
    }

    public final int c(com.anythink.expressad.foundation.d.c cVar) {
        com.anythink.expressad.video.signal.a.j b10 = b(cVar);
        if (b10 != null) {
            return b10.d();
        }
        return 0;
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.a getActivityProxy() {
        return this.f12267z.getActivityProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f12267z.getIJSRewardVideoV1();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public b getJSBTModule() {
        return this.f12267z.getJSBTModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.c getJSCommon() {
        return this.f12267z.getJSCommon();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public e getJSContainerModule() {
        return this.f12267z.getJSContainerModule();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        return this.f12267z.getJSNotifyProxy();
    }

    @Override // com.anythink.expressad.video.signal.factory.IJSFactory
    public com.anythink.expressad.video.signal.j getJSVideoModule() {
        return this.f12267z.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f12257n;
    }

    public String getUnitId() {
        return this.f12256m;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().g()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().g()) {
            getActivityProxy().c();
        }
    }

    public void onPause() {
        if (getJSCommon().g()) {
            getActivityProxy().a();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().g()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onResume() {
        if (com.anythink.expressad.foundation.f.b.f9758c) {
            return;
        }
        if (getJSCommon().g()) {
            getActivityProxy().b();
        }
        getActivityProxy().a(0);
    }

    public void onStart() {
        if (getJSCommon().g()) {
            getActivityProxy().e();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().g()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(3);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f12267z = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f12255l = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f12263u = z10;
    }

    public void setBigOffer(boolean z10) {
        this.y = z10;
    }

    public void setIV(boolean z10) {
        this.f12262t = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f12264v = i10;
        this.f12265w = i11;
        this.f12266x = i12;
    }

    public void setMute(int i10) {
        this.f12261s = i10;
    }

    public void setPlacementId(String str) {
        this.f12257n = str;
    }

    public void setReward(c cVar) {
        this.f12259q = cVar;
    }

    public void setRewardId(String str) {
        this.f12260r = str;
    }

    public void setRewardUnitSetting(d dVar) {
        this.o = dVar;
    }

    public void setUnitId(String str) {
        this.f12256m = str;
    }

    public void setUserId(String str) {
        this.f12258p = str;
    }

    public static void a(Object obj, String str) {
        j.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    private void b(Object obj) {
        j.a().b(obj, a(this.f12254b));
    }

    private static void a(WindVaneWebView windVaneWebView, String str, String str2) {
        j.a();
        j.a((WebView) windVaneWebView, str, Base64.encodeToString(str2.getBytes(), 2));
    }

    public final com.anythink.expressad.video.signal.a.j b(com.anythink.expressad.foundation.d.c cVar) {
        if (cVar == null) {
            return null;
        }
        a.C0140a a10 = com.anythink.expressad.videocommon.a.a(this.f12262t ? com.anythink.expressad.foundation.g.a.aU : 94, cVar);
        if (a10 != null && a10.c()) {
            WindVaneWebView a11 = a10.a();
            if (a11.getObject() instanceof com.anythink.expressad.video.signal.a.j) {
                o.d(f12252k, "JSCommon 进来");
                return (com.anythink.expressad.video.signal.a.j) a11.getObject();
            }
        }
        return null;
    }

    private static String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            o.d(f12252k, "code to string is error");
            return "";
        }
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12253a = 0;
        this.f12254b = 1;
        this.f12261s = 2;
        this.f12262t = false;
        this.f12263u = false;
        this.y = false;
        this.f12267z = new com.anythink.expressad.video.signal.factory.a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean b(int i10) {
        try {
        } catch (Throwable th) {
            o.b(f12252k, th.getMessage(), th);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                this.f12255l.setRequestedOrientation(11);
            }
            return false;
        }
        this.f12255l.setRequestedOrientation(12);
        return true;
    }

    public void a(String str) {
        o.d(f12252k, str);
        Activity activity = this.f12255l;
        if (activity != null) {
            activity.finish();
        }
    }

    public final void a(d dVar, com.anythink.expressad.foundation.d.c cVar) {
        c.C0119c M;
        if (c(cVar) == 1) {
            return;
        }
        if (((cVar == null || (M = cVar.M()) == null) ? false : b(M.c())) || dVar == null) {
            return;
        }
        b(this.o.b());
    }

    public final String b() {
        d dVar;
        if (TextUtils.isEmpty(this.f12257n) && (dVar = this.o) != null && !TextUtils.isEmpty(dVar.O())) {
            return this.o.O();
        }
        return this.f12257n;
    }
}
