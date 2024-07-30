package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.huawei.hms.ads.base.R;
import com.huawei.hms.ads.ex;
import com.huawei.openalliance.ad.beans.inner.SourceParam;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.constant.ba;
import com.huawei.openalliance.ad.constant.bw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import gb.r0;
import gb.w0;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PPSLabelView extends TextView {

    /* renamed from: s, reason: collision with root package name */
    public boolean f23836s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f23837t;

    /* loaded from: classes2.dex */
    public static class a implements gb.j {

        /* renamed from: s, reason: collision with root package name */
        public final WeakReference<PPSLabelView> f23838s;

        /* renamed from: t, reason: collision with root package name */
        public final String f23839t;

        /* renamed from: com.huawei.openalliance.ad.views.PPSLabelView$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class RunnableC0306a implements Runnable {

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Drawable f23840s;

            public RunnableC0306a(Drawable drawable) {
                this.f23840s = drawable;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                PPSLabelView pPSLabelView = aVar.f23838s.get();
                if (pPSLabelView != null) {
                    pPSLabelView.c(aVar.f23839t, this.f23840s);
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
                PPSLabelView pPSLabelView = aVar.f23838s.get();
                if (pPSLabelView != null) {
                    pPSLabelView.setTextWhenImgLoadFail(aVar.f23839t);
                }
            }
        }

        public a(PPSLabelView pPSLabelView, String str) {
            this.f23838s = new WeakReference<>(pPSLabelView);
            this.f23839t = str;
        }

        @Override // gb.j
        public final void Code() {
            ex.V("PPSLabelView", "start - dspLogo load failed");
            gb.w.b(new b());
        }

        @Override // gb.j
        public final void Code(String str, Drawable drawable) {
            ex.V("PPSLabelView", "start - dspLogo load onSuccess");
            gb.w.b(new RunnableC0306a(drawable));
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements RemoteCallResultCallback<String> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PPSLabelView> f23843a;

        /* renamed from: b, reason: collision with root package name */
        public final String f23844b;

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                PPSLabelView pPSLabelView = bVar.f23843a.get();
                if (pPSLabelView != null) {
                    pPSLabelView.setTextWhenImgLoadFail(bVar.f23844b);
                }
            }
        }

        public b(PPSLabelView pPSLabelView, String str) {
            this.f23843a = new WeakReference<>(pPSLabelView);
            this.f23844b = str;
        }

        @Override // com.huawei.openalliance.ad.ipc.RemoteCallResultCallback
        public final void onRemoteCallResult(String str, CallResult<String> callResult) {
            String data = callResult.getData();
            PPSLabelView pPSLabelView = this.f23843a.get();
            if (pPSLabelView != null) {
                if (!TextUtils.isEmpty(data) && data.startsWith(bw.CONTENT.toString())) {
                    SourceParam sourceParam = new SourceParam();
                    sourceParam.l(false);
                    sourceParam.h();
                    sourceParam.i(data);
                    w0.e(pPSLabelView.getContext(), sourceParam, new a(pPSLabelView, this.f23844b));
                    return;
                }
                gb.w.b(new a());
            }
        }
    }

    public PPSLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23836s = true;
        try {
            this.f23837t = context.getResources().getDrawable(R.drawable.hiad_default_dsp_logo);
        } catch (Throwable unused) {
            ex.I("PPSLabelView", "init error");
        }
    }

    private String getDefaultAdSign() {
        if (this.f23836s) {
            return getResources().getString(R.string.hiad_ad_label_new);
        }
        return "";
    }

    public final t a(Drawable drawable, boolean z10) {
        int i10;
        Bitmap c10 = w0.c(drawable);
        if (c10 == null) {
            ex.V("PPSLabelView", "originImage bitmap is null");
            return null;
        }
        float textSize = getTextSize();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(c10, Math.round(textSize), Math.round(textSize), false));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        if (z10) {
            i10 = r0.i(getContext(), 4.0f);
        } else {
            i10 = 0;
        }
        return new t(bitmapDrawable, 0, i10);
    }

    public void b(AdSource adSource, String str) {
        String j10;
        if (adSource == null) {
            return;
        }
        if (gb.p.j(adSource.k()) == null) {
            j10 = "";
        } else {
            j10 = gb.p.j(adSource.k());
        }
        String h10 = com.ironsource.adapters.facebook.a.h(j10, "");
        String p10 = adSource.p();
        if (TextUtils.isEmpty(j10) && TextUtils.isEmpty(p10)) {
            ex.V("PPSLabelView", "displayTextWithDspInfo, use default adSign");
        } else if (!TextUtils.isEmpty(j10) && TextUtils.isEmpty(p10)) {
            ex.V("PPSLabelView", "displayTextWithDspInfo, use dspNameWithAdSign");
            setText(h10);
        } else {
            d(h10, p10);
        }
    }

    public void c(String str, Drawable drawable) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            String defaultAdSign = getDefaultAdSign();
            if (TextUtils.isEmpty(str)) {
                str = defaultAdSign;
            }
            boolean z10 = !TextUtils.isEmpty(str);
            spannableStringBuilder.append((CharSequence) str);
            t a10 = a(drawable, z10);
            if (a10 != null) {
                spannableStringBuilder.setSpan(a10, 0, 1, 33);
            }
            setText(spannableStringBuilder);
        } catch (Throwable unused) {
            ex.I("PPSLabelView", "setTextWhenImgLoaded error");
        }
    }

    public final void d(String str, String str2) {
        ex.V("PPSLabelView", "loadAndSetDspInfo, start");
        c(str, this.f23837t);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ba.f22075z, str2);
            ha.i.e(getContext()).d(com.huawei.openalliance.ad.constant.s.f22113h, jSONObject.toString(), new b(this, str), String.class);
        } catch (Throwable unused) {
            ex.I("PPSLabelView", "loadAndSetDspInfo error");
        }
    }

    public void setTextForAppDetailView(AdSource adSource) {
        if (adSource == null) {
            ex.V("PPSLabelView", "setTextWithDspInfo, use default adSign");
        } else {
            this.f23836s = false;
            b(adSource, "");
        }
    }

    public void setTextWhenImgLoadFail(String str) {
        String defaultAdSign = getDefaultAdSign();
        if (TextUtils.isEmpty(str)) {
            str = defaultAdSign;
        }
        if (TextUtils.isEmpty(str) && !this.f23836s) {
            setVisibility(8);
        }
        setText(str);
    }
}
