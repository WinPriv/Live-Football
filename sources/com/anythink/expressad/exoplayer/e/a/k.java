package com.anythink.expressad.exoplayer.e.a;

import android.util.Log;
import com.anythink.expressad.exoplayer.e.m;

/* loaded from: classes.dex */
public final class k {
    private static final String f = "TrackEncryptionBox";

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7902b;

    /* renamed from: c, reason: collision with root package name */
    public final m.a f7903c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7904d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7905e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals(com.anythink.expressad.exoplayer.b.be) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.anythink.expressad.exoplayer.k.a.a(r2)
            r4.f7901a = r5
            r4.f7902b = r6
            r4.f7904d = r7
            r4.f7905e = r11
            com.anythink.expressad.exoplayer.e.m$a r5 = new com.anythink.expressad.exoplayer.e.m$a
            if (r6 != 0) goto L20
            goto L72
        L20:
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L4c;
                case 3046671: goto L41;
                case 3049879: goto L36;
                case 3049895: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r2
            goto L55
        L2b:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L34
            goto L29
        L34:
            r0 = 3
            goto L55
        L36:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L3f
            goto L29
        L3f:
            r0 = r11
            goto L55
        L41:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L4a
            goto L29
        L4a:
            r0 = r1
            goto L55
        L4c:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L55
            goto L29
        L55:
            switch(r0) {
                case 0: goto L71;
                case 1: goto L71;
                case 2: goto L72;
                case 3: goto L72;
                default: goto L58;
            }
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L72
        L71:
            r1 = r11
        L72:
            r5.<init>(r1, r8, r9, r10)
            r4.f7903c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.e.a.k.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }

    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(com.anythink.expressad.exoplayer.b.be)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(com.anythink.expressad.exoplayer.b.bg)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals(com.anythink.expressad.exoplayer.b.f7295bd)) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(com.anythink.expressad.exoplayer.b.bf)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
