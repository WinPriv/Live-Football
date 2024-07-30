package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.a6;
import ka.n7;

/* loaded from: classes2.dex */
public final class m0 implements com.huawei.openalliance.ad.ppskit.utils.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PPSRewardView f23507a;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Drawable f23508s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Drawable f23509t;

        public a(Drawable drawable, BitmapDrawable bitmapDrawable) {
            this.f23508s = drawable;
            this.f23509t = bitmapDrawable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewGroup viewGroup;
            Drawable drawable;
            View view;
            m0 m0Var = m0.this;
            PPSAppDetailView pPSAppDetailView = m0Var.f23507a.Q;
            Drawable drawable2 = this.f23508s;
            pPSAppDetailView.setAppIconImageDrawable(drawable2);
            PPSRewardView pPSRewardView = m0Var.f23507a;
            PPSAppDetailTemplateView pPSAppDetailTemplateView = pPSRewardView.I;
            if (pPSAppDetailTemplateView != null) {
                pPSAppDetailTemplateView.setAppIconImageDrawable(drawable2);
            }
            if (!(drawable2 instanceof a6) && (viewGroup = pPSRewardView.H) != null && (drawable = this.f23509t) != null && pPSRewardView.D0 != 3) {
                viewGroup.setBackground(drawable);
                Context context = pPSRewardView.f23268x;
                if (context == null) {
                    view = null;
                } else {
                    View view2 = new View(context);
                    view2.setBackgroundResource(R.color.hiad_30_percent_white);
                    view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    view = view2;
                }
                if (view != null) {
                    pPSRewardView.H.addView(view, 0);
                }
            }
            n7.b("PPSRewardView", "get icon suucess");
        }
    }

    public m0(PPSRewardView pPSRewardView) {
        this.f23507a = pPSRewardView;
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a() {
        n7.e("PPSRewardView", "get icon failed");
    }

    @Override // com.huawei.openalliance.ad.ppskit.utils.n1
    public final void a(String str, Drawable drawable) {
        if (drawable != null) {
            d2.a(new a(drawable, androidx.activity.n.x(this.f23507a.getContext(), drawable)));
        }
    }
}
