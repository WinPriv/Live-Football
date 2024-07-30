package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends e {
    public b(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, p pVar) {
        super(i10, map, jSONObject, jSONObject2, null, pVar);
    }

    public int C() {
        int b10 = b("ad_view_width", -2);
        if (b10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getWidth();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b10;
    }

    public int D() {
        int b10 = b("ad_view_height", -2);
        if (b10 == -2) {
            MaxAdFormat format = getFormat();
            if (format.isAdViewAd()) {
                return format.getSize().getHeight();
            }
            throw new IllegalStateException("Invalid ad format");
        }
        return b10;
    }

    public long E() {
        return b("viewability_imp_delay_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.b.bW)).longValue());
    }

    public boolean F() {
        if (G() >= 0) {
            return true;
        }
        return false;
    }

    public long G() {
        long b10 = b("ad_refresh_ms", -1L);
        if (b10 >= 0) {
            return b10;
        }
        return a("ad_refresh_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.a.f18691l)).longValue());
    }

    public boolean H() {
        return b("proe", (Boolean) this.f17558b.a(com.applovin.impl.sdk.c.a.J)).booleanValue();
    }

    public long I() {
        return Utils.parseColor(b("bg_color", (String) null));
    }

    @Override // com.applovin.impl.mediation.a.a
    public a a(com.applovin.impl.mediation.g gVar) {
        return new b(this, gVar);
    }

    private b(b bVar, com.applovin.impl.mediation.g gVar) {
        super(bVar.B(), bVar.af(), bVar.V(), bVar.U(), gVar, bVar.f17558b);
    }
}
