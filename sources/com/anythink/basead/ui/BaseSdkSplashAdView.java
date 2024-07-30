package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.e.aa;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.u;
import com.anythink.core.common.k.h;
import com.anythink.core.common.k.l;
import com.anythink.core.common.res.b;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes.dex */
public abstract class BaseSdkSplashAdView extends BaseSplashAdView {
    public static final int TYPE_ASSEBLEM = 1;
    public static final int TYPE_SINGLE_PICTURE = 0;

    /* renamed from: t, reason: collision with root package name */
    protected RoundImageView f4190t;

    /* renamed from: u, reason: collision with root package name */
    ViewGroup f4191u;

    /* renamed from: v, reason: collision with root package name */
    TextView f4192v;

    /* renamed from: w, reason: collision with root package name */
    TextView f4193w;

    /* renamed from: x, reason: collision with root package name */
    TextView f4194x;
    TextView y;

    /* renamed from: z, reason: collision with root package name */
    protected final View.OnClickListener f4195z;

    public BaseSdkSplashAdView(Context context) {
        super(context);
        this.f4195z = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = BaseSdkSplashAdView.this.f4119c.f5664m;
                if (kVar != null && kVar.x() == 0) {
                    BaseSdkSplashAdView.super.b(1);
                }
            }
        };
    }

    public static boolean isSinglePicture(i iVar, k kVar) {
        if ((iVar instanceof s) && (kVar instanceof u)) {
            if (2 != ((u) kVar).X()) {
                return false;
            }
            return true;
        }
        if (!(iVar instanceof aa) || 1 != ((aa) iVar).Y()) {
            return false;
        }
        return true;
    }

    public abstract void b();

    public abstract void c();

    public void o() {
        b();
        this.f4191u = (ViewGroup) findViewById(h.a(getContext(), "myoffer_four_element_container", "id"));
        this.f4192v = (TextView) findViewById(h.a(getContext(), "myoffer_publisher_name", "id"));
        this.f4193w = (TextView) findViewById(h.a(getContext(), "myoffer_privacy_agreement", "id"));
        this.f4194x = (TextView) findViewById(h.a(getContext(), "myoffer_permission_manage", "id"));
        this.y = (TextView) findViewById(h.a(getContext(), "myoffer_version_name", "id"));
        if (this.f4120d.K()) {
            ViewGroup viewGroup = this.f4191u;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TextView textView = this.f4192v;
            if (textView != null) {
                textView.setVisibility(0);
                this.f4192v.setText(this.f4120d.F());
                this.f4132r.add(this.f4192v);
            }
            TextView textView2 = this.f4193w;
            if (textView2 != null) {
                textView2.setVisibility(0);
                this.f4193w.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashAdView.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.b(n.a().g(), BaseSdkSplashAdView.this.f4120d.H());
                    }
                });
            }
            TextView textView3 = this.f4194x;
            if (textView3 != null) {
                textView3.setVisibility(0);
                this.f4194x.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashAdView.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l.b(n.a().g(), BaseSdkSplashAdView.this.f4120d.I());
                    }
                });
            }
            TextView textView4 = this.y;
            if (textView4 != null) {
                textView4.setVisibility(0);
                this.y.setText(getContext().getResources().getString(h.a(getContext(), "myoffer_panel_version", com.anythink.expressad.foundation.h.i.f10128g), this.f4120d.G()));
                this.f4132r.add(this.y);
            }
        } else {
            ViewGroup viewGroup2 = this.f4191u;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            TextView textView5 = this.y;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            TextView textView6 = this.f4192v;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            TextView textView7 = this.f4193w;
            if (textView7 != null) {
                textView7.setVisibility(8);
            }
            TextView textView8 = this.f4194x;
            if (textView8 != null) {
                textView8.setVisibility(8);
            }
            try {
                View findViewById = findViewById(h.a(getContext(), "myoffer_four_element_container_bg", "id"));
                if (findViewById != null) {
                    findViewById.setBackgroundDrawable(null);
                }
            } catch (Throwable unused) {
            }
        }
        RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_ad_logo", "id"));
        this.f4190t = roundImageView;
        final ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
        if (!TextUtils.isEmpty(this.f4120d.v())) {
            this.f4190t.setVisibility(0);
            int i10 = layoutParams.width;
            com.anythink.core.common.res.b.a(getContext()).a(new com.anythink.core.common.res.e(1, this.f4120d.v()), i10, i10, new b.a() { // from class: com.anythink.basead.ui.BaseSdkSplashAdView.4
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                    BaseSdkSplashAdView.this.f4190t.setVisibility(8);
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, BaseSdkSplashAdView.this.f4120d.v())) {
                        ViewGroup.LayoutParams layoutParams2 = layoutParams;
                        int i11 = layoutParams2.height;
                        layoutParams2.width = (int) (i11 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                        layoutParams2.height = i11;
                        BaseSdkSplashAdView.this.f4190t.setLayoutParams(layoutParams2);
                        BaseSdkSplashAdView.this.f4190t.setScaleType(ImageView.ScaleType.FIT_XY);
                        BaseSdkSplashAdView.this.f4190t.setImageBitmap(bitmap);
                        BaseSdkSplashAdView.this.f4190t.setVisibility(0);
                    }
                }
            });
        } else if (this.f4120d.J() != null) {
            Bitmap J = this.f4120d.J();
            int i11 = layoutParams.height;
            layoutParams.width = (int) (i11 * ((J.getWidth() * 1.0f) / J.getHeight()));
            layoutParams.height = i11;
            this.f4190t.setLayoutParams(layoutParams);
            this.f4190t.setScaleType(ImageView.ScaleType.FIT_XY);
            this.f4190t.setImageBitmap(J);
            this.f4190t.setImageBitmap(this.f4120d.J());
            this.f4190t.setVisibility(0);
        } else {
            this.f4190t.setVisibility(8);
        }
        this.f4132r.add(this.f4190t);
        q();
        r();
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView, com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView, com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView
    public void p() {
        super.p();
        setOnClickListener(this.f4195z);
    }

    @Override // com.anythink.basead.ui.BaseSplashAdView, com.anythink.basead.ui.BaseAdView
    public final void a(int i10) {
        com.anythink.basead.e.a aVar = this.F;
        if (aVar != null) {
            aVar.onAdClick(i10);
        }
        GuideToClickView guideToClickView = this.J;
        if (guideToClickView != null) {
            guideToClickView.setVisibility(8);
        }
    }

    public BaseSdkSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar, aVar);
        this.f4195z = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSdkSplashAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = BaseSdkSplashAdView.this.f4119c.f5664m;
                if (kVar != null && kVar.x() == 0) {
                    BaseSdkSplashAdView.super.b(1);
                }
            }
        };
        c();
        p();
        a(this.B, this.f4119c.f5664m.h());
    }
}
