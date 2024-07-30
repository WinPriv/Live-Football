package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final p f16953a;

    /* renamed from: b, reason: collision with root package name */
    private final y f16954b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<AppLovinFullscreenActivity> f16955c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f16956d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    private Messenger f16957e;

    /* renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0188a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0188a() {
        }

        private void a(FullscreenAdService.b bVar) {
            a(null, bVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f16957e.send(obtain);
            } catch (RemoteException e10) {
                y unused = a.this.f16954b;
                if (y.a()) {
                    a.this.f16954b.b("AppLovinFullscreenActivity", "Failed to forward callback (" + bVar.a() + ")", e10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<a> f16969a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what == FullscreenAdService.b.AD.a() && (aVar = this.f16969a.get()) != null) {
                aVar.a(com.applovin.impl.sdk.ad.b.a(message.getData().getInt(FullscreenAdService.DATA_KEY_AD_SOURCE)), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            } else {
                super.handleMessage(message);
            }
        }

        private b(a aVar) {
            this.f16969a = new WeakReference<>(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, p pVar) {
        this.f16953a = pVar;
        this.f16954b = pVar.L();
        this.f16955c = new WeakReference<>(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f16956d.compareAndSet(false, true)) {
            if (y.a()) {
                this.f16954b.b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f16957e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            obtain.replyTo = new Messenger(new b());
            try {
                if (y.a()) {
                    this.f16954b.b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f16957e.send(obtain);
            } catch (RemoteException e10) {
                if (y.a()) {
                    this.f16954b.b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f16956d.compareAndSet(true, false) && y.a()) {
            this.f16954b.b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.f16955c.get();
        if (appLovinFullscreenActivity != null) {
            if (y.a()) {
                this.f16954b.b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (y.a()) {
            this.f16954b.e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f16953a.M().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.p(jSONObject, d.a(JsonUtils.getString(jSONObject, "zone_id", "")), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f16955c.get();
                    if (appLovinFullscreenActivity != null) {
                        y unused = a.this.f16954b;
                        if (y.a()) {
                            a.this.f16954b.b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C0188a c0188a = new C0188a();
                        com.applovin.impl.adview.activity.b.a.a((e) appLovinAd, c0188a, c0188a, c0188a, null, a.this.f16953a, appLovinFullscreenActivity, new a.InterfaceC0190a() { // from class: com.applovin.impl.adview.activity.a.1.1
                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                            public void a(com.applovin.impl.adview.activity.b.a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.d();
                            }

                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0190a
                            public void a(String str2, Throwable th) {
                                com.applovin.impl.adview.p.a((e) appLovinAd, c0188a, str2, th, appLovinFullscreenActivity);
                            }
                        });
                        return;
                    }
                    y unused2 = a.this.f16954b;
                    if (y.a()) {
                        a.this.f16954b.e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i10) {
                    a.this.a();
                }
            }, this.f16953a));
        } catch (JSONException e10) {
            if (y.a()) {
                this.f16954b.b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a();
        }
    }
}
