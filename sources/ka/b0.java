package ka;

import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import java.io.File;

/* loaded from: classes2.dex */
public final class b0 extends y {
    public b0() {
        super("arContentVertify");
    }

    public static String f(XRInfo xRInfo, String str) {
        String p10 = com.huawei.openalliance.ad.ppskit.utils.y1.p(xRInfo.p());
        File[] listFiles = new File(str).listFiles();
        int i10 = 0;
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(p10)) {
            int length = listFiles.length;
            while (i10 < length) {
                File file = listFiles[i10];
                if (com.ironsource.adapters.facebook.a.b(file.getName())) {
                    return file.getCanonicalPath();
                }
                i10++;
            }
        } else {
            int length2 = listFiles.length;
            while (i10 < length2) {
                File file2 = listFiles[i10];
                if (file2.getName().equals(p10)) {
                    return file2.getCanonicalPath();
                }
                i10++;
            }
        }
        n7.e("CmdArContentVertify", "checkArModelFileValid failed");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:0: B:33:0x007b->B:56:?, LOOP_END, SYNTHETIC] */
    @Override // ka.y, ka.b2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.b0.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }
}
