package com.anythink.expressad.video.module.a.a;

/* loaded from: classes.dex */
public class d extends k {
    public d(com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.b.c cVar2, com.anythink.expressad.videocommon.c.c cVar3, String str, String str2, com.anythink.expressad.video.module.a.a aVar, int i10, boolean z10) {
        super(cVar, cVar2, cVar3, str, str2, aVar, i10, z10);
    }

    @Override // com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        if (this.W) {
            if (i10 != 122) {
                switch (i10) {
                    case 109:
                        b(2);
                        a(2);
                        return;
                    case 110:
                        com.anythink.expressad.foundation.d.c cVar = this.X;
                        if (cVar != null && cVar.k() == 5) {
                            a(obj.toString());
                        }
                        b(1);
                        a(1);
                        return;
                    case 111:
                        a(1);
                        return;
                    default:
                        return;
                }
            }
            a();
        }
    }
}
