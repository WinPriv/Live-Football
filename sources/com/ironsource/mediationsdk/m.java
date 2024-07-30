package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyBannerListener;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public ISDemandOnlyBannerListener f25591a = null;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25592s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25593t;

        public a(String str, IronSourceError ironSourceError) {
            this.f25592s = str;
            this.f25593t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StringBuilder sb2 = new StringBuilder("onBannerAdLoadFailed() error = ");
            IronSourceError ironSourceError = this.f25593t;
            sb2.append(ironSourceError.getErrorMessage());
            String sb3 = sb2.toString();
            String str = this.f25592s;
            m.b(str, sb3);
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = m.this.f25591a;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdLoadFailed(str, ironSourceError);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25595s;

        public b(String str) {
            this.f25595s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f25595s;
            m.b(str, "onBannerAdLoaded()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = m.this.f25591a;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdLoaded(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25597s;

        public c(String str) {
            this.f25597s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f25597s;
            m.b(str, "onBannerAdShown()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = m.this.f25591a;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdShown(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25599s;

        public d(String str) {
            this.f25599s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f25599s;
            m.b(str, "onBannerAdClicked()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = m.this.f25591a;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdClicked(str);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25601s;

        public e(String str) {
            this.f25601s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = this.f25601s;
            m.b(str, "onBannerAdLeftApplication()");
            ISDemandOnlyBannerListener iSDemandOnlyBannerListener = m.this.f25591a;
            if (iSDemandOnlyBannerListener != null) {
                iSDemandOnlyBannerListener.onBannerAdLeftApplication(str);
            }
        }
    }

    public static /* synthetic */ void b(String str, String str2) {
        IronLog.CALLBACK.info("Instance: " + str + " " + str2);
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.f25591a != null) {
            com.ironsource.environment.e.c.f24668a.b(new a(str, ironSourceError));
        }
    }
}
