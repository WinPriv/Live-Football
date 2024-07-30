package com.huawei.openalliance.ad.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.n;
import com.huawei.hms.ads.cl;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.nativead.R;
import com.huawei.openalliance.ad.activity.FeedbackActivity;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.inter.data.AdContentData;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.views.PPSBaseDialogContentView;
import gb.r0;
import gb.u;
import gb.w0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FeedbackView extends PPSBaseDialogContentView {
    public LinearLayout E;
    public LinearLayout F;
    public FlowLayoutView G;
    public FlowLayoutView H;
    public ViewStub I;
    public ImageView J;
    public ba.b K;
    public boolean L;
    public boolean M;
    public ea.a N;
    public b O;
    public d P;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f22202s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ FeedbackInfo f22203t;

        /* renamed from: com.huawei.openalliance.ad.feedback.FeedbackView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0286a implements Runnable {
            public RunnableC0286a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                FeedbackView feedbackView = FeedbackView.this;
                feedbackView.L = true;
                int i10 = aVar.f22202s;
                FeedbackInfo feedbackInfo = aVar.f22203t;
                ba.b bVar = feedbackView.K;
                if (bVar != null) {
                    ((FeedbackActivity) bVar).m(i10, feedbackInfo);
                }
            }
        }

        public a(int i10, FeedbackInfo feedbackInfo) {
            this.f22202s = i10;
            this.f22203t = feedbackInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10;
            try {
                FeedbackView feedbackView = FeedbackView.this;
                if (!feedbackView.L) {
                    return;
                }
                feedbackView.L = false;
                if (!view.isSelected()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                view.setSelected(z10);
                view.postDelayed(new RunnableC0286a(), 200L);
            } catch (Throwable th) {
                ex.I("FeedbackView", "onClick error, %s", th.getClass().getSimpleName());
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: u, reason: collision with root package name */
        public ba.b f22206u;

        public b(Context context) {
            super(context);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z10;
            ba.b bVar;
            ea.a aVar = this.f22207s;
            if (aVar == null) {
                return;
            }
            aVar.getClass();
            ex.V("FeedbackPresenter", "click complain");
            if (aVar.f27883e != null && aVar.f != null && aVar.f27880b != null) {
                try {
                    Intent intent = new Intent();
                    intent.putExtra("package_name", aVar.f.getPackageName());
                    intent.putExtra("slotid", aVar.f27880b.D());
                    intent.putExtra("content_id", aVar.f27880b.L());
                    intent.putExtra("apiVer", aVar.f27880b.f0());
                    intent.putExtra(ba.aw, aVar.f27883e.k());
                    intent.setAction(w.cN);
                    intent.setPackage(r0.n(aVar.f));
                    if (!(aVar.f instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    u.f(aVar.f, intent);
                } catch (Throwable th) {
                    ex.I("FeedbackPresenter", "start ac failed: %s", th.getClass().getSimpleName());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            ex.Code("FeedbackView", "click to complain:%s", Boolean.valueOf(z10));
            if (z10 && (bVar = this.f22206u) != null) {
                ((FeedbackActivity) bVar).m(3, this.f22207s.f27883e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class c implements View.OnClickListener {

        /* renamed from: s, reason: collision with root package name */
        public ea.a f22207s;

        /* renamed from: t, reason: collision with root package name */
        public final Context f22208t;

        public c(Context context) {
            this.f22208t = context;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        public d(Context context) {
            super(context);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean l10;
            ea.a aVar = this.f22207s;
            if (aVar == null) {
                return;
            }
            AdContentData adContentData = aVar.f27880b;
            if (adContentData == null) {
                l10 = false;
            } else {
                String l02 = adContentData.l0();
                if (TextUtils.isEmpty(l02)) {
                    l02 = aVar.f27880b.k0();
                }
                l10 = r0.l(this.f22208t, l02);
            }
            ex.Code("FeedbackView", "click to why this ad:%s", Boolean.valueOf(l10));
        }
    }

    public FeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = true;
        this.M = true;
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void b() {
        boolean z10;
        View view;
        View.OnClickListener onClickListener;
        try {
            this.M = cl.Code(getContext()).V();
            ex.V("FeedbackView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.A), Integer.valueOf(this.B));
            if (this.f23802x != null && this.f23801w != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || (view = this.f23798t) == null) {
                return;
            }
            view.setPadding(this.A, 0, this.B, 0);
            ea.a aVar = this.N;
            if (aVar != null) {
                ArrayList arrayList = aVar.f27881c;
                ArrayList arrayList2 = aVar.f27882d;
                FeedbackInfo feedbackInfo = aVar.f27883e;
                if (n.r(arrayList)) {
                    n.q(this.E, true);
                    f(this.G, arrayList, 2);
                } else {
                    n.q(this.E, false);
                }
                if (n.r(arrayList2)) {
                    n.q(this.F, true);
                    f(this.H, arrayList2, 1);
                } else {
                    n.q(this.F, false);
                }
                if (this.M) {
                    if (feedbackInfo != null && feedbackInfo.Z()) {
                        ((TextView) findViewById(R.id.complain_tv)).setText(feedbackInfo.k());
                    } else {
                        ViewStub viewStub = this.I;
                        if (viewStub != null) {
                            viewStub.setVisibility(8);
                        }
                    }
                }
                View findViewById = findViewById(R.id.extra_area);
                if (findViewById != null) {
                    if (!this.M) {
                        onClickListener = this.P;
                    } else {
                        onClickListener = this.O;
                    }
                    findViewById.setOnClickListener(onClickListener);
                }
            }
            this.f23798t.requestLayout();
            this.f23798t.getViewTreeObserver().addOnGlobalLayoutListener(this.D);
        } catch (Throwable th) {
            ex.I("FeedbackView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void c(Context context) {
        try {
            View inflate = LayoutInflater.from(context).inflate(R.layout.hiad_feedback_view, this);
            this.f23797s = inflate;
            this.E = (LinearLayout) inflate.findViewById(R.id.feedback_positive_ll);
            this.F = (LinearLayout) this.f23797s.findViewById(R.id.feedback_negative_ll);
            this.f23798t = this.f23797s.findViewById(R.id.feedback_view_root);
            this.f23799u = this.f23797s.findViewById(R.id.feedback_scrollview);
            this.G = (FlowLayoutView) this.f23797s.findViewById(R.id.feedback_positive_flv);
            this.H = (FlowLayoutView) this.f23797s.findViewById(R.id.feedback_negative_flv);
            this.I = (ViewStub) this.f23797s.findViewById(R.id.feedback_viewstub);
            this.N = new ea.a(this);
            this.O = new b(getContext());
            d dVar = new d(getContext());
            this.P = dVar;
            b bVar = this.O;
            ea.a aVar = this.N;
            bVar.f22207s = aVar;
            dVar.f22207s = aVar;
        } catch (Throwable th) {
            ex.I("FeedbackView", "initView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public final void e(Context context) {
        int i10;
        boolean V = cl.Code(context).V();
        this.M = V;
        ex.Code("FeedbackView", "isChinaRom = %s", Boolean.valueOf(V));
        ViewStub viewStub = this.I;
        if (viewStub == null) {
            return;
        }
        if (!this.M) {
            i10 = R.layout.hiad_whythisad_viewstub;
        } else {
            i10 = R.layout.hiad_complain_viewstub;
        }
        viewStub.setLayoutResource(i10);
        this.I.inflate();
        ImageView imageView = (ImageView) findViewById(R.id.right_arrow);
        this.J = imageView;
        if (imageView != null) {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_feedback_right_arrow);
            if (u.k()) {
                this.J.setImageBitmap(w0.k(drawable));
            }
        }
    }

    public final void f(FlowLayoutView flowLayoutView, List<FeedbackInfo> list, int i10) {
        flowLayoutView.removeAllViews();
        if (androidx.transition.n.h(list)) {
            ex.V("FeedbackView", "feedbackInfoList is null");
            return;
        }
        int i11 = 1;
        ex.V("FeedbackView", "initFlowLayout, feedType: %s, feedbackList.size: %s", Integer.valueOf(i10), Integer.valueOf(list.size()));
        for (FeedbackInfo feedbackInfo : list) {
            if (feedbackInfo != null && !TextUtils.isEmpty(feedbackInfo.k())) {
                String k10 = feedbackInfo.k();
                View inflate = LayoutInflater.from(getContext()).inflate(R.layout.hiad_feedback_unlike_label_item, (ViewGroup) flowLayoutView, false);
                if (inflate instanceof TextView) {
                    TextView textView = (TextView) inflate;
                    textView.setText(k10);
                    textView.setOnClickListener(new a(i10, feedbackInfo));
                    flowLayoutView.addView(textView);
                }
            }
        }
        if (u.k()) {
            i11 = -1;
        }
        flowLayoutView.setDefaultDisplayMode(i11);
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public void setAdContentData(AdContentData adContentData) {
        ArrayList arrayList;
        ea.a aVar = this.N;
        if (aVar != null) {
            aVar.f = getContext();
            if (adContentData != null && !androidx.transition.n.h(adContentData.d0())) {
                aVar.f27880b = adContentData;
                List<FeedbackInfo> d02 = adContentData.d0();
                aVar.f27882d = new ArrayList();
                aVar.f27881c = new ArrayList();
                for (FeedbackInfo feedbackInfo : d02) {
                    if (feedbackInfo != null) {
                        int q10 = feedbackInfo.q();
                        if (q10 != 1) {
                            if (q10 != 2) {
                                if (q10 != 3) {
                                    ex.Code("FeedbackPresenter", "invalid feedback type");
                                } else {
                                    aVar.f27883e = feedbackInfo;
                                }
                            } else {
                                arrayList = aVar.f27881c;
                            }
                        } else {
                            arrayList = aVar.f27882d;
                        }
                        arrayList.add(feedbackInfo);
                    }
                }
                aVar.f27879a.b();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSBaseDialogContentView
    public void setFeedbackListener(ba.b bVar) {
        this.K = bVar;
        b bVar2 = this.O;
        if (bVar2 != null) {
            bVar2.f22206u = bVar;
        }
    }
}
