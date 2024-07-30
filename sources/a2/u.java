package a2;

import android.os.Build;

/* compiled from: WorkTypeConverters.java */
/* loaded from: classes.dex */
public final class u {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:93), block:B:35:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static r1.c a(byte[] r7) {
        /*
            r1.c r0 = new r1.c
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r1.c$a r5 = new r1.c$a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.HashSet r3 = r0.f34810a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.u.a(byte[]):r1.c");
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a3.l.j("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static r1.i c(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
                                return r1.i.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(a3.l.j("Could not convert ", i10, " to NetworkType"));
                        }
                        return r1.i.METERED;
                    }
                    return r1.i.NOT_ROAMING;
                }
                return r1.i.UNMETERED;
            }
            return r1.i.CONNECTED;
        }
        return r1.i.NOT_REQUIRED;
    }

    public static int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a3.l.j("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static r1.l e(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5) {
                                return r1.l.CANCELLED;
                            }
                            throw new IllegalArgumentException(a3.l.j("Could not convert ", i10, " to State"));
                        }
                        return r1.l.BLOCKED;
                    }
                    return r1.l.FAILED;
                }
                return r1.l.SUCCEEDED;
            }
            return r1.l.RUNNING;
        }
        return r1.l.ENQUEUED;
    }

    public static int f(r1.l lVar) {
        int ordinal = lVar.ordinal();
        if (ordinal != 0) {
            int i10 = 1;
            if (ordinal != 1) {
                i10 = 2;
                if (ordinal != 2) {
                    i10 = 3;
                    if (ordinal != 3) {
                        i10 = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + lVar + " to int");
                        }
                    }
                }
            }
            return i10;
        }
        return 0;
    }
}
