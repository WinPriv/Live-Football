package com.huawei.openalliance.ad.constant;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.ads.ec;
import com.huawei.hms.ads.ex;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class ct {
    private static final String B = "com.huawei.fastapp.dev";
    private static final String[] C;
    private static final String Code = "WhiteListPkgList";
    private static final String D = "com.huawei.browser";
    private static final String[] F;
    private static final String[] I;
    private static final String[] L;
    private static final String S = "com.hihonor.fastapp";
    private static final String V = "com.huawei.appmarket";
    private static final String Z = "com.huawei.fastapp";

    /* renamed from: a, reason: collision with root package name */
    private static final String f22091a = "com.hicloud.browser";

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f22092b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f22093c = "com.android.browser";

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f22094d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f22095e = "com.hihonor.browser";
    private static final String[] f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, List<String>> f22096g;

    /* renamed from: h, reason: collision with root package name */
    private static final String f22097h = "com.petal.litegames";

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f22098i;

    static {
        String[] strArr = {"ffe391e0ea186d0734ed601e4e70e3224b7309d48e2075bac46d8c667eae7212", "3baf59a2e5331c30675fab35ff5fff0d116142d3d4664f1c3cb804068b40614f"};
        I = strArr;
        String[] strArr2 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05", "59321357AB0A6BACBE3D32665B0084DCBB709B1D234EC684431AAEC5A0F0B8B1"};
        C = strArr2;
        String[] strArr3 = {w.aZ};
        F = strArr3;
        String[] strArr4 = {w.f22143bb};
        L = strArr4;
        String[] strArr5 = {w.f22145bd};
        f22092b = strArr5;
        String[] strArr6 = {"bbe2ff269828a0d922498ee87f65afe769c27d62f489d5c19b9cc6c444c80811", "d8a4db56b7ebc39fe5f3004215f0e0decb43b9cfcbe9b2d948383fedd434e7d9", w.f22143bb};
        f22094d = strArr6;
        String[] strArr7 = {"22dcb04cfaa28f382b613794eba4441a8bcb1dbc8576776f1b1e6a457b00d449"};
        f = strArr7;
        HashMap hashMap = new HashMap();
        f22096g = hashMap;
        String[] strArr8 = {"A9436644E0BD71FF512C63839F8AC27114399F36956958688555DFCC63257EDE"};
        f22098i = strArr8;
        hashMap.put(f22095e, Arrays.asList(strArr7));
        hashMap.put(f22093c, Arrays.asList(strArr6));
        hashMap.put("com.huawei.browser", Arrays.asList(strArr4));
        hashMap.put("com.huawei.appmarket", Arrays.asList(strArr));
        hashMap.put(al.Code, Arrays.asList("b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"));
        hashMap.put(al.I, Arrays.asList(al.C));
        hashMap.put(al.V, Arrays.asList(al.B));
        hashMap.put("com.huawei.fastapp", Arrays.asList(strArr2));
        hashMap.put("com.huawei.fastapp.dev", Arrays.asList(strArr2));
        hashMap.put("com.hihonor.fastapp", Arrays.asList(strArr3));
        hashMap.put("com.hicloud.browser", Arrays.asList(strArr5));
        hashMap.put(f22097h, Arrays.asList(strArr8));
    }

    public static boolean Code(Context context, String str, String str2) {
        boolean Code2 = Code(str, str2);
        return !Code2 ? V(context, str, str2) : Code2;
    }

    private static boolean V(Context context, String str, String str2) {
        String str3;
        String Code2 = ec.Code(context).Code();
        if (TextUtils.isEmpty(Code2)) {
            str3 = "inTrustAppList trustAppList is empty";
        } else if (((com.huawei.openalliance.ad.beans.metadata.b) gb.b.o(com.huawei.openalliance.ad.beans.metadata.b.class, Code2, new Class[0])) == null) {
            str3 = "inTrustAppList toObjectNoException is null";
        } else {
            str3 = "inTrustAppList map is null";
        }
        ex.V(Code, str3);
        return false;
    }

    public static boolean Code(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return Code(f22096g.get(str), str2);
        }
        ex.Z(Code, "inWhiteList invalid input");
        return false;
    }

    private static boolean Code(List<String> list, String str) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }
}
