package ib;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.hamkho.livefoot.R;
import com.huawei.opendevice.open.SimplePrivacyActivity;
import ka.n7;

/* loaded from: classes2.dex */
public final class n extends ClickableSpan {

    /* renamed from: s, reason: collision with root package name */
    public final Context f29505s;

    /* renamed from: t, reason: collision with root package name */
    public Class<?> f29506t;

    public n(Context context) {
        this.f29505s = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        Context context = this.f29505s;
        n7.e("ClickSpan", "onClick");
        if (this.f29506t == null) {
            n7.g("ClickSpan", "onClick activity is null");
            return;
        }
        try {
            Intent intent = new Intent(context, this.f29506t);
            if (SimplePrivacyActivity.class == this.f29506t) {
                intent.setFlags(268435456);
                if (com.huawei.openalliance.ad.ppskit.utils.d0.m(context)) {
                    intent.addFlags(32768);
                }
            }
            intent.setClipData(oa.a.f33785b);
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            str = "onClick startActivity ActivityNotFoundException";
            n7.i("ClickSpan", str);
        } catch (Exception unused2) {
            str = "onClick startActivity Exception";
            n7.i("ClickSpan", str);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.f29505s.getResources().getColor(R.color.hiad_functional_blue));
        textPaint.setUnderlineText(com.huawei.openalliance.ad.ppskit.utils.m.I());
    }
}
