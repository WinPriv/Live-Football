package gb;

import android.text.TextUtils;
import com.huawei.hms.ads.ex;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class m0 {
    public static boolean a(File file) {
        boolean z10;
        if (!file.mkdirs()) {
            File file2 = file;
            int i10 = 0;
            while (true) {
                if (i10 >= 10 || file2 == null) {
                    break;
                }
                String c10 = c(file2);
                ArrayList arrayList = o.f28608a;
                if (!arrayList.isEmpty() && !TextUtils.isEmpty(c10)) {
                    z10 = arrayList.contains(c10);
                } else {
                    z10 = false;
                }
                if (!z10) {
                    i10++;
                    if (file2.exists()) {
                        ex.Code("FileUtil", "current file exists");
                        if (file2.isFile()) {
                            b(file2);
                        }
                    } else {
                        File parentFile = file2.getParentFile();
                        if (parentFile != null && TextUtils.equals(c(parentFile), c(file2))) {
                            ex.I("FileUtil", "parent file is the same as current");
                            break;
                        }
                        file2 = parentFile;
                    }
                } else {
                    break;
                }
            }
            return file.mkdirs();
        }
        return true;
    }

    public static void b(File file) {
        try {
            File file2 = new File(file.getCanonicalPath() + System.currentTimeMillis());
            if (file.renameTo(file2)) {
                file2.delete();
            }
        } catch (IOException unused) {
            ex.I("FileUtil", "deleteSingleFile IOException");
        }
    }

    public static String c(File file) {
        if (file == null) {
            return null;
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException unused) {
            ex.Z("FileUtil", "get path error");
            return null;
        }
    }

    public static void d(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        d(file2);
                    } else {
                        b(file2);
                    }
                }
            }
            b(file);
        }
    }
}
