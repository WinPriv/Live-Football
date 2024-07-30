package com.anythink.expressad.video.module.a.a;

import com.anythink.expressad.video.module.AnythinkContainerView;
import com.anythink.expressad.video.module.AnythinkVideoView;

/* loaded from: classes.dex */
public final class m extends o {
    public static final long ag = 3000;
    private AnythinkVideoView ai;
    private AnythinkContainerView aj;
    private int ak;
    private final com.anythink.core.common.i.a al;
    private boolean am;
    private boolean an;
    private int ao;
    private int ap;
    private final com.anythink.core.common.i.b aq;

    public m(AnythinkVideoView anythinkVideoView, AnythinkContainerView anythinkContainerView, com.anythink.expressad.foundation.d.c cVar, com.anythink.expressad.videocommon.c.c cVar2, com.anythink.expressad.videocommon.b.c cVar3, String str, String str2, int i10, int i11, com.anythink.expressad.video.module.a.a aVar, int i12, boolean z10, int i13) {
        super(cVar, cVar2, cVar3, str, str2, aVar, i12, z10);
        this.al = com.anythink.core.common.i.c.a();
        this.am = false;
        this.an = false;
        this.ao = 1;
        this.aq = new com.anythink.core.common.i.b() { // from class: com.anythink.expressad.video.module.a.a.m.1
            @Override // java.lang.Runnable
            public final void run() {
                m.this.aj.showVideoClickView(-1);
                m.this.ai.soundOperate(0, 2);
            }
        };
        this.ai = anythinkVideoView;
        this.aj = anythinkContainerView;
        this.ap = i10;
        this.ak = i11;
        this.ao = i13;
        if (anythinkVideoView != null) {
            this.am = anythinkVideoView.getVideoSkipTime() == 0;
        }
        if (anythinkVideoView == null || anythinkContainerView == null) {
            this.W = false;
        }
    }

    private void g() {
        this.al.a(this.aq);
    }

    private void h() {
        g();
        this.al.a(this.aq, ag);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i() {
        /*
            r4 = this;
            com.anythink.expressad.foundation.d.c r0 = r4.X
            if (r0 == 0) goto L70
            int r0 = r0.k()
            r1 = 5
            if (r0 != r1) goto L70
            com.anythink.expressad.video.module.AnythinkVideoView r0 = r4.ai
            if (r0 == 0) goto L5c
            java.util.List<com.anythink.expressad.foundation.d.c> r0 = r0.mCampOrderViewData
            if (r0 == 0) goto L5c
            r0 = 0
            r1 = r0
        L15:
            com.anythink.expressad.video.module.AnythinkVideoView r2 = r4.ai
            java.util.List<com.anythink.expressad.foundation.d.c> r2 = r2.mCampOrderViewData
            int r2 = r2.size()
            if (r1 >= r2) goto L45
            com.anythink.expressad.video.module.AnythinkVideoView r2 = r4.ai
            java.util.List<com.anythink.expressad.foundation.d.c> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L42
            com.anythink.expressad.video.module.AnythinkVideoView r2 = r4.ai
            java.util.List<com.anythink.expressad.foundation.d.c> r2 = r2.mCampOrderViewData
            java.lang.Object r2 = r2.get(r1)
            com.anythink.expressad.foundation.d.c r2 = (com.anythink.expressad.foundation.d.c) r2
            java.lang.String r2 = r2.aZ()
            com.anythink.expressad.foundation.d.c r3 = r4.X
            java.lang.String r3 = r3.aZ()
            if (r2 != r3) goto L42
            int r0 = r1 + (-1)
            goto L45
        L42:
            int r1 = r1 + 1
            goto L15
        L45:
            if (r0 < 0) goto L5c
            com.anythink.expressad.video.module.AnythinkVideoView r1 = r4.ai
            java.util.List<com.anythink.expressad.foundation.d.c> r1 = r1.mCampOrderViewData
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L5c
            com.anythink.expressad.video.module.AnythinkVideoView r1 = r4.ai
            java.util.List<com.anythink.expressad.foundation.d.c> r1 = r1.mCampOrderViewData
            java.lang.Object r0 = r1.get(r0)
            com.anythink.expressad.foundation.d.c r0 = (com.anythink.expressad.foundation.d.c) r0
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L70
            com.anythink.expressad.video.module.AnythinkVideoView r1 = r4.ai
            if (r1 == 0) goto L66
            r1.setCampaign(r0)
        L66:
            com.anythink.expressad.video.module.AnythinkContainerView r1 = r4.aj
            if (r1 == 0) goto L6d
            r1.setCampaign(r0)
        L6d:
            r4.a(r0)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.a.a.m.i():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    @Override // com.anythink.expressad.video.module.a.a.o, com.anythink.expressad.video.module.a.a.k, com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.video.module.a.a.m.a(int, java.lang.Object):void");
    }

    private void a(int i10, int i11) {
        com.anythink.expressad.foundation.d.c cVar;
        if (this.am || this.ai == null || (cVar = this.X) == null) {
            return;
        }
        int i12 = this.ak;
        char c10 = (i12 < 0 || i10 < i12) ? (char) 1 : (char) 2;
        if (c10 != 2 && (cVar.i() != 0 ? i10 > this.X.i() : this.ai.mCurrPlayNum > 1)) {
            c10 = 2;
        }
        if (c10 != 2 && this.ai.mCurrPlayNum > 1 && i10 == i11) {
            c10 = 2;
        }
        if (c10 == 2) {
            this.ai.closeVideoOperate(0, 2);
            this.am = true;
        }
    }
}
