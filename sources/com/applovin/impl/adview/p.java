package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class p implements AppLovinInterstitialAdDialog {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.p f17182a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f17183b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, Object> f17184c = Collections.synchronizedMap(CollectionUtils.map());

    /* renamed from: d, reason: collision with root package name */
    private volatile AppLovinAdLoadListener f17185d;

    /* renamed from: e, reason: collision with root package name */
    private volatile AppLovinAdDisplayListener f17186e;
    private volatile AppLovinAdVideoPlaybackListener f;

    /* renamed from: g, reason: collision with root package name */
    private volatile AppLovinAdClickListener f17187g;

    /* renamed from: h, reason: collision with root package name */
    private volatile com.applovin.impl.sdk.ad.e f17188h;

    /* renamed from: com.applovin.impl.adview.p$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f17194a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f17195b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f17196c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f17197d;

        public AnonymousClass3(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j10) {
            this.f17194a = context;
            this.f17195b = viewGroup;
            this.f17196c = appLovinFullscreenAdViewObserver;
            this.f17197d = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.f17194a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.3.1
                @Override // java.lang.Runnable
                public void run() {
                    p.this.f17182a.L();
                    if (com.applovin.impl.sdk.y.a()) {
                        p.this.f17182a.L().b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + AnonymousClass3.this.f17195b + ")");
                    }
                    AnonymousClass3.this.f17195b.setBackgroundColor(-16777216);
                    com.applovin.impl.sdk.ad.e eVar = p.this.f17188h;
                    AppLovinAdClickListener appLovinAdClickListener = p.this.f17187g;
                    AppLovinAdDisplayListener appLovinAdDisplayListener = p.this.f17186e;
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = p.this.f;
                    Map map = p.this.f17184c;
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    com.applovin.impl.adview.activity.b.a.a(eVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener, map, p.this.f17182a, (Activity) anonymousClass3.f17194a, new a.InterfaceC0190a() { // from class: com.applovin.impl.adview.p.3.1.1
                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                        public void a(com.applovin.impl.adview.activity.b.a aVar) {
                            if (com.applovin.impl.sdk.utils.b.a((Activity) AnonymousClass3.this.f17194a)) {
                                com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                                p.a(p.this.f17188h, p.this.f17186e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, null);
                                return;
                            }
                            AnonymousClass3.this.f17196c.setPresenter(aVar);
                            try {
                                aVar.a(AnonymousClass3.this.f17195b);
                            } catch (Throwable th) {
                                String str = "Failed to show interstitial: presenter threw exception " + th;
                                com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", str);
                                p.a(p.this.f17188h, p.this.f17186e, str, null, null);
                            }
                        }

                        @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                        public void a(String str, Throwable th) {
                            p.a(p.this.f17188h, p.this.f17186e, str, th, null);
                        }
                    });
                }
            }, this.f17197d);
        }
    }

    public p(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk != null) {
            if (context != null) {
                this.f17182a = appLovinSdk.coreSdk;
                this.f17183b = new WeakReference<>(context);
                return;
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    private void g() {
        if (this.f17182a.w().b() == null) {
            this.f17182a.P().a(com.applovin.impl.sdk.d.f.o);
        }
    }

    private Context h() {
        return this.f17183b.get();
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f17187g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f17186e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f17185d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            this.f17184c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.p.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                p.this.b(appLovinAd);
                p.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i10) {
                p.this.a(i10);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f17182a);
        Context h10 = h();
        if (!a(maybeRetrieveNonDummyAd, appLovinAd, h10)) {
            a(appLovinAd);
        } else {
            a((com.applovin.impl.sdk.ad.e) maybeRetrieveNonDummyAd, h10);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    public Map<String, Object> b() {
        return this.f17184c;
    }

    public AppLovinAdDisplayListener c() {
        return this.f17186e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f;
    }

    public AppLovinAdClickListener e() {
        return this.f17187g;
    }

    public com.applovin.impl.sdk.ad.e f() {
        return this.f17188h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.5
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.f17185d != null) {
                    p.this.f17185d.adReceived(appLovinAd);
                }
            }
        });
    }

    public static void a(com.applovin.impl.sdk.ad.e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        com.applovin.impl.sdk.y.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof com.applovin.impl.sdk.ad.h) {
            com.applovin.impl.sdk.utils.k.a(appLovinAdDisplayListener, str);
        } else {
            com.applovin.impl.sdk.utils.k.b(appLovinAdDisplayListener, eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, androidx.lifecycle.i iVar) {
        if (viewGroup != null && iVar != null) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f17182a);
            Context h10 = h();
            if (!a(maybeRetrieveNonDummyAd, appLovinAd, h10)) {
                a(appLovinAd);
                return;
            }
            AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(iVar, this, this.f17182a);
            iVar.a(appLovinFullscreenAdViewObserver);
            a((com.applovin.impl.sdk.ad.e) maybeRetrieveNonDummyAd, viewGroup, appLovinFullscreenAdViewObserver, h10);
            return;
        }
        com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
        a(appLovinAd);
    }

    public void a() {
        this.f17187g = null;
        this.f17185d = null;
        this.f = null;
        this.f17186e = null;
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f17182a.E().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private boolean a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return false;
        }
        if (appLovinAd == null) {
            com.applovin.impl.sdk.y.i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd2);
            return false;
        }
        if (((AppLovinAdImpl) appLovinAd).hasShown() && ((Boolean) this.f17182a.a(com.applovin.impl.sdk.c.b.f18716cn)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        }
        if (appLovinAd instanceof com.applovin.impl.sdk.ad.e) {
            return true;
        }
        this.f17182a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f17182a.L().e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + appLovinAd + "'");
        }
        return false;
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, final Context context) {
        g();
        this.f17188h = eVar;
        final long max = Math.max(0L, ((Long) this.f17182a.a(com.applovin.impl.sdk.c.b.cz)).longValue());
        this.f17182a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f17182a.L().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(eVar, context, new Runnable() { // from class: com.applovin.impl.adview.p.2
            @Override // java.lang.Runnable
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.p.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        p.this.f17182a.L();
                        if (com.applovin.impl.sdk.y.a()) {
                            p.this.f17182a.L().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        p.this.a(context);
                    }
                }, max);
            }
        });
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        g();
        this.f17188h = eVar;
        long max = Math.max(0L, ((Long) this.f17182a.a(com.applovin.impl.sdk.c.b.cz)).longValue());
        this.f17182a.L();
        if (com.applovin.impl.sdk.y.a()) {
            this.f17182a.L().b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(eVar, context, new AnonymousClass3(context, viewGroup, appLovinFullscreenAdViewObserver, max));
    }

    private void a(com.applovin.impl.sdk.ad.e eVar, Context context, final Runnable runnable) {
        if (TextUtils.isEmpty(eVar.N()) && eVar.ah() && !com.applovin.impl.sdk.utils.i.a(context) && (context instanceof Activity)) {
            AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.ai()).setMessage(eVar.aj()).setPositiveButton(eVar.ak(), (DialogInterface.OnClickListener) null).create();
            create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.p.4
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            create.show();
            return;
        }
        runnable.run();
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.f17186e != null) {
            this.f17186e.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f17182a.B());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f17182a.w().b() == null && ((Boolean) this.f17182a.a(com.applovin.impl.sdk.c.b.cU)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i10) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.p.6
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.f17185d != null) {
                    p.this.f17185d.failedToReceiveAd(i10);
                }
            }
        });
    }
}
