package com.huawei.openalliance.ad.ppskit.views;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.utils.e2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import ka.gj;
import ka.kc;
import ka.n7;

/* loaded from: classes2.dex */
public class PPSFullScreenNotifyView extends RelativeLayout {
    public static final /* synthetic */ int I = 0;
    public Context A;
    public int B;
    public int C;
    public int D;
    public final Handler E;
    public ObjectAnimator F;
    public ContentRecord G;
    public kc H;

    /* renamed from: s, reason: collision with root package name */
    public AppInfo f23180s;

    /* renamed from: t, reason: collision with root package name */
    public View f23181t;

    /* renamed from: u, reason: collision with root package name */
    public View f23182u;

    /* renamed from: v, reason: collision with root package name */
    public View f23183v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f23184w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f23185x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f23186z;

    /* loaded from: classes2.dex */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            String str;
            int i10 = PPSFullScreenNotifyView.I;
            PPSFullScreenNotifyView pPSFullScreenNotifyView = PPSFullScreenNotifyView.this;
            pPSFullScreenNotifyView.getClass();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        str = "ACTION_CANCEL";
                    }
                } else {
                    n7.e("PPSFullScreenNotifyView", "ACTION_UP");
                    pPSFullScreenNotifyView.H.a(-1);
                    pPSFullScreenNotifyView.H.c();
                }
                return true;
            }
            str = "ACTION_DOWN";
            n7.e("PPSFullScreenNotifyView", str);
            return true;
        }
    }

    public PPSFullScreenNotifyView(Context context) {
        super(context);
        this.E = new Handler();
        a aVar = new a();
        n7.e("PPSFullScreenNotifyView", "init");
        View.inflate(context, R.layout.hiad_full_screen_notity_layout, this);
        setVisibility(4);
        this.A = context;
        ka.w wVar = new ka.w();
        wVar.f32042e = y1.d(1);
        this.f23181t = findViewById(R.id.app_layout);
        this.f23182u = findViewById(R.id.layout_start);
        this.f23183v = findViewById(R.id.layout_end);
        this.y = (ImageView) findViewById(R.id.app_icon);
        this.f23184w = (TextView) findViewById(R.id.app_name_tv);
        this.f23185x = (TextView) findViewById(R.id.notify_tv);
        ImageView imageView = (ImageView) findViewById(R.id.app_close);
        this.f23186z = imageView;
        imageView.setOnClickListener(new o(this, wVar));
        this.f23182u.setOnTouchListener(new p(this, wVar));
        this.f23183v.setOnTouchListener(new q(this, wVar));
        setOnTouchListener(aVar);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("alpha", gl.Code, 1.0f, 1.0f));
        this.F = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(200L);
        this.F.setInterpolator(new LinearInterpolator());
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.y.getLayoutParams();
            layoutParams.removeRule(15);
            this.y.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f23186z.getLayoutParams();
            layoutParams2.removeRule(15);
            this.f23186z.setLayoutParams(layoutParams2);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.D = this.f23181t.getMeasuredWidth();
        if (this.B != this.C) {
            View findViewById = findViewById(R.id.app_view);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.width = (int) (this.B - e2.a(24, this.A));
            findViewById.setLayoutParams(layoutParams);
            int i12 = (this.D - this.B) / 2;
            View findViewById2 = findViewById(R.id.layout_start);
            ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            layoutParams2.width = i12;
            findViewById2.setLayoutParams(layoutParams2);
            View findViewById3 = findViewById(R.id.layout_end);
            ViewGroup.LayoutParams layoutParams3 = findViewById3.getLayoutParams();
            layoutParams3.width = i12;
            findViewById3.setLayoutParams(layoutParams3);
        }
    }

    public void setOnCloseListener(gj gjVar) {
        this.H.f31377d = gjVar;
    }
}
