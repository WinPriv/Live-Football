package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final E f24756b = new E();

    /* renamed from: a, reason: collision with root package name */
    public ISDemandOnlyInterstitialListener f24757a = null;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24758s;

        public a(String str) {
            this.f24758s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24758s;
            iSDemandOnlyInterstitialListener.onInterstitialAdReady(str);
            E.b("onInterstitialAdReady() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24760s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24761t;

        public b(String str, IronSourceError ironSourceError) {
            this.f24760s = str;
            this.f24761t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24760s;
            IronSourceError ironSourceError = this.f24761t;
            iSDemandOnlyInterstitialListener.onInterstitialAdLoadFailed(str, ironSourceError);
            E.b("onInterstitialAdLoadFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24763s;

        public c(String str) {
            this.f24763s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24763s;
            iSDemandOnlyInterstitialListener.onInterstitialAdOpened(str);
            E.b("onInterstitialAdOpened() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class d implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24765s;

        public d(String str) {
            this.f24765s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24765s;
            iSDemandOnlyInterstitialListener.onInterstitialAdClosed(str);
            E.b("onInterstitialAdClosed() instanceId=" + str);
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24767s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ IronSourceError f24768t;

        public e(String str, IronSourceError ironSourceError) {
            this.f24767s = str;
            this.f24768t = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24767s;
            IronSourceError ironSourceError = this.f24768t;
            iSDemandOnlyInterstitialListener.onInterstitialAdShowFailed(str, ironSourceError);
            E.b("onInterstitialAdShowFailed() instanceId=" + str + " error=" + ironSourceError.getErrorMessage());
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f24770s;

        public f(String str) {
            this.f24770s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener = E.this.f24757a;
            String str = this.f24770s;
            iSDemandOnlyInterstitialListener.onInterstitialAdClicked(str);
            E.b("onInterstitialAdClicked() instanceId=" + str);
        }
    }

    private E() {
    }

    public static E a() {
        return f24756b;
    }

    public static /* synthetic */ void b(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    public final void a(String str, IronSourceError ironSourceError) {
        if (this.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new b(str, ironSourceError));
        }
    }

    public final void b(String str, IronSourceError ironSourceError) {
        if (this.f24757a != null) {
            new Handler(Looper.getMainLooper()).post(new e(str, ironSourceError));
        }
    }
}
