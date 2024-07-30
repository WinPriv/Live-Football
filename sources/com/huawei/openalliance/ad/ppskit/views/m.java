package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.y4;

/* loaded from: classes2.dex */
public final class m implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f23501s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageView f23502t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyOptimizeView f23503u;

    /* loaded from: classes2.dex */
    public class a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.m$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0302a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23505s;

            public RunnableC0302a(Drawable drawable) {
                this.f23505s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                m.this.f23502t.setBackground(null);
                m.this.f23502t.setImageDrawable(this.f23505s);
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
                d2.a(new RunnableC0302a(drawable));
            }
        }
    }

    public m(PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView, String str, ImageView imageView) {
        this.f23503u = pPSFullScreenNotifyOptimizeView;
        this.f23501s = str;
        this.f23502t = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.h("icon");
        sourceParam.n(this.f23501s);
        PPSFullScreenNotifyOptimizeView pPSFullScreenNotifyOptimizeView = this.f23503u;
        e6.c e10 = new za.c(pPSFullScreenNotifyOptimizeView.A, sourceParam).e();
        if (e10 != null) {
            String str = e10.f27764a;
            if (!TextUtils.isEmpty(str)) {
                String h10 = y4.a(pPSFullScreenNotifyOptimizeView.A, "normal").h(pPSFullScreenNotifyOptimizeView.A, str);
                if (!TextUtils.isEmpty(h10)) {
                    SourceParam sourceParam2 = new SourceParam();
                    sourceParam2.n(h10);
                    com.huawei.openalliance.ad.ppskit.utils.v0.g(pPSFullScreenNotifyOptimizeView.A, sourceParam2, new a(), null, null);
                }
            }
        }
    }
}
