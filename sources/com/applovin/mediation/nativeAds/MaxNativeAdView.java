package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.mediation.a.d;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.y;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import s.f;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a, reason: collision with root package name */
    private final View f19629a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f19630b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f19631c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f19632d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f19633e;
    private final FrameLayout f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f19634g;

    /* renamed from: h, reason: collision with root package name */
    private final FrameLayout f19635h;

    /* renamed from: i, reason: collision with root package name */
    private final ViewGroup f19636i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f19637j;

    /* renamed from: k, reason: collision with root package name */
    private final FrameLayout f19638k;

    /* renamed from: l, reason: collision with root package name */
    private final Button f19639l;

    /* renamed from: m, reason: collision with root package name */
    private b f19640m;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(f.b("Attempting to render MAX native ad with invalid format: ", str));
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if (!"media_banner_template".equals(str) && !"no_body_banner_template".equals(str)) {
                if ("vertical_media_banner_template".equals(str)) {
                    return R.layout.max_native_ad_vertical_media_banner_view;
                }
                return R.layout.max_native_ad_banner_view;
            }
            return R.layout.max_native_ad_media_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return R.layout.max_native_ad_vertical_leader_view;
            }
            return R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    public b getAdViewTracker() {
        return this.f19640m;
    }

    public TextView getAdvertiserTextView() {
        return this.f19631c;
    }

    public TextView getBodyTextView() {
        return this.f19632d;
    }

    public Button getCallToActionButton() {
        return this.f19639l;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f19630b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f19631c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f19632d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        ImageView imageView = this.f19633e;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        Button button = this.f19639l;
        if (button != null) {
            arrayList.add(button);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f;
    }

    public ImageView getIconImageView() {
        return this.f19633e;
    }

    public View getMainView() {
        return this.f19629a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f19638k;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f19637j;
        if (viewGroup == null) {
            return this.f19638k;
        }
        return viewGroup;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f19635h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f19634g;
        if (viewGroup == null) {
            return this.f19635h;
        }
        return viewGroup;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f19636i;
    }

    public TextView getTitleTextView() {
        return this.f19630b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f19640m;
        if (bVar != null) {
            bVar.b();
        }
        if (!isHardwareAccelerated()) {
            y.h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f19640m;
        if (bVar != null) {
            bVar.a();
            this.f19640m = null;
        }
        View view = this.f19629a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f19629a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f19629a);
        }
    }

    public void render(d dVar, a.InterfaceC0201a interfaceC0201a, p pVar) {
        recycle();
        if (!dVar.H().get() || !dVar.G().get()) {
            this.f19640m = new b(dVar, this, interfaceC0201a, pVar);
        }
        final MaxNativeAd nativeAd = dVar.getNativeAd();
        if (dVar.E() && nativeAd.isContainerClickable()) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        if (StringUtils.isValidString(dVar.D())) {
            pVar.L();
            if (y.a()) {
                pVar.L().b("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        pVar.L();
        if (y.a()) {
            pVar.L().b("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f19630b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f19632d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f19631c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f19639l;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f19633e;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f19633e.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    this.f19633e.setImageURI(icon.getUri());
                } else {
                    this.f19633e.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f19637j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f19637j.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f19634g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f19634g.addView(optionsView);
                this.f19634g.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f19636i;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f19636i.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd r3, java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.R.id.applovin_native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_star_rating_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setStarRatingContentViewGroupId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.R.id.applovin_native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        int i10;
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f19629a = view;
        } else {
            if (z10) {
                i10 = a(maxNativeAdViewBinder.templateType, format);
            } else {
                i10 = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f19629a = LayoutInflater.from(context).inflate(i10, (ViewGroup) this, false);
        }
        addView(this.f19629a);
        this.f19630b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f19631c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f19632d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f19633e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f19634g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f19635h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f19636i = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f19637j = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f19638k = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f19639l = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    private void a(MaxNativeAd maxNativeAd) {
        if (this.f19630b == null) {
            y.h("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f19630b.setText(maxNativeAd.getTitle());
        } else {
            this.f19630b.setVisibility(8);
        }
        if (this.f19631c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f19631c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f19631c.setVisibility(8);
            }
        }
        if (this.f19632d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f19632d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f19632d.setVisibility(4);
            } else {
                this.f19632d.setVisibility(8);
            }
        }
        if (this.f19639l != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f19639l.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f19639l.setVisibility(4);
            } else {
                this.f19639l.setVisibility(8);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            if (icon == null || this.f19633e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f.removeAllViews();
                    this.f.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f19633e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                this.f19633e.setImageURI(icon.getUri());
            } else {
                this.f.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f19635h;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f19635h.addView(optionsView);
            this.f19635h.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f19638k != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f19638k.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f19638k.setVisibility(8);
            }
        }
        if (this.f19636i != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f19636i.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f19636i.addView(appLovinStarRatingView);
            } else {
                this.f19636i.setVisibility(8);
            }
        }
        a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000L);
    }

    private void a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.3
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    } else {
                        p pVar = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                        pVar.L();
                        if (y.a()) {
                            pVar.L().d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                        }
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }
}
