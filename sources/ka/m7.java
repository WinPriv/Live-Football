package ka;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* loaded from: classes2.dex */
public final class m7 extends b3.c {

    /* renamed from: b, reason: collision with root package name */
    public File f31457b;

    public m7() {
        super(2);
    }

    @Override // b3.c
    public final b3.c a(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            if (this.f31457b == null && !TextUtils.isEmpty(str)) {
                File file = new File(str, "Log");
                if (file.isDirectory() || com.huawei.openalliance.ad.ppskit.utils.x.v(file)) {
                    File file2 = new File(file, str2.concat(".log"));
                    this.f31457b = file2;
                    file2.setReadable(true);
                    this.f31457b.setWritable(true);
                    this.f31457b.setExecutable(false, false);
                    return this;
                }
            }
            Log.e("FileLogNode", "Failed to initialize the file logger.");
            return this;
        }
        Log.e("FileLogNode", "Failed to initialize the file logger, parameter error.");
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // b3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(ka.u7 r8, int r9, java.lang.String r10) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r8.a(r1)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " "
            r1.<init>(r2)
            java.lang.StringBuilder r2 = r8.f31932g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L31
            goto L96
        L31:
            java.io.File r1 = r7.f31457b
            if (r1 == 0) goto L96
            java.lang.String r1 = "\n"
            java.lang.String r0 = r0.concat(r1)
            boolean r1 = r7.e(r0)
            if (r1 == 0) goto L96
            java.io.File r1 = r7.f31457b
            java.lang.String r2 = "Exception when writing the log file. "
            if (r1 != 0) goto L48
            goto L96
        L48:
            r3 = 0
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6d
            r5 = 1
            r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6d
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L6a
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "UTF-8"
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L68
            r5.write(r0)     // Catch: java.lang.Throwable -> L65
            r5.flush()     // Catch: java.lang.Throwable -> L65
            androidx.transition.n.D(r5)
            goto L84
        L65:
            r0 = move-exception
            r3 = r5
            goto L70
        L68:
            r0 = move-exception
            goto L70
        L6a:
            r0 = move-exception
            r1 = r3
            goto L70
        L6d:
            r0 = move-exception
            r1 = r3
            r4 = r1
        L70:
            java.lang.String r5 = "FileUtil"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> L8b
            android.util.Log.w(r5, r0)     // Catch: java.lang.Throwable -> L8b
            androidx.transition.n.D(r3)
        L84:
            androidx.transition.n.D(r1)
            androidx.transition.n.D(r4)
            goto L96
        L8b:
            r8 = move-exception
            androidx.transition.n.D(r3)
            androidx.transition.n.D(r1)
            androidx.transition.n.D(r4)
            throw r8
        L96:
            java.lang.Object r0 = r7.f2858a
            b3.c r0 = (b3.c) r0
            if (r0 == 0) goto L9f
            r0.b(r8, r9, r10)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.m7.b(ka.u7, int, java.lang.String):void");
    }

    @Override // b3.c
    public final boolean e(String str) {
        boolean z10;
        String str2;
        if (this.f31457b.length() + str.length() > 4194304) {
            File file = new File(this.f31457b.getPath() + ".bak");
            if (file.exists()) {
                z10 = file.delete();
            } else {
                z10 = true;
            }
            if (z10) {
                if (!this.f31457b.renameTo(file)) {
                    str2 = "Failed to backup the log file.";
                }
            } else {
                str2 = "Cannot rename log file to bak.";
            }
            Log.w("FileLogNode", str2);
            return false;
        }
        return true;
    }
}
