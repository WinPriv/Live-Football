package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdFormat;
import com.huawei.hms.ads.gl;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class e extends a {
    public e(int i10, Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.mediation.g gVar, p pVar) {
        super(i10, map, jSONObject, jSONObject2, gVar, pVar);
    }

    public int K() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.bX;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.bZ;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.f18713cb;
        } else if (format == MaxAdFormat.NATIVE) {
            bVar = com.applovin.impl.sdk.c.b.f18715cd;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return b("viewability_min_width", ((Integer) this.f17558b.a(bVar)).intValue());
        }
        return 0;
    }

    public int L() {
        com.applovin.impl.sdk.c.b<Integer> bVar;
        MaxAdFormat format = getFormat();
        if (format == MaxAdFormat.BANNER) {
            bVar = com.applovin.impl.sdk.c.b.bY;
        } else if (format == MaxAdFormat.MREC) {
            bVar = com.applovin.impl.sdk.c.b.f18712ca;
        } else if (format == MaxAdFormat.LEADER) {
            bVar = com.applovin.impl.sdk.c.b.f18714cc;
        } else if (format == MaxAdFormat.NATIVE) {
            bVar = com.applovin.impl.sdk.c.b.ce;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            return b("viewability_min_height", ((Integer) this.f17558b.a(bVar)).intValue());
        }
        return 0;
    }

    public float M() {
        return a("viewability_min_alpha", ((Float) this.f17558b.a(com.applovin.impl.sdk.c.b.cf)).floatValue() / 100.0f);
    }

    public int N() {
        return b("viewability_min_pixels", -1);
    }

    public float O() {
        return a("viewability_min_percentage_dp", -1.0f);
    }

    public float Q() {
        return a("viewability_min_percentage_pixels", -1.0f);
    }

    public boolean S() {
        if (N() < 0 && O() < gl.Code && Q() < gl.Code) {
            return false;
        }
        return true;
    }

    public long T() {
        return b("viewability_timer_min_visible_ms", ((Long) this.f17558b.a(com.applovin.impl.sdk.c.b.cg)).longValue());
    }
}
