package com.applovin.impl.sdk.ad;

import a3.l;
import android.os.Bundle;
import com.applovin.impl.sdk.p;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f extends AppLovinAdImpl {

    /* renamed from: a, reason: collision with root package name */
    private AppLovinAd f18612a;

    /* renamed from: b, reason: collision with root package name */
    private final d f18613b;

    public f(d dVar, p pVar) {
        super(new JSONObject(), new JSONObject(), b.UNKNOWN, pVar);
        this.f18613b = dVar;
    }

    private AppLovinAd c() {
        return (AppLovinAd) this.sdk.U().c(this.f18613b);
    }

    private String d() {
        d adZone = getAdZone();
        if (adZone != null && !adZone.e()) {
            return adZone.a();
        }
        return null;
    }

    public AppLovinAd a() {
        return this.f18612a;
    }

    public AppLovinAd b() {
        AppLovinAd appLovinAd = this.f18612a;
        if (appLovinAd == null) {
            return c();
        }
        return appLovinAd;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            AppLovinAd b10 = b();
            if (b10 != null) {
                return b10.equals(obj);
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.getAdIdNumber();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public d getAdZone() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        if (appLovinAdImpl != null) {
            return appLovinAdImpl.getAdZone();
        }
        return this.f18613b;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase
    public long getCreatedAtMillis() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getCreatedAtMillis();
        }
        return 0L;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public Bundle getDirectDownloadParameters() {
        return null;
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public String getDirectDownloadToken() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementContentUrl() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public String getOpenMeasurementCustomReferenceData() {
        return null;
    }

    @Override // com.applovin.impl.sdk.a.a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public JSONObject getOriginalFullResponse() {
        AppLovinAd b10 = b();
        if (b10 instanceof AppLovinAdImpl) {
            return ((AppLovinAdImpl) b10).getOriginalFullResponse();
        }
        return null;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdSize getSize() {
        return getAdZone().c();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public b getSource() {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) b();
        if (appLovinAdImpl != null) {
            return appLovinAdImpl.getSource();
        }
        return b.UNKNOWN;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public AppLovinAdType getType() {
        return getAdZone().d();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public String getZoneId() {
        if (this.f18613b.e()) {
            return null;
        }
        return this.f18613b.a();
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public int hashCode() {
        AppLovinAd b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return super.hashCode();
    }

    @Override // com.applovin.impl.sdk.array.ArrayDirectDownloadAd
    public boolean isDirectDownloadEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.a.a
    public boolean isOpenMeasurementEnabled() {
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl, com.applovin.sdk.AppLovinAd
    public boolean isVideoAd() {
        AppLovinAd b10 = b();
        if (b10 != null && b10.isVideoAd()) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.sdk.ad.AppLovinAdImpl
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AppLovinAd{ #");
        sb2.append(getAdIdNumber());
        sb2.append(", adType=");
        sb2.append(getType());
        sb2.append(", adSize=");
        sb2.append(getSize());
        sb2.append(", zoneId='");
        return l.p(sb2, d(), "'}");
    }

    public void a(AppLovinAd appLovinAd) {
        this.f18612a = appLovinAd;
    }
}
