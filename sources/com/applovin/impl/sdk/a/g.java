package com.applovin.impl.sdk.a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.c.h;
import com.applovin.impl.c.m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.huawei.hms.ads.gl;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class g extends b {

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ boolean f18513h = true;

    /* renamed from: i, reason: collision with root package name */
    private final com.applovin.impl.c.a f18514i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f18515j;

    /* renamed from: k, reason: collision with root package name */
    private MediaEvents f18516k;

    /* renamed from: l, reason: collision with root package name */
    private final VastProperties f18517l;

    /* renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f18518m;

    /* renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f18519n;
    private final AtomicBoolean o;

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f18520p;

    public g(com.applovin.impl.c.a aVar) {
        super(aVar);
        this.f18515j = new AtomicBoolean();
        this.f18518m = new AtomicBoolean();
        this.f18519n = new AtomicBoolean();
        this.o = new AtomicBoolean();
        this.f18520p = new AtomicBoolean();
        this.f18514i = aVar;
        float i10 = (float) aVar.i();
        if (aVar.i() == -1) {
            this.f18517l = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        } else {
            this.f18517l = VastProperties.createVastPropertiesForSkippableMedia(i10, true, Position.STANDALONE);
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void c() {
        a("track loaded", new Runnable() { // from class: com.applovin.impl.sdk.a.g.1
            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                gVar.f18492g.loaded(gVar.f18517l);
            }
        });
    }

    public void f() {
        if (this.f18519n.compareAndSet(false, true)) {
            a("track first quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.7
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f18516k.firstQuartile();
                }
            });
        }
    }

    public void g() {
        if (this.o.compareAndSet(false, true)) {
            a("track midpoint", new Runnable() { // from class: com.applovin.impl.sdk.a.g.8
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f18516k.midpoint();
                }
            });
        }
    }

    public void h() {
        if (this.f18520p.compareAndSet(false, true)) {
            a("track third quartile", new Runnable() { // from class: com.applovin.impl.sdk.a.g.9
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f18516k.thirdQuartile();
                }
            });
        }
    }

    public void i() {
        a("track completed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.10
            @Override // java.lang.Runnable
            public void run() {
                g.this.f18516k.complete();
            }
        });
    }

    public void j() {
        a("track paused", new Runnable() { // from class: com.applovin.impl.sdk.a.g.11
            @Override // java.lang.Runnable
            public void run() {
                g.this.f18516k.pause();
            }
        });
    }

    public void k() {
        a("track resumed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.12
            @Override // java.lang.Runnable
            public void run() {
                g.this.f18516k.resume();
            }
        });
    }

    public void l() {
        if (this.f18515j.compareAndSet(false, true)) {
            a("buffer started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.13
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f18516k.bufferStart();
                }
            });
        }
    }

    public void m() {
        if (this.f18515j.compareAndSet(true, false)) {
            a("buffer finished", new Runnable() { // from class: com.applovin.impl.sdk.a.g.2
                @Override // java.lang.Runnable
                public void run() {
                    g.this.f18516k.bufferFinish();
                }
            });
        }
    }

    public void n() {
        a("track skipped", new Runnable() { // from class: com.applovin.impl.sdk.a.g.4
            @Override // java.lang.Runnable
            public void run() {
                g.this.f18516k.skipped();
            }
        });
    }

    public void o() {
        a("track clicked", new Runnable() { // from class: com.applovin.impl.sdk.a.g.5
            @Override // java.lang.Runnable
            public void run() {
                g.this.f18516k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionContext a(WebView webView) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        if (!f18513h && this.f18514i.aY() == null) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        for (com.applovin.impl.c.b bVar : this.f18514i.aY().a()) {
            List<h> b10 = bVar.b();
            if (b10.isEmpty()) {
                m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.f18488b);
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (h hVar : b10) {
                    if (com.anythink.expressad.foundation.d.c.aM.equalsIgnoreCase(hVar.a())) {
                        arrayList2.add(hVar);
                    }
                }
                if (arrayList2.isEmpty()) {
                    m.a(bVar.d(), com.applovin.impl.c.f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED, this.f18488b);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList3.add(new URL(((h) it.next()).b()));
                        } catch (Throwable th) {
                            if (y.a()) {
                                this.f18489c.b(this.f18490d, "Failed to parse JavaScript resource url", th);
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.f18488b);
                    } else {
                        String c10 = bVar.c();
                        String a10 = bVar.a();
                        if (StringUtils.isValidString(c10) && !StringUtils.isValidString(a10)) {
                            m.a(bVar.d(), com.applovin.impl.c.f.FAILED_TO_LOAD_RESOURCE, this.f18488b);
                        } else {
                            Iterator it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                URL url = (URL) it2.next();
                                if (StringUtils.isValidString(c10)) {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(a10, url, c10);
                                } else {
                                    createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                }
                                arrayList.add(createVerificationScriptResourceWithoutParameters);
                            }
                        }
                    }
                }
            }
        }
        String e10 = this.f18488b.ag().e();
        if (TextUtils.isEmpty(e10)) {
            if (y.a()) {
                this.f18489c.e(this.f18490d, "JavaScript SDK content not loaded successfully");
            }
            return null;
        }
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f18488b.ag().d(), e10, arrayList, this.f18514i.getOpenMeasurementContentUrl(), this.f18514i.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th2) {
            if (!y.a()) {
                return null;
            }
            this.f18489c.b(this.f18490d, "Failed to create ad session context", th2);
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public AdSessionConfiguration a() {
        try {
            CreativeType creativeType = CreativeType.VIDEO;
            ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Throwable th) {
            if (y.a()) {
                this.f18489c.b(this.f18490d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.a.b
    public void a(AdSession adSession) {
        try {
            this.f18516k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (y.a()) {
                this.f18489c.b(this.f18490d, "Failed to create media events", th);
            }
        }
    }

    public void a(final float f, final boolean z10) {
        if (this.f18518m.compareAndSet(false, true)) {
            a("track started", new Runnable() { // from class: com.applovin.impl.sdk.a.g.6
                @Override // java.lang.Runnable
                public void run() {
                    float f10;
                    MediaEvents mediaEvents = g.this.f18516k;
                    float f11 = f;
                    if (z10) {
                        f10 = gl.Code;
                    } else {
                        f10 = 1.0f;
                    }
                    mediaEvents.start(f11, f10);
                }
            });
        }
    }

    public void a(final boolean z10) {
        a("track volume changed", new Runnable() { // from class: com.applovin.impl.sdk.a.g.3
            @Override // java.lang.Runnable
            public void run() {
                float f;
                MediaEvents mediaEvents = g.this.f18516k;
                if (z10) {
                    f = gl.Code;
                } else {
                    f = 1.0f;
                }
                mediaEvents.volumeChange(f);
            }
        });
    }
}
