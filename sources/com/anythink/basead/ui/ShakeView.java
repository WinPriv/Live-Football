package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class ShakeView extends BaseShakeView {

    /* renamed from: c, reason: collision with root package name */
    private ImageView f4450c;

    /* renamed from: d, reason: collision with root package name */
    private View f4451d;

    public ShakeView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(1);
        setGravity(1);
        this.f4450c = new ImageView(getContext());
        this.f4450c.setLayoutParams(new LinearLayout.LayoutParams(h.a(getContext(), 115.0f), h.a(getContext(), 115.0f)));
        ImageView imageView = this.f4450c;
        int a10 = h.a(getContext(), 115.0f);
        int parseColor = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a10);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f4201a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h.a(getContext(), 76.0f), h.a(getContext(), 76.0f));
        layoutParams.gravity = 17;
        this.f4201a.setLayoutParams(layoutParams);
        this.f4201a.setImageResource(h.a(n.a().g(), "myoffer_shake_icon", i.f10125c));
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(this.f4450c);
        frameLayout.addView(this.f4201a);
        View inflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_shake_hint_text", "layout"), (ViewGroup) null);
        this.f4451d = inflate;
        inflate.setLayoutParams(layoutParams2);
        ((TextView) this.f4451d.findViewById(h.a(n.a().g(), "tv_splash_shake_hint_text", "id"))).setText(h.a(n.a().g(), "myoffer_shake_full_title", i.f10128g));
        addView(frameLayout);
        addView(this.f4451d);
    }

    @Override // com.anythink.basead.ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // com.anythink.basead.ui.BaseShakeView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.f4201a.setOnClickListener(onClickListener);
            this.f4450c.setOnClickListener(onClickListener);
            this.f4451d.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private void a(View view) {
        int a10 = h.a(getContext(), 115.0f);
        int parseColor = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a10);
        view.setBackgroundDrawable(gradientDrawable);
    }
}
