package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C1416d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public final class h extends f<com.ironsource.mediationsdk.adunit.d.c> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r21, com.ironsource.mediationsdk.model.r r22, java.lang.String r23, boolean r24, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r25, com.ironsource.mediationsdk.IronSourceSegment r26) {
        /*
            r20 = this;
            r0 = r22
            com.ironsource.mediationsdk.adunit.c.a r13 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO
            com.ironsource.mediationsdk.utils.c r4 = r0.f25731n
            int r5 = r0.f25721c
            int r6 = r0.f25723e
            int r7 = r0.f25727j
            int r8 = r0.f25726i
            if (r24 == 0) goto L16
            com.ironsource.mediationsdk.adunit.c.b.a$a r2 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0328a.MANUAL
        L14:
            r15 = r2
            goto L20
        L16:
            boolean r2 = r4.o
            if (r2 == 0) goto L1d
            com.ironsource.mediationsdk.adunit.c.b.a$a r2 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0328a.AUTOMATIC_LOAD_WHILE_SHOW
            goto L14
        L1d:
            com.ironsource.mediationsdk.adunit.c.b.a$a r2 = com.ironsource.mediationsdk.adunit.c.b.a.EnumC0328a.AUTOMATIC_LOAD_AFTER_CLOSE
            goto L14
        L20:
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            long r2 = r4.f25898l
            long r10 = r4.f25897k
            r14 = r9
            r16 = r2
            r18 = r10
            r14.<init>(r15, r16, r18)
            boolean r10 = r0.f25728k
            long r11 = r0.f25729l
            r0 = r13
            r2 = r23
            r3 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = r20
            r1 = r25
            r2 = r26
            r0.<init>(r13, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.c.h.<init>(java.util.List, com.ironsource.mediationsdk.model.r, java.lang.String, boolean, java.util.Set, com.ironsource.mediationsdk.IronSourceSegment):void");
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final BaseAdInteractionAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b10 = C1416d.a().b(networkSettings, ad_unit);
        if (b10 != null && (b10 instanceof BaseAdInteractionAdapter)) {
            try {
                return (BaseAdInteractionAdapter) b10;
            } catch (Exception e10) {
                IronLog.INTERNAL.error("exception creating adapter - " + e10.getMessage());
            }
        }
        return null;
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c b(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i10, String str) {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
        a aVar = this.o;
        return new com.ironsource.mediationsdk.adunit.d.c(new com.ironsource.mediationsdk.adunit.d.a(ad_unit, aVar.f25176b, i10, this.f25203h, str, this.f, this.f25202g, networkSettings, aVar.f25180g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final String n() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }
}
