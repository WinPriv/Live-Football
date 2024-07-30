package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.ppskit.beans.metadata.SpareCheckResult;
import com.huawei.openalliance.ad.ppskit.beans.metadata.XRInfo;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.sourcefetch.SourceParam;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ce implements kg {

    /* renamed from: a, reason: collision with root package name */
    public final List<ContentRecord> f31048a;

    /* renamed from: b, reason: collision with root package name */
    public List<String> f31049b;

    /* renamed from: c, reason: collision with root package name */
    public int f31050c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31051d;

    /* renamed from: e, reason: collision with root package name */
    public com.huawei.openalliance.ad.ppskit.handlers.e0 f31052e;
    public final com.huawei.openalliance.ad.ppskit.handlers.i0 f;

    /* renamed from: g, reason: collision with root package name */
    public final com.huawei.openalliance.ad.ppskit.handlers.l f31053g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f31054h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31055i;

    /* renamed from: j, reason: collision with root package name */
    public final p f31056j;

    /* renamed from: k, reason: collision with root package name */
    public final d5 f31057k;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31058s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Integer f31059t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f31060u;

        public a(String str, Integer num, String str2) {
            this.f31058s = str;
            this.f31059t = num;
            this.f31060u = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.huawei.openalliance.ad.ppskit.handlers.s.n(ce.this.f31054h).q(this.f31058s, this.f31059t.intValue(), this.f31060u);
        }
    }

    public ce(int i10, Context context, boolean z10) {
        this.f31050c = 1;
        this.f31055i = false;
        n7.f("ContentProcessor", "ContentProcessor - isPreContent: %s", Boolean.valueOf(z10));
        this.f31054h = context.getApplicationContext();
        this.f31051d = z10;
        this.f = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31053g = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        this.f31052e = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f31056j = new p(context);
        this.f31057k = y4.a(context, com.anythink.expressad.video.dynview.a.a.f11377aa);
        this.f31050c = i10;
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
            return null;
        }
        int length2 = listFiles.length;
        while (i10 < length2) {
            File file2 = listFiles[i10];
            if (file2.getName().equals(p10)) {
                return file2.getCanonicalPath();
            }
            i10++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ab  */
    @Override // ka.kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord a(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r21, int r22, long r23, byte[] r25, int r26) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ce.a(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, int, long, byte[], int):com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord");
    }

    public SpareCheckResult b(ContentRecord contentRecord) {
        String str;
        String h12 = contentRecord.h1();
        String h10 = contentRecord.h();
        String p22 = contentRecord.p2();
        ContentRecord n10 = this.f31052e.n(h12, h10, p22);
        if (n10 == null) {
            return new SpareCheckResult("cachedContentRecord is null", "", false);
        }
        String m32 = n10.m3();
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(m32)) {
            n7.f("ContentProcessor", "delete content %s because of media not exist.", h10);
            this.f31052e.y(h12, h10, p22, "isExist - filepath is empty");
            return new SpareCheckResult("filePath is blank", m32, false);
        }
        Context context = this.f31054h;
        if (!com.huawei.openalliance.ad.ppskit.utils.x.r(context, m32, "normal")) {
            n7.f("ContentProcessor", "delete content %s because of media not valid.", h10);
            com.huawei.openalliance.ad.ppskit.utils.x.e(context, m32);
            this.f31052e.y(h12, h10, p22, "isExist - file not exist");
            if (d5.i(m32)) {
                str = y4.a(context, "normal").h(context, m32);
            } else {
                str = m32;
            }
            return new SpareCheckResult(m32, str, false);
        }
        return new SpareCheckResult(m32);
    }

    public final ContentRecord c(String str, String str2, int i10, long j10) {
        int i11;
        int i12;
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = this.f31052e;
        e0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Context context = e0Var.f22513b;
        if (str2 != null) {
            i11 = 0;
            i12 = 7;
            Iterator it = e0Var.h(e0Var.B(), null, 36, new String[]{str, String.valueOf(i10), str2, "0", String.valueOf(j10), String.valueOf(j10), String.valueOf(System.currentTimeMillis() - com.huawei.openalliance.ad.ppskit.handlers.l.d(context).w(str))}, "updateTime desc, displayCount asc", "0, 1").iterator();
            while (it.hasNext()) {
                arrayList.add((ContentRecord) it.next());
            }
        } else {
            i11 = 0;
            i12 = 7;
        }
        if (androidx.transition.n.M(arrayList)) {
            arrayList = new ArrayList();
            if (str2 != null) {
                Class<? extends pa.a> B = e0Var.B();
                String[] strArr = new String[i12];
                strArr[i11] = str;
                strArr[1] = String.valueOf(i10);
                strArr[2] = str2;
                strArr[3] = "0";
                strArr[4] = String.valueOf(j10);
                strArr[5] = String.valueOf(j10);
                strArr[6] = String.valueOf(System.currentTimeMillis() - com.huawei.openalliance.ad.ppskit.handlers.l.d(context).w(str));
                Iterator it2 = e0Var.h(B, null, 35, strArr, "updateTime desc, displayCount asc", "0, 1").iterator();
                while (it2.hasNext()) {
                    arrayList.add((ContentRecord) it2.next());
                }
            }
            if (androidx.transition.n.M(arrayList)) {
                return null;
            }
        }
        return (ContentRecord) arrayList.get(i11);
    }

    public final SourceParam d(ImageInfo imageInfo, ContentRecord contentRecord, long j10) {
        boolean z10;
        int O;
        if (imageInfo == null) {
            return null;
        }
        SourceParam sourceParam = new SourceParam();
        sourceParam.e(contentRecord);
        sourceParam.n(imageInfo.g());
        sourceParam.k(imageInfo.a());
        if (imageInfo.o() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sourceParam.l(z10);
        sourceParam.o(true);
        sourceParam.g(Long.valueOf(j10));
        boolean equals = com.huawei.openalliance.ad.constant.bd.V.equals(imageInfo.d());
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31053g;
        if (equals) {
            O = lVar.N(contentRecord.h1());
        } else {
            O = lVar.O(contentRecord.h1());
        }
        sourceParam.b(O);
        return sourceParam;
    }

    public final String e(ImageInfo imageInfo, ContentRecord contentRecord, long j10, boolean z10) {
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.t(imageInfo.g())) {
            return null;
        }
        SourceParam d10 = d(imageInfo, contentRecord, j10);
        d10.t(com.anythink.expressad.video.dynview.a.a.f11377aa);
        d10.q(z10);
        e6.c f = this.f.f(d10);
        if (f == null) {
            n7.e("ContentProcessor", "download image failed");
            return null;
        }
        return f.f27764a;
    }

    public final String g(ContentRecord contentRecord, XRInfo xRInfo, String str, String str2, String str3) {
        Context context = this.f31054h;
        d5 d5Var = this.f31057k;
        try {
            boolean k10 = com.huawei.openalliance.ad.ppskit.utils.x.k(str, str2);
            p pVar = this.f31056j;
            if (k10) {
                n7.e("ContentProcessor", "unzip ar success");
                String f = f(xRInfo, str2);
                d5Var.g(context, str3);
                if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(f)) {
                    return f;
                }
                pVar.t(contentRecord, contentRecord.h1(), "2");
            } else {
                pVar.t(contentRecord, contentRecord.h1(), "1");
                n7.e("ContentProcessor", "unzip has failed");
            }
        } catch (IOException | Exception e10) {
            n7.g("ContentProcessor", "IOException unZipArFile:".concat(e10.getClass().getSimpleName()));
        }
        d5Var.o(context, str);
        return null;
    }

    public void h(long j10) {
        Iterator it = this.f31052e.p(0, j10).iterator();
        while (it.hasNext()) {
            k((ContentRecord) it.next(), "deleteExpireContents");
        }
    }

    public final void i(long j10, ArrayList arrayList) {
        if (androidx.transition.n.M(arrayList)) {
            n7.b("ContentProcessor", " contentRecords is null, update Priority And UpdateTime fail");
        } else {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new ee(this, arrayList, j10), 0);
        }
    }

    public void j(ContentRecord contentRecord, long j10, byte[] bArr, int i10) {
        n7.e("ContentProcessor", "downloadOneArContent start");
        if (contentRecord == null) {
            n7.g("ContentProcessor", "downloadOneArContent, contentRecord in null");
        } else if (this.f31050c != 1) {
            n7.e("ContentProcessor", "downloadOneArContent, pre content should be supported for splash mode");
        } else {
            r(contentRecord, j10, bArr, i10);
        }
    }

    public void k(ContentRecord contentRecord, String str) {
        if (contentRecord == null) {
            n7.i("ContentProcessor", "fail to delete content, content is null");
            return;
        }
        String m32 = contentRecord.m3();
        int i10 = this.f31050c;
        if ((1 == i10 || i10 == 18) && !com.huawei.openalliance.ad.ppskit.utils.y1.h(m32)) {
            com.huawei.openalliance.ad.ppskit.utils.x.e(this.f31054h, m32);
        }
        this.f31052e.y(contentRecord.h1(), contentRecord.h(), contentRecord.p2(), str);
    }

    public void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = this.f31052e;
        ArrayList h10 = e0Var.h(e0Var.B(), null, 10, new String[]{str}, null, null);
        if (androidx.transition.n.M(h10)) {
            n7.b("ContentProcessor", "delete content records is empty");
            return;
        }
        Iterator it = h10.iterator();
        while (it.hasNext()) {
            k((ContentRecord) it.next(), "deleteInvalidContents");
        }
    }

    public final void m(String str, String str2, String str3) {
        Integer q10;
        if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str) && !com.huawei.openalliance.ad.ppskit.utils.y1.h(str2) && (q10 = com.huawei.openalliance.ad.ppskit.utils.y1.q(str2)) != null) {
            com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str, q10, str3), 0);
        }
    }

    public final boolean n(int i10, String str) {
        String string;
        com.huawei.openalliance.ad.ppskit.handlers.l lVar = this.f31053g;
        synchronized (lVar.f22585a) {
            string = lVar.G(str).getString("allow_mobile_traffic", "");
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                int parseInt = Integer.parseInt(string);
                if (1 == parseInt) {
                    return true;
                }
                if (parseInt == 0) {
                    return com.huawei.openalliance.ad.ppskit.utils.k1.e(this.f31054h);
                }
            } catch (NumberFormatException e10) {
                n7.g("ContentProcessor", "exception happen: ".concat(e10.getClass().getSimpleName()));
            }
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 0 && com.huawei.openalliance.ad.ppskit.utils.k1.e(this.f31054h)) {
            return true;
        }
        return false;
    }

    public final boolean o(ImageInfo imageInfo, boolean z10) {
        String str;
        if (imageInfo == null) {
            n7.b("ContentProcessor", "Image file Path not exist");
            return true;
        }
        Context context = this.f31054h;
        d5 d5Var = this.f31057k;
        try {
            if (z10) {
                str = d5Var.h(context, d5.f(imageInfo.g()));
            } else {
                str = d5Var.h(context, d5.f(imageInfo.g())) + com.huawei.openalliance.ad.ppskit.utils.x.z(imageInfo.g());
            }
            if (com.huawei.openalliance.ad.ppskit.utils.x.q(str)) {
                return true;
            }
            n7.b("ContentProcessor", "check Image file not exist");
            return false;
        } catch (Exception e10) {
            n7.e("ContentProcessor", "Exception ar content is not prepared:".concat(e10.getClass().getSimpleName()));
            return false;
        }
    }

    public void p() {
        ArrayList<ContentRecord> a10 = this.f31052e.a(this.f31050c);
        if (!androidx.transition.n.M(a10)) {
            for (ContentRecord contentRecord : a10) {
                if (contentRecord != null) {
                    s(contentRecord.h1(), contentRecord.h(), contentRecord.p2());
                }
            }
        }
    }

    public final void q(long j10) {
        Iterator it = this.f31052e.p(1, j10).iterator();
        while (it.hasNext()) {
            k((ContentRecord) it.next(), "deleteExpireContents");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0246, code lost:
    
        if (com.huawei.openalliance.ad.ppskit.utils.y1.h(r0) == false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0268 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord r19, long r20, byte[] r22, int r23) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.ce.r(com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord, long, byte[], int):boolean");
    }

    public final boolean s(String str, String str2, String str3) {
        com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var;
        String str4;
        ContentRecord n10 = this.f31052e.n(str, str2, str3);
        if (n10 != null) {
            String m32 = n10.m3();
            if (com.huawei.openalliance.ad.ppskit.utils.y1.h(m32)) {
                e0Var = this.f31052e;
                str4 = "isExist - filepath is empty";
            } else {
                Context context = this.f31054h;
                if (!com.huawei.openalliance.ad.ppskit.utils.x.r(context, m32, "normal")) {
                    com.huawei.openalliance.ad.ppskit.utils.x.e(context, m32);
                    e0Var = this.f31052e;
                    str4 = "isExist - file not exist";
                } else {
                    return true;
                }
            }
            e0Var.y(str, str2, str3, str4);
        }
        return false;
    }

    public ce(Context context) {
        this.f31050c = 1;
        this.f31055i = false;
        this.f31051d = false;
        this.f31054h = context.getApplicationContext();
        this.f31052e = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
    }

    public ce(Context context, List<ContentRecord> list, boolean z10, int i10) {
        this.f31050c = 1;
        this.f31055i = false;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(list != null ? list.size() : 0);
        objArr[1] = Boolean.valueOf(z10);
        n7.f("ContentProcessor", "ContentProcessor - content records size: %d isPreContent: %s", objArr);
        this.f31054h = context.getApplicationContext();
        this.f31048a = list;
        this.f31051d = z10;
        this.f = com.huawei.openalliance.ad.ppskit.handlers.i0.d(context);
        this.f31053g = com.huawei.openalliance.ad.ppskit.handlers.l.d(context);
        this.f31052e = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
        this.f31056j = new p(context);
        this.f31057k = y4.a(context, com.anythink.expressad.video.dynview.a.a.f11377aa);
        this.f31050c = i10;
    }
}
