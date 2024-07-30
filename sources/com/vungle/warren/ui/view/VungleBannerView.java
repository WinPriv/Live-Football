package com.vungle.warren.ui.view;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.webkit.WebView;
import com.anythink.core.common.res.d;
import com.vungle.warren.AdConfig;
import com.vungle.warren.AdRequest;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.SessionTracker;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.SessionData;
import com.vungle.warren.session.SessionAttribute;
import com.vungle.warren.session.SessionEvent;
import com.vungle.warren.ui.CloseDelegate;
import com.vungle.warren.ui.JavascriptBridge;
import com.vungle.warren.ui.PresenterAdOpenCallback;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.WebAdContract;
import com.vungle.warren.utility.ActivityManager;
import com.vungle.warren.utility.ExternalRouter;
import com.vungle.warren.utility.HandlerScheduler;
import d1.a;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class VungleBannerView extends WebView implements WebAdContract.WebAdView {
    private static final String TAG = "com.vungle.warren.ui.view.VungleBannerView";
    private BroadcastReceiver broadcastReceiver;
    private final AdConfig config;
    private boolean destroyed;
    private AtomicReference<Boolean> isAdVisible;
    private final AdContract.AdvertisementPresenter.EventListener listener;
    private OnViewTouchListener onViewTouchListener;
    private WebAdContract.WebAdPresenter presenter;
    PresentationFactory presenterFactory;
    private final AdRequest request;

    public VungleBannerView(Context context, AdRequest adRequest, AdConfig adConfig, PresentationFactory presentationFactory, AdContract.AdvertisementPresenter.EventListener eventListener) {
        super(context);
        this.isAdVisible = new AtomicReference<>();
        this.onViewTouchListener = new OnViewTouchListener() { // from class: com.vungle.warren.ui.view.VungleBannerView.1
            @Override // com.vungle.warren.ui.view.OnViewTouchListener
            public boolean onTouch(MotionEvent motionEvent) {
                if (VungleBannerView.this.presenter != null) {
                    VungleBannerView.this.presenter.onViewTouched(motionEvent);
                    return false;
                }
                return false;
            }
        };
        this.listener = eventListener;
        this.request = adRequest;
        this.config = adConfig;
        this.presenterFactory = presentationFactory;
        setLayerType(2, null);
        setBackgroundColor(0);
        attachListeners();
    }

    private void attachListeners() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.vungle.warren.ui.view.VungleBannerView.2
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (VungleBannerView.this.onViewTouchListener == null) {
                    return VungleBannerView.super.onTouchEvent(motionEvent);
                }
                return VungleBannerView.this.onViewTouchListener.onTouch(motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"AddJavascriptInterface", "NewApi"})
    public void prepare() {
        WebSettingsUtils.applyDefault(this);
        addJavascriptInterface(new JavascriptBridge(this.presenter), "Android");
        getSettings().setMediaPlaybackRequiresUserGesture(false);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void close() {
        if (this.presenter != null) {
            finishDisplayingAdInternal(false);
            return;
        }
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null) {
            presentationFactory.destroy();
            this.presenterFactory = null;
            this.listener.onError(new VungleException(25), this.request.getPlacementId());
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void destroyAdView(long j10) {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        this.presenter = null;
        this.presenterFactory = null;
        removeJavascriptInterface("Android");
        setWebChromeClient(null);
        Runnable runnable = new Runnable() { // from class: com.vungle.warren.ui.view.VungleBannerView.3
            @Override // java.lang.Runnable
            public void run() {
                VungleBannerView.this.stopLoading();
                VungleBannerView.this.setWebViewClient(null);
                if (Build.VERSION.SDK_INT >= 29) {
                    VungleBannerView.this.setWebViewRenderProcessClient(null);
                }
                VungleBannerView.this.loadUrl(d.f6477a);
            }
        };
        if (j10 <= 0) {
            runnable.run();
        } else {
            new HandlerScheduler().schedule(runnable, j10);
        }
    }

    public void finishDisplayingAd() {
        finishDisplayingAdInternal(true);
    }

    public void finishDisplayingAdInternal(boolean z10) {
        int i10;
        WebAdContract.WebAdPresenter webAdPresenter = this.presenter;
        if (webAdPresenter != null) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            webAdPresenter.detach(i10 | 2);
        } else {
            PresentationFactory presentationFactory = this.presenterFactory;
            if (presentationFactory != null) {
                presentationFactory.destroy();
                this.presenterFactory = null;
                this.listener.onError(new VungleException(25), this.request.getPlacementId());
            }
        }
        if (z10) {
            SessionData.Builder event = new SessionData.Builder().setEvent(SessionEvent.DISMISS_AD);
            AdRequest adRequest = this.request;
            if (adRequest != null && adRequest.getEventId() != null) {
                event.addData(SessionAttribute.EVENT_ID, this.request.getEventId());
            }
            SessionTracker.getInstance().trackEvent(event.build());
        }
        destroyAdView(0L);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public String getWebsiteUrl() {
        return getUrl();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public boolean hasWebView() {
        return true;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null && this.presenter == null) {
            presentationFactory.getBannerViewPresentation(getContext(), this.request, this.config, new CloseDelegate() { // from class: com.vungle.warren.ui.view.VungleBannerView.4
                @Override // com.vungle.warren.ui.CloseDelegate
                public void close() {
                    VungleBannerView.this.finishDisplayingAdInternal(false);
                }
            }, new PresentationFactory.ViewCallback() { // from class: com.vungle.warren.ui.view.VungleBannerView.5
                @Override // com.vungle.warren.PresentationFactory.ViewCallback
                public void onResult(Pair<WebAdContract.WebAdPresenter, VungleWebClient> pair, VungleException vungleException) {
                    VungleBannerView vungleBannerView = VungleBannerView.this;
                    vungleBannerView.presenterFactory = null;
                    if (vungleException == null) {
                        vungleBannerView.presenter = (WebAdContract.WebAdPresenter) pair.first;
                        VungleBannerView.this.setWebViewClient((VungleWebClient) pair.second);
                        VungleBannerView.this.presenter.setEventListener(VungleBannerView.this.listener);
                        VungleBannerView.this.presenter.attach(VungleBannerView.this, null);
                        VungleBannerView.this.prepare();
                        if (VungleBannerView.this.isAdVisible.get() != null) {
                            VungleBannerView vungleBannerView2 = VungleBannerView.this;
                            vungleBannerView2.setAdVisibility(((Boolean) vungleBannerView2.isAdVisible.get()).booleanValue());
                        }
                        ViewGroup.LayoutParams layoutParams = VungleBannerView.this.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -1;
                            layoutParams.width = -1;
                            return;
                        }
                        return;
                    }
                    if (vungleBannerView.listener != null) {
                        VungleBannerView.this.listener.onError(vungleException, VungleBannerView.this.request.getPlacementId());
                    }
                }
            });
        }
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.vungle.warren.ui.view.VungleBannerView.6
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra(AdContract.AdvertisementBus.COMMAND);
                if (AdContract.AdvertisementBus.STOP_ALL.equalsIgnoreCase(stringExtra)) {
                    VungleBannerView.this.finishDisplayingAdInternal(false);
                } else {
                    VungleLogger.warn("VungleBannerView#onAttachedToWindow", String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
                }
            }
        };
        a.a(getContext()).b(this.broadcastReceiver, new IntentFilter(AdContract.AdvertisementBus.ACTION));
        resumeWeb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        a.a(getContext()).d(this.broadcastReceiver);
        super.onDetachedFromWindow();
        PresentationFactory presentationFactory = this.presenterFactory;
        if (presentationFactory != null) {
            presentationFactory.destroy();
        }
        pauseWeb();
    }

    @Override // android.webkit.WebView
    public void onPause() {
        super.onPause();
        setAdVisibility(false);
    }

    @Override // android.webkit.WebView
    public void onResume() {
        super.onResume();
        Log.d(TAG, "Resuming Flex");
        setAdVisibility(true);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        setAdVisibility(z10);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void open(String str, String str2, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback presenterAdOpenCallback) {
        String str3 = TAG;
        Log.d(str3, "Opening " + str2);
        if (!ExternalRouter.launch(str, str2, getContext(), leftApplicationCallback, true, presenterAdOpenCallback)) {
            Log.e(str3, "Cannot open url " + str2);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void pauseWeb() {
        onPause();
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void removeWebView() {
        ViewParent parent = getParent();
        if (parent instanceof ViewManager) {
            ((ViewManager) parent).removeView(this);
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void resumeWeb() {
        onResume();
    }

    public void setAdVisibility(boolean z10) {
        WebAdContract.WebAdPresenter webAdPresenter = this.presenter;
        if (webAdPresenter != null) {
            webAdPresenter.setAdVisibility(z10);
        } else {
            this.isAdVisible.set(Boolean.valueOf(z10));
        }
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setPresenter(WebAdContract.WebAdPresenter webAdPresenter) {
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void setVisibility(boolean z10) {
        int i10;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        setVisibility(i10);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showCloseButton() {
        throw new UnsupportedOperationException("VungleBannerView does not implement a close button");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showDialog(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        throw new UnsupportedOperationException("VungleBannerView does not implement a dialog.");
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void showWebsite(String str) {
        loadUrl(str);
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void refreshDialogIfVisible() {
    }

    public View renderBannerView() {
        return this;
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setImmersiveMode() {
    }

    @Override // com.vungle.warren.ui.contract.WebAdContract.WebAdView
    public void updateWindow() {
    }

    @Override // com.vungle.warren.ui.contract.AdContract.AdView
    public void setOrientation(int i10) {
    }
}
