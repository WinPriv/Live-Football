package qa;

import com.huawei.openalliance.ad.ppskit.download.DownloadTask;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.io.File;
import ka.n7;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static class a extends Exception {

        /* renamed from: s, reason: collision with root package name */
        public final String f34730s;

        public a(String str) {
            super("Url is redirected!");
            this.f34730s = str;
        }
    }

    public static long a(c cVar) {
        String str;
        int e10 = cVar.e();
        n7.c("DownloadUtil", "responseCode:%s", Integer.valueOf(e10));
        if (206 == e10) {
            String c10 = cVar.c("Content-Range");
            long j10 = -1;
            if (y1.h(c10) || !c10.startsWith("bytes")) {
                return -1L;
            }
            int indexOf = c10.indexOf(47);
            if (-1 != indexOf) {
                try {
                    j10 = Long.parseLong(c10.substring(indexOf + 1));
                    if (n7.d()) {
                        n7.c("DownloadUtil", "get new filelength by Content-Range:%s", Long.valueOf(j10));
                        return j10;
                    }
                    return j10;
                } catch (NumberFormatException unused) {
                    str = "getEntityLegth NumberFormatException";
                }
            } else {
                str = "getEntityLegth failed Content-Range";
            }
            n7.i("DownloadUtil", str);
            return j10;
        }
        if (200 == e10) {
            return cVar.f();
        }
        if (302 != e10) {
            return 0L;
        }
        throw new a(cVar.c("Location"));
    }

    public static boolean b(DownloadTask downloadTask, String str) {
        String str2;
        File file = new File(str);
        if (!x.i(file)) {
            str2 = "isFileValid - dst file not exist";
        } else if (downloadTask.g()) {
            n7.b("DownloadUtil", "need to check Sha256");
            if (!x.j(downloadTask.B(), file)) {
                str2 = "isFileValid - dst file not valid";
            } else {
                return true;
            }
        } else {
            n7.b("DownloadUtil", "no need to check Sha256");
            return true;
        }
        n7.g("DownloadUtil", str2);
        return false;
    }
}
