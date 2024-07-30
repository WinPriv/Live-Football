package com.applovin.impl.adview.activity.b;

import a3.l;
import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.applovin.impl.adview.m;
import com.applovin.impl.adview.u;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.huawei.hms.ads.gl;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: v, reason: collision with root package name */
    private final com.applovin.impl.adview.activity.a.b f17025v;

    /* renamed from: w, reason: collision with root package name */
    private com.applovin.impl.sdk.utils.f f17026w;

    /* renamed from: x, reason: collision with root package name */
    private long f17027x;
    private final AtomicBoolean y;

    public b(com.applovin.impl.sdk.ad.e eVar, Activity activity, Map<String, Object> map, p pVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(eVar, activity, map, pVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        this.f17025v = new com.applovin.impl.adview.activity.a.b(this.f16982a, this.f16986e, this.f16983b);
        this.y = new AtomicBoolean();
    }

    private long c() {
        com.applovin.impl.sdk.ad.e eVar = this.f16982a;
        if (eVar instanceof com.applovin.impl.sdk.ad.a) {
            float l10 = ((com.applovin.impl.sdk.ad.a) eVar).l();
            if (l10 <= gl.Code) {
                l10 = (float) this.f16982a.t();
            }
            return (long) ((this.f16982a.R() / 100.0d) * Utils.secondsToMillisLong(l10));
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void a() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void d() {
        a((ViewGroup) null);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void h() {
        m();
        com.applovin.impl.sdk.utils.f fVar = this.f17026w;
        if (fVar != null) {
            fVar.a();
            this.f17026w = null;
        }
        super.h();
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void m() {
        com.applovin.impl.sdk.utils.f fVar;
        boolean r10 = r();
        int i10 = 100;
        if (t()) {
            if (!r10 && (fVar = this.f17026w) != null) {
                i10 = (int) Math.min(100.0d, ((this.f17027x - fVar.b()) / this.f17027x) * 100.0d);
            }
            if (y.a()) {
                this.f16984c.b("AppLovinFullscreenActivity", "Ad engaged at " + i10 + "%");
            }
        }
        super.a(i10, false, r10, -2L);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean r() {
        if (t()) {
            return this.y.get();
        }
        return true;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public boolean s() {
        return false;
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void u() {
        long ae;
        long millis;
        long j10 = 0;
        if (this.f16982a.ad() >= 0 || this.f16982a.ae() >= 0) {
            if (this.f16982a.ad() >= 0) {
                ae = this.f16982a.ad();
            } else {
                if (this.f16982a.af()) {
                    int l10 = (int) ((com.applovin.impl.sdk.ad.a) this.f16982a).l();
                    if (l10 > 0) {
                        millis = TimeUnit.SECONDS.toMillis(l10);
                    } else {
                        int t10 = (int) this.f16982a.t();
                        if (t10 > 0) {
                            millis = TimeUnit.SECONDS.toMillis(t10);
                        }
                    }
                    j10 = 0 + millis;
                }
                ae = (long) ((this.f16982a.ae() / 100.0d) * j10);
            }
            b(ae);
        }
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void w() {
        super.w();
        this.f17025v.a(this.f16989i);
        this.f16991k = SystemClock.elapsedRealtime();
        this.y.set(true);
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(long j10) {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void a(ViewGroup viewGroup) {
        this.f17025v.a(this.f16988h, this.f16987g, this.f, viewGroup);
        a(false);
        u uVar = this.f16987g;
        if (uVar != null) {
            uVar.a();
        }
        this.f.renderAd(this.f16982a);
        a("javascript:al_onPoststitialShow();", this.f16982a.S());
        if (t()) {
            long c10 = c();
            this.f17027x = c10;
            if (c10 > 0) {
                if (y.a()) {
                    this.f16984c.b("AppLovinFullscreenActivity", l.n(new StringBuilder("Scheduling timer for ad fully watched in "), this.f17027x, "ms..."));
                }
                this.f17026w = com.applovin.impl.sdk.utils.f.a(this.f17027x, this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        y yVar = b.this.f16984c;
                        if (y.a()) {
                            b.this.f16984c.b("AppLovinFullscreenActivity", "Marking ad as fully watched");
                        }
                        b.this.y.set(true);
                    }
                });
            }
        }
        if (this.f16988h != null) {
            if (this.f16982a.t() >= 0) {
                a(this.f16988h, this.f16982a.t(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.f16991k = SystemClock.elapsedRealtime();
                    }
                });
            } else {
                this.f16988h.setVisibility(0);
            }
        }
        u();
        this.f16983b.M().a(new z(this.f16983b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = new ArrayList();
                m mVar = b.this.f16988h;
                if (mVar != null) {
                    arrayList.add(new com.applovin.impl.sdk.a.d(mVar, FriendlyObstructionPurpose.CLOSE_AD, "close button"));
                }
                u uVar2 = b.this.f16987g;
                if (uVar2 != null && uVar2.b()) {
                    u uVar3 = b.this.f16987g;
                    arrayList.add(new com.applovin.impl.sdk.a.d(uVar3, FriendlyObstructionPurpose.NOT_VISIBLE, uVar3.getIdentifier()));
                }
                b.this.f16982a.o().a(b.this.f, arrayList);
            }
        }), o.a.MAIN, TimeUnit.SECONDS.toMillis(1L));
        v();
        super.b(Utils.isVideoMutedInitially(this.f16983b));
    }

    @Override // com.applovin.impl.sdk.b.b.a
    public void b() {
    }

    @Override // com.applovin.impl.adview.activity.b.a
    public void e() {
    }
}
