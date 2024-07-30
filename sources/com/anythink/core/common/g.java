package com.anythink.core.common;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.SystemClock;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.ai;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    protected ai f5817a;

    /* renamed from: b, reason: collision with root package name */
    protected com.anythink.core.common.e.e f5818b;

    /* renamed from: c, reason: collision with root package name */
    protected com.anythink.core.c.d f5819c;

    /* renamed from: d, reason: collision with root package name */
    boolean f5820d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5821e;

    /* loaded from: classes.dex */
    public class a implements ATCustomLoadListener {

        /* renamed from: a, reason: collision with root package name */
        ATBaseAdAdapter f5825a;

        /* renamed from: b, reason: collision with root package name */
        long f5826b;

        public /* synthetic */ a(g gVar, long j10, ATBaseAdAdapter aTBaseAdAdapter, byte b10) {
            this(j10, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(BaseAd... baseAdArr) {
            List<? extends BaseAd> list;
            g gVar = g.this;
            long j10 = this.f5826b;
            ATBaseAdAdapter aTBaseAdAdapter = this.f5825a;
            if (baseAdArr != null) {
                list = Arrays.asList(baseAdArr);
            } else {
                list = null;
            }
            gVar.a(j10, aTBaseAdAdapter, list);
            ATBaseAdAdapter aTBaseAdAdapter2 = this.f5825a;
            if (aTBaseAdAdapter2 != null) {
                aTBaseAdAdapter2.releaseLoadResource();
            }
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            g.a(this.f5826b, this.f5825a);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(String str, String str2) {
            g gVar = g.this;
            long j10 = this.f5826b;
            ATBaseAdAdapter aTBaseAdAdapter = this.f5825a;
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
            com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
            if (!gVar.f5820d) {
                gVar.f5820d = true;
                com.anythink.core.common.j.c.a(trackingInfo, 0, errorCode, SystemClock.elapsedRealtime() - j10);
                com.anythink.core.common.k.g.a(trackingInfo, g.i.f5075b, g.i.f5079g, errorCode.printStackTrace());
            }
            ATBaseAdAdapter aTBaseAdAdapter2 = this.f5825a;
            if (aTBaseAdAdapter2 != null) {
                aTBaseAdAdapter2.releaseLoadResource();
            }
        }

        private a(long j10, ATBaseAdAdapter aTBaseAdAdapter) {
            this.f5826b = j10;
            this.f5825a = aTBaseAdAdapter;
        }
    }

    public g(long j10, long j11, ai aiVar, com.anythink.core.common.e.e eVar) {
        super(j10, j11);
        this.f5821e = "g";
        this.f5820d = false;
        this.f5817a = aiVar;
        this.f5818b = eVar;
    }

    private void a(Context context) {
        ATBaseAdAdapter a10 = com.anythink.core.common.k.i.a(this.f5817a);
        if (a10 == null) {
            return;
        }
        com.anythink.core.common.e.e eVar = this.f5818b;
        eVar.f5595q = 1;
        eVar.f5596r = 0;
        eVar.f5597s = 0;
        a10.setTrackingInfo(eVar);
        a10.setUnitGroupInfo(this.f5817a);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.anythink.core.common.j.a.a(context).a(1, this.f5818b);
        com.anythink.core.common.k.g.a(this.f5818b, g.i.f5074a, g.i.f5080h, "");
        this.f5819c = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(this.f5818b.W());
        com.anythink.core.common.a.a().a(this.f5818b.W(), this.f5818b.x());
        this.f5820d = false;
        a10.internalLoad(context, this.f5819c.a(this.f5818b.W(), this.f5818b.X(), a10.getUnitGroupInfo()), v.a().c(this.f5818b.W()), new a(this, elapsedRealtime, a10, (byte) 0));
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Context g6;
        ATBaseAdAdapter a10;
        if (this.f5817a != null && this.f5818b != null && (g6 = com.anythink.core.common.b.n.a().g()) != null && (a10 = com.anythink.core.common.k.i.a(this.f5817a)) != null) {
            com.anythink.core.common.e.e eVar = this.f5818b;
            eVar.f5595q = 1;
            eVar.f5596r = 0;
            eVar.f5597s = 0;
            a10.setTrackingInfo(eVar);
            a10.setUnitGroupInfo(this.f5817a);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            com.anythink.core.common.j.a.a(g6).a(1, this.f5818b);
            com.anythink.core.common.k.g.a(this.f5818b, g.i.f5074a, g.i.f5080h, "");
            this.f5819c = com.anythink.core.c.e.a(com.anythink.core.common.b.n.a().g()).a(this.f5818b.W());
            com.anythink.core.common.a.a().a(this.f5818b.W(), this.f5818b.x());
            this.f5820d = false;
            a10.internalLoad(g6, this.f5819c.a(this.f5818b.W(), this.f5818b.X(), a10.getUnitGroupInfo()), v.a().c(this.f5818b.W()), new a(this, elapsedRealtime, a10, (byte) 0));
        }
    }

    public static void a(long j10, com.anythink.core.common.b.d dVar) {
        dVar.getTrackingInfo().c(SystemClock.elapsedRealtime() - j10);
    }

    public final void a(long j10, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        if (!this.f5820d) {
            this.f5820d = true;
            trackingInfo.d(SystemClock.elapsedRealtime() - j10);
            com.anythink.core.common.j.a.a(com.anythink.core.common.b.n.a().g()).a(2, trackingInfo);
            com.anythink.core.common.k.g.a(trackingInfo, g.i.f5075b, g.i.f, "");
        }
        com.anythink.core.common.a.a().a(trackingInfo.W(), trackingInfo.z(), aTBaseAdAdapter, list, this.f5817a.p());
    }

    private void a(long j10, com.anythink.core.common.b.d dVar, AdError adError) {
        com.anythink.core.common.e.e trackingInfo = dVar.getTrackingInfo();
        if (this.f5820d) {
            return;
        }
        this.f5820d = true;
        com.anythink.core.common.j.c.a(trackingInfo, 0, adError, SystemClock.elapsedRealtime() - j10);
        com.anythink.core.common.k.g.a(trackingInfo, g.i.f5075b, g.i.f5079g, adError.printStackTrace());
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
    }
}
