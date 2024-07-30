package com.applovin.impl.mediation;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
import java.util.List;

/* loaded from: classes.dex */
public class MaxAdWaterfallInfoImpl implements MaxAdWaterfallInfo {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.a.a f17483a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17484b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17485c;

    /* renamed from: d, reason: collision with root package name */
    private final List<MaxNetworkResponseInfo> f17486d;

    /* renamed from: e, reason: collision with root package name */
    private final long f17487e;

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, long j10, List<MaxNetworkResponseInfo> list) {
        this(aVar, aVar.s(), aVar.t(), j10, list);
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public long getLatencyMillis() {
        return this.f17487e;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public MaxAd getLoadedAd() {
        return this.f17483a;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getName() {
        return this.f17484b;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public List<MaxNetworkResponseInfo> getNetworkResponses() {
        return this.f17486d;
    }

    @Override // com.applovin.mediation.MaxAdWaterfallInfo
    public String getTestName() {
        return this.f17485c;
    }

    public String toString() {
        return "MaxAdWaterfallInfo{name=" + this.f17484b + ", testName=" + this.f17485c + ", networkResponses=" + this.f17486d + ", latencyMillis=" + this.f17487e + '}';
    }

    public MaxAdWaterfallInfoImpl(com.applovin.impl.mediation.a.a aVar, String str, String str2, long j10, List<MaxNetworkResponseInfo> list) {
        this.f17483a = aVar;
        this.f17484b = str;
        this.f17485c = str2;
        this.f17486d = list;
        this.f17487e = j10;
    }
}
