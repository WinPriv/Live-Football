package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.videocommon.b.h;
import java.io.File;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f12379a = 259200000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f12380b = "HTMLResourceManager";

    /* renamed from: c, reason: collision with root package name */
    private String f12381c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static j f12383a = new j(0);

        private a() {
        }
    }

    public /* synthetic */ j(byte b10) {
        this();
    }

    private void c() {
        this.f12381c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.f12381c)) {
                return;
            }
            h.a.f12367a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.j.1
                @Override // com.anythink.expressad.foundation.g.g.a
                public final void a() {
                    com.anythink.expressad.foundation.h.m.c(j.this.f12381c);
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void c() {
                }
            });
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    private j() {
        this.f12381c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public static j a() {
        return a.f12383a;
    }

    public final boolean a(String str, byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        try {
            if (bArr.length <= 0) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f12381c);
            sb2.append("/");
            sb2.append(p.a(x.a(str)));
            sb2.append(".html");
            return com.anythink.expressad.foundation.h.m.a(bArr, new File(sb2.toString()));
        } catch (Exception e10) {
            if (!com.anythink.expressad.a.f6552a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public final String b(String str) {
        try {
            File file = new File(this.f12381c + "/" + p.a(x.a(str)) + ".html");
            if (file.exists()) {
                return com.anythink.expressad.foundation.h.m.a(file);
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }

    public final String a(String str) {
        try {
            String str2 = this.f12381c + "/" + p.a(x.a(str)) + ".html";
            if (new File(str2).exists()) {
                return "file:////".concat(String.valueOf(str2));
            }
            return null;
        } catch (Throwable th) {
            if (!com.anythink.expressad.a.f6552a) {
                return null;
            }
            th.printStackTrace();
            return null;
        }
    }
}
