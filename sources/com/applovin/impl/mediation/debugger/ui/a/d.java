package com.applovin.impl.mediation.debugger.ui.a;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class d extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f18051a;

    /* renamed from: b, reason: collision with root package name */
    private AppLovinSdkUtils.Size f18052b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f18053c;

    /* renamed from: d, reason: collision with root package name */
    private RelativeLayout f18054d;

    public d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, R.style.Theme.Translucent.NoTitleBar);
        this.f18051a = viewGroup;
        this.f18052b = size;
        this.f18053c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f18054d.removeView(this.f18051a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f18053c, this.f18052b.getWidth()), AppLovinSdkUtils.dpToPx(this.f18053c, this.f18052b.getHeight()));
        layoutParams.addRule(13);
        this.f18051a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f18053c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f18053c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f18053c.getResources().getDrawable(com.applovin.sdk.R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f18053c);
        this.f18054d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f18054d.setBackgroundColor(Integer.MIN_VALUE);
        this.f18054d.addView(imageButton);
        this.f18054d.addView(this.f18051a);
        this.f18054d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        setContentView(this.f18054d);
    }
}
