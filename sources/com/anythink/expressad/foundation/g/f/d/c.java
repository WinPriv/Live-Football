package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.o;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c extends e<JSONArray> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9963c = "c";

    public c(int i10, String str, String str2, com.anythink.expressad.foundation.g.f.e<JSONArray> eVar) {
        super(i10, str, str2, eVar);
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<JSONArray> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return k.a(new JSONArray(new String(cVar.f9988b, com.anythink.expressad.foundation.g.f.g.e.a(cVar.f9990d))), cVar);
        } catch (UnsupportedEncodingException e10) {
            o.d(f9963c, e10.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        } catch (JSONException e11) {
            o.d(f9963c, e11.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }
}
