package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxAdapterParametersImpl implements MaxAdapterInitializationParameters, MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters {

    /* renamed from: a, reason: collision with root package name */
    private String f17488a;

    /* renamed from: b, reason: collision with root package name */
    private Map<String, Object> f17489b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f17490c;

    /* renamed from: d, reason: collision with root package name */
    private Bundle f17491d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f17492e;
    private Boolean f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f17493g;

    /* renamed from: h, reason: collision with root package name */
    private String f17494h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17495i;

    /* renamed from: j, reason: collision with root package name */
    private String f17496j;

    /* renamed from: k, reason: collision with root package name */
    private String f17497k;

    /* renamed from: l, reason: collision with root package name */
    private long f17498l;

    /* renamed from: m, reason: collision with root package name */
    private MaxAdFormat f17499m;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.a aVar) {
        MaxAdapterParametersImpl a10 = a((com.applovin.impl.mediation.a.f) aVar);
        a10.f17496j = aVar.r();
        a10.f17497k = aVar.k();
        a10.f17498l = aVar.m();
        return a10;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f17499m;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f17488a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f17498l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f17497k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.f17494h;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f17491d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f17489b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f17490c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f17496j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.f17492e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f17493g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f17495i;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.h hVar, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a10 = a(hVar);
        a10.f17488a = str;
        a10.f17499m = maxAdFormat;
        return a10;
    }

    public static MaxAdapterParametersImpl a(com.applovin.impl.mediation.a.f fVar) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f17488a = fVar.getAdUnitId();
        maxAdapterParametersImpl.f17492e = fVar.aa();
        maxAdapterParametersImpl.f = fVar.ab();
        maxAdapterParametersImpl.f17493g = fVar.ac();
        maxAdapterParametersImpl.f17494h = fVar.ad();
        maxAdapterParametersImpl.f17489b = fVar.af();
        maxAdapterParametersImpl.f17490c = fVar.ag();
        maxAdapterParametersImpl.f17491d = fVar.ah();
        maxAdapterParametersImpl.f17495i = fVar.Z();
        return maxAdapterParametersImpl;
    }
}
