package ka;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentResource;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public volatile long f31156a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f31157b;

    /* renamed from: c, reason: collision with root package name */
    public final File f31158c;

    /* renamed from: d, reason: collision with root package name */
    public h5 f31159d;

    /* renamed from: e, reason: collision with root package name */
    public d5 f31160e;
    public volatile long f = 345600000;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f31161s;

        public a(String str) {
            this.f31161s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            ArrayList<ContentResource> arrayList;
            boolean z10;
            boolean e10;
            ArrayList arrayList2;
            ArrayList arrayList3;
            boolean z11;
            boolean e11;
            File[] fileArr;
            int i10;
            HashSet hashSet = new HashSet();
            if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(this.f31161s)) {
                hashSet.add(this.f31161s);
            }
            f5 f5Var = f5.this;
            n7.e("FileDiskCache", "clearAllExpiredFiles valid time: " + f5Var.f);
            long currentTimeMillis = System.currentTimeMillis();
            File[] listFiles = f5Var.f31158c.listFiles();
            if (listFiles != null) {
                int i11 = 0;
                for (int length = listFiles.length; i11 < length; length = i10) {
                    File file = listFiles[i11];
                    if (file.isFile()) {
                        i10 = length;
                        if (file.lastModified() < currentTimeMillis - f5Var.f) {
                            n7.c("FileDiskCache", "remove old expired file, modify time: %s file: %s", Long.valueOf(file.lastModified()), com.huawei.openalliance.ad.ppskit.utils.y1.j(com.huawei.openalliance.ad.ppskit.utils.x.w(file)));
                            if (com.huawei.openalliance.ad.ppskit.utils.x.s(file)) {
                                n7.b("FileDiskCache", "file delete success");
                                f5Var.c(file.getName(), true);
                            }
                        }
                    } else {
                        i10 = length;
                    }
                    if (file.isDirectory() && (("normal".equals(f5Var.f31160e.f31091e) && file.getName().startsWith("arzip")) || "webview_preload".equals(f5Var.f31160e.f31091e))) {
                        n7.c("FileDiskCache", "delete file: %s", com.huawei.openalliance.ad.ppskit.utils.y1.j(file.getName()));
                        com.huawei.openalliance.ad.ppskit.utils.x.y(file);
                    }
                    i11++;
                }
            }
            long e12 = f5.this.e();
            n7.f("FileDiskCache", "cacheType: %s current used size: %s maxSize: %s", f5.this.f31160e.f31091e, Long.valueOf(e12), Long.valueOf(f5.this.f31156a));
            String str2 = "there is enough space in disk cache";
            if (e12 > f5.this.f31156a) {
                f5 f5Var2 = f5.this;
                h5 h5Var = f5Var2.f31159d;
                if (h5Var != null) {
                    arrayList2 = ((com.huawei.openalliance.ad.ppskit.utils.h) h5Var).b(f5Var2.f31160e.f31091e);
                } else {
                    arrayList2 = null;
                }
                n7.e("FileDiskCache", "delete files not recorded");
                File[] listFiles2 = f5Var2.f31158c.listFiles();
                if (listFiles2 != null) {
                    Arrays.sort(listFiles2, new b());
                    int length2 = listFiles2.length;
                    int i12 = 0;
                    while (i12 < length2) {
                        int i13 = length2;
                        File file2 = listFiles2[i12];
                        if (file2.isFile()) {
                            fileArr = listFiles2;
                            if (!f5.d(file2.getName(), arrayList2)) {
                                e12 -= f5Var2.a(file2, hashSet);
                                n7.c("FileDiskCache", "cachetype: %s current size: %s", f5Var2.f31160e.f31091e, Long.valueOf(e12));
                                arrayList3 = arrayList2;
                                if (e12 <= f5Var2.f31156a) {
                                    n7.e("FileDiskCache", "used cache space is lower than max size");
                                    z11 = true;
                                    break;
                                } else {
                                    i12++;
                                    arrayList2 = arrayList3;
                                    length2 = i13;
                                    listFiles2 = fileArr;
                                }
                            }
                        } else {
                            fileArr = listFiles2;
                        }
                        arrayList3 = arrayList2;
                        i12++;
                        arrayList2 = arrayList3;
                        length2 = i13;
                        listFiles2 = fileArr;
                    }
                }
                arrayList3 = arrayList2;
                z11 = false;
                if (z11) {
                    n7.e("FileDiskCache", "there is enough space in disk cache");
                } else {
                    long e13 = f5Var2.e();
                    n7.e("FileDiskCache", "delete sorted content resource files");
                    if (!androidx.transition.n.M(arrayList3)) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            ContentResource contentResource = (ContentResource) it.next();
                            Iterator it2 = it;
                            File file3 = new File(f5Var2.f31158c, contentResource.a());
                            d5 d5Var = f5Var2.f31160e;
                            if (d5Var == null) {
                                e11 = false;
                            } else {
                                e11 = d5Var.e(contentResource.a());
                            }
                            str = str2;
                            if (n7.d()) {
                                n7.c("FileDiskCache", "deleteFromSortedContentResources, isAccessed: %s", Boolean.valueOf(e11));
                            }
                            if (!e11 && file3.exists()) {
                                e13 -= f5Var2.a(file3, hashSet);
                                n7.c("FileDiskCache", "cachetype: %s current size: %s", f5Var2.f31160e.f31091e, Long.valueOf(e13));
                                if (e13 <= f5Var2.f31156a) {
                                    n7.e("FileDiskCache", "used cache space is lower than max size");
                                    break;
                                }
                            } else {
                                Object[] objArr = new Object[1];
                                if (!e11) {
                                    objArr[0] = contentResource.a();
                                    n7.f("FileDiskCache", "file %s not exist, delete table entry", objArr);
                                    f5Var2.c(contentResource.a(), false);
                                } else {
                                    objArr[0] = contentResource.a();
                                    n7.f("FileDiskCache", "file %s is using, not delete", objArr);
                                }
                            }
                            str2 = str;
                            it = it2;
                        }
                    }
                }
            }
            str = str2;
            int i14 = 0;
            for (File file4 : f5.this.f31158c.listFiles()) {
                if (file4.isFile()) {
                    i14++;
                }
            }
            n7.f("FileDiskCache", "cacheType: %s current used num: %s maxNum: %s", f5.this.f31160e.f31091e, Integer.valueOf(i14), Integer.valueOf(f5.this.f31157b));
            if (i14 > f5.this.f31157b) {
                f5 f5Var3 = f5.this;
                h5 h5Var2 = f5Var3.f31159d;
                if (h5Var2 != null) {
                    arrayList = ((com.huawei.openalliance.ad.ppskit.utils.h) h5Var2).b(f5Var3.f31160e.f31091e);
                } else {
                    arrayList = null;
                }
                n7.e("FileDiskCache", "delete files not recorded for num");
                File[] listFiles3 = f5Var3.f31158c.listFiles();
                if (listFiles3 != null) {
                    Arrays.sort(listFiles3, new b());
                    for (File file5 : listFiles3) {
                        if (file5.isFile() && !f5.d(file5.getName(), arrayList)) {
                            if (f5Var3.a(file5, hashSet) > 0) {
                                i14--;
                            }
                            n7.c("FileDiskCache", "cachetype: %s current num: %s", f5Var3.f31160e.f31091e, Integer.valueOf(i14));
                            if (i14 <= f5Var3.f31157b) {
                                n7.e("FileDiskCache", "used num is lower than max num");
                                z10 = true;
                                break;
                            }
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    n7.e("FileDiskCache", str);
                    return;
                }
                int i15 = 0;
                for (File file6 : f5Var3.f31158c.listFiles()) {
                    if (file6.isFile()) {
                        i15++;
                    }
                }
                n7.e("FileDiskCache", "delete sorted content resource files for num");
                if (!androidx.transition.n.M(arrayList)) {
                    for (ContentResource contentResource2 : arrayList) {
                        File file7 = new File(f5Var3.f31158c, contentResource2.a());
                        d5 d5Var2 = f5Var3.f31160e;
                        if (d5Var2 == null) {
                            e10 = false;
                        } else {
                            e10 = d5Var2.e(contentResource2.a());
                        }
                        if (n7.d()) {
                            n7.c("FileDiskCache", "deleteFromSortedContentResources, isAccessed: %s", Boolean.valueOf(e10));
                        }
                        if (!e10 && file7.exists()) {
                            if (f5Var3.a(file7, hashSet) > 0) {
                                i15--;
                            }
                            n7.c("FileDiskCache", "cachetype: %s current num: %s", f5Var3.f31160e.f31091e, Integer.valueOf(i15));
                            if (i15 <= f5Var3.f31157b) {
                                n7.e("FileDiskCache", "used cache num is lower than max num");
                                return;
                            }
                        } else {
                            Object[] objArr2 = new Object[1];
                            if (!e10) {
                                objArr2[0] = contentResource2.a();
                                n7.f("FileDiskCache", "file %s not exist, delete table entry", objArr2);
                                f5Var3.c(contentResource2.a(), false);
                            } else {
                                objArr2[0] = contentResource2.a();
                                n7.f("FileDiskCache", "file %s is using, not delete", objArr2);
                            }
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Comparator<File> {
        @Override // java.util.Comparator
        public final int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    public f5(File file, long j10, int i10) {
        this.f31158c = file;
        this.f31156a = j10;
        this.f31157b = i10;
        com.huawei.openalliance.ad.ppskit.utils.x.v(file);
    }

    public static boolean d(String str, ArrayList arrayList) {
        if (androidx.transition.n.M(arrayList)) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((ContentResource) it.next()).a(), str)) {
                return true;
            }
        }
        return false;
    }

    public final long a(File file, HashSet hashSet) {
        if (!androidx.transition.n.M(hashSet) && hashSet.contains(file.getName())) {
            if (n7.d()) {
                n7.c("FileDiskCache", "file %s in blackList, don't delete", file.getName());
            }
            return 0L;
        }
        n7.c("FileDiskCache", "remove old exceeded file, modify time: %s file: %s", Long.valueOf(file.lastModified()), file.getName());
        long length = file.length();
        if (!com.huawei.openalliance.ad.ppskit.utils.x.s(file)) {
            return 0L;
        }
        n7.f("FileDiskCache", "file %s deleted", file.getName());
        c(file.getName(), true);
        return length;
    }

    public final void b(String str, File file, ContentResource contentResource) {
        n7.e("FileDiskCache", "put file: ".concat(str));
        File file2 = new File(this.f31158c, str);
        com.huawei.openalliance.ad.ppskit.utils.x.n(file2);
        if (file.renameTo(file2)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean lastModified = file2.setLastModified(currentTimeMillis);
            if (contentResource != null) {
                contentResource.z(currentTimeMillis);
            }
            n7.e("FileDiskCache", "set last modify result: " + lastModified);
            h5 h5Var = this.f31159d;
            if (h5Var != null) {
                com.huawei.openalliance.ad.ppskit.utils.h hVar = (com.huawei.openalliance.ad.ppskit.utils.h) h5Var;
                if (contentResource != null) {
                    com.huawei.openalliance.ad.ppskit.utils.p2.a(new z4(hVar, contentResource), 10);
                }
            }
        }
        if (contentResource == null || contentResource.O() != 1) {
            str = null;
        }
        f(str);
    }

    public final void c(String str, boolean z10) {
        String str2;
        int i10;
        h5 h5Var = this.f31159d;
        if (h5Var != null) {
            String str3 = this.f31160e.f31091e;
            com.huawei.openalliance.ad.ppskit.utils.h hVar = (com.huawei.openalliance.ad.ppskit.utils.h) h5Var;
            if (TextUtils.isEmpty(str)) {
                str2 = "fileName is empty";
            } else {
                int i11 = 1;
                n7.f("DiskCacheFileOperation", "onFileRemoved: %s", str);
                Context context = hVar.f22856a;
                ArrayList r10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(context).r(str, str3);
                if (!androidx.transition.n.M(r10)) {
                    n7.e("DiskCacheFileOperation", "contentResources is not empty");
                    if (z10) {
                        u uVar = new u(context);
                        Context context2 = uVar.f31722a;
                        try {
                            if (androidx.transition.n.M(r10)) {
                                n7.g("AnalysisReport", "onContentResourceRemoved, contentRecord is null");
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                int size = r10.size();
                                int i12 = -1;
                                int i13 = 0;
                                String str4 = null;
                                while (i13 < size) {
                                    ContentResource contentResource = (ContentResource) r10.get(i13);
                                    if (i13 == 0) {
                                        i10 = size;
                                        i12 = contentResource.H();
                                        i11 = contentResource.O();
                                        str4 = contentResource.a();
                                    } else {
                                        i10 = size;
                                        sb2.append(",");
                                    }
                                    sb2.append(contentResource.c());
                                    sb2.append("#");
                                    sb2.append(contentResource.H());
                                    sb2.append("#");
                                    sb2.append(contentResource.U());
                                    sb2.append("#");
                                    sb2.append(contentResource.K());
                                    sb2.append("#");
                                    sb2.append(contentResource.C());
                                    i13++;
                                    size = i10;
                                }
                                String packageName = context2.getPackageName();
                                o c10 = uVar.c(packageName, true);
                                if (c10 == null) {
                                    n7.e("AnalysisReport", "onContentResourceRemoved analysisInfo is null");
                                } else {
                                    n7.b("AnalysisReport", "onContentResourceRemoved analysisInfo not null");
                                    c10.b(i12);
                                    c10.f31525a = "77";
                                    c10.f31565s = sb2.toString();
                                    c10.T = Integer.valueOf(i11);
                                    c10.f31563r = str4;
                                    new ke(context2, zh.a(-1, context2), null).t(packageName, c10, false, true);
                                }
                            }
                        } catch (Throwable th) {
                            e0.i.p(th, "onContentResourceRemoved:", "AnalysisReport");
                        }
                    }
                    com.huawei.openalliance.ad.ppskit.handlers.s n10 = com.huawei.openalliance.ad.ppskit.handlers.s.n(context);
                    n10.getClass();
                    if (TextUtils.isEmpty(str)) {
                        n7.g("ContentResourceDao", "deleteContentResource with empty file name");
                    } else {
                        n7.c("ContentResourceDao", "deleteContentResourceByName: %s cacheType: %s", str, str3);
                        n10.j(ContentResource.class, 39, new String[]{str, str3});
                    }
                    Iterator it = r10.iterator();
                    while (it.hasNext()) {
                        ContentResource contentResource2 = (ContentResource) it.next();
                        if ("arzip".equalsIgnoreCase(contentResource2.i())) {
                            n7.e("DiskCacheFileOperation", "AR deleteUnzipDir");
                            try {
                                String str5 = d5.a(context, hVar.f22857b).getCanonicalPath() + File.separator + "arzip" + str;
                                if (!com.huawei.openalliance.ad.ppskit.utils.y1.h(str5)) {
                                    com.huawei.openalliance.ad.ppskit.utils.x.y(new File(str5));
                                }
                            } catch (Throwable th2) {
                                e0.i.p(th2, "Exception delete ar unzip dir:", "DiskCacheFileOperation");
                            }
                        } else if (contentResource2.H() == 1 || contentResource2.H() == 18) {
                            if (TextUtils.equals(str3, "normal")) {
                                com.huawei.openalliance.ad.ppskit.handlers.e0 e0Var = new com.huawei.openalliance.ad.ppskit.handlers.e0(context);
                                String c11 = contentResource2.c();
                                n7.f("e0", "deleteContentById id: %s reason: %s", c11, "fileRemoved");
                                e0Var.j(ContentRecord.class, 10, new String[]{c11});
                            }
                        }
                    }
                    return;
                }
                str2 = "contentResources is empty";
            }
            n7.e("DiskCacheFileOperation", str2);
        }
    }

    public final long e() {
        File[] listFiles = this.f31158c.listFiles();
        long j10 = 0;
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    j10 += file.length();
                }
            }
        }
        return j10;
    }

    public final void f(String str) {
        com.huawei.openalliance.ad.ppskit.utils.p2.a(new a(str), 10);
    }
}
