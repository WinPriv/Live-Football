package com.huawei.openalliance.ad.ppskit.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.beans.metadata.AdSource;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import com.huawei.openalliance.ad.ppskit.utils.d2;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.lang.ref.WeakReference;
import ka.d5;
import ka.n7;
import ka.y4;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes2.dex */
public class PPSLabelView extends TextView {

    /* renamed from: s, reason: collision with root package name */
    public boolean f23220s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f23221t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f23222u;

    /* loaded from: classes2.dex */
    public static class a implements com.huawei.openalliance.ad.ppskit.utils.n1 {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSLabelView> f23223a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23224b;

        /* renamed from: com.huawei.openalliance.ad.ppskit.views.PPSLabelView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0298a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23225s;

            public RunnableC0298a(Drawable drawable) {
                this.f23225s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                PPSLabelView pPSLabelView = aVar.f23223a.get();
                if (pPSLabelView != null) {
                    pPSLabelView.b(aVar.f23224b, this.f23225s);
                }
            }
        }

        /* loaded from: classes2.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                PPSLabelView pPSLabelView = aVar.f23223a.get();
                if (pPSLabelView != null) {
                    pPSLabelView.setTextWhenImgLoadFail(aVar.f23224b);
                }
            }
        }

        public a(PPSLabelView pPSLabelView, String str) {
            this.f23223a = new WeakReference<>(pPSLabelView);
            this.f23224b = str;
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a() {
            n7.e("PPSLabelView", "start - dspLogo load failed");
            d2.a(new b());
        }

        @Override // com.huawei.openalliance.ad.ppskit.utils.n1
        public final void a(String str, Drawable drawable) {
            n7.e("PPSLabelView", "start - dspLogo load onSuccess");
            if (drawable != null) {
                d2.a(new RunnableC0298a(drawable));
            }
        }
    }

    public PPSLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23220s = true;
        this.f23221t = false;
        try {
            com.huawei.openalliance.ad.ppskit.utils.d0.a(context.getApplicationContext());
            this.f23222u = context.getResources().getDrawable(R.drawable.hiad_default_dsp_logo);
        } catch (Throwable unused) {
            n7.g("PPSLabelView", "init error");
        }
    }

    private String getDefaultAdSign() {
        if (this.f23220s) {
            return getResources().getString(R.string.hiad_ad_label_new);
        }
        return "";
    }

    public final d1 a(Drawable drawable, boolean z10) {
        Bitmap b10 = com.huawei.openalliance.ad.ppskit.utils.v0.b(drawable);
        if (b10 == null) {
            n7.e("PPSLabelView", "originImage bitmap is null");
            return null;
        }
        float textSize = getTextSize();
        int i10 = 0;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(b10, Math.round(textSize), Math.round(textSize), false));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        if (z10) {
            i10 = com.huawei.openalliance.ad.ppskit.utils.d0.b(getContext(), 4.0f);
        }
        return new d1(bitmapDrawable, i10);
    }

    public final void b(String str, Drawable drawable) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            String defaultAdSign = getDefaultAdSign();
            if (TextUtils.isEmpty(str)) {
                str = defaultAdSign;
            }
            boolean z10 = !TextUtils.isEmpty(str);
            spannableStringBuilder.append((CharSequence) str);
            d1 a10 = a(drawable, z10);
            if (a10 != null) {
                spannableStringBuilder.setSpan(a10, 0, 1, 33);
            }
            setText(spannableStringBuilder);
        } catch (Throwable unused) {
            n7.g("PPSLabelView", "setTextWhenImgLoaded error");
        }
    }

    public final void c(AdSource adSource, String str) {
        String p10;
        Context context;
        a aVar;
        if (adSource == null) {
            return;
        }
        if (y1.p(adSource.a()) == null) {
            p10 = "";
        } else {
            p10 = y1.p(adSource.a());
        }
        if (str == null) {
            str = "";
        }
        String h10 = com.ironsource.adapters.facebook.a.h(p10, str);
        String k10 = adSource.k();
        if (TextUtils.isEmpty(p10) && TextUtils.isEmpty(k10)) {
            n7.e("PPSLabelView", "displayTextWithDspInfo, use default adSign");
            return;
        }
        if (!TextUtils.isEmpty(p10) && TextUtils.isEmpty(k10)) {
            n7.e("PPSLabelView", "displayTextWithDspInfo, use dspNameWithAdSign");
            setText(h10);
            return;
        }
        n7.e("PPSLabelView", "loadAndSetDspInfo, start");
        d5 a10 = y4.a(getContext(), "normal");
        String h11 = a10.h(getContext(), a10.j(getContext(), k10));
        if (this.f23221t) {
            b(h10, this.f23222u);
            if (TextUtils.isEmpty(h11)) {
                SourceParam sourceParam = new SourceParam();
                sourceParam.l(false);
                sourceParam.o(true);
                sourceParam.n(k10);
                com.huawei.openalliance.ad.ppskit.utils.v0.g(getContext(), sourceParam, new a(this, h10), "normal", null);
                return;
            }
            context = getContext();
            aVar = new a(this, h10);
        } else if (!TextUtils.isEmpty(h10) && TextUtils.isEmpty(h11)) {
            n7.e("PPSLabelView", "displayTextWithDspInfo, use dspNameWithAdSign");
            setTextWhenImgLoadFail(h10);
            return;
        } else {
            b(h10, this.f23222u);
            context = getContext();
            aVar = new a(this, h10);
        }
        String str2 = com.huawei.openalliance.ad.ppskit.utils.v0.f23046a;
        p2.a(new com.huawei.openalliance.ad.ppskit.utils.u0(context, aVar, h11), 2);
    }

    public void setTextForAppDetailView(AdSource adSource) {
        if (adSource == null) {
            n7.e("PPSLabelView", "setTextWithDspInfo, use default adSign");
            return;
        }
        this.f23220s = false;
        this.f23221t = true;
        c(adSource, "");
    }

    public void setTextWhenImgLoadFail(String str) {
        String defaultAdSign = getDefaultAdSign();
        if (TextUtils.isEmpty(str)) {
            str = defaultAdSign;
        }
        if (TextUtils.isEmpty(str) && !this.f23220s) {
            setVisibility(8);
        }
        setText(str);
    }
}
