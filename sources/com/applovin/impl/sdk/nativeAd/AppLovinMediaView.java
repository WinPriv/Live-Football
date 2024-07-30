package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.R;
import com.huawei.hms.ads.gl;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinMediaView extends FrameLayout {
    protected final ImageView imageView;
    protected final y logger;
    protected final p sdk;

    public AppLovinMediaView(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, Context context) {
        super(context);
        Uri uri;
        setBackgroundColor(-16777216);
        this.sdk = pVar;
        this.logger = pVar.L();
        LayoutInflater.from(context).inflate(R.layout.applovin_native_ad_media_view, (ViewGroup) this, true);
        Uri mainImageUri = appLovinNativeAdImpl.getMainImageUri();
        com.applovin.impl.c.a vastAd = appLovinNativeAdImpl.getVastAd();
        if (vastAd != null) {
            uri = vastAd.h();
        } else {
            uri = null;
        }
        if (mainImageUri == null && uri == null) {
            throw new IllegalStateException("AppLovin native ad missing image AND video resources");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        setOnClickListener(appLovinNativeAdImpl.getClickHandler());
        ImageView imageView = (ImageView) findViewById(R.id.image_view);
        this.imageView = imageView;
        if (mainImageUri != null) {
            imageView.setImageURI(mainImageUri);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    public float getAspectRatio() {
        Drawable drawable;
        ImageView imageView = this.imageView;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return gl.Code;
    }
}
