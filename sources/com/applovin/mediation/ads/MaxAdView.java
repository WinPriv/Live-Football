package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.c;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;
import e0.i;

/* loaded from: classes.dex */
public class MaxAdView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private MaxAdViewImpl f19586a;

    /* renamed from: b, reason: collision with root package name */
    private View f19587b;

    /* renamed from: c, reason: collision with root package name */
    private int f19588c;

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i10, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f19587b = view;
        view.setBackgroundColor(0);
        addView(this.f19587b);
        this.f19587b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f19588c = getVisibility();
        this.f19586a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f19587b, appLovinSdk.coreSdk, context);
        setGravity(i10);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f19586a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f19586a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f19586a.getAdUnitId();
    }

    public String getPlacement() {
        this.f19586a.logApiCall("getPlacement()");
        return this.f19586a.getPlacement();
    }

    public void loadAd() {
        this.f19586a.logApiCall("loadAd()");
        this.f19586a.loadAd();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (!isInEditMode()) {
            this.f19586a.logApiCall("onWindowVisibilityChanged(visibility=" + i10 + ")");
            if (this.f19586a != null && r.a(this.f19588c, i10)) {
                this.f19586a.onWindowVisibilityChanged(i10);
            }
            this.f19588c = i10;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        this.f19586a.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f19586a.setAdReviewListener(maxAdReviewListener);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.f19586a.logApiCall("setAlpha(alpha=" + f + ")");
        View view = this.f19587b;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f19586a.logApiCall("setBackgroundColor(color=" + i10 + ")");
        MaxAdViewImpl maxAdViewImpl = this.f19586a;
        if (maxAdViewImpl != null) {
            maxAdViewImpl.setPublisherBackgroundColor(i10);
        }
        View view = this.f19587b;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setCustomData(String str) {
        this.f19586a.logApiCall("setCustomData(value=" + str + ")");
        this.f19586a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f19586a.logApiCall(i.g("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f19586a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        this.f19586a.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f19586a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        this.f19586a.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f19586a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        this.f19586a.logApiCall("setPlacement(placement=" + str + ")");
        this.f19586a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        this.f19586a.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f19586a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        this.f19586a.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f19586a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f19586a.logApiCall("startAutoRefresh()");
        this.f19586a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f19586a.logApiCall("stopAutoRefresh()");
        this.f19586a.stopAutoRefresh();
    }

    @Override // android.view.View
    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f19586a;
        if (maxAdViewImpl != null) {
            return maxAdViewImpl.toString();
        }
        return "MaxAdView";
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, c.a(context), appLovinSdk, context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        MaxAdFormat a10;
        String a11 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a12 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        if (StringUtils.isValidString(a12)) {
            a10 = MaxAdFormat.formatFromString(a12);
        } else {
            a10 = c.a(context);
        }
        MaxAdFormat maxAdFormat = a10;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a11 != null) {
            if (!TextUtils.isEmpty(a11)) {
                if (isInEditMode()) {
                    a(context);
                    return;
                } else {
                    a(a11, maxAdFormat, attributeIntValue, AppLovinSdk.getInstance(context), context);
                    return;
                }
            }
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i10, i11);
    }
}
