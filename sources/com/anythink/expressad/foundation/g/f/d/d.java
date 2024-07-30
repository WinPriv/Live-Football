package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.o;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends e<JSONObject> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9964c = "d";

    public d(int i10, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONObject> eVar) {
        super(i10, str, str2, eVar);
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<JSONObject> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            String str = new String(cVar.f9988b, com.anythink.expressad.foundation.g.f.g.e.a(cVar.f9990d));
            if (cVar.f9987a == 204) {
                return k.a(new JSONObject(), cVar);
            }
            return k.a(new JSONObject(str), cVar);
        } catch (UnsupportedEncodingException e10) {
            o.d(f9964c, e10.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e11) {
            o.d(f9964c, e11.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
