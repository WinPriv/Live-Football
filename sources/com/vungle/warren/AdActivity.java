package com.vungle.warren;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.anythink.expressad.exoplayer.b;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.OrientationDelegate;
import com.vungle.warren.ui.VungleActivity;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.state.BundleOptionsState;
import com.vungle.warren.ui.state.OptionsState;
import com.vungle.warren.ui.view.FullAdWidget;
import d1.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class AdActivity extends Activity {
    public static final String PRESENTER_STATE = "presenter_state";
    private static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "VungleActivity";
    private static AdContract.AdvertisementPresenter.EventListener bus;
    private BroadcastReceiver broadcastReceiver;
    private AdContract.AdvertisementPresenter presenter;
    private PresentationFactory presenterFactory;
    private AdRequest request;
    private OptionsState state;
    private AtomicBoolean pendingStart = new AtomicBoolean(false);
    private boolean started = false;
    private boolean resumed = false;
    private PresentationFactory.FullScreenCallback fullscreenCallback = new PresentationFactory.FullScreenCallback() { // from class: com.vungle.warren.AdActivity.4
        @Override // com.vungle.warren.PresentationFactory.FullScreenCallback
        public void onResult(Pair<AdContract.AdView, AdContract.AdvertisementPresenter> pair, VungleException vungleException) {
            if (vungleException != null) {
                AdActivity.this.presenterFactory = null;
                AdActivity.this.deliverError(vungleException.getExceptionCode(), AdActivity.this.request);
                AdActivity.this.finish();
                return;
            }
            AdActivity.this.presenter = (AdContract.AdvertisementPresenter) pair.second;
            AdActivity.this.presenter.setEventListener(AdActivity.bus);
            AdActivity.this.presenter.attach((AdContract.AdView) pair.first, AdActivity.this.state);
            if (AdActivity.this.pendingStart.getAndSet(false)) {
                AdActivity.this.start();
            }
        }
    };

    private void connectBroadcastReceiver() {
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.vungle.warren.AdActivity.3
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra(AdContract.AdvertisementBus.COMMAND);
                stringExtra.getClass();
                if (!stringExtra.equals(AdContract.AdvertisementBus.STOP_ALL)) {
                    VungleLogger.warn("AdActivity#connectBroadcastReceiver", String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
                } else {
                    AdActivity.this.finish();
                }
            }
        };
        a.a(getApplicationContext()).b(this.broadcastReceiver, new IntentFilter(AdContract.AdvertisementBus.ACTION));
    }

    public static Intent createIntent(Context context, AdRequest adRequest) {
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        intent.addFlags(268435456);
        Bundle bundle = new Bundle();
        bundle.putSerializable(REQUEST_KEY_EXTRA, adRequest);
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deliverError(int i10, AdRequest adRequest) {
        VungleException vungleException = new VungleException(i10);
        AdContract.AdvertisementPresenter.EventListener eventListener = bus;
        if (eventListener != null) {
            eventListener.onError(vungleException, adRequest.getPlacementId());
        }
        VungleLogger.error("AdActivity#deliverError", vungleException.getLocalizedMessage());
    }

    public static AdContract.AdvertisementPresenter.EventListener getEventListener() {
        return bus;
    }

    public static AdRequest getRequest(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return (AdRequest) extras.getSerializable(REQUEST_KEY_EXTRA);
        }
        return null;
    }

    public static void setEventListener(AdContract.AdvertisementPresenter.EventListener eventListener) {
        bus = eventListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start() {
        if (this.presenter == null) {
            this.pendingStart.set(true);
        } else if (!this.started && this.resumed && hasWindowFocus()) {
            this.presenter.start();
            this.started = true;
        }
    }

    private void stop() {
        int i10;
        if (this.presenter != null && this.started) {
            boolean isChangingConfigurations = isChangingConfigurations();
            if (isFinishing()) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            this.presenter.stop((isChangingConfigurations ? 1 : 0) | i10);
            this.started = false;
        }
        this.pendingStart.set(false);
    }

    public abstract boolean canRotate();

    @Override // android.app.Activity
    @SuppressLint({"ResourceType"})
    public void onBackPressed() {
        AdContract.AdvertisementPresenter advertisementPresenter = this.presenter;
        if (advertisementPresenter != null) {
            advertisementPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        if (i10 == 2) {
            Log.d(TAG, "landscape");
        } else if (i10 == 1) {
            Log.d(TAG, "portrait");
        }
        AdContract.AdvertisementPresenter advertisementPresenter = this.presenter;
        if (advertisementPresenter != null) {
            advertisementPresenter.onViewConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        AdRequest adRequest;
        OptionsState optionsState;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(b.f7294bc, b.f7294bc);
        this.request = getRequest(getIntent());
        ServiceLocator serviceLocator = ServiceLocator.getInstance(this);
        if (((VungleStaticApi) serviceLocator.getService(VungleStaticApi.class)).isInitialized() && bus != null && (adRequest = this.request) != null && !TextUtils.isEmpty(adRequest.getPlacementId())) {
            long currentTimeMillis = System.currentTimeMillis();
            VungleLogger.verbose(true, TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Creating ad, request = %1$s, at: %2$d", this.request, Long.valueOf(currentTimeMillis)));
            try {
                FullAdWidget fullAdWidget = new FullAdWidget(this, getWindow());
                this.presenterFactory = (PresentationFactory) serviceLocator.getService(PresentationFactory.class);
                if (bundle == null) {
                    optionsState = null;
                } else {
                    optionsState = (OptionsState) bundle.getParcelable(PRESENTER_STATE);
                }
                OptionsState optionsState2 = optionsState;
                this.state = optionsState2;
                this.presenterFactory.getFullScreenPresentation(this, this.request, fullAdWidget, optionsState2, new CloseDelegate() { // from class: com.vungle.warren.AdActivity.1
                    @Override // com.vungle.warren.ui.CloseDelegate
                    public void close() {
                        AdActivity.this.finish();
                    }
                }, new OrientationDelegate() { // from class: com.vungle.warren.AdActivity.2
                    @Override // com.vungle.warren.ui.OrientationDelegate
                    public void setOrientation(int i10) {
                        AdActivity.this.setRequestedOrientation(i10);
                    }
                }, bundle, this.fullscreenCallback);
                setContentView(fullAdWidget, fullAdWidget.getLayoutParams());
                connectBroadcastReceiver();
                VungleLogger.verbose(true, TAG, AdLoader.TT_DOWNLOAD_CONTEXT, String.format("Ad created, request = %1$s, elapsed time: %2$dms", this.request, Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                return;
            } catch (InstantiationException unused) {
                deliverError(10, this.request);
                finish();
                return;
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        a.a(getApplicationContext()).d(this.broadcastReceiver);
        AdContract.AdvertisementPresenter advertisementPresenter = this.presenter;
        if (advertisementPresenter != null) {
            advertisementPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        } else {
            PresentationFactory presentationFactory = this.presenterFactory;
            if (presentationFactory != null) {
                presentationFactory.destroy();
                this.presenterFactory = null;
                deliverError(25, this.request);
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        AdRequest request = getRequest(getIntent());
        AdRequest request2 = getRequest(intent);
        String str2 = null;
        if (request != null) {
            str = request.getPlacementId();
        } else {
            str = null;
        }
        if (request2 != null) {
            str2 = request2.getPlacementId();
        }
        if (str != null && str2 != null && !str.equals(str2)) {
            Log.d(TAG, "Tried to play another placement " + str2 + " while playing " + str);
            deliverError(15, request2);
            VungleLogger.warn("AdActivity#onNewIntent", String.format("Tried to play another placement %1$s while playing %2$s", str2, str));
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.resumed = false;
        stop();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        AdContract.AdvertisementPresenter advertisementPresenter;
        super.onRestoreInstanceState(bundle);
        Log.d(TAG, "onRestoreInstanceState(" + bundle + ")");
        if (bundle != null && (advertisementPresenter = this.presenter) != null) {
            advertisementPresenter.restoreFromSave((OptionsState) bundle.getParcelable(PRESENTER_STATE));
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.resumed = true;
        start();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Log.d(TAG, "onSaveInstanceState");
        BundleOptionsState bundleOptionsState = new BundleOptionsState();
        AdContract.AdvertisementPresenter advertisementPresenter = this.presenter;
        if (advertisementPresenter != null) {
            advertisementPresenter.generateSaveState(bundleOptionsState);
            bundle.putParcelable(PRESENTER_STATE, bundleOptionsState);
        }
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null) {
            presentationFactory.saveState(bundle);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            start();
        } else {
            stop();
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (canRotate()) {
            super.setRequestedOrientation(i10);
        }
    }
}
