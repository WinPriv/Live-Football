package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.y4;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f23538s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageView f23539t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PPSFullScreenNotifyView f23540u;

    /* loaded from: classes2.dex */
    public class a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0303a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23542s;

            public RunnableC0303a(Drawable drawable) {
                this.f23542s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                r.this.f23539t.setBackground(null);
                r.this.f23539t.setImageDrawable(this.f23542s);
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
                d2.a(new RunnableC0303a(drawable));
            }
        }
    }

    public r(PPSFullScreenNotifyView pPSFullScreenNotifyView, String str, ImageView imageView) {
        this.f23540u = pPSFullScreenNotifyView;
        this.f23538s = str;
        this.f23539t = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.h("icon");
        sourceParam.n(this.f23538s);
        PPSFullScreenNotifyView pPSFullScreenNotifyView = this.f23540u;
        e6.c e10 = new za.c(pPSFullScreenNotifyView.A, sourceParam).e();
        if (e10 != null) {
            String str = e10.f27764a;
            if (!TextUtils.isEmpty(str)) {
                String h10 = y4.a(pPSFullScreenNotifyView.A, "normal").h(pPSFullScreenNotifyView.A, str);
                if (!TextUtils.isEmpty(h10)) {
                    SourceParam sourceParam2 = new SourceParam();
                    sourceParam2.n(h10);
                    com.huawei.openalliance.ad.ppskit.utils.v0.g(pPSFullScreenNotifyView.A, sourceParam2, new a(), null, null);
                }
            }
        }
    }
}
