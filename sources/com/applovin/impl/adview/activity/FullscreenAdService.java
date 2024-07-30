package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.p;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.y;

/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* loaded from: classes.dex */
    public static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                p pVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (pVar == null) {
                    if (!Utils.getBooleanForProbability(1)) {
                        super.handleMessage(message);
                        return;
                    } else {
                        throw new RuntimeException("parentWrapper is null for " + message.what);
                    }
                }
                e f = pVar.f();
                int i10 = message.what;
                b bVar = b.AD;
                if (i10 == bVar.a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, f.getRawFullResponse());
                    bundle.putInt(FullscreenAdService.DATA_KEY_AD_SOURCE, f.getSource().a());
                    Message obtain = Message.obtain((Handler) null, bVar.a());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                        return;
                    } catch (RemoteException e10) {
                        y.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e10);
                        return;
                    }
                }
                if (message.what == b.AD_DISPLAYED.a()) {
                    k.a(pVar.c(), f);
                    return;
                }
                if (message.what == b.AD_CLICKED.a()) {
                    k.a(pVar.e(), f);
                    return;
                }
                if (message.what == b.AD_VIDEO_STARTED.a()) {
                    k.a(pVar.d(), f);
                    return;
                }
                if (message.what == b.AD_VIDEO_ENDED.a()) {
                    Bundle data = message.getData();
                    k.a(pVar.d(), f, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == b.AD_HIDDEN.a()) {
                    k.b(pVar.c(), f);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* renamed from: g, reason: collision with root package name */
        private final int f16952g;

        b(int i10) {
            this.f16952g = i10;
        }

        public int a() {
            return this.f16952g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a()).getBinder();
    }
}
