package a4;

import android.content.Context;
import androidx.appcompat.app.r;
import androidx.transition.n;
import com.huawei.openalliance.ad.ppskit.utils.p2;
import com.huawei.openalliance.ad.ppskit.utils.x;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import com.onesignal.c3;
import com.onesignal.e3;
import com.onesignal.m2;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import ka.a5;
import ka.h5;
import ka.n7;
import org.json.JSONObject;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes.dex */
public final class l implements b4.b, id.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f258s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f259t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f260u;

    public /* synthetic */ l(int i10, Object obj, Object obj2) {
        this.f258s = i10;
        this.f259t = obj;
        this.f260u = obj2;
    }

    public final String a(String str) {
        n7.b("DiskManager", "try to get cache file for " + y1.j(str));
        File file = new File((File) ((r) this.f259t).f683b, "cache_" + n.Q(str));
        if (!file.exists()) {
            n7.c("DiskManager", "The requested cache file for url %s does not exist", y1.j(str));
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        long lastModified = file.lastModified();
        if (lastModified == currentTimeMillis) {
            currentTimeMillis++;
        }
        if (!file.setLastModified(currentTimeMillis)) {
            try {
                long length = file.length();
                if (length < 1) {
                    length = 0;
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                long j10 = length - 1;
                randomAccessFile.seek(j10);
                byte readByte = randomAccessFile.readByte();
                randomAccessFile.seek(j10);
                randomAccessFile.write(readByte);
                randomAccessFile.close();
            } catch (IOException e10) {
                n7.j("DiskFiles", "Failed to manually update lastModifyTime to file %s with error %s", file.getName(), e10.getClass().getSimpleName());
            }
            if (lastModified < currentTimeMillis) {
                n7.h("DiskFiles", "Failed to manually update lastModifyTime to file %s", file.getName());
            }
        }
        h5 h5Var = (h5) this.f260u;
        String name = file.getName();
        long currentTimeMillis2 = System.currentTimeMillis();
        com.huawei.openalliance.ad.ppskit.utils.h hVar = (com.huawei.openalliance.ad.ppskit.utils.h) h5Var;
        hVar.getClass();
        p2.a(new a5(hVar, name, currentTimeMillis2), 10);
        return Advertisement.FILE_SCHEME + x.w(file);
    }

    public final ArrayList b(e3.m mVar) {
        ac.a aVar;
        zc.d.d(mVar, "entryAction");
        ArrayList arrayList = new ArrayList();
        if (mVar.equals(e3.m.APP_CLOSE)) {
            return arrayList;
        }
        if (mVar.equals(e3.m.APP_OPEN)) {
            aVar = d();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            arrayList.add(aVar);
        }
        arrayList.add(c());
        return arrayList;
    }

    public final ac.a c() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f259t;
        String str = zb.a.f37359a;
        Object obj = concurrentHashMap.get(zb.a.f37359a);
        zc.d.b(obj);
        return (ac.a) obj;
    }

    public final ac.a d() {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f259t;
        String str = zb.a.f37359a;
        Object obj = concurrentHashMap.get(zb.a.f37360b);
        zc.d.b(obj);
        return (ac.a) obj;
    }

    @Override // tc.a
    public final Object get() {
        return new k((Context) ((tc.a) this.f259t).get(), (i) ((tc.a) this.f260u).get());
    }

    @Override // id.a
    public final Object newInstance() {
        try {
            Object obj = this.f259t;
            return ((Class) obj).cast(((Method) this.f260u).invoke(null, (Class) obj, Object.class));
        } catch (Exception e10) {
            throw new r2.a(e10);
        }
    }

    public final String toString() {
        switch (this.f258s) {
            case 3:
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("from", ((m2) this.f259t).a());
                    jSONObject.put("to", ((m2) this.f260u).a());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return jSONObject.toString();
            default:
                return super.toString();
        }
    }

    public l(c3 c3Var, c3 c3Var2, l3.d dVar) {
        this.f258s = 4;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f259t = concurrentHashMap;
        ac.c cVar = new ac.c(c3Var);
        this.f260u = cVar;
        concurrentHashMap.put(zb.a.f37359a, new ac.b(cVar, c3Var2, dVar));
        concurrentHashMap.put(zb.a.f37360b, new ac.d(cVar, c3Var2, dVar));
    }

    public l(Class cls) {
        this.f258s = 5;
        this.f259t = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod.setAccessible(true);
            this.f260u = declaredMethod;
        } catch (NoSuchMethodException e10) {
            throw new r2.a(e10);
        } catch (RuntimeException e11) {
            throw new r2.a(e11);
        }
    }
}
