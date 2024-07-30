package com.anythink.interstitial.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.g;
import com.anythink.core.common.v;
import com.anythink.interstitial.api.ATInterstitialExListener;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener;
import java.util.Map;

/* loaded from: classes.dex */
public final class d implements CustomInterstitialEventListener {

    /* renamed from: a, reason: collision with root package name */
    ATInterstitialListener f12589a;

    /* renamed from: b, reason: collision with root package name */
    CustomInterstitialAdapter f12590b;

    /* renamed from: c, reason: collision with root package name */
    long f12591c;

    /* renamed from: d, reason: collision with root package name */
    long f12592d;

    /* renamed from: e, reason: collision with root package name */
    int f12593e = 0;
    boolean f = true;

    public d(CustomInterstitialAdapter customInterstitialAdapter, ATInterstitialListener aTInterstitialListener) {
        this.f12589a = aTInterstitialListener;
        this.f12590b = customInterstitialAdapter;
    }

    private static void a(String str) {
        com.anythink.core.common.e.d d10;
        if (!TextUtils.isEmpty(str) && (d10 = v.a().d(str)) != null) {
            v.a().e(str);
            a.a(n.a().g(), str).d(v.a().a(str, d10.a()));
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z10) {
        ATInterstitialListener aTInterstitialListener = this.f12589a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(j.a(this.f12590b), z10);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATInterstitialListener aTInterstitialListener = this.f12589a;
        if (aTInterstitialListener != null && (aTInterstitialListener instanceof ATInterstitialExListener)) {
            ((ATInterstitialExListener) aTInterstitialListener).onDownloadConfirm(context, j.a(this.f12590b), aTNetworkConfirmInfo);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            g.a(trackingInfo, g.i.f5077d, g.i.f, "");
            com.anythink.core.common.j.a.a(n.a().g()).a(6, trackingInfo);
        }
        ATInterstitialListener aTInterstitialListener = this.f12589a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdClicked(j.a(this.f12590b));
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            int i10 = this.f12593e;
            if (i10 == 0) {
                i10 = this.f12590b.getDismissType();
            }
            if (i10 == 0) {
                i10 = 1;
            }
            trackingInfo.y(i10);
            com.anythink.core.common.k.g.a(trackingInfo, g.i.f5078e, g.i.f, "");
            long j10 = this.f12591c;
            if (j10 != 0) {
                com.anythink.core.common.j.c.a(trackingInfo, false, j10, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f12592d);
            }
            com.anythink.core.common.j.c.a(trackingInfo, false);
            try {
                this.f12590b.clearImpressionListener();
                this.f12590b.destory();
            } catch (Throwable unused) {
            }
            ATInterstitialListener aTInterstitialListener = this.f12589a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdClose(j.a(trackingInfo, this.f12590b));
            }
            a(trackingInfo.W());
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        this.f12591c = System.currentTimeMillis();
        this.f12592d = SystemClock.elapsedRealtime();
        j a10 = j.a(this.f12590b);
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            String ilrd = this.f12590b.getILRD();
            if (!TextUtils.isEmpty(ilrd)) {
                trackingInfo.a(ilrd);
            }
            String str = "";
            com.anythink.core.common.k.g.a(trackingInfo, g.i.f5076c, g.i.f, "");
            com.anythink.core.common.j.a.a(n.a().g()).a(4, trackingInfo, this.f12590b.getUnitGroupInfo());
            if (trackingInfo != null) {
                str = trackingInfo.W();
                v.a().a(str, a10);
            }
            if (!TextUtils.isEmpty(str)) {
                a a11 = a.a(n.a().E(), str);
                if (a11.a((ATAdStatusInfo) null)) {
                    a11.a(n.a().E(), 6, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, (Map<String, Object>) null);
                }
            }
        }
        ATInterstitialListener aTInterstitialListener = this.f12589a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdShow(a10);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.f12593e = 3;
            }
            com.anythink.core.common.j.a.a(n.a().g()).a(9, this.f12590b.getTrackingInfo());
            ATInterstitialListener aTInterstitialListener = this.f12589a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoEnd(j.a(this.f12590b));
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        this.f12593e = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.adShowError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (trackingInfo.H() == 66) {
                this.f = false;
            }
            com.anythink.core.common.j.c.a(trackingInfo, errorCode, this.f12590b.getNetworkInfoMap());
            String W = trackingInfo.W();
            a(trackingInfo.W());
            if (!TextUtils.isEmpty(W)) {
                a a10 = a.a(n.a().E(), W);
                if (a10.a((ATAdStatusInfo) null)) {
                    a10.a(n.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null, (Map<String, Object>) null);
                }
            }
        }
        ATInterstitialListener aTInterstitialListener = this.f12589a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.f12590b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            if (this.f) {
                com.anythink.core.common.j.a.a(n.a().g()).a(8, trackingInfo);
                ATInterstitialListener aTInterstitialListener = this.f12589a;
                if (aTInterstitialListener != null) {
                    aTInterstitialListener.onInterstitialAdVideoStart(j.a(this.f12590b));
                }
            }
        }
    }
}
