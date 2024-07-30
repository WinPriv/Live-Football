package com.huawei.openalliance.ad.ppskit.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import ka.n7;
import ka.y4;

/* loaded from: classes2.dex */
public class ChoicesView extends ImageView {

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f23111s;

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.ChoicesView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0295a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

            /* renamed from: com.huawei.openalliance.ad.ppskit.views.ChoicesView$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public class RunnableC0296a implements Runnable {

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ Drawable f23114s;

                public RunnableC0296a(Drawable drawable) {
                    this.f23114s = drawable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChoicesView.this.setImageDrawable(this.f23114s);
                }
            }

            /* renamed from: com.huawei.openalliance.ad.ppskit.views.ChoicesView$a$a$b */
            /* loaded from: classes2.dex */
            public class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ChoicesView.this.setImageResource(R.drawable.hiad_ad_adchoice);
                }
            }

            public C0295a() {
            }

            @Override // com.huawei.openalliance.ad.ppskit.utils.n1
            public final void a() {
                n7.b("HwChoicesView_KIT", "download icon fail, use local icon");
                d2.a(new b());
            }

            @Override // com.huawei.openalliance.ad.ppskit.utils.n1
            public final void a(String str, Drawable drawable) {
                if (drawable != null) {
                    d2.a(new RunnableC0296a(drawable));
                }
            }
        }

        public a(String str) {
            this.f23111s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SourceParam sourceParam = new SourceParam();
            sourceParam.l(false);
            sourceParam.o(true);
            sourceParam.h("icon");
            sourceParam.n(this.f23111s);
            ChoicesView choicesView = ChoicesView.this;
            e6.c e10 = new za.c(choicesView.getContext(), sourceParam).e();
            if (e10 != null) {
                String str = e10.f27764a;
                if (!TextUtils.isEmpty(str)) {
                    String h10 = y4.a(choicesView.getContext(), "normal").h(choicesView.getContext(), str);
                    if (!TextUtils.isEmpty(h10)) {
                        SourceParam sourceParam2 = new SourceParam();
                        sourceParam2.n(h10);
                        com.huawei.openalliance.ad.ppskit.utils.v0.g(choicesView.getContext(), sourceParam2, new C0295a(), null, null);
                    }
                }
            }
        }
    }

    public ChoicesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.hiad_24_dp);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.hiad_24_dp);
        n7.c("HwChoicesView_KIT", "adChoiceViewWidth = %s", Integer.valueOf(dimensionPixelSize));
        setLayoutParams(new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
        setImageResource(R.drawable.hiad_ad_whythisad_i);
    }

    public void setAdChoiceIcon(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        n7.b("HwChoicesView_KIT", "updateIcon from server.");
        p2.c(new a(str));
    }
}
