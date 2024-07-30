package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.c.a;
import com.applovin.impl.c.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;

/* loaded from: classes.dex */
class e extends c {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.c.a f18857b;

    public e(com.applovin.impl.c.a aVar, com.applovin.impl.sdk.p pVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", aVar, pVar, appLovinAdLoadListener);
        this.f18857b = aVar;
    }

    private void j() {
        String str;
        if (b()) {
            return;
        }
        if (this.f18857b.aW()) {
            com.applovin.impl.c.d aQ = this.f18857b.aQ();
            if (aQ != null) {
                com.applovin.impl.c.i b10 = aQ.b();
                if (b10 != null) {
                    Uri b11 = b10.b();
                    if (b11 != null) {
                        str = b11.toString();
                    } else {
                        str = "";
                    }
                    String c10 = b10.c();
                    if (!URLUtil.isValidUrl(str) && !StringUtils.isValidString(c10)) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f18839h.d(this.f18838g, "Companion ad does not have any resources attached. Skipping...");
                            return;
                        }
                        return;
                    }
                    if (b10.a() == i.a.STATIC) {
                        if (com.applovin.impl.sdk.y.a()) {
                            this.f18839h.b(this.f18838g, "Caching static companion ad at " + str + "...");
                        }
                        Uri b12 = b(str, Collections.emptyList(), false);
                        if (b12 != null) {
                            b10.a(b12);
                            this.f18857b.a(true);
                            return;
                        } else {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f18839h.e(this.f18838g, "Failed to cache static companion ad");
                                return;
                            }
                            return;
                        }
                    }
                    if (b10.a() == i.a.HTML) {
                        if (StringUtils.isValidString(str)) {
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f18839h.b(this.f18838g, "Begin caching HTML companion ad. Fetching from " + str + "...");
                            }
                            String c11 = c(str);
                            if (StringUtils.isValidString(c11)) {
                                if (com.applovin.impl.sdk.y.a()) {
                                    this.f18839h.b(this.f18838g, "HTML fetched. Caching HTML now...");
                                }
                                b10.a(a(c11, Collections.emptyList(), this.f18857b));
                                this.f18857b.a(true);
                                return;
                            }
                            if (com.applovin.impl.sdk.y.a()) {
                                this.f18839h.e(this.f18838g, "Unable to load companion ad resources from " + str);
                                return;
                            }
                            return;
                        }
                        if (com.applovin.impl.sdk.y.a()) {
                            a3.k.t("Caching provided HTML for companion ad. No fetch required. HTML: ", c10, this.f18839h, this.f18838g);
                        }
                        b10.a(a(c10, Collections.emptyList(), this.f18857b));
                        this.f18857b.a(true);
                        return;
                    }
                    if (b10.a() == i.a.IFRAME && com.applovin.impl.sdk.y.a()) {
                        this.f18839h.b(this.f18838g, "Skip caching of iFrame resource...");
                        return;
                    }
                    return;
                }
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "Failed to retrieve non-video resources from companion ad. Skipping...");
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Companion ad caching disabled. Skipping...");
        }
    }

    private void k() {
        com.applovin.impl.c.o aP;
        Uri b10;
        if (b()) {
            return;
        }
        if (this.f18857b.aX()) {
            if (this.f18857b.aO() != null && (aP = this.f18857b.aP()) != null && (b10 = aP.b()) != null) {
                Uri a10 = a(b10.toString(), Collections.emptyList(), false);
                if (a10 != null) {
                    if (com.applovin.impl.sdk.y.a()) {
                        this.f18839h.b(this.f18838g, "Video file successfully cached into: " + a10);
                    }
                    aP.a(a10);
                    return;
                }
                if (com.applovin.impl.sdk.y.a()) {
                    this.f18839h.e(this.f18838g, "Failed to cache video file: " + aP);
                    return;
                }
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Video caching disabled. Skipping...");
        }
    }

    private void l() {
        String aU;
        if (b()) {
            return;
        }
        if (this.f18857b.aV() != null) {
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Begin caching HTML template. Fetching from " + this.f18857b.aV() + "...");
            }
            aU = c(this.f18857b.aV().toString(), this.f18857b.I(), this.f18857b.shouldUrlEncodeResourcePath());
        } else {
            aU = this.f18857b.aU();
        }
        if (StringUtils.isValidString(aU)) {
            String a10 = a(aU, this.f18857b.I(), ((c) this).f18844a);
            if (this.f18857b.q() && this.f18857b.isOpenMeasurementEnabled()) {
                a10 = this.f.ag().a(a10);
            }
            this.f18857b.a(a10);
            if (com.applovin.impl.sdk.y.a()) {
                this.f18839h.b(this.f18838g, "Finish caching HTML template " + this.f18857b.aU() + " for ad #" + this.f18857b.getAdIdNumber());
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Unable to load HTML template");
        }
    }

    private void m() {
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Caching play & pause images...");
        }
        Uri a10 = a(((c) this).f18844a.aC(), "play");
        if (a10 != null) {
            ((c) this).f18844a.c(a10);
        }
        Uri a11 = a(((c) this).f18844a.aD(), com.anythink.expressad.foundation.d.c.f9459cb);
        if (a11 != null) {
            ((c) this).f18844a.d(a11);
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Ad updated with playImageFilename = " + ((c) this).f18844a.aC() + ", pauseImageFilename = " + ((c) this).f18844a.aD());
        }
    }

    @Override // com.applovin.impl.sdk.e.c
    public void h() {
        this.f18857b.o().e();
        super.h();
    }

    @Override // com.applovin.impl.sdk.e.c
    public void i() {
        this.f18857b.o().c();
        super.i();
    }

    @Override // com.applovin.impl.sdk.e.c, java.lang.Runnable
    public void run() {
        String str;
        super.run();
        boolean f = this.f18857b.f();
        if (com.applovin.impl.sdk.y.a()) {
            com.applovin.impl.sdk.y yVar = this.f18839h;
            String str2 = this.f18838g;
            StringBuilder sb2 = new StringBuilder("Begin caching for VAST ");
            if (f) {
                str = "streaming ";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("ad #");
            sb2.append(((c) this).f18844a.getAdIdNumber());
            sb2.append("...");
            yVar.b(str2, sb2.toString());
        }
        c();
        m();
        if (f) {
            if (this.f18857b.m()) {
                i();
            }
            a.b l10 = this.f18857b.l();
            a.b bVar = a.b.COMPANION_AD;
            if (l10 == bVar) {
                j();
                l();
            } else {
                k();
            }
            if (!this.f18857b.m()) {
                i();
            }
            if (this.f18857b.l() == bVar) {
                k();
            } else {
                j();
                l();
            }
        } else {
            j();
            k();
            l();
            i();
        }
        if (com.applovin.impl.sdk.y.a()) {
            this.f18839h.b(this.f18838g, "Finished caching VAST ad #" + this.f18857b.getAdIdNumber());
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f18857b.getCreatedAtMillis();
        com.applovin.impl.sdk.d.d.a(this.f18857b, this.f);
        com.applovin.impl.sdk.d.d.a(currentTimeMillis, this.f18857b, this.f);
        a(this.f18857b);
        this.f18857b.b();
        a();
    }
}
