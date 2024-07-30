package com.vungle.warren;

import a3.k;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import com.vungle.warren.PresentationFactory;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.ui.contract.AdContract;
import com.vungle.warren.ui.contract.NativeAdContract;
import d1.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class NativeAdLayout extends FrameLayout {
    private static final String TAG = "NativeAdLayout";
    private BroadcastReceiver broadcastReceiver;
    private OnItemClickListener clickListener;
    private Context context;
    private boolean destroyed;
    private boolean disableRenderManagement;
    private final AtomicReference<Boolean> isAdVisible;
    private AdContract.AdvertisementPresenter.EventListener listener;
    private NativeAd nativeAd;
    private final AtomicBoolean pendingImpression;
    private final AtomicBoolean pendingStart;
    private NativeAdContract.NativePresenter presenter;
    private PresentationFactory presenterFactory;
    private AdRequest request;
    private boolean started;

    /* loaded from: classes2.dex */
    public interface OnItemClickListener {
        void onItemClicked(int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ViewEvent {
        public static final int CTA_CLICK = 1;
        public static final int PRIVACY_CLICK = 2;
    }

    public NativeAdLayout(Context context) {
        super(context);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    private void initView(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdVisibility(boolean z10) {
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter != null) {
            nativePresenter.setAdVisibility(z10);
        } else {
            this.isAdVisible.set(Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void start() {
        Log.d(TAG, "start() " + hashCode());
        if (this.presenter == null) {
            this.pendingStart.set(true);
        } else if (!this.started && hasWindowFocus()) {
            this.presenter.start();
            this.started = true;
        }
    }

    public void disableLifeCycleManagement(boolean z10) {
        this.disableRenderManagement = z10;
    }

    public void finishDisplayingAdInternal(boolean z10) {
        int i10;
        Log.d(TAG, "finishDisplayingAdInternal() " + z10 + " " + hashCode());
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter != null) {
            if (z10) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            nativePresenter.detach(i10 | 2);
        } else {
            PresentationFactory presentationFactory = this.presenterFactory;
            if (presentationFactory != null) {
                presentationFactory.destroy();
                this.presenterFactory = null;
                this.listener.onError(new VungleException(25), this.request.getPlacementId());
            }
        }
        release();
    }

    public void finishNativeAd() {
        String str = TAG;
        Log.d(str, "finishNativeAd() " + hashCode());
        a.a(this.context).d(this.broadcastReceiver);
        NativeAd nativeAd = this.nativeAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        } else {
            Log.d(str, "No need to destroy due to haven't played the ad.");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d(TAG, "onAttachedToWindow() " + hashCode());
        if (this.disableRenderManagement) {
            return;
        }
        renderNativeAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d(TAG, "onDetachedFromWindow() " + hashCode());
        if (this.disableRenderManagement) {
            return;
        }
        finishNativeAd();
    }

    public void onImpression() {
        Log.d(TAG, "onImpression() " + hashCode());
        NativeAdContract.NativePresenter nativePresenter = this.presenter;
        if (nativePresenter == null) {
            this.pendingImpression.set(true);
        } else {
            nativePresenter.onProgressUpdate(1, 100.0f);
        }
    }

    public void onItemClicked(int i10) {
        OnItemClickListener onItemClickListener = this.clickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClicked(i10);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        String str = TAG;
        StringBuilder n10 = k.n("onVisibilityChanged() visibility=", i10, " ");
        n10.append(hashCode());
        Log.d(str, n10.toString());
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAdVisibility(z10);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        Log.d(TAG, "onWindowFocusChanged() hasWindowFocus=" + z10 + " " + hashCode());
        super.onWindowFocusChanged(z10);
        setAdVisibility(z10);
        if (this.presenter != null && !this.started) {
            start();
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        String str = TAG;
        StringBuilder n10 = k.n("onWindowVisibilityChanged() visibility=", i10, " ");
        n10.append(hashCode());
        Log.d(str, n10.toString());
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAdVisibility(z10);
    }

    public void register(Context context, NativeAd nativeAd, PresentationFactory presentationFactory, AdContract.AdvertisementPresenter.EventListener eventListener, AdConfig adConfig, final AdRequest adRequest) {
        this.presenterFactory = presentationFactory;
        this.listener = eventListener;
        this.request = adRequest;
        this.nativeAd = nativeAd;
        if (this.presenter == null) {
            presentationFactory.getNativeViewPresentation(context, this, adRequest, adConfig, new PresentationFactory.NativeViewCallback() { // from class: com.vungle.warren.NativeAdLayout.2
                @Override // com.vungle.warren.PresentationFactory.NativeViewCallback
                public void onResult(Pair<NativeAdContract.NativeView, NativeAdContract.NativePresenter> pair, VungleException vungleException) {
                    NativeAdLayout.this.presenterFactory = null;
                    if (vungleException != null) {
                        if (NativeAdLayout.this.listener != null) {
                            NativeAdLayout.this.listener.onError(vungleException, adRequest.getPlacementId());
                            return;
                        }
                        return;
                    }
                    NativeAdContract.NativeView nativeView = (NativeAdContract.NativeView) pair.first;
                    NativeAdLayout.this.presenter = (NativeAdContract.NativePresenter) pair.second;
                    NativeAdLayout.this.presenter.setEventListener(NativeAdLayout.this.listener);
                    NativeAdLayout.this.presenter.attach(nativeView, null);
                    if (NativeAdLayout.this.pendingStart.getAndSet(false)) {
                        NativeAdLayout.this.start();
                    }
                    if (NativeAdLayout.this.pendingImpression.getAndSet(false)) {
                        NativeAdLayout.this.presenter.onProgressUpdate(1, 100.0f);
                    }
                    if (NativeAdLayout.this.isAdVisible.get() != null) {
                        NativeAdLayout nativeAdLayout = NativeAdLayout.this;
                        nativeAdLayout.setAdVisibility(((Boolean) nativeAdLayout.isAdVisible.get()).booleanValue());
                    }
                    NativeAdLayout.this.destroyed = false;
                }
            });
        }
    }

    public void release() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        this.presenter = null;
        this.presenterFactory = null;
    }

    public void renderNativeAd() {
        Log.d(TAG, "renderNativeAd() " + hashCode());
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.vungle.warren.NativeAdLayout.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String stringExtra = intent.getStringExtra(AdContract.AdvertisementBus.COMMAND);
                if (AdContract.AdvertisementBus.STOP_ALL.equalsIgnoreCase(stringExtra)) {
                    NativeAdLayout.this.finishDisplayingAdInternal(false);
                } else {
                    VungleLogger.warn("NativeAdLayout#onAttachedToWindow", String.format("Receiving Invalid Broadcast: %1$s", stringExtra));
                }
            }
        };
        a.a(this.context).b(this.broadcastReceiver, new IntentFilter(AdContract.AdvertisementBus.ACTION));
        start();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.clickListener = onItemClickListener;
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }

    @TargetApi(21)
    public NativeAdLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.pendingStart = new AtomicBoolean(false);
        this.pendingImpression = new AtomicBoolean(false);
        this.isAdVisible = new AtomicReference<>();
        this.started = false;
        initView(context);
    }
}
