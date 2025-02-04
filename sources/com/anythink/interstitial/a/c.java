package com.anythink.interstitial.a;

import android.content.Context;
import com.anythink.core.api.ATAdInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.common.b.n;
import com.anythink.interstitial.api.ATInterstitialAutoEventListener;
import com.anythink.interstitial.api.ATInterstitialExListener;

/* loaded from: classes.dex */
public final class c implements ATInterstitialExListener {

    /* renamed from: a, reason: collision with root package name */
    ATInterstitialAutoEventListener f12569a;

    public c(ATInterstitialAutoEventListener aTInterstitialAutoEventListener) {
        this.f12569a = aTInterstitialAutoEventListener;
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDeeplinkCallback(final ATAdInfo aTAdInfo, final boolean z10) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onDeeplinkCallback(aTAdInfo, z10);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialExListener
    public final void onDownloadConfirm(final Context context, final ATAdInfo aTAdInfo, final ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.2
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    Context context2 = context;
                    if (context2 == null) {
                        context2 = n.a().E();
                    }
                    aTInterstitialAutoEventListener.onDownloadConfirm(context2, aTAdInfo, aTNetworkConfirmInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClicked(final ATAdInfo aTAdInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.7
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdClicked(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdClose(final ATAdInfo aTAdInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.6
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdClose(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdShow(final ATAdInfo aTAdInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.8
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdShow(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoEnd(final ATAdInfo aTAdInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.4
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoEnd(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoError(final AdError adError) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.5
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoError(adError);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdVideoStart(final ATAdInfo aTAdInfo) {
        n.a().a(new Runnable() { // from class: com.anythink.interstitial.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ATInterstitialAutoEventListener aTInterstitialAutoEventListener = c.this.f12569a;
                if (aTInterstitialAutoEventListener != null) {
                    aTInterstitialAutoEventListener.onInterstitialAdVideoStart(aTAdInfo);
                }
            }
        });
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoaded() {
    }

    @Override // com.anythink.interstitial.api.ATInterstitialListener
    public final void onInterstitialAdLoadFail(AdError adError) {
    }
}
