package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.p;
import com.anythink.expressad.foundation.h.x;
import com.anythink.expressad.videocommon.b.h;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12390a = "foldername";

    /* renamed from: b, reason: collision with root package name */
    public static final String f12391b = "md5filename";

    /* renamed from: c, reason: collision with root package name */
    public static final String f12392c = "nc";

    /* renamed from: d, reason: collision with root package name */
    public static final int f12393d = 259200000;

    /* renamed from: e, reason: collision with root package name */
    private static String f12394e = "ResourceManager";
    private String f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static m f12396a = new m(0);

        private a() {
        }
    }

    public /* synthetic */ m(byte b10) {
        this();
    }

    private void c() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public final void b() {
        try {
            if (!TextUtils.isEmpty(this.f)) {
                h.a.f12367a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.m.1
                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void a() {
                        com.anythink.expressad.foundation.h.m.c(m.this.f);
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void c() {
                    }
                });
            }
        } catch (Exception e10) {
            if (com.anythink.expressad.a.f6552a) {
                e10.printStackTrace();
            }
        }
    }

    private m() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public static m a() {
        return a.f12396a;
    }

    public final synchronized String a(String str, byte[] bArr) {
        String message;
        String str2 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str3 = this.f + "/" + p.a(x.a(str)) + ".zip";
                    File file = new File(str3);
                    if (com.anythink.expressad.foundation.h.m.a(bArr, file)) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters(f12392c);
                        if (queryParameters != null && queryParameters.size() != 0) {
                            str2 = a(str, str3, file);
                        }
                        List<String> queryParameters2 = parse.getQueryParameters(f12391b);
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str4 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str4) && str4.equals(com.anythink.expressad.foundation.h.l.a(file))) {
                                str2 = a(str, str3, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        com.anythink.expressad.foundation.h.m.b(file);
                    }
                }
            } catch (Exception e10) {
                if (com.anythink.expressad.a.f6552a) {
                    e10.printStackTrace();
                }
                message = e10.getMessage();
            }
        }
        message = str2;
        return message;
    }

    private String a(String str, String str2, File file) {
        String a10 = com.anythink.expressad.foundation.h.m.a(str2, this.f + "/" + p.a(x.a(str)));
        return TextUtils.isEmpty(a10) ? com.anythink.expressad.foundation.h.m.b(file) : a10;
    }

    public final String a(String str) {
        String str2;
        try {
            String str3 = this.f + "/" + p.a(x.a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(f12390a);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!com.anythink.expressad.foundation.h.m.a(str5)) {
                return null;
            }
            try {
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            return Advertisement.FILE_SCHEME + str5 + (TextUtils.isEmpty(str2) ? "" : "?".concat(String.valueOf(str2)));
        } catch (Exception e10) {
            if (!com.anythink.expressad.a.f6552a) {
                return null;
            }
            e10.printStackTrace();
            return null;
        }
    }
}
