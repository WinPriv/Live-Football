package oa;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.constant.al;
import com.huawei.openalliance.ad.constant.w;
import com.huawei.openalliance.ad.ppskit.beans.metadata.TrustAppList;
import com.huawei.openalliance.ad.ppskit.handlers.l;
import com.huawei.openalliance.ad.ppskit.utils.y0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.n7;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f33803a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f33804b;

    static {
        String[] strArr = {w.f22143bb};
        String[] strArr2 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"};
        String[] strArr3 = {"7031f6af3a934c09ba00f0196c68e7a0e6f2f948a2db7becb3b15c303cf02bde"};
        String[] strArr4 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05", "595103FD70B6793C64D85343D1549CC7AD4F508F0D310F19D07A50A1C2CE7BA4"};
        String[] strArr5 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"};
        String[] strArr6 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"};
        String[] strArr7 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"};
        String[] strArr8 = {"50787dff857ccc7423352c5273275ad14b21f2b977ca3c124cf4684c1a9bc05c"};
        String[] strArr9 = {w.f22143bb};
        String[] strArr10 = {"bbe2ff269828a0d922498ee87f65afe769c27d62f489d5c19b9cc6c444c80811", "d8a4db56b7ebc39fe5f3004215f0e0decb43b9cfcbe9b2d948383fedd434e7d9", w.f22143bb};
        String[] strArr11 = {"0a612d7aac96ac5d85f1c4a3768dd3ca7032681bae68e0dd7009bd25ad1fa3a0"};
        String[] strArr12 = {w.f22143bb};
        String[] strArr13 = {w.f22143bb};
        String[] strArr14 = {"7031f6af3a934c09ba00f0196c68e7a0e6f2f948a2db7becb3b15c303cf02bde"};
        String[] strArr15 = {w.f22143bb};
        String[] strArr16 = {"ffe391e0ea186d0734ed601e4e70e3224b7309d48e2075bac46d8c667eae7212", "3baf59a2e5331c30675fab35ff5fff0d116142d3d4664f1c3cb804068b40614f"};
        String[] strArr17 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05"};
        String[] strArr18 = {al.C};
        String[] strArr19 = {al.B};
        String[] strArr20 = {"b92825c2bd5d6d6d1e7f39eecd17843b7d9016f611136b75441bc6f4d3f00f05", "59321357AB0A6BACBE3D32665B0084DCBB709B1D234EC684431AAEC5A0F0B8B1"};
        String[] strArr21 = {w.aZ};
        String[] strArr22 = {"fb87009b7de1fbee3d19e853f449103633c420ecc0717549cfd0fb9262a544fa"};
        String[] strArr23 = {w.f22145bd};
        HashMap hashMap = new HashMap();
        f33803a = hashMap;
        new ArrayList();
        HashMap hashMap2 = new HashMap();
        f33804b = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap.put(w.cp, Arrays.asList(strArr));
        hashMap.put("com.android.mediacenter", Arrays.asList(strArr2));
        hashMap.put("com.huawei.hwvplayer.youku", Arrays.asList(strArr3));
        hashMap.put("com.huawei.himovie", Arrays.asList(strArr4));
        hashMap.put("com.huawei.hiskytone", Arrays.asList(strArr5));
        hashMap.put("com.huawei.health", Arrays.asList(strArr6));
        hashMap.put("com.huawei.wallet", Arrays.asList(strArr7));
        hashMap.put("com.android.calendar", Arrays.asList("2771bcfe40c0f6194ce52701daad4efa0f8c380c844e83081e4592f0b13163e5"));
        hashMap.put("com.huawei.android.totemweather", Arrays.asList(strArr8));
        hashMap.put("com.huawei.android.thememanager", Arrays.asList(strArr9));
        hashMap.put("com.android.browser", Arrays.asList(strArr10));
        hashMap.put("com.vmall.client", Arrays.asList(strArr11));
        hashMap.put(w.f22142ba, Arrays.asList(strArr12));
        hashMap.put("com.huawei.mycenter", Arrays.asList(strArr13));
        hashMap.put("com.huawei.hwvplayer", Arrays.asList(strArr14));
        hashMap.put("com.huawei.hifolder", Arrays.asList(strArr15));
        hashMap.put(w.W, Arrays.asList(strArr16));
        hashMap.put(al.Code, Arrays.asList(strArr17));
        hashMap.put(al.I, Arrays.asList(strArr18));
        hashMap.put(al.V, Arrays.asList(strArr19));
        hashMap.put(w.aV, Arrays.asList(strArr20));
        hashMap.put(w.aX, Arrays.asList(strArr21));
        hashMap.put(w.aW, Arrays.asList(strArr20));
        hashMap.put("com.huawei.discover", Arrays.asList(strArr22));
        hashMap.put(w.f22144bc, Arrays.asList(strArr23));
        hashMap.put("com.hihonor.browser", Arrays.asList("22dcb04cfaa28f382b613794eba4441a8bcb1dbc8576776f1b1e6a457b00d449"));
        hashMap.put("com.petal.litegames", Arrays.asList("A9436644E0BD71FF512C63839F8AC27114399F36956958688555DFCC63257EDE"));
        hashMap2.put(w.cp, Arrays.asList(strArr));
        hashMap2.put("com.android.mediacenter", Arrays.asList(strArr2));
        hashMap2.put("com.huawei.hwvplayer.youku", Arrays.asList(strArr3));
        hashMap2.put("com.huawei.himovie", Arrays.asList(strArr4));
        hashMap2.put("com.huawei.hiskytone", Arrays.asList(strArr5));
        hashMap2.put("com.huawei.health", Arrays.asList(strArr6));
        hashMap2.put("com.huawei.wallet", Arrays.asList(strArr7));
        hashMap2.put("com.huawei.android.totemweather", Arrays.asList(strArr8));
        hashMap2.put("com.huawei.android.thememanager", Arrays.asList(strArr9));
        hashMap2.put("com.vmall.client", Arrays.asList(strArr11));
        hashMap2.put("com.huawei.mycenter", Arrays.asList(strArr13));
        hashMap2.put("com.huawei.hwvplayer", Arrays.asList(strArr14));
        hashMap2.put(w.W, Arrays.asList(strArr16));
        hashMap2.put(al.Code, Arrays.asList(strArr17));
        hashMap2.put(al.I, Arrays.asList(strArr18));
        hashMap2.put(al.V, Arrays.asList(strArr19));
        hashMap2.put("com.huawei.discover", Arrays.asList(strArr22));
        hashMap3.put("com.huawei.himovie.tv", Arrays.asList("18dd69e7e187401aff81e8dccf6b44fc75b7badb1b9fccfdb14242ff1edce7b1"));
        hashMap3.put("com.huawei.appmarket.tv", Arrays.asList("ce1ef7188f820973c191227d95d54311ed3a65ec83e37009e898a1c058bbc775"));
        hashMap3.put("com.huawei.hidisk", Arrays.asList("35ee6832a80d8552eef38408a504f169d27564b87d3bd7a3b0779bee68a57df4"));
        hashMap3.put(al.I, Arrays.asList(strArr18));
        hashMap3.put("com.huawei.android.totemweather", Arrays.asList(strArr8));
        hashMap3.put("com.huawei.music.bigscreen", Arrays.asList("483ad05d7c0832e16116c42a2617d4b73803e6f94eb64f638c8001d4491c94ef"));
        hashMap3.put("com.huawei.fastapptv", Arrays.asList("59321357ab0a6bacbe3d32665b0084dcbb709b1d234ec684431aaec5a0f0b8b1"));
    }

    public static boolean a(Context context, String str, String str2) {
        String string;
        String str3;
        String str4;
        boolean b10 = b(str, str2);
        if (!b10) {
            l d10 = l.d(context);
            String packageName = context.getPackageName();
            synchronized (d10.f22585a) {
                string = d10.G(packageName).getString("trust_app_list", "");
            }
            if (TextUtils.isEmpty(string)) {
                str3 = "WhiteListPkgList";
                str4 = "inTrustAppList trustAppList is empty";
            } else {
                TrustAppList trustAppList = (TrustAppList) y0.o(null, string, TrustAppList.class, new Class[0]);
                if (trustAppList == null) {
                    str3 = "WhiteListPkgList";
                    str4 = "inTrustAppList toObjectNoException is null";
                } else {
                    Map<String, List<String>> a10 = trustAppList.a();
                    if (a10 == null) {
                        str3 = "WhiteListPkgList";
                        str4 = "inTrustAppList map is null";
                    } else {
                        List<String> list = a10.get(str);
                        if (list == null) {
                            str3 = "WhiteListPkgList";
                            str4 = "inTrustAppList signList is null";
                        } else {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                if (str2.equalsIgnoreCase(it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
            n7.e(str3, str4);
            return false;
        }
        return b10;
    }

    public static boolean b(String str, String str2) {
        return c(str, str2, (List) f33803a.get(str));
    }

    public static boolean c(String str, String str2, List<String> list) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list == null) {
                return false;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str2.equalsIgnoreCase(it.next())) {
                    return true;
                }
            }
            return false;
        }
        n7.i("WhiteListPkgList", "inWhiteList invalid input");
        return false;
    }
}
