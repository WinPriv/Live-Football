package com.applovin.impl.mediation.debugger.ui.b.a;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.anythink.expressad.exoplayer.k.p;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.mediation.debugger.b.c.b f18073a;
    private final Context o;

    public a(com.applovin.impl.mediation.debugger.b.c.b bVar, Context context) {
        super(c.b.DETAIL);
        this.f18073a = bVar;
        this.o = context;
        this.f18137d = q();
        this.f18138e = r();
    }

    private SpannedString q() {
        int i10;
        if (c()) {
            i10 = -16777216;
        } else {
            i10 = -7829368;
        }
        return StringUtils.createSpannedString(this.f18073a.i(), i10, 18, 1);
    }

    private SpannedString r() {
        if (!c()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) s());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) t());
        if (this.f18073a.a() == b.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        String str;
        if (this.f18073a.d()) {
            if (!TextUtils.isEmpty(this.f18073a.j())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f18073a.j(), -16777216));
                return new SpannedString(spannableStringBuilder);
            }
            if (this.f18073a.e()) {
                str = "Retrieving SDK Version...";
            } else {
                str = "SDK Found";
            }
            return StringUtils.createListItemDetailSpannedString(str, -16777216);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    private SpannedString t() {
        if (this.f18073a.e()) {
            if (!TextUtils.isEmpty(this.f18073a.k())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f18073a.k(), -16777216));
                if (this.f18073a.f()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", Color.rgb(p.f9095b, com.anythink.expressad.video.module.a.a.R, 0)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f18073a.l(), -16777216));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
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
        if (this.f18073a.a() != b.a.MISSING) {
            return true;
        }
        return false;
    }

    public com.applovin.impl.mediation.debugger.b.c.b f() {
        return this.f18073a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.c
    public int g() {
        int o = this.f18073a.o();
        if (o <= 0) {
            return R.drawable.applovin_ic_mediation_placeholder;
        }
        return o;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f18137d) + ", detailText=" + ((Object) this.f18138e) + ", network=" + this.f18073a + "}";
    }
}
