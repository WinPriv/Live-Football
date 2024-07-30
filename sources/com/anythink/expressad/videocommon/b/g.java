package com.anythink.expressad.videocommon.b;

import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.b.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12360a = "<anythinkloadend></anythinkloadend>";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12361b = "DownLoadUtils";

    /* renamed from: c, reason: collision with root package name */
    private static final int f12362c = 20000;

    /* renamed from: d, reason: collision with root package name */
    private static final int f12363d = 30000;

    public static void a(final String str, final i.c cVar) {
        try {
            if (!w.a(str) && URLUtil.isNetworkUrl(str)) {
                h.a.f12367a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.g.1
                    final /* synthetic */ boolean f = true;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[Catch: all -> 0x00e5, TryCatch #2 {all -> 0x00e5, blocks: (B:53:0x00d4, B:56:0x00da, B:58:0x00dd, B:35:0x00e9, B:37:0x00ef, B:39:0x00f5, B:41:0x00fd, B:43:0x0101, B:47:0x0107, B:49:0x010b), top: B:52:0x00d4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #2 {all -> 0x00e5, blocks: (B:53:0x00d4, B:56:0x00da, B:58:0x00dd, B:35:0x00e9, B:37:0x00ef, B:39:0x00f5, B:41:0x00fd, B:43:0x0101, B:47:0x0107, B:49:0x010b), top: B:52:0x00d4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x00bf A[Catch: Exception -> 0x00c3, TRY_ENTER, TryCatch #12 {Exception -> 0x00c3, blocks: (B:29:0x0090, B:31:0x0095, B:80:0x00bf, B:82:0x00c7), top: B:2:0x0004 }] */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x00c7 A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #12 {Exception -> 0x00c3, blocks: (B:29:0x0090, B:31:0x0095, B:80:0x00bf, B:82:0x00c7), top: B:2:0x0004 }] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v11 */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v13 */
                    /* JADX WARN: Type inference failed for: r4v14 */
                    /* JADX WARN: Type inference failed for: r4v2 */
                    /* JADX WARN: Type inference failed for: r4v8 */
                    /* JADX WARN: Type inference failed for: r4v9 */
                    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
                    @Override // com.anythink.expressad.foundation.g.g.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void a() {
                        /*
                            Method dump skipped, instructions count: 327
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.videocommon.b.g.AnonymousClass1.a():void");
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void c() {
                    }
                });
                return;
            }
            cVar.a("url is error");
        } catch (Throwable th) {
            if (com.anythink.expressad.a.f6552a) {
                th.printStackTrace();
            }
        }
    }
}
