package com.applovin.impl.sdk.a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdkUtils;
import com.huawei.openalliance.ad.constant.w;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinAdBase f18487a;

    /* renamed from: b, reason: collision with root package name */
    protected final p f18488b;

    /* renamed from: c, reason: collision with root package name */
    protected final y f18489c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f18490d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f18491e;
    protected AdSession f;

    /* renamed from: g, reason: collision with root package name */
    protected AdEvents f18492g;

    public b(AppLovinAdBase appLovinAdBase) {
        this.f18487a = appLovinAdBase;
        this.f18488b = appLovinAdBase.getSdk();
        this.f18489c = appLovinAdBase.getSdk().L();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            StringBuilder l10 = com.ironsource.adapters.facebook.a.l(str, w.bE);
            l10.append(appLovinAdBase.getDspName());
            str = l10.toString();
        }
        this.f18490d = str;
    }

    public abstract AdSessionConfiguration a();

    public abstract AdSessionContext a(WebView webView);

    public void a(AdSession adSession) {
    }

    public void b() {
        b(null);
    }

    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.b.2
            @Override // java.lang.Runnable
            public void run() {
                b.this.f18492g.loaded();
            }
        });
    }

    public void d() {
        a("track impression event", new Runnable() { // from class: com.applovin.impl.sdk.a.b.3
            @Override // java.lang.Runnable
            public void run() {
                b.this.f18492g.impressionOccurred();
            }
        });
    }

    public void e() {
        a("stop session", new Runnable() { // from class: com.applovin.impl.sdk.a.b.6
            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f18491e = false;
                bVar.f.finish();
                b bVar2 = b.this;
                bVar2.f = null;
                bVar2.f18492g = null;
            }
        });
    }

    public void a(View view) {
        a(view, Collections.emptyList());
    }

    public void b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                AdSessionContext a10;
                if (!b.this.f18487a.isOpenMeasurementEnabled()) {
                    y yVar = b.this.f18489c;
                    if (y.a()) {
                        b bVar = b.this;
                        bVar.f18489c.c(bVar.f18490d, "Skip starting session - Open Measurement disabled");
                        return;
                    }
                    return;
                }
                b bVar2 = b.this;
                if (bVar2.f != null) {
                    y yVar2 = bVar2.f18489c;
                    if (y.a()) {
                        b bVar3 = b.this;
                        bVar3.f18489c.d(bVar3.f18490d, "Attempting to start session again for ad: " + b.this.f18487a);
                        return;
                    }
                    return;
                }
                y yVar3 = bVar2.f18489c;
                if (y.a()) {
                    b bVar4 = b.this;
                    bVar4.f18489c.b(bVar4.f18490d, "Starting session");
                }
                AdSessionConfiguration a11 = b.this.a();
                if (a11 == null || (a10 = b.this.a(webView)) == null) {
                    return;
                }
                try {
                    b.this.f = AdSession.createAdSession(a11, a10);
                    try {
                        b bVar5 = b.this;
                        bVar5.f18492g = AdEvents.createAdEvents(bVar5.f);
                        b bVar6 = b.this;
                        bVar6.a(bVar6.f);
                        b.this.f.start();
                        b bVar7 = b.this;
                        bVar7.f18491e = true;
                        y yVar4 = bVar7.f18489c;
                        if (y.a()) {
                            b bVar8 = b.this;
                            bVar8.f18489c.b(bVar8.f18490d, "Session started");
                        }
                    } catch (Throwable th) {
                        y yVar5 = b.this.f18489c;
                        if (y.a()) {
                            b bVar9 = b.this;
                            bVar9.f18489c.b(bVar9.f18490d, "Failed to create ad events", th);
                        }
                    }
                } catch (Throwable th2) {
                    y yVar6 = b.this.f18489c;
                    if (y.a()) {
                        b bVar10 = b.this;
                        bVar10.f18489c.b(bVar10.f18490d, "Failed to create session", th2);
                    }
                }
            }
        });
    }

    public void a(final View view, final List<d> list) {
        a("update main view: " + view, new Runnable() { // from class: com.applovin.impl.sdk.a.b.4
            @Override // java.lang.Runnable
            public void run() {
                b.this.f.registerAdView(view);
                b.this.f.removeAllFriendlyObstructions();
                for (d dVar : list) {
                    if (dVar.a() != null) {
                        try {
                            b.this.f.addFriendlyObstruction(dVar.a(), dVar.b(), dVar.c());
                        } catch (Throwable th) {
                            y yVar = b.this.f18489c;
                            if (y.a()) {
                                b bVar = b.this;
                                bVar.f18489c.b(bVar.f18490d, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    public void a(final String str) {
        a("track error", new Runnable() { // from class: com.applovin.impl.sdk.a.b.5
            @Override // java.lang.Runnable
            public void run() {
                b.this.f.error(ErrorType.VIDEO, str);
            }
        });
    }

    public void a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.a.b.7
            @Override // java.lang.Runnable
            public void run() {
                try {
                    b bVar = b.this;
                    if (!bVar.f18491e) {
                        y yVar = bVar.f18489c;
                        if (y.a()) {
                            b bVar2 = b.this;
                            bVar2.f18489c.e(bVar2.f18490d, "Failed to run operation: " + str);
                            return;
                        }
                        return;
                    }
                    y yVar2 = bVar.f18489c;
                    if (y.a()) {
                        b bVar3 = b.this;
                        bVar3.f18489c.b(bVar3.f18490d, "Running operation: " + str);
                    }
                    runnable.run();
                } catch (Throwable th) {
                    y yVar3 = b.this.f18489c;
                    if (y.a()) {
                        b bVar4 = b.this;
                        bVar4.f18489c.b(bVar4.f18490d, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }
}
