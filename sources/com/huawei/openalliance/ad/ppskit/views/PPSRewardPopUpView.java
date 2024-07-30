package com.huawei.openalliance.ad.ppskit.views;

import android.app.AlertDialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.inter.data.MaterialClickInfo;
import ka.ij;
import ka.n7;

/* loaded from: classes2.dex */
public class PPSRewardPopUpView extends RelativeLayout {
    public TextView A;
    public ij B;
    public AlertDialog C;
    public MaterialClickInfo D;

    /* renamed from: s, reason: collision with root package name */
    public Context f23238s;

    /* renamed from: t, reason: collision with root package name */
    public ContentRecord f23239t;

    /* renamed from: u, reason: collision with root package name */
    public AppInfo f23240u;

    /* renamed from: v, reason: collision with root package name */
    public String f23241v;

    /* renamed from: w, reason: collision with root package name */
    public View f23242w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f23243x;
    public ImageView y;

    /* renamed from: z, reason: collision with root package name */
    public SixElementsView f23244z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSRewardPopUpView.this.B.a();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSRewardPopUpView.this.B.b();
        }
    }

    public PPSRewardPopUpView(Context context) {
        super(context);
        this.f23238s = context;
        View inflate = View.inflate(context, R.layout.hiad_reward_popup, this);
        this.f23242w = inflate;
        inflate.setOnClickListener(new d0(this));
        this.y = (ImageView) this.f23242w.findViewById(R.id.popup_icon);
        this.f23244z = (SixElementsView) this.f23242w.findViewById(R.id.popup_icon_six_elements);
        this.f23243x = (TextView) this.f23242w.findViewById(R.id.popup_download_btn);
        this.A = (TextView) this.f23242w.findViewById(R.id.abort_downlaod_btn);
        AlertDialog create = com.huawei.openalliance.ad.ppskit.utils.v.a(this.f23238s).create();
        this.C = create;
        create.setView(this.f23242w);
        this.C.setCanceledOnTouchOutside(false);
        this.C.getWindow().setDimAmount(0.2f);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r5 = this;
            android.content.Context r0 = r5.f23238s
            boolean r1 = r0 instanceof android.app.Activity
            java.lang.String r2 = "PPSRewardPopUpView"
            if (r1 != 0) goto Lb
            java.lang.String r0 = "context not activity"
            goto L1e
        Lb:
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0.isFinishing()
            if (r1 != 0) goto L1c
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 1
            goto L22
        L1c:
            java.lang.String r0 = "can't show dialog due to activity status!"
        L1e:
            ka.n7.e(r2, r0)
            r0 = 0
        L22:
            if (r0 != 0) goto L25
            return
        L25:
            android.widget.ImageView r0 = r5.y
            java.lang.String r1 = r5.f23241v
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L50
            if (r0 != 0) goto L32
            goto L50
        L32:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "load app icon:"
            r3.<init>(r4)
            java.lang.String r4 = com.huawei.openalliance.ad.ppskit.utils.y1.j(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            ka.n7.e(r2, r3)
            com.huawei.openalliance.ad.ppskit.views.e0 r2 = new com.huawei.openalliance.ad.ppskit.views.e0
            r2.<init>(r5, r1, r0)
            r0 = 4
            com.huawei.openalliance.ad.ppskit.utils.p2.a(r2, r0)
        L50:
            android.view.View r0 = r5.f23242w
            if (r0 == 0) goto L5b
            android.app.AlertDialog r0 = r5.C
            if (r0 == 0) goto L5b
            r0.show()
        L5b:
            com.huawei.openalliance.ad.ppskit.views.SixElementsView r0 = r5.f23244z
            if (r0 == 0) goto L62
            r0.c()
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardPopUpView.a():void");
    }

    public final void b() {
        if (this.f23242w != null && this.C != null) {
            n7.e("PPSRewardPopUpView", "Dialog has been dismissed");
            if (this.C.isShowing()) {
                this.C.dismiss();
            }
            this.C = null;
        }
    }

    public final void c() {
        n7.e("PPSRewardPopUpView", "refresh UI");
        this.f23244z.b(this.f23239t);
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(this.f23238s)) {
            this.f23243x.setTextSize(1, 30.0f);
            this.A.setTextSize(1, 30.0f);
        }
        this.f23241v = this.f23240u.getIconUrl();
        this.f23243x.setOnClickListener(new a());
        this.A.setOnClickListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & com.anythink.expressad.exoplayer.k.p.f9095b;
            if (action == 0) {
                this.D = a0.a.z(this, motionEvent);
            }
            if (1 == action) {
                a0.a.T(this, motionEvent, this.D);
            }
        } catch (Throwable th) {
            n7.h("PPSRewardPopUpView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public MaterialClickInfo getClickInfo() {
        return this.D;
    }

    public AlertDialog getDialog() {
        return this.C;
    }

    public void setAdPopupData(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            return;
        }
        try {
            n7.e("PPSRewardPopUpView", "set popup data");
            this.f23239t = contentRecord;
            this.f23240u = contentRecord.j0();
            c();
        } catch (RuntimeException unused) {
            str = "setAdPopupData RuntimeException.";
            n7.g("PPSRewardPopUpView", str);
        } catch (Exception unused2) {
            str = "setAdPopupData error.";
            n7.g("PPSRewardPopUpView", str);
        }
    }

    public void setPopUpClickListener(ij ijVar) {
        this.B = ijVar;
    }
}
