package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.o;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class g extends i<String> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9970c = "g";

    /* renamed from: d, reason: collision with root package name */
    private String f9971d;

    public g(int i10, String str, String str2, com.anythink.expressad.foundation.g.f.e<String> eVar) {
        super(i10, str, eVar);
        this.f9971d = str2;
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<String> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        try {
            return k.a(new String(cVar.f9988b, com.anythink.expressad.foundation.g.f.g.e.a(cVar.f9990d)), cVar);
        } catch (UnsupportedEncodingException e10) {
            o.d(f9970c, e10.getMessage());
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(8, cVar));
        }
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final byte[] h() {
        try {
            String str = this.f9971d;
            if (str == null) {
                return null;
            }
            return str.getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
