package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.y4;

/* loaded from: classes2.dex */
public final class c0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f23397s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageView f23398t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PPSRewardEndCardView f23399u;

    /* loaded from: classes2.dex */
    public class a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.c0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0300a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23401s;

            public RunnableC0300a(Drawable drawable) {
                this.f23401s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c0.this.f23398t.setImageDrawable(this.f23401s);
            }
        }

        public a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a() {
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a(String str, Drawable drawable) {
            if (drawable != null) {
                d2.a(new RunnableC0300a(drawable));
            }
        }
    }

    public c0(PPSRewardEndCardView pPSRewardEndCardView, String str, ImageView imageView) {
        this.f23399u = pPSRewardEndCardView;
        this.f23397s = str;
        this.f23398t = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.h("icon");
        sourceParam.n(this.f23397s);
        PPSRewardEndCardView pPSRewardEndCardView = this.f23399u;
        if (!pPSRewardEndCardView.E) {
            sourceParam.b(pPSRewardEndCardView.f23229t.O(pPSRewardEndCardView.G));
        }
        e6.c e10 = new za.c(pPSRewardEndCardView.f23228s, sourceParam).e();
        if (e10 != null) {
            String str = e10.f27764a;
            if (!TextUtils.isEmpty(str)) {
                String h10 = y4.a(pPSRewardEndCardView.f23228s, "normal").h(pPSRewardEndCardView.f23228s, str);
                if (!TextUtils.isEmpty(h10)) {
                    SourceParam sourceParam2 = new SourceParam();
                    sourceParam2.n(h10);
                    com.huawei.openalliance.ad.ppskit.utils.v0.g(pPSRewardEndCardView.f23228s, sourceParam2, new a(), null, null);
                }
            }
        }
    }
}
