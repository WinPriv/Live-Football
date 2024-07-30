package com.applovin.impl.mediation.a;

import android.os.SystemClock;
import com.applovin.impl.sdk.b;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends e implements com.applovin.impl.sdk.ad.g, b.a {

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f17554c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f17555d;

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.b f17556e;
    private WeakReference<a> f;

    /* loaded from: classes.dex */
    public interface a {
        void onAdExpiredOld(d dVar);
    }

    public d(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i10, map, jSONObject, jSONObject2, null, pVar);
        this.f17554c = new AtomicBoolean();
        this.f17555d = new AtomicBoolean();
        this.f = new WeakReference<>(null);
    }

    public MaxNativeAdView C() {
        return ((com.applovin.impl.mediation.a.a) this).f17541a.c();
    }

    public String D() {
        return BundleUtils.getString("template", "", ag());
    }

    public boolean E() {
        return b("inacc", (Boolean) this.f17558b.a(com.applovin.impl.sdk.c.a.V)).booleanValue();
    }

    public boolean F() {
        if (((com.applovin.impl.mediation.a.a) this).f17541a == null) {
            return true;
        }
        return false;
    }

    public AtomicBoolean G() {
        return this.f17554c;
    }

    public AtomicBoolean H() {
        return this.f17555d;
    }

    public long I() {
        long b10 = b("ad_expiration_ms", -1L);
        if (b10 < 0) {
            return a("ad_expiration_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.D)).longValue());
        }
        return b10;
    }

    public void J() {
        a(true);
    }

    @Override // com.applovin.impl.sdk.ad.g
    public long P() {
        return I() - (SystemClock.elapsedRealtime() - w());
    }

    @Override // com.applovin.impl.sdk.ad.g
    public void R() {
        MaxNativeAd nativeAd = getNativeAd();
        if (nativeAd != null) {
            nativeAd.setExpired();
        }
    }

    @Override // com.applovin.impl.mediation.a.a
    public com.applovin.impl.mediation.a.a a(com.applovin.impl.mediation.g gVar) {
        return new d(this, gVar);
    }

    @Override // com.applovin.impl.sdk.b.a
    public void onAdExpired() {
        if (getNativeAd() != null) {
            getNativeAd().setExpired();
        }
        a(false);
        a aVar = this.f.get();
        if (aVar != null) {
            aVar.onAdExpiredOld(this);
            this.f.clear();
        }
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        ((com.applovin.impl.mediation.a.a) this).f17541a.a(maxNativeAdView);
    }

    public void a(a aVar) {
        if (this.f17554c.get() || this.f17556e != null) {
            return;
        }
        com.applovin.impl.sdk.b bVar = new com.applovin.impl.sdk.b(this.f17558b, this);
        this.f17556e = bVar;
        bVar.a(this);
        this.f = new WeakReference<>(aVar);
    }

    private d(d dVar, com.applovin.impl.mediation.g gVar) {
        super(dVar.B(), dVar.af(), dVar.V(), dVar.U(), gVar, dVar.f17558b);
        this.f17554c = new AtomicBoolean();
        this.f17555d = new AtomicBoolean();
        this.f = new WeakReference<>(null);
    }

    private void a(boolean z10) {
        com.applovin.impl.sdk.b bVar = this.f17556e;
        if (bVar != null) {
            bVar.a();
            this.f17556e = null;
        }
        if (z10) {
            this.f.clear();
        }
    }
}
