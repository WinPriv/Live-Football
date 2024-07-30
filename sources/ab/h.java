package ab;

import android.content.Context;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import java.util.Map;
import ka.ii;
import ka.p;

/* loaded from: classes2.dex */
public final class h extends ii {
    public final p f;

    /* renamed from: g, reason: collision with root package name */
    public final Map<String, String> f399g;

    public h(Context context, ContentRecord contentRecord, Map map) {
        super(context, contentRecord);
        this.f = new p(context);
        this.f399g = map;
    }

    public static String e(XRInfo xRInfo, String str) {
        String p10 = y1.p(xRInfo.p());
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        int i10 = 0;
        if (y1.h(p10)) {
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
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x019d A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:63:0x011e, B:65:0x017a, B:69:0x0182, B:72:0x0189, B:74:0x018f, B:76:0x019d, B:77:0x01a0, B:79:0x01a6, B:80:0x01ab, B:82:0x01b7, B:84:0x01c0), top: B:62:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:63:0x011e, B:65:0x017a, B:69:0x0182, B:72:0x0189, B:74:0x018f, B:76:0x019d, B:77:0x01a0, B:79:0x01a6, B:80:0x01ab, B:82:0x01b7, B:84:0x01c0), top: B:62:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7 A[Catch: all -> 0x01c6, TryCatch #0 {all -> 0x01c6, blocks: (B:63:0x011e, B:65:0x017a, B:69:0x0182, B:72:0x0189, B:74:0x018f, B:76:0x019d, B:77:0x01a0, B:79:0x01a6, B:80:0x01ab, B:82:0x01b7, B:84:0x01c0), top: B:62:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c0 A[Catch: all -> 0x01c6, TRY_LEAVE, TryCatch #0 {all -> 0x01c6, blocks: (B:63:0x011e, B:65:0x017a, B:69:0x0182, B:72:0x0189, B:74:0x018f, B:76:0x019d, B:77:0x01a0, B:79:0x01a6, B:80:0x01ab, B:82:0x01b7, B:84:0x01c0), top: B:62:0x011e }] */
    @Override // ka.ii
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.h.a():boolean");
    }
}
