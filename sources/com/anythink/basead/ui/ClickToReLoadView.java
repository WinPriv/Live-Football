package com.anythink.basead.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.k.h;
import com.anythink.expressad.foundation.h.i;

/* loaded from: classes.dex */
public class ClickToReLoadView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f4217a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f4218b;

    /* renamed from: c, reason: collision with root package name */
    private a f4219c;

    /* renamed from: d, reason: collision with root package name */
    private int f4220d;

    /* renamed from: com.anythink.basead.ui.ClickToReLoadView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        long f4221a;

        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f4221a > 1000) {
                this.f4221a = currentTimeMillis;
                if (ClickToReLoadView.this.f4219c != null) {
                    ClickToReLoadView.this.f4219c.a();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public ClickToReLoadView(Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        this.f4220d = h.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f4217a = imageView;
        imageView.setImageResource(h.a(context, "myoffer_webview_reload_icon", i.f10125c));
        int a10 = h.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a10, a10);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f4220d;
        TextView textView = new TextView(context);
        this.f4218b = textView;
        textView.setText(getResources().getText(h.a(context, "myoffer_webview_reload", i.f10128g)));
        this.f4218b.setTextColor(getResources().getColor(h.a(context, "color_reload_button", i.f10126d)));
        this.f4218b.setBackgroundResource(h.a(context, "myoffer_webview_bg_reload_button", i.f10125c));
        int a11 = h.a(context, 9.0f);
        int a12 = h.a(context, 5.0f);
        this.f4218b.setPadding(a11, a12, a11, a12);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f4220d;
        addView(this.f4217a, layoutParams);
        addView(this.f4218b, layoutParams2);
        this.f4218b.setOnClickListener(new AnonymousClass1());
    }

    private void b() {
        try {
            this.f4217a.setVisibility(8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4218b.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.topMargin = 0;
                this.f4218b.setLayoutParams(layoutParams);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (getHeight() < h.a(getContext(), 100.0f)) {
            try {
                this.f4217a.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4218b.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.topMargin = 0;
                    this.f4218b.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void setListener(a aVar) {
        this.f4219c = aVar;
    }

    private void a(Context context) {
        setOrientation(1);
        setGravity(17);
        this.f4220d = h.a(context, 10.0f);
        ImageView imageView = new ImageView(context);
        this.f4217a = imageView;
        imageView.setImageResource(h.a(context, "myoffer_webview_reload_icon", i.f10125c));
        int a10 = h.a(context, 30.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a10, a10);
        layoutParams.gravity = 17;
        layoutParams.bottomMargin = this.f4220d;
        TextView textView = new TextView(context);
        this.f4218b = textView;
        textView.setText(getResources().getText(h.a(context, "myoffer_webview_reload", i.f10128g)));
        this.f4218b.setTextColor(getResources().getColor(h.a(context, "color_reload_button", i.f10126d)));
        this.f4218b.setBackgroundResource(h.a(context, "myoffer_webview_bg_reload_button", i.f10125c));
        int a11 = h.a(context, 9.0f);
        int a12 = h.a(context, 5.0f);
        this.f4218b.setPadding(a11, a12, a11, a12);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = this.f4220d;
        addView(this.f4217a, layoutParams);
        addView(this.f4218b, layoutParams2);
    }

    private void a() {
        this.f4218b.setOnClickListener(new AnonymousClass1());
    }
}
