package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.b.n;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class ShakeThumbView extends BaseShakeView {

    /* renamed from: c, reason: collision with root package name */
    private ImageView f4449c;

    public ShakeThumbView(Context context) {
        super(context);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void a() {
        setOrientation(1);
        setGravity(1);
        this.f4449c = new ImageView(getContext());
        this.f4449c.setLayoutParams(new LinearLayout.LayoutParams(h.a(getContext(), 90.0f), h.a(getContext(), 90.0f)));
        ImageView imageView = this.f4449c;
        int a10 = h.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a10);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.f4201a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(h.a(getContext(), 40.0f), h.a(getContext(), 40.0f));
        layoutParams.gravity = 49;
        layoutParams.topMargin = h.a(getContext(), 12.0f);
        this.f4201a.setLayoutParams(layoutParams);
        this.f4201a.setImageResource(h.a(n.a().g(), "myoffer_shake_icon", i.f10125c));
        TextView textView = new TextView(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = h.a(getContext(), 13.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setText(h.a(n.a().g(), "myoffer_shake_simple_title", i.f10128g));
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(this.f4449c);
        frameLayout.addView(this.f4201a);
        frameLayout.addView(textView);
        addView(frameLayout);
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
            this.f4449c.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public ShakeThumbView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private void a(View view) {
        int a10 = h.a(getContext(), 88.0f);
        int parseColor = Color.parseColor("#99000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(a10);
        view.setBackgroundDrawable(gradientDrawable);
    }
}
