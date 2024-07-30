package com.applovin.impl.sdk.nativeAd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.R;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final p sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, p pVar, Context context) {
        super(context);
        this.sdk = pVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            imageView.setImageURI(privacyIconUri);
        } else {
            imageView.setImageResource(R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnTouchListener(null);
        removeAllViews();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Utils.openUri(p.y(), this.privacyDestinationUri, this.sdk);
    }
}
