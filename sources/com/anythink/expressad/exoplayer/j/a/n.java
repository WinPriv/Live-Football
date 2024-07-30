package com.anythink.expressad.exoplayer.j.a;

import com.anythink.expressad.exoplayer.k.af;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n extends e {

    /* renamed from: g, reason: collision with root package name */
    private static final String f8787g = ".v3.exo";

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f8788h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f8789i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f8790j = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    private n(String str, long j10, long j11, long j12, File file) {
        super(str, j10, j11, j12, file);
    }

    public static File a(File file, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        sb2.append(".");
        return new File(file, a3.l.n(sb2, j11, f8787g));
    }

    public static n b(String str, long j10) {
        return new n(str, j10, -1L, com.anythink.expressad.exoplayer.b.f7291b, null);
    }

    private static File b(File file, h hVar) {
        String group;
        String name = file.getName();
        Matcher matcher = f8789i.matcher(name);
        if (matcher.matches()) {
            group = af.h(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = f8788h.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File a10 = a(file.getParentFile(), hVar.c(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(a10)) {
            return a10;
        }
        return null;
    }

    public static n a(String str, long j10) {
        return new n(str, j10, -1L, com.anythink.expressad.exoplayer.b.f7291b, null);
    }

    public static n a(String str, long j10, long j11) {
        return new n(str, j10, j11, com.anythink.expressad.exoplayer.b.f7291b, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0061, code lost:
    
        if (r16.renameTo(r1) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.anythink.expressad.exoplayer.j.a.n a(java.io.File r16, com.anythink.expressad.exoplayer.j.a.h r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L6e
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.j.a.n.f8789i
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = com.anythink.expressad.exoplayer.k.af.h(r1)
            if (r1 != 0) goto L3f
            goto L39
        L2d:
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.j.a.n.f8788h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L3b
        L39:
            r1 = r6
            goto L64
        L3b:
            java.lang.String r1 = r2.group(r5)
        L3f:
            java.io.File r7 = r16.getParentFile()
            int r8 = r0.c(r1)
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L64
            goto L39
        L64:
            if (r1 != 0) goto L67
            return r6
        L67:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L71
        L6e:
            r2 = r16
            r15 = r2
        L71:
            java.util.regex.Pattern r2 = com.anythink.expressad.exoplayer.j.a.n.f8790j
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L7e
            return r6
        L7e:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = r0.a(r2)
            if (r8 != 0) goto L91
            return r6
        L91:
            com.anythink.expressad.exoplayer.j.a.n r0 = new com.anythink.expressad.exoplayer.j.a.n
            java.lang.String r2 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r2)
            java.lang.String r1 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r1)
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.exoplayer.j.a.n.a(java.io.File, com.anythink.expressad.exoplayer.j.a.h):com.anythink.expressad.exoplayer.j.a.n");
    }

    public final n a(int i10) {
        com.anythink.expressad.exoplayer.k.a.b(this.f8745d);
        long currentTimeMillis = System.currentTimeMillis();
        return new n(this.f8742a, this.f8743b, this.f8744c, currentTimeMillis, a(this.f8746e.getParentFile(), i10, this.f8743b, currentTimeMillis));
    }
}
