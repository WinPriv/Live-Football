package com.huawei.opendevice.open;

import android.text.TextUtils;
import com.hamkho.livefoot.R;
import ib.p;
import java.util.HashMap;
import java.util.Locale;
import ka.n7;

/* loaded from: classes2.dex */
public abstract class BaseStatementActivity extends BaseWebActivity {
    public static final HashMap<String, String> H;
    public boolean G = true;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        H = hashMap;
        hashMap.put("zh-hans-", "zh-cn");
        hashMap.put("zh-hant-", "zh-tw");
        hashMap.put("zh-hans-sg", "zh-cn");
        hashMap.put("zh-hans-mo", "zh-cn");
        hashMap.put("zh-hans-hk", "zh-cn");
        hashMap.put("zh-hans-cn", "zh-cn");
        hashMap.put("zh-hant-cn", "zh-hk");
        hashMap.put("zh-hant-mo", "zh-hk");
        hashMap.put("zh-hant-hk", "zh-hk");
        hashMap.put("zh-hant-tw", "zh-tw");
        hashMap.put("zh-", "zh-cn");
        hashMap.put("zh-tw", "zh-tw");
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public final void f(p pVar) {
        n7.f("BaseStatementActivity", "onCreate isOOBE: %s", Boolean.valueOf(this.G));
        if (this.G) {
            p(pVar);
        } else {
            m(pVar);
        }
    }

    @Override // com.huawei.opendevice.open.BaseWebActivity
    public int j() {
        n7.e("BaseStatementActivity", "getLayoutId isOOBE: " + this.G);
        if (this.G) {
            return R.layout.opendevice_simple_web;
        }
        return R.layout.opendevice_web;
    }

    public final String l(String str, String str2, String str3) {
        StringBuilder j10 = com.ironsource.adapters.facebook.a.j(str);
        j10.append(q());
        if (!TextUtils.isEmpty(str2)) {
            j10.append("-");
            j10.append(str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            j10.append("-");
            j10.append(str3);
        }
        j10.append(".htm");
        return j10.toString();
    }

    public abstract void m(p pVar);

    public final String o(String str) {
        return "file:///android_asset/" + r() + q() + "-" + str + ".htm";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x002d  */
    @Override // com.huawei.opendevice.open.BaseWebActivity, com.huawei.openalliance.ad.ppskit.activity.SafeActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            java.lang.String r0 = "htm/instructions/terms-en.htm"
            java.lang.String r1 = "SystemUtil"
            boolean r2 = com.huawei.openalliance.ad.ppskit.utils.z1.S(r6)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L27
            android.content.res.AssetManager r2 = r6.getAssets()     // Catch: java.lang.Throwable -> L1e
            r2.open(r0)     // Catch: java.io.IOException -> L15 java.lang.Throwable -> L1e
            r0 = r4
            goto L1f
        L15:
            java.lang.String r2 = "%s is not in assets"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L1e
            r5[r3] = r0     // Catch: java.lang.Throwable -> L1e
            ka.n7.f(r1, r2, r5)     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = r3
        L1f:
            if (r0 != 0) goto L27
            java.lang.String r0 = "sub user and local statement not exists."
            ka.n7.e(r1, r0)
            goto L3e
        L27:
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.z1.R(r6)
            if (r0 != 0) goto L40
            com.huawei.openalliance.ad.ppskit.utils.h r0 = com.huawei.openalliance.ad.ppskit.utils.h.a(r6)
            boolean r0 = r0.c()
            if (r0 != 0) goto L40
            boolean r0 = com.huawei.openalliance.ad.ppskit.utils.m.I()
            if (r0 == 0) goto L3e
            goto L40
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r4
        L41:
            r6.G = r0
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1[r3] = r0
            java.lang.String r0 = "BaseStatementActivity"
            java.lang.String r2 = "onCreate isOOBE: %s"
            ka.n7.f(r0, r2, r1)
            super.onCreate(r7)
            boolean r7 = r6.G
            if (r7 == 0) goto L6a
            android.webkit.WebView r7 = r6.f24185u
            if (r7 == 0) goto L6a
            r7.setLongClickable(r4)
            android.webkit.WebView r7 = r6.f24185u
            com.huawei.opendevice.open.BaseWebActivity$e r0 = new com.huawei.opendevice.open.BaseWebActivity$e
            r0.<init>()
            r7.setOnLongClickListener(r0)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.opendevice.open.BaseStatementActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(ib.p r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.opendevice.open.BaseStatementActivity.p(ib.p):void");
    }

    public abstract String q();

    public abstract String r();

    public String s() {
        return Locale.getDefault().getCountry().toLowerCase(Locale.getDefault());
    }
}
