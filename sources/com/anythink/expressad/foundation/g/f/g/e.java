package com.anythink.expressad.foundation.g.f.g;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.openalliance.ad.constant.w;
import java.util.List;
import org.jsoup.helper.HttpConnection;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10018a = "e";

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        com.anythink.expressad.foundation.g.f.c.c b10 = b(list, "Content-Type");
        if (b10 != null) {
            String b11 = b10.b();
            if (!TextUtils.isEmpty(b11)) {
                String[] split = b11.split(w.aG);
                for (int i10 = 1; i10 < split.length; i10++) {
                    String[] split2 = split[i10].trim().split(ContainerUtils.KEY_VALUE_DELIMITER);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        return split2[1];
                    }
                }
            }
        }
        return "UTF-8";
    }

    private static com.anythink.expressad.foundation.g.f.c.c b(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.anythink.expressad.foundation.g.f.c.c cVar = list.get(i10);
                if (cVar != null && str.equals(cVar.a())) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private static boolean c(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        if (TextUtils.equals(a(list, "Accept-Ranges"), "bytes")) {
            return true;
        }
        String a10 = a(list, "Content-Range");
        if (a10 != null && a10.startsWith("bytes")) {
            return true;
        }
        return false;
    }

    public static boolean b(List<com.anythink.expressad.foundation.g.f.c.c> list) {
        return TextUtils.equals(a(list, HttpConnection.CONTENT_ENCODING), c.f10012d);
    }

    public static String a(List<com.anythink.expressad.foundation.g.f.c.c> list, String str) {
        com.anythink.expressad.foundation.g.f.c.c b10 = b(list, str);
        return b10 != null ? b10.b() : "";
    }

    private static void a(com.anythink.expressad.foundation.g.f.h.b bVar, String str, String str2) {
        if (bVar != null) {
            try {
                if (!com.anythink.expressad.foundation.h.w.a(str) && !com.anythink.expressad.foundation.h.w.a(str2)) {
                    bVar.a(str, str2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
