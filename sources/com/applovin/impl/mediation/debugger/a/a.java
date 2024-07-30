package com.applovin.impl.mediation.debugger.a;

import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class a implements DTBAdCallback {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdFormat f17897a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0207a f17898b;

    /* renamed from: c, reason: collision with root package name */
    private DTBAdRequest f17899c;

    /* renamed from: com.applovin.impl.mediation.debugger.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0207a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public a(b bVar, MaxAdFormat maxAdFormat, InterfaceC0207a interfaceC0207a) {
        this((List<?>) Arrays.asList(bVar.a()), maxAdFormat, interfaceC0207a);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f17899c;
        if (dTBAdRequest == null) {
            this.f17898b.onAdLoadFailed(null, this.f17897a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f17898b.onAdLoadFailed(adError, this.f17897a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f17898b.onAdResponseLoaded(dTBAdResponse, this.f17897a);
    }

    public a(List<?> list, MaxAdFormat maxAdFormat, InterfaceC0207a interfaceC0207a) {
        this.f17897a = maxAdFormat;
        this.f17898b = interfaceC0207a;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            this.f17899c = dTBAdRequest;
            dTBAdRequest.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}
