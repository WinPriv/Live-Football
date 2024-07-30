package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hms.ads.cz;
import com.huawei.hms.ads.dj;
import com.huawei.hms.ads.ex;
import com.huawei.hms.ads.fs;
import com.huawei.hms.ads.splash.R;
import com.huawei.openalliance.ad.beans.metadata.AdSource;
import com.huawei.openalliance.ad.constant.ba;
import gb.r0;
import gb.w0;

/* loaded from: classes2.dex */
public class PPSSplashLabelView extends PPSLabelView {

    /* renamed from: u, reason: collision with root package name */
    public fs f23947u;

    /* renamed from: v, reason: collision with root package name */
    public Integer f23948v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f23949w;

    /* renamed from: x, reason: collision with root package name */
    public final a f23950x;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PPSSplashLabelView pPSSplashLabelView = PPSSplashLabelView.this;
            dj.Code(pPSSplashLabelView.getContext()).Code();
            cz.Code(pPSSplashLabelView.getContext());
            Intent intent = new Intent();
            intent.setAction(com.huawei.openalliance.ad.constant.w.ag);
            intent.setPackage(r0.n(pPSSplashLabelView.getContext()));
            int intValue = pPSSplashLabelView.f23948v.intValue();
            Integer o = r0.o(pPSSplashLabelView.getContext());
            if (!r0.f() && (o == null || o.intValue() < 30454100)) {
                ex.V("PPSSplashLabelView", "HMS version is low, interactMode is %s", Integer.valueOf(intValue));
                if (intValue == 4) {
                    intValue = 1;
                }
                if (intValue == 3) {
                    intValue = 2;
                }
            }
            intent.putExtra(ba.ah, intValue);
            if (!(pPSSplashLabelView.getContext() instanceof Activity)) {
                intent.addFlags(268435456);
            }
            gb.u.f(pPSSplashLabelView.getContext(), intent);
            fs fsVar = pPSSplashLabelView.f23947u;
            if (fsVar != null) {
                fsVar.C();
            }
        }
    }

    public PPSSplashLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23950x = new a();
    }

    private ImageSpan getClickImageSpan() {
        try {
            Drawable drawable = getResources().getDrawable(R.drawable.hiad_chevron_right);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            if (gb.u.k()) {
                return new t(getContext(), w0.k(drawable), r0.i(getContext(), 4.0f));
            }
            return new t(drawable, r0.i(getContext(), 4.0f), 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private void setClick(SpannableStringBuilder spannableStringBuilder) {
        if (PPSSplashAdSourceView.b(getContext(), this.f23948v, this.f23949w)) {
            spannableStringBuilder.append(" ");
            SpannableString spannableString = new SpannableString(spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableString);
            ImageSpan clickImageSpan = getClickImageSpan();
            if (clickImageSpan != null) {
                spannableStringBuilder2.setSpan(clickImageSpan, spannableString.length() - 1, spannableString.length(), 33);
            }
            setText(spannableStringBuilder2);
            setOnClickListener(this.f23950x);
            return;
        }
        setText(spannableStringBuilder);
    }

    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    public final void b(AdSource adSource, String str) {
        String j10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (adSource == null) {
            ex.V("PPSSplashLabelView", "adSource is null");
            setClick(spannableStringBuilder);
            return;
        }
        if (gb.p.j(adSource.k()) == null) {
            j10 = "";
        } else {
            j10 = gb.p.j(adSource.k());
        }
        if (str == null) {
            str = "";
        }
        String h10 = com.ironsource.adapters.facebook.a.h(j10, str);
        String p10 = adSource.p();
        if (TextUtils.isEmpty(j10) && TextUtils.isEmpty(p10)) {
            setClick(spannableStringBuilder);
        } else if (!TextUtils.isEmpty(j10) && TextUtils.isEmpty(p10)) {
            setClick(new SpannableStringBuilder(h10));
        } else {
            d(h10, p10);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    public final void c(String str, Drawable drawable) {
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            boolean z10 = !TextUtils.isEmpty(str);
            spannableStringBuilder.append((CharSequence) str);
            t a10 = a(drawable, z10);
            if (a10 != null) {
                spannableStringBuilder.setSpan(a10, 0, 1, 33);
            }
            setClick(spannableStringBuilder);
        } catch (Throwable unused) {
            ex.I("PPSSplashLabelView", "setTextWhenImgLoaded error");
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSLabelView
    public void setTextWhenImgLoadFail(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) str);
        }
        setClick(spannableStringBuilder);
    }
}
