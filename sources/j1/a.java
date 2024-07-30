package j1;

import android.content.Context;
import android.view.ViewGroup;
import com.huawei.openalliance.ad.ppskit.utils.q1;
import java.io.ObjectInputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import ka.l;

/* compiled from: SimpleSQLiteQuery.java */
/* loaded from: classes.dex */
public class a implements d, l, id.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f29567s;

    /* renamed from: t, reason: collision with root package name */
    public Object f29568t;

    /* renamed from: u, reason: collision with root package name */
    public Object f29569u;

    @Override // ka.l
    public boolean a(Context context) {
        return false;
    }

    @Override // ka.l
    public boolean b() {
        return false;
    }

    @Override // ka.l
    public int e(ViewGroup viewGroup) {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f29567s) {
            case 1:
                if (!(obj instanceof m0.c)) {
                    return false;
                }
                m0.c cVar = (m0.c) obj;
                Object obj2 = cVar.f32635a;
                Object obj3 = this.f29568t;
                if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object obj4 = this.f29569u;
                Object obj5 = cVar.f32636b;
                if (obj5 != obj4 && (obj5 == null || !obj5.equals(obj4))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    @Override // ka.l
    public String f() {
        return null;
    }

    @Override // ka.l
    public boolean g() {
        return false;
    }

    @Override // ka.l
    public Integer h() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        switch (this.f29567s) {
            case 1:
                Object obj = this.f29568t;
                int i10 = 0;
                if (obj == null) {
                    hashCode = 0;
                } else {
                    hashCode = obj.hashCode();
                }
                Object obj2 = this.f29569u;
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                }
                return hashCode ^ i10;
            default:
                return super.hashCode();
        }
    }

    @Override // ka.l
    public String i() {
        return null;
    }

    @Override // ka.l
    public boolean j() {
        return !(this instanceof ka.c);
    }

    @Override // ka.l
    public String k() {
        return null;
    }

    @Override // ka.l
    public String l() {
        return null;
    }

    @Override // j1.d
    public final String m() {
        return (String) this.f29568t;
    }

    public final void n() {
        this.f29568t = null;
        this.f29569u = null;
    }

    @Override // id.a
    public final Object newInstance() {
        try {
            return ((Method) this.f29568t).invoke(null, (Object[]) this.f29569u);
        } catch (Exception e10) {
            throw new r2.a(e10);
        }
    }

    public final String toString() {
        switch (this.f29567s) {
            case 1:
                return "Pair{" + this.f29568t + " " + this.f29569u + "}";
            default:
                return super.toString();
        }
    }

    public a(Context context) {
        this.f29567s = 6;
        Context applicationContext = context.getApplicationContext();
        this.f29568t = applicationContext;
        this.f29569u = q1.m(applicationContext);
    }

    @Override // j1.d
    public final void b(k1.d dVar) {
        Object[] objArr = (Object[]) this.f29569u;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            if (obj == null) {
                dVar.e(i10);
            } else if (obj instanceof byte[]) {
                dVar.b(i10, (byte[]) obj);
            } else if (obj instanceof Float) {
                dVar.c(((Float) obj).floatValue(), i10);
            } else if (obj instanceof Double) {
                dVar.c(((Double) obj).doubleValue(), i10);
            } else if (obj instanceof Long) {
                dVar.d(i10, ((Long) obj).longValue());
            } else if (obj instanceof Integer) {
                dVar.d(i10, ((Integer) obj).intValue());
            } else if (obj instanceof Short) {
                dVar.d(i10, ((Short) obj).shortValue());
            } else if (obj instanceof Byte) {
                dVar.d(i10, ((Byte) obj).byteValue());
            } else if (obj instanceof String) {
                dVar.f(i10, (String) obj);
            } else if (obj instanceof Boolean) {
                dVar.d(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
            }
        }
    }

    @Override // ka.l
    public String e() {
        return null;
    }

    public a(int i10) {
        this.f29567s = i10;
        if (i10 != 3) {
            this.f29568t = new HashMap();
            this.f29569u = new HashMap();
        } else {
            this.f29568t = new AtomicReference();
            this.f29569u = new q.b();
        }
    }

    public a(String str, int i10) {
        this.f29567s = 0;
        this.f29568t = str;
        this.f29569u = null;
    }

    public a(Class cls) {
        this.f29567s = 7;
        Object[] objArr = {null, Boolean.FALSE};
        this.f29569u = objArr;
        objArr[0] = cls;
        try {
            Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Boolean.TYPE);
            this.f29568t = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e10) {
            throw new r2.a(e10);
        } catch (RuntimeException e11) {
            throw new r2.a(e11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        this(str, 0);
        this.f29567s = 0;
    }
}
