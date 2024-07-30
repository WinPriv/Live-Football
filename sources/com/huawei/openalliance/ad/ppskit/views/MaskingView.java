package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.hamkho.livefoot.R;
import ka.n7;

/* loaded from: classes2.dex */
public class MaskingView extends RelativeLayout {

    /* renamed from: s, reason: collision with root package name */
    public Animation f23130s;

    /* renamed from: t, reason: collision with root package name */
    public Animation f23131t;

    /* renamed from: u, reason: collision with root package name */
    public Animation f23132u;

    /* renamed from: v, reason: collision with root package name */
    public Animation f23133v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f23134w;

    /* renamed from: x, reason: collision with root package name */
    public ImageView f23135x;

    public MaskingView(Context context) {
        super(context);
        n7.e("MaskingView", "init");
        View.inflate(context, R.layout.pps_masking_view, this);
        ImageView imageView = (ImageView) findViewById(R.id.hiad_click_hand);
        this.f23134w = imageView;
        imageView.setImageDrawable(getResources().getDrawable(R.drawable.hiad_click_hint_hand));
        ImageView imageView2 = (ImageView) findViewById(R.id.hiad_click_arc);
        this.f23135x = imageView2;
        imageView2.setImageDrawable(getResources().getDrawable(R.drawable.hiad_click_hint_arc));
        this.f23130s = AnimationUtils.loadAnimation(context, R.anim.hiad_masking_hand_zoom_in);
        this.f23131t = AnimationUtils.loadAnimation(context, R.anim.hiad_masking_hand_zoom_out);
        this.f23130s.setDuration(400L);
        this.f23131t.setDuration(400L);
        this.f23130s.setAnimationListener(new e(this));
        this.f23131t.setAnimationListener(new f(this));
        this.f23132u = AnimationUtils.loadAnimation(context, R.anim.haid_masking_arc_zoom_in);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.haid_masking_fade_out);
        this.f23133v = loadAnimation;
        loadAnimation.setDuration(400L);
        this.f23132u.setDuration(400L);
        this.f23132u.setAnimationListener(new g(this));
        this.f23133v.setAnimationListener(new h(this));
        this.f23134w.startAnimation(this.f23131t);
    }
}
