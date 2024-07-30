package com.applovin.impl.sdk.e;

import android.app.Activity;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.p f18878a;

    public n(com.applovin.impl.sdk.p pVar) {
        super("TaskInitializeSdk", pVar);
        this.f18878a = pVar;
    }

    private void b() {
        Map<String, Object> d10;
        Map<String, Object> c10;
        if (!this.f18878a.e()) {
            boolean d11 = this.f18878a.N().d();
            String str = "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
            if (this.f18878a.S() != null) {
                if (d11) {
                    str = this.f18878a.Q().d().b() + " (use this for test devices)";
                }
                d10 = this.f18878a.S().b();
                c10 = this.f18878a.S().g();
            } else {
                if (d11) {
                    str = this.f18878a.R().k().b() + " (use this for test devices)";
                }
                d10 = this.f18878a.R().d();
                c10 = this.f18878a.R().c();
            }
            com.applovin.impl.sdk.utils.l lVar = new com.applovin.impl.sdk.utils.l();
            lVar.a().a("=====AppLovin SDK=====");
            lVar.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f18878a.a(com.applovin.impl.sdk.c.b.dT)).a("Ad Review Version", com.applovin.impl.sdk.g.a()).a("OM SDK Version", this.f18878a.ag().c());
            lVar.a("===Device Info===").a("OS", Utils.getAndroidOSInfo()).a(IronSourceConstants.TYPE_GAID, str).a("Model", d10.get("model")).a("Locale", d10.get("locale")).a("Emulator", d10.get("sim")).a("Tablet", d10.get("is_tablet"));
            lVar.a("===App Info===").a("Application ID", c10.get("package_name")).a("Target SDK", c10.get("target_sdk")).a("ExoPlayer Version", Integer.valueOf(Utils.getExoPlayerVersionCode()));
            lVar.a("===SDK Settings===").a("SDK Key", this.f18878a.B()).a("Mediation Provider", this.f18878a.s()).a("TG", com.applovin.impl.sdk.utils.q.a(this.f18878a)).a("AEI", this.f18878a.a(com.applovin.impl.sdk.c.b.ax)).a("MEI", this.f18878a.a(com.applovin.impl.sdk.c.b.ay)).a("Test Mode On", Boolean.valueOf(this.f18878a.av().a())).a("Verbose Logging On", Boolean.valueOf(d11));
            lVar.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(com.applovin.impl.b.a.a(f()));
            com.applovin.impl.b.a.b ae = this.f18878a.ae();
            boolean b10 = ae.b();
            if (b10) {
                lVar.a("===Consent Flow Settings===").a("Enabled", Boolean.valueOf(b10)).a("Privacy Policy URI", ae.c()).a("Terms of Service URI", ae.d());
            }
            lVar.a();
            com.applovin.impl.sdk.y.f("AppLovinSdk", lVar.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0184, code lost:
    
        if (r12.f18878a.d() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01e1, code lost:
    
        r2 = "failed";
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01e2, code lost:
    
        r10.append(r2);
        r10.append(" in ");
        r10.append(java.lang.System.currentTimeMillis() - r6);
        r10.append("ms");
        r8.b(r9, r10.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01de, code lost:
    
        if (r12.f18878a.d() != false) goto L45;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.n.run():void");
    }

    private void a() {
        if (this.f18878a.ao().a()) {
            return;
        }
        Activity x10 = this.f18878a.x();
        if (x10 != null) {
            this.f18878a.ao().a(x10);
        } else {
            this.f18878a.M().a(new z(this.f18878a, true, new Runnable() { // from class: com.applovin.impl.sdk.e.n.2
                @Override // java.lang.Runnable
                public void run() {
                    n.this.f18878a.ao().a(n.this.f18878a.w().a());
                }
            }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        }
    }
}
