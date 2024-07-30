package com.huawei.openalliance.ad.ppskit.views;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import ka.y4;

/* loaded from: classes2.dex */
public final class e0 implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f23419s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ImageView f23420t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ PPSRewardPopUpView f23421u;

    /* loaded from: classes2.dex */
    public class a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.e0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0301a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23423s;

            public RunnableC0301a(Drawable drawable) {
                this.f23423s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e0.this.f23420t.setImageDrawable(this.f23423s);
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
                d2.a(new RunnableC0301a(drawable));
            }
        }
    }

    public e0(PPSRewardPopUpView pPSRewardPopUpView, String str, ImageView imageView) {
        this.f23421u = pPSRewardPopUpView;
        this.f23419s = str;
        this.f23420t = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SourceParam sourceParam = new SourceParam();
        sourceParam.l(false);
        sourceParam.o(true);
        sourceParam.h("icon");
        sourceParam.n(this.f23419s);
        PPSRewardPopUpView pPSRewardPopUpView = this.f23421u;
        e6.c e10 = new za.c(pPSRewardPopUpView.f23238s, sourceParam).e();
        if (e10 != null) {
            String str = e10.f27764a;
            if (!TextUtils.isEmpty(str)) {
                String h10 = y4.a(pPSRewardPopUpView.f23238s, "normal").h(pPSRewardPopUpView.f23238s, str);
                if (!TextUtils.isEmpty(h10)) {
                    SourceParam sourceParam2 = new SourceParam();
                    sourceParam2.n(h10);
                    com.huawei.openalliance.ad.ppskit.utils.v0.g(pPSRewardPopUpView.f23238s, sourceParam2, new a(), null, null);
                }
            }
        }
    }
}
