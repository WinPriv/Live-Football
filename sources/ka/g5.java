package ka;

import android.os.FileObserver;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class g5 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f31202a;

    public g5(File file) {
        super(file);
        this.f31202a = new ConcurrentHashMap();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i10, String str) {
        int i11;
        ConcurrentHashMap concurrentHashMap = this.f31202a;
        if (i10 != 16) {
            if (i10 == 32) {
                if (n7.d()) {
                    n7.c("FileListener", "OPEN, path= %s", str);
                }
                if (n7.d()) {
                    n7.c("FileListener", "setNotAccessed, accessMap = %s", Arrays.asList(concurrentHashMap));
                }
                n7.c("FileListener", "setAccessed, accessMap = %s", Arrays.asList(concurrentHashMap));
                if (concurrentHashMap.containsKey(str)) {
                    i11 = Integer.valueOf(((Integer) concurrentHashMap.get(str)).intValue() + 1);
                } else {
                    i11 = 1;
                }
                concurrentHashMap.put(str, i11);
                return;
            }
            return;
        }
        if (n7.d()) {
            n7.c("FileListener", "CLOSE_NOWRITE, path= %s", str);
        }
        if (n7.d()) {
            n7.c("FileListener", "setNotAccessed, accessMap = %s", Arrays.asList(concurrentHashMap));
        }
        if (concurrentHashMap.containsKey(str)) {
            if (((Integer) concurrentHashMap.get(str)).intValue() > 1) {
                concurrentHashMap.put(str, Integer.valueOf(((Integer) concurrentHashMap.get(str)).intValue() - 1));
            } else {
                concurrentHashMap.remove(str);
            }
        }
    }

    public g5(String str) {
        super(str);
        this.f31202a = new ConcurrentHashMap();
    }
}
