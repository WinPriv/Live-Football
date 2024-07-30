package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.activity.PPSRewardActivity;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.download.app.AppStatus;
import com.huawei.openalliance.ad.ppskit.inter.data.AppInfo;
import com.huawei.openalliance.ad.ppskit.views.AppDownloadButton;
import java.util.List;
import ka.Cif;
import ka.n7;
import ka.yi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class PPSRewardEndCardView extends RelativeLayout {
    public va.b A;
    public ImageView B;
    public TextView C;
    public TextView D;
    public boolean E;
    public String F;
    public String G;
    public yi H;
    public ka.l I;
    public int J;
    public boolean K;
    public SixElementsView L;
    public final c M;

    /* renamed from: s, reason: collision with root package name */
    public Context f23228s;

    /* renamed from: t, reason: collision with root package name */
    public com.huawei.openalliance.ad.ppskit.handlers.l f23229t;

    /* renamed from: u, reason: collision with root package name */
    public ContentRecord f23230u;

    /* renamed from: v, reason: collision with root package name */
    public AppInfo f23231v;

    /* renamed from: w, reason: collision with root package name */
    public String f23232w;

    /* renamed from: x, reason: collision with root package name */
    public MetaData f23233x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public AppDownloadButton f23234z;

    /* loaded from: classes2.dex */
    public class a implements AppDownloadButton.i {
        public a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.i
        public final CharSequence a(String str) {
            PPSRewardEndCardView pPSRewardEndCardView = PPSRewardEndCardView.this;
            if (!pPSRewardEndCardView.E) {
                return androidx.activity.n.E(pPSRewardEndCardView.F, pPSRewardEndCardView.f23228s.getString(R.string.hiad_download_open));
            }
            return str;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements AppDownloadButton.l {
        public b() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.views.AppDownloadButton.l
        public final boolean a() {
            boolean z10;
            PPSRewardEndCardView pPSRewardEndCardView = PPSRewardEndCardView.this;
            va.b bVar = pPSRewardEndCardView.A;
            if (bVar != null) {
                z10 = PPSRewardActivity.this.C;
            } else {
                z10 = false;
            }
            if (!z10 && pPSRewardEndCardView.f23229t.R(pPSRewardEndCardView.G) && pPSRewardEndCardView.K) {
                pPSRewardEndCardView.f23234z.m();
                return false;
            }
            pPSRewardEndCardView.f23234z.setAllowedNonWifiNetwork(true);
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            String str;
            String str2;
            n7.e("PPSRewardEndCardView", "action:" + motionEvent.getAction());
            PPSRewardEndCardView pPSRewardEndCardView = PPSRewardEndCardView.this;
            if (pPSRewardEndCardView.f23234z != null && motionEvent.getAction() == 1) {
                if (pPSRewardEndCardView.E) {
                    if (AppStatus.INSTALLED == pPSRewardEndCardView.f23234z.getStatus()) {
                        str2 = "app";
                    } else {
                        str2 = "";
                    }
                    ((j0) pPSRewardEndCardView.H).a(str2, pPSRewardEndCardView.E, true, false);
                } else {
                    yi yiVar = pPSRewardEndCardView.H;
                    if (yiVar != null) {
                        if (pPSRewardEndCardView.J == 9) {
                            str = com.huawei.openalliance.ad.constant.v.I;
                        } else {
                            str = com.huawei.openalliance.ad.constant.v.B;
                        }
                        ((j0) yiVar).a(str, false, false, false);
                    }
                }
            }
            return true;
        }
    }

    public PPSRewardEndCardView(Context context, int i10) {
        super(context);
        int i11;
        this.E = true;
        this.K = true;
        this.M = new c();
        this.f23228s = context;
        this.f23229t = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        if (1 == i10) {
            i11 = R.layout.hiad_reward_endcard;
        } else {
            i11 = R.layout.hiad_reward_land_endcard;
        }
        View inflate = View.inflate(context, i11, this);
        this.y = inflate;
        this.B = (ImageView) inflate.findViewById(R.id.endcard_icon);
        this.C = (TextView) this.y.findViewById(R.id.endcard_title);
        this.D = (TextView) this.y.findViewById(R.id.endcard_desc);
        this.f23234z = (AppDownloadButton) this.y.findViewById(R.id.endcard_download_btn);
        this.L = (SixElementsView) this.y.findViewById(R.id.reward_end_card_six_elements);
        if (com.huawei.openalliance.ad.ppskit.utils.d0.v(context)) {
            this.C.setTextSize(1, 36.0f);
            this.D.setTextSize(1, 28.0f);
        }
        this.I = Cif.a(this.f23228s.getApplicationContext());
    }

    public static void a(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r4 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = r4.E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "PPSRewardEndCardView"
            java.lang.String r3 = "refresh UI, isAppRelated: %s"
            ka.n7.f(r1, r3, r0)
            boolean r0 = r4.E
            if (r0 == 0) goto L3c
            android.widget.TextView r0 = r4.C
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r1 = r4.f23231v
            java.lang.String r1 = r1.getAppName()
            a(r0, r1)
            android.widget.TextView r0 = r4.D
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r1 = r4.f23231v
            java.lang.String r1 = r1.getAppDesc()
            a(r0, r1)
            com.huawei.openalliance.ad.ppskit.inter.data.AppInfo r0 = r4.f23231v
            java.lang.String r0 = r0.getIconUrl()
            r4.f23232w = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L62
            goto L5c
        L3c:
            com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData r0 = r4.f23233x
            if (r0 == 0) goto L5c
            android.widget.TextView r1 = r4.C
            java.lang.String r0 = r0.c()
            java.lang.String r0 = com.huawei.openalliance.ad.ppskit.utils.y1.p(r0)
            a(r1, r0)
            android.widget.TextView r0 = r4.D
            com.huawei.openalliance.ad.ppskit.beans.metadata.MetaData r1 = r4.f23233x
            java.lang.String r1 = r1.d()
            java.lang.String r1 = com.huawei.openalliance.ad.ppskit.utils.y1.p(r1)
            a(r0, r1)
        L5c:
            java.lang.String r0 = r4.c()
            r4.f23232w = r0
        L62:
            com.huawei.openalliance.ad.ppskit.views.SixElementsView r0 = r4.L
            r1 = 8
            r0.setTitleTextVisibility(r1)
            com.huawei.openalliance.ad.ppskit.views.SixElementsView r0 = r4.L
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r4.f23230u
            r0.b(r1)
            android.view.View r0 = r4.y
            com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView$c r1 = r4.M
            r0.setOnTouchListener(r1)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r1 = r4.f23230u
            r0.setContentRecord(r1)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            r0.setNeedShowPermision(r2)
            ka.l r0 = r4.I
            boolean r0 = r0.g()
            if (r0 == 0) goto L95
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.f1 r1 = new com.huawei.openalliance.ad.ppskit.views.f1
            android.content.Context r2 = r4.f23228s
            r1.<init>(r2)
            goto L9e
        L95:
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.e1 r1 = new com.huawei.openalliance.ad.ppskit.views.e1
            android.content.Context r2 = r4.f23228s
            r1.<init>(r2)
        L9e:
            r0.setAppDownloadButtonStyle(r1)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView$a r1 = new com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView$a
            r1.<init>()
            r0.setButtonTextWatcher(r1)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView$b r1 = new com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView$b
            r1.<init>()
            r0.setOnNonWifiDownloadListener(r1)
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            r1 = 5
            r0.setSource(r1)
            boolean r0 = r4.E
            if (r0 != 0) goto Lca
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.a0 r1 = new com.huawei.openalliance.ad.ppskit.views.a0
            r1.<init>(r4)
            r0.setClickListenerInner(r1)
            goto Ld4
        Lca:
            com.huawei.openalliance.ad.ppskit.views.AppDownloadButton r0 = r4.f23234z
            com.huawei.openalliance.ad.ppskit.views.b0 r1 = new com.huawei.openalliance.ad.ppskit.views.b0
            r1.<init>(r4)
            r0.setClickActionListener(r1)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.openalliance.ad.ppskit.views.PPSRewardEndCardView.b():void");
    }

    public final String c() {
        MetaData metaData = this.f23233x;
        if (metaData == null) {
            return null;
        }
        List<ImageInfo> U = metaData.U();
        if (androidx.transition.n.M(U) || TextUtils.isEmpty(U.get(0).g())) {
            U = this.f23233x.h0();
            if (androidx.transition.n.M(U)) {
                return null;
            }
        }
        return U.get(0).g();
    }
}
