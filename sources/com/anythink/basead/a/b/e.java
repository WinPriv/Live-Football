package com.anythink.basead.a.b;

import android.text.TextUtils;
import com.anythink.core.common.e.i;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends com.anythink.core.common.res.image.b {

    /* renamed from: a, reason: collision with root package name */
    private String f3591a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3592b;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3593j;

    /* renamed from: k, reason: collision with root package name */
    private String f3594k;

    /* renamed from: l, reason: collision with root package name */
    private int f3595l;

    /* renamed from: m, reason: collision with root package name */
    private i f3596m;

    public e(String str, boolean z10, i iVar, String str2) {
        super(str2);
        this.f3596m = iVar;
        this.f3591a = str;
        this.f3592b = z10;
        this.f3593j = TextUtils.equals(iVar.x(), str2);
        this.f3594k = iVar.p();
        this.f3595l = iVar.d();
    }

    @Override // com.anythink.core.common.res.image.b
    public final Map<String, String> a() {
        return null;
    }

    @Override // com.anythink.core.common.res.image.b
    public final void c() {
        if (this.f3593j) {
            com.anythink.basead.a.b.a(30, this.f3596m, new com.anythink.basead.c.i("", ""));
            com.anythink.core.common.j.c.a(this.f3591a, this.f3594k, this.f6495c, "1", this.f6500i, (String) null, this.f6497e, this.f6498g, this.f3595l, this.f6499h - this.f);
        }
        d.a().a(this.f6495c, 100);
    }

    @Override // com.anythink.core.common.res.image.b
    public final boolean a(InputStream inputStream) {
        com.anythink.basead.a.f.a();
        return com.anythink.basead.a.f.a(this.f6495c, inputStream);
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(com.anythink.core.common.k.b.b bVar) {
        if (this.f3592b) {
            com.anythink.core.common.k.b.a.a().a(bVar, 6);
        } else {
            com.anythink.core.common.k.b.a.a().a(bVar, 5);
        }
    }

    @Override // com.anythink.core.common.res.image.b
    public final void a(String str, String str2) {
        if (this.f3593j) {
            com.anythink.core.common.j.c.a(this.f3591a, this.f3594k, this.f6495c, "0", this.f6500i, str2, this.f6497e, 0L, this.f3595l, this.f6499h - this.f);
        }
        d.a().a(this.f6495c, com.anythink.basead.c.f.a(str, str2));
    }

    @Override // com.anythink.core.common.res.image.b
    public final void b() {
    }
}
