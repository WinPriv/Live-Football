package com.anythink.expressad.video.module.c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.h.b;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.k;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.anythink.expressad.foundation.g.f.h.a {
    public a(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.foundation.g.f.h.a
    public final void a(String str, b bVar) {
        super.a(str, bVar);
        bVar.a("platform", "1");
        bVar.a(com.anythink.expressad.foundation.g.a.f9771bd, Build.VERSION.RELEASE);
        bVar.a("package_name", k.h(this.f10025a));
        bVar.a(com.anythink.expressad.foundation.g.a.bf, k.d(this.f10025a));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.c(this.f10025a));
        bVar.a("app_version_code", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(k.b(this.f10025a));
        bVar.a("orientation", sb3.toString());
        bVar.a("gaid", "");
        bVar.a("sdk_version", com.anythink.expressad.out.b.f10461a);
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        if (com.anythink.expressad.d.b.b() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    String a10 = j.a(jSONObject.toString());
                    if (!TextUtils.isEmpty(a10)) {
                        bVar.a("dvi", a10);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
