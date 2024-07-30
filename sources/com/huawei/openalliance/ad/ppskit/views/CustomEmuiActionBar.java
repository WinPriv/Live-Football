package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSActivity;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.n7;

/* loaded from: classes2.dex */
public class CustomEmuiActionBar extends RelativeLayout implements View.OnClickListener {

    /* renamed from: s, reason: collision with root package name */
    public TextView f23117s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f23118t;

    /* renamed from: u, reason: collision with root package name */
    public ImageView f23119u;

    /* renamed from: v, reason: collision with root package name */
    public a f23120v;

    /* loaded from: classes2.dex */
    public interface a {
        void onMenuBtnClick(View view);
    }

    public CustomEmuiActionBar(Context context, boolean z10) {
        super(context);
        setBackgroundColor(Color.rgb(0, 151, 168));
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.hiad_8_dp);
        setPadding(dimensionPixelSize, com.huawei.openalliance.ad.ppskit.utils.d0.a(context) + dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        LayoutInflater.from(context).inflate(R.layout.hiad_custom_emui_action_bar, this);
        this.f23119u = (ImageView) findViewById(R.id.hiad_id_back_btn);
        this.f23117s = (TextView) findViewById(R.id.hiad_id_title_tv);
        ImageView imageView = (ImageView) findViewById(R.id.hiad_id_menu_btn);
        this.f23118t = imageView;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 4);
        }
        ImageView imageView2 = this.f23119u;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.f23118t;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        a aVar = this.f23120v;
        if (aVar != null) {
            if (view == this.f23119u) {
                n7.e("PPSActivity", "onClose");
                ((PPSActivity) aVar).finishAndRemoveTask();
            } else {
                ImageView imageView = this.f23118t;
                if (view == imageView) {
                    aVar.onMenuBtnClick(imageView);
                }
            }
        }
    }

    public void setCallBack(a aVar) {
        this.f23120v = aVar;
    }

    public void setTitle(String str) {
        if (this.f23117s != null && !y1.h(str)) {
            this.f23117s.setText(str);
        }
    }
}
