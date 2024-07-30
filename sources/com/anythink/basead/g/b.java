package com.anythink.basead.g;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.e.o;
import com.anythink.core.common.e.s;
import com.anythink.core.common.t;
import com.anythink.core.common.u;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.common.g.a {

    /* renamed from: a, reason: collision with root package name */
    String f4018a;

    /* renamed from: b, reason: collision with root package name */
    JSONObject f4019b;

    public b(int i10, s sVar, String str) {
        String str2 = "";
        try {
            switch (i10) {
                case 1:
                    str2 = sVar.Q();
                    break;
                case 2:
                    str2 = sVar.R();
                    break;
                case 3:
                    str2 = sVar.S();
                    break;
                case 4:
                    str2 = sVar.T();
                    break;
                case 5:
                    str2 = sVar.U();
                    break;
                case 6:
                    str2 = sVar.V();
                    break;
                case 7:
                    str2 = sVar.W();
                    break;
                case 8:
                    str2 = sVar.X();
                    break;
                case 9:
                    str2 = sVar.Y();
                    break;
            }
            Uri parse = Uri.parse(sVar.R(str2));
            this.f4018a = parse.getScheme() + "://" + parse.getAuthority() + parse.getPath();
            this.f4019b = new JSONObject();
            for (String str3 : parse.getQueryParameterNames()) {
                this.f4019b.put(str3, URLEncoder.encode(parse.getQueryParameter(str3)));
            }
            this.f4019b.put("req_id", str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final int a() {
        return 1;
    }

    @Override // com.anythink.core.common.g.a
    public final void b(AdError adError) {
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConnection.CONTENT_ENCODING, com.anythink.expressad.foundation.g.f.g.c.f10012d);
        hashMap.put("Content-Type", "application/json;charset=utf-8");
        return hashMap;
    }

    @Override // com.anythink.core.common.g.a
    public final byte[] d() {
        JSONObject jSONObject = this.f4019b;
        if (jSONObject != null) {
            try {
                jSONObject.put(t.f6511a, String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
            }
            return com.anythink.core.common.g.a.c(this.f4019b.toString());
        }
        return new byte[0];
    }

    @Override // com.anythink.core.common.g.a
    public final String g() {
        return "";
    }

    @Override // com.anythink.core.common.g.a
    public final String h() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Context i() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String j() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final String k() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Map<String, Object> l() {
        return null;
    }

    @Override // com.anythink.core.common.g.a
    public final Object a(String str) {
        return null;
    }

    public final void b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f4019b.put("scenario", str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.anythink.core.common.g.a
    public final boolean a(int i10) {
        return false;
    }

    @Override // com.anythink.core.common.g.a
    public final void a(AdError adError) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> c10 = c();
        if (c10 != null) {
            try {
                for (String str : c10.keySet()) {
                    jSONObject.put(str, c10.get(str));
                }
            } catch (Exception unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        JSONObject jSONObject3 = this.f4019b;
        String jSONObject4 = jSONObject3 != null ? jSONObject3.toString() : "";
        u.a().a(1, b(), jSONObject2, jSONObject4, o.a(1000));
        com.anythink.core.common.j.c.a("tk", adError.getPlatformCode(), adError.getPlatformMSG(), this.f4018a, "", "1", "");
    }

    @Override // com.anythink.core.common.g.a
    public final String b() {
        return this.f4018a;
    }
}
