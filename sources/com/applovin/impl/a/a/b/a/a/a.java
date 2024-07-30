package com.applovin.impl.a.a.b.a.a;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.a.a.a.a f16917a;
    private final Context o;

    public a(com.applovin.impl.a.a.a.a aVar, Context context) {
        super(c.b.DETAIL);
        this.f16917a = aVar;
        this.o = context;
        this.f18137d = q();
        this.f18138e = r();
    }

    private SpannedString q() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f16917a.a());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f16917a.b());
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString r() {
        return new SpannedString("Displayed " + Utils.getPrettyDate(this.f16917a.d(), true));
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int a() {
        if (c()) {
            return R.drawable.applovin_ic_disclosure_arrow;
        }
        return super.g();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int b() {
        return g.a(R.color.applovin_sdk_disclosureButtonColor, this.o);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public boolean c() {
        return true;
    }
}
