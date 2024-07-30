package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;

/* loaded from: classes2.dex */
public final class ad {

    /* renamed from: b, reason: collision with root package name */
    public static final ad f25104b = new ad();

    /* renamed from: a, reason: collision with root package name */
    public ISDemandOnlyRewardedVideoListener f25105a = null;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25106s;

        public a(String str) {
            this.f25106s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25106s;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadSuccess(str);
            ad.b("onRewardedVideoAdLoadSuccess() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25108s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25109t;

        public b(String str, IronSourceError ironSourceError) {
            this.f25108s = str;
            this.f25109t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25108s;
            IronSourceError ironSourceError = this.f25109t;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdLoadFailed(str, ironSourceError);
            ad.b("onRewardedVideoAdLoadFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25111s;

        public c(String str) {
            this.f25111s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25111s;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdOpened(str);
            ad.b("onRewardedVideoAdOpened() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25113s;

        public d(String str) {
            this.f25113s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25113s;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdClosed(str);
            ad.b("onRewardedVideoAdClosed() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25115s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f25116t;

        public e(String str, IronSourceError ironSourceError) {
            this.f25115s = str;
            this.f25116t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25115s;
            IronSourceError ironSourceError = this.f25116t;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdShowFailed(str, ironSourceError);
            ad.b("onRewardedVideoAdShowFailed() instanceId=" + str + "error=" + ironSourceError.getErrorMessage());
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25118s;

        public f(String str) {
            this.f25118s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25118s;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdClicked(str);
            ad.b("onRewardedVideoAdClicked() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class g implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f25120s;

        public g(String str) {
            this.f25120s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener = ad.this.f25105a;
            String str = this.f25120s;
            iSDemandOnlyRewardedVideoListener.onRewardedVideoAdRewarded(str);
            ad.b("onRewardedVideoAdRewarded() instanceId=" + str);
        }
    }

    private ad() {
    }

    public static ad a() {
        return f25104b;
    }

    public static /* synthetic */ void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new b(str, ironSourceError));
        }
    }

    public final void b(String str, IronSourceError ironSourceError) {
        if (this.f25105a != null) {
            new Handler(Looper.getMainLooper()).post(new e(str, ironSourceError));
        }
    }
}
