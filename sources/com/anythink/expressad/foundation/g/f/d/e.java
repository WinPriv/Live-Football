package com.anythink.expressad.foundation.g.f.d;

import com.anythink.expressad.foundation.g.f.i;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public abstract class e<T> extends i<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final String f9965c = "e";

    /* renamed from: d, reason: collision with root package name */
    private final String f9966d;

    public e(int i10, String str, String str2, com.anythink.expressad.foundation.g.f.e<T> eVar) {
        super(i10, str, eVar);
        this.f9966d = str2;
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final byte[] h() {
        try {
            String str = this.f9966d;
            if (str == null) {
                return null;
            }
            return str.getBytes(com.anythink.expressad.foundation.g.a.bN);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
