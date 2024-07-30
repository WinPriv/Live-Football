package com.anythink.expressad.exoplayer.j.a;

import android.net.Uri;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8768a = "exo_";

    /* renamed from: b, reason: collision with root package name */
    private static final String f8769b = "exo_redir";

    /* renamed from: c, reason: collision with root package name */
    private static final String f8770c = "exo_len";

    private j() {
    }

    public static long a(i iVar) {
        return iVar.a(f8770c);
    }

    private static Uri b(i iVar) {
        String a10 = iVar.a(f8769b, (String) null);
        if (a10 == null) {
            return null;
        }
        return Uri.parse(a10);
    }

    public static void a(k kVar, long j10) {
        kVar.a(f8770c, j10);
    }

    private static void a(k kVar) {
        kVar.a(f8770c);
    }

    private static void b(k kVar) {
        kVar.a(f8769b);
    }

    public static void a(k kVar, Uri uri) {
        kVar.a(f8769b, uri.toString());
    }
}
