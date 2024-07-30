package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.gj;
import ka.kc;
import ka.n7;

/* loaded from: classes2.dex */
public class PPSFullScreenNotifyOptimizeView extends RelativeLayout {
    public Context A;
    public final Handler B;
    public ObjectAnimator C;
    public ContentRecord D;
    public kc E;
    public int F;

    /* renamed from: s, reason: collision with root package name */
    public AppInfo f23172s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f23173t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f23174u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f23175v;

    /* renamed from: w, reason: collision with root package name */
    public ImageView f23176w;

    /* renamed from: x, reason: collision with root package name */
    public Button f23177x;
    public RelativeLayout y;

    /* renamed from: z, reason: collision with root package name */
    public RelativeLayout f23178z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i10;
            PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView = PPSFullScreenNotifyOptimizeView.this;
            n7.f("PPSFullScreenNotifyOptimizeView", "onClick, insActvNotifyCfg: %s", Integer.valueOf(pPSFullScreenNotifyOptimizeView.F));
            if (view.getId() == R.id.app_close_optimize) {
                ka.w wVar = new ka.w();
                wVar.f32042e = y1.d(2);
                pPSFullScreenNotifyOptimizeView.E.b("0", wVar);
                return;
            }
            if (view.getId() != R.id.app_valid_click_optimize && view.getId() != R.id.app_open_btn_optimize) {
                if (view.getId() == R.id.app_view_optimize && (i10 = pPSFullScreenNotifyOptimizeView.F) == 2) {
                    pPSFullScreenNotifyOptimizeView.E.a(i10);
                } else {
                    return;
                }
            } else {
                pPSFullScreenNotifyOptimizeView.E.a(pPSFullScreenNotifyOptimizeView.F);
            }
            pPSFullScreenNotifyOptimizeView.E.c();
        }
    }

    public PPSFullScreenNotifyOptimizeView(Context context) {
        super(context);
        this.B = new Handler();
        a aVar = new a();
        n7.e("PPSFullScreenNotifyOptimizeView", "init");
        View.inflate(context, R.layout.hiad_full_screen_notity_optimize_layout, this);
        setVisibility(4);
        this.A = context;
        this.f23175v = (ImageView) findViewById(R.id.app_icon_optimize);
        this.f23173t = (TextView) findViewById(R.id.app_name_tv_optimize);
        this.f23174u = (TextView) findViewById(R.id.notify_tv_optimize);
        this.f23176w = (ImageView) findViewById(R.id.app_close_optimize);
        this.y = (RelativeLayout) findViewById(R.id.app_view_optimize);
        this.f23178z = (RelativeLayout) findViewById(R.id.app_valid_click_optimize);
        this.f23177x = (Button) findViewById(R.id.app_open_btn_optimize);
        this.y.setOnClickListener(aVar);
        this.f23178z.setOnClickListener(aVar);
        this.f23177x.setOnClickListener(aVar);
        this.f23176w.setOnClickListener(aVar);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("alpha", gl.Code, 1.0f, 1.0f));
        this.C = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.C.setInterpolator(new LinearInterpolator());
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f23175v.getLayoutParams();
            layoutParams.removeRule(15);
            this.f23175v.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f23176w.getLayoutParams();
            layoutParams2.removeRule(15);
            this.f23176w.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setOnCloseListener(gj gjVar) {
        this.E.f31377d = gjVar;
    }
}
