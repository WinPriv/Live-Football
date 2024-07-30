package com.anythink.expressad.video.dynview.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.i;
import com.anythink.expressad.foundation.h.o;
import com.huawei.hms.ads.gl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AnyThinkSegmentsProgressBar extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f11646a;

    /* renamed from: b, reason: collision with root package name */
    private int f11647b;

    /* renamed from: c, reason: collision with root package name */
    private int f11648c;

    /* renamed from: d, reason: collision with root package name */
    private int f11649d;

    /* renamed from: e, reason: collision with root package name */
    private int f11650e;
    private int f;

    /* renamed from: g, reason: collision with root package name */
    private int f11651g;

    /* renamed from: h, reason: collision with root package name */
    private int f11652h;

    /* renamed from: i, reason: collision with root package name */
    private List<ProgressBar> f11653i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f11654j;

    /* renamed from: k, reason: collision with root package name */
    private String f11655k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11656l;

    public AnyThinkSegmentsProgressBar(Context context) {
        super(context);
        this.f11646a = "AnyThinkSegmentsProgressBar";
        this.f11648c = 1;
        this.f11649d = 20;
        this.f11650e = 10;
        this.f = 1;
        this.f11651g = -1711276033;
        this.f11652h = -1;
        this.f11653i = new ArrayList();
        this.f11656l = false;
    }

    private void a() {
        Drawable drawable;
        try {
            this.f11656l = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.V);
        } catch (Throwable th) {
            o.d("AnyThinkSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f11648c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f11655k)) {
                    this.f11655k = this.f11656l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f11648c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f11655k)) {
                    this.f11655k = this.f11656l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f11653i.clear();
            removeAllViews();
            setBackgroundDrawable(c());
            TextView textView = new TextView(getContext());
            this.f11654j = textView;
            textView.setTextColor(-1);
            this.f11654j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f11654j.setLayoutParams(layoutParams);
            if (this.f11648c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f11654j;
                int i10 = this.f11649d;
                textView2.setPadding(i10 / 2, 15, i10 / 2, 5);
            }
            if (this.f11648c == 2) {
                this.f11654j.setGravity(16);
                TextView textView3 = this.f11654j;
                int i11 = this.f11649d;
                textView3.setPadding(i11 / 2, 0, i11 / 2, 0);
            }
            try {
                int a10 = i.a(getContext(), "anythink_reward_video_icon", i.f10125c);
                if (a10 != 0 && (drawable = getContext().getResources().getDrawable(a10)) != null) {
                    drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    this.f11654j.setCompoundDrawables(drawable, null, null, null);
                    this.f11654j.setCompoundDrawablePadding(5);
                }
            } catch (Throwable th2) {
                o.d("AnyThinkSegmentsProgressBar", th2.getMessage());
            }
            this.f11654j.setText(a(this.f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i12 = 0; i12 < this.f11647b; i12++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, R.attr.progressBarStyleHorizontal);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i13 = this.f11649d;
                layoutParams3.leftMargin = i13 / 2;
                layoutParams3.rightMargin = i13 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f11653i.add(progressBar);
            }
            if (this.f11648c == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f11654j);
                addView(linearLayout);
            }
            if (this.f11648c == 2) {
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f11654j);
            }
        } catch (Throwable th3) {
            o.d("AnyThinkSegmentsProgressBar", th3.getMessage());
        }
    }

    private LayerDrawable b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f11650e);
        gradientDrawable.setColor(this.f11651g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f11650e);
        gradientDrawable2.setColor(this.f11652h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        return layerDrawable;
    }

    private static GradientDrawable c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setDither(true);
        try {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(new int[]{0, 1291845632});
        } catch (Throwable unused) {
        }
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, gl.Code);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.anythink.expressad.video.dynview.widget.AnyThinkSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                AnyThinkSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i10, int i11) {
        this.f11647b = i10;
        this.f11648c = i11;
        a();
    }

    public void setIndicatorText(String str) {
        this.f11655k = str;
    }

    public void setProgress(int i10, int i11) {
        try {
            if (this.f11653i.size() == 0) {
                return;
            }
            if (i11 < this.f11653i.size()) {
                this.f11653i.get(i11).setProgress(i10);
            }
            int i12 = i11 + 1;
            if (i12 > this.f) {
                this.f = i12;
                TextView textView = this.f11654j;
                if (textView != null) {
                    textView.setText(a(i12));
                }
            }
        } catch (Throwable th) {
            o.d("AnyThinkSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i10, int i11, int i12, int i13) {
        this.f11647b = i10;
        this.f11648c = i11;
        this.f11652h = i12;
        this.f11651g = i13;
        a();
    }

    public void init(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f11647b = i10;
        this.f11648c = i11;
        this.f11652h = i12;
        this.f11651g = i13;
        this.f11649d = i14;
        this.f11650e = i15;
        a();
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11646a = "AnyThinkSegmentsProgressBar";
        this.f11648c = 1;
        this.f11649d = 20;
        this.f11650e = 10;
        this.f = 1;
        this.f11651g = -1711276033;
        this.f11652h = -1;
        this.f11653i = new ArrayList();
        this.f11656l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11646a = "AnyThinkSegmentsProgressBar";
        this.f11648c = 1;
        this.f11649d = 20;
        this.f11650e = 10;
        this.f = 1;
        this.f11651g = -1711276033;
        this.f11652h = -1;
        this.f11653i = new ArrayList();
        this.f11656l = false;
    }

    public AnyThinkSegmentsProgressBar(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f11646a = "AnyThinkSegmentsProgressBar";
        this.f11648c = 1;
        this.f11649d = 20;
        this.f11650e = 10;
        this.f = 1;
        this.f11651g = -1711276033;
        this.f11652h = -1;
        this.f11653i = new ArrayList();
        this.f11656l = false;
    }

    private StringBuilder a(int i10) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f11655k, Integer.valueOf(i10), Integer.valueOf(this.f11647b)));
        } catch (Throwable th) {
            e0.i.n(sb2, this.f11647b, "videos, the", i10, " is playing.");
            o.d("AnyThinkSegmentsProgressBar", th.getMessage());
        }
        return sb2;
    }
}
