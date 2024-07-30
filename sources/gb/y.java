package gb;

/* loaded from: classes2.dex */
public final class y {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r8 = r8.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        if (r8 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7, com.huawei.openalliance.ad.inter.data.AdContentData r8, int r9) {
        /*
            r0 = 0
            if (r7 == 0) goto Lda
            if (r8 != 0) goto L7
            goto Lda
        L7:
            int r1 = r8.M0()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L10
            goto L59
        L10:
            com.huawei.openalliance.ad.beans.metadata.MetaData r4 = r8.K()
            if (r4 != 0) goto L18
            r4 = r0
            goto L1c
        L18:
            com.huawei.openalliance.ad.beans.metadata.PromoteInfo r4 = r4.G()
        L1c:
            r5 = 10
            java.lang.String r6 = ""
            if (r1 != r5) goto L60
            if (r4 == 0) goto L49
            int r8 = r4.a()
            r1 = 2
            if (r8 != r1) goto L49
            java.lang.String r8 = r4.b()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L49
            android.content.res.Resources r8 = r7.getResources()
            int r1 = com.huawei.hms.ads.base.R.string.hiad_wechat_mini_spec
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = r4.b()
            r5[r3] = r4
            java.lang.String r8 = r8.getString(r1, r5)
            goto Lb7
        L49:
            android.content.res.Resources r8 = r7.getResources()
            int r1 = com.huawei.hms.ads.base.R.string.hiad_wechat_mini_spec
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r6
            java.lang.String r8 = r8.getString(r1, r4)
            if (r8 != 0) goto L5b
        L59:
            r8 = r0
            goto Lb7
        L5b:
            java.lang.String r8 = r8.trim()
            goto Lb7
        L60:
            if (r4 == 0) goto L8e
            java.lang.String r1 = r4.b()
            int r4 = r4.a()
            if (r4 != r2) goto L8f
            boolean r8 = android.text.TextUtils.isEmpty(r1)
            android.content.res.Resources r4 = r7.getResources()
            if (r8 != 0) goto L81
            int r8 = com.huawei.hms.ads.base.R.string.hiad_fast_app_spec
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r1
            java.lang.String r8 = r4.getString(r8, r5)
            goto Lb7
        L81:
            int r8 = com.huawei.hms.ads.base.R.string.hiad_fast_app_spec
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r6
            java.lang.String r8 = r4.getString(r8, r1)
            if (r8 != 0) goto L5b
            goto L59
        L8e:
            r1 = r0
        L8f:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L96
            goto Lb6
        L96:
            com.huawei.openalliance.ad.inter.data.AppInfo r8 = r8.c1()
            if (r8 != 0) goto L9d
            goto L59
        L9d:
            java.lang.String r4 = r8.L()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto Lb6
            java.lang.String r4 = r8.q()
            boolean r4 = gb.b0.b(r7, r4)
            if (r4 == 0) goto Lb6
            java.lang.String r8 = r8.L()
            goto Lb7
        Lb6:
            r8 = r1
        Lb7:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 == 0) goto Lbe
            return r0
        Lbe:
            android.content.res.Resources r7 = r7.getResources()
            if (r9 != 0) goto Lcf
            int r9 = com.huawei.hms.ads.base.R.string.hiad_touch_jump_to
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r8
            java.lang.String r7 = r7.getString(r9, r0)
            return r7
        Lcf:
            int r9 = com.huawei.hms.ads.base.R.string.hiad_jump_to
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r8
            java.lang.String r7 = r7.getString(r9, r0)
            return r7
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.y.a(android.content.Context, com.huawei.openalliance.ad.inter.data.AdContentData, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(com.huawei.openalliance.ad.beans.metadata.CtrlExt r2, java.lang.Integer r3) {
        /*
            r0 = 0
            if (r2 != 0) goto L5
            r2 = r0
            goto Lf
        L5:
            java.lang.String r1 = "1"
            java.lang.String r2 = r2.k()
            boolean r2 = r1.equals(r2)
        Lf:
            if (r2 == 0) goto L2a
            r2 = 1
            if (r3 == 0) goto L26
            int r3 = r3.intValue()
            if (r3 == r2) goto L24
            r1 = 2
            if (r3 == r1) goto L24
            r1 = 6
            if (r3 == r1) goto L24
            switch(r3) {
                case 12: goto L24;
                case 13: goto L24;
                case 14: goto L24;
                default: goto L23;
            }
        L23:
            goto L26
        L24:
            r3 = r2
            goto L27
        L26:
            r3 = r0
        L27:
            if (r3 == 0) goto L2a
            r0 = r2
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.y.b(com.huawei.openalliance.ad.beans.metadata.CtrlExt, java.lang.Integer):boolean");
    }
}
