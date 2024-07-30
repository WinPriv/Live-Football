package com.anythink.expressad.video.module.a.a;

/* loaded from: classes.dex */
public final class h extends k {
    public h(com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.b.c cVar2, com.anythink.expressad.videocommon.c.c cVar3, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i10, boolean z10) {
        super(cVar, cVar2, cVar3, str, str2, aVar, i10, z10);
    }

    @Override // com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public final void a(int i10, Object obj) {
        if (i10 != 100) {
            if (i10 != 109) {
                if (i10 != 122) {
                    if (i10 != 129) {
                        String str = "";
                        if (i10 != 118) {
                            if (i10 == 119) {
                                if (obj != null && (obj instanceof String)) {
                                    str = (String) obj;
                                }
                                a(4, str);
                            }
                        } else {
                            if (obj != null && (obj instanceof String)) {
                                str = (String) obj;
                            }
                            a(3, str);
                        }
                    } else {
                        com.anythink.expressad.foundation.d.c cVar = this.X;
                        if (cVar != null && cVar.J() == 2) {
                            e();
                            d();
                            c();
                            a(1);
                        }
                    }
                } else {
                    a();
                }
            } else {
                b(2);
            }
        } else {
            e();
            d();
            c();
            a(2);
        }
        super.a(i10, obj);
    }
}
