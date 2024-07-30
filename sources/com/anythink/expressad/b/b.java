package com.anythink.expressad.b;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    String f7094a;

    private b(String str, String str2) {
        super(str);
        this.f7094a = str2;
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.f7094a);
            byte[] bArr = new byte[2048];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.k.b.b bVar) {
        com.anythink.core.common.k.b.a.a().a(bVar, 2);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
    }
}
