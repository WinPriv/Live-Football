package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.k.h;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes.dex */
public class SinglePictureSplashAdView extends BaseSdkSplashAdView {
    public SinglePictureSplashAdView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashAdView
    public final void b() {
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_splash_ad_install_btn", "id"));
        final RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_splash_bg", "id"));
        com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4120d.u()), getResources().getDisplayMetrics().widthPixels, (getResources().getDisplayMetrics().widthPixels * 627) / 1200, new b.a() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.1
            @Override // com.anythink.core.common.res.b.a
            public final void onSuccess(String str, final Bitmap bitmap) {
                if (TextUtils.equals(str, SinglePictureSplashAdView.this.f4120d.u())) {
                    SinglePictureSplashAdView singlePictureSplashAdView = SinglePictureSplashAdView.this;
                    final WrapRoundImageView wrapRoundImageView = (WrapRoundImageView) singlePictureSplashAdView.findViewById(h.a(singlePictureSplashAdView.getContext(), "myoffer_splash_ad_content_image_area", "id"));
                    if (SinglePictureSplashAdView.this.f4119c.f5664m.j() == 2) {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        wrapRoundImageView.setImageBitmap(bitmap);
                    } else {
                        wrapRoundImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        wrapRoundImageView.post(new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                wrapRoundImageView.setBitmapAndResize(bitmap, SinglePictureSplashAdView.this.getWidth(), SinglePictureSplashAdView.this.getHeight());
                            }
                        });
                    }
                    if (roundImageView != null) {
                        roundImageView.setImageBitmap(com.anythink.core.common.k.b.a(SinglePictureSplashAdView.this.getContext(), bitmap));
                    }
                }
            }

            @Override // com.anythink.core.common.res.b.a
            public final void onFail(String str, String str2) {
            }
        });
        k kVar = this.f4119c.f5664m;
        if (kVar != null && textView != null) {
            if (kVar.x() != 0 && !m()) {
                textView.setVisibility(0);
                if (!TextUtils.isEmpty(this.f4120d.w())) {
                    textView.setText(this.f4120d.w());
                } else {
                    textView.setText(com.anythink.basead.a.e.a(getContext(), this.f4120d));
                }
                this.f4132r.add(textView);
                return;
            }
            textView.setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.BaseSdkSplashAdView
    public final void c() {
        int R;
        if (this.f4119c.f5664m.R() < 0) {
            R = 100;
        } else {
            R = this.f4119c.f5664m.R();
        }
        super.a(R, new Runnable() { // from class: com.anythink.basead.ui.SinglePictureSplashAdView.2
            @Override // java.lang.Runnable
            public final void run() {
                SinglePictureSplashAdView singlePictureSplashAdView = SinglePictureSplashAdView.this;
                if (singlePictureSplashAdView.F == null) {
                    return;
                }
                int width = singlePictureSplashAdView.getWidth();
                int height = SinglePictureSplashAdView.this.getHeight();
                int i10 = (int) (SinglePictureSplashAdView.this.getResources().getDisplayMetrics().heightPixels * 0.5d);
                if (width < ((int) (SinglePictureSplashAdView.this.getResources().getDisplayMetrics().widthPixels * 0.5d))) {
                    SinglePictureSplashAdView.this.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, "Splash display width is less than 50% of screen width!"));
                    Log.e("anythink", "Splash display width is less than 50% of screen width!");
                } else if (height >= i10) {
                    SinglePictureSplashAdView.super.h();
                } else {
                    SinglePictureSplashAdView.this.a(com.anythink.basead.c.f.a(com.anythink.basead.c.f.f3754k, "Splash display height is less than 50% of screen height!"));
                    Log.e("anythink", "Splash display height is less than 50% of screen height!");
                }
            }
        });
    }

    public SinglePictureSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a() {
        if (this.f4119c.f5664m.q() == 2) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_land", "layout"), this);
        } else {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_ad_layout_single_port", "layout"), this);
        }
        o();
    }
}
