package com.anythink.expressad.foundation.g.d;

import a3.l;
import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.k;
import java.io.File;

/* loaded from: classes.dex */
public final class d extends com.anythink.expressad.foundation.g.g.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9888a = "ImageWorker";

    /* renamed from: e, reason: collision with root package name */
    private String f9889e;
    private String f;

    /* renamed from: g, reason: collision with root package name */
    private String f9890g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9891h = false;

    /* renamed from: i, reason: collision with root package name */
    private a f9892i;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public d(String str, String str2, String str3) {
        this.f9889e = str;
        this.f = str2;
        this.f9890g = str3;
    }

    private String h() {
        return this.f9889e;
    }

    private String i() {
        return this.f;
    }

    private String j() {
        return this.f9890g;
    }

    private boolean k() {
        return this.f9891h;
    }

    private a l() {
        return this.f9892i;
    }

    private void n() {
        try {
            File file = new File(this.f9890g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.anythink.expressad.foundation.g.f.h.a.a(file, this.f, new f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(long j10, long j11) {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(k kVar) {
                    String unused = d.this.f9890g;
                    d.this.d();
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                    d dVar = d.this;
                    dVar.b(dVar.f, "load image from http faild because http return code: " + aVar.f9900a + ".image url is " + d.this.f);
                }
            });
        } catch (Exception e10) {
            b(this.f, e10.getMessage());
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        } catch (OutOfMemoryError e11) {
            b(this.f, e11.getMessage());
        }
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void b() {
    }

    public final void d() {
        if (new File(this.f9890g).exists()) {
            String str = this.f;
            String str2 = this.f9890g;
            a aVar = this.f9892i;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        b(this.f, l.p(new StringBuilder("load image faild.because file["), this.f9890g, "] is not exist!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a aVar = this.f9892i;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(boolean z10) {
        this.f9891h = z10;
    }

    public final void a(a aVar) {
        this.f9892i = aVar;
    }

    private void a(String str, String str2) {
        a aVar = this.f9892i;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void a() {
        if (!this.f9891h) {
            if (TextUtils.isEmpty(this.f9890g)) {
                b(this.f, "save path is null.");
                return;
            }
            File file = new File(this.f9890g);
            if (file.exists() && file.length() > 0) {
                d();
                return;
            } else {
                n();
                return;
            }
        }
        n();
    }

    private static void m() {
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void c() {
    }
}
