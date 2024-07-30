package com.anythink.nativead.api;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.nativead.api.NativeAd;

/* loaded from: classes.dex */
public class ATNativeAdView extends FrameLayout {
    private static final String TAG = "ATNativeAdView";
    View mAdView;
    NativeAd.ImpressionEventListener mImpressionEventListener;
    boolean mIsInWindow;
    NativeAd mNativeAd;
    int mNativeAdId;

    public ATNativeAdView(Context context) {
        super(context);
    }

    private void callbackImpression() {
        NativeAd.ImpressionEventListener impressionEventListener = this.mImpressionEventListener;
        if (impressionEventListener != null) {
            impressionEventListener.onImpression();
        }
    }

    public synchronized void attachNativeAd(NativeAd nativeAd) {
        this.mNativeAd = nativeAd;
    }

    public synchronized void clear() {
        NativeAd nativeAd = this.mNativeAd;
        if (nativeAd != null) {
            try {
                nativeAd.clear(this);
            } catch (Throwable unused) {
            }
            this.mNativeAd = null;
        }
    }

    public void clearImpressionListener(int i10) {
        if (this.mNativeAdId == i10) {
            this.mImpressionEventListener = null;
        }
    }

    public void destory() {
        this.mImpressionEventListener = null;
    }

    public boolean isAttachInWindow() {
        return this.mIsInWindow;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsInWindow = true;
        if (getVisibility() == 0) {
            callbackImpression();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mIsInWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 0 && getVisibility() == 0) {
            callbackImpression();
        }
    }

    public void renderView(int i10, View view, NativeAd.ImpressionEventListener impressionEventListener) {
        View view2 = this.mAdView;
        if (view2 != null) {
            removeView(view2);
        }
        this.mAdView = view;
        this.mNativeAdId = i10;
        this.mImpressionEventListener = impressionEventListener;
        addView(view);
        if (this.mIsInWindow && getVisibility() == 0) {
            callbackImpression();
        }
    }

    public ATNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ATNativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
