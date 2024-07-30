package t2;

import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import g2.k0;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: LottieValueCallback.java */
/* loaded from: classes.dex */
public class c implements id.a {

    /* renamed from: s, reason: collision with root package name */
    public final Object f35398s;

    /* renamed from: t, reason: collision with root package name */
    public Object f35399t;

    /* renamed from: u, reason: collision with root package name */
    public final Object f35400u;

    public /* synthetic */ c(RelativeLayout relativeLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f35398s = relativeLayout;
        this.f35399t = tabLayout;
        this.f35400u = viewPager2;
    }

    public Object a(b bVar) {
        return this.f35400u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(float f, float f10, Object obj, Object obj2, float f11, float f12, float f13) {
        b bVar = (b) this.f35398s;
        bVar.f35392a = f;
        bVar.f35393b = f10;
        bVar.f35394c = obj;
        bVar.f35395d = obj2;
        bVar.f35396e = f11;
        bVar.f = f12;
        bVar.f35397g = f13;
        return a(bVar);
    }

    @Override // id.a
    public final Object newInstance() {
        try {
            Object obj = this.f35398s;
            return ((Class) obj).cast(((Method) this.f35399t).invoke(null, (Class) obj, (Long) this.f35400u));
        } catch (Exception e10) {
            throw new r2.a(e10);
        }
    }

    public /* synthetic */ c() {
        this.f35398s = new b();
        this.f35400u = null;
    }

    public /* synthetic */ c(k0 k0Var) {
        this.f35398s = new b();
        this.f35400u = null;
        this.f35400u = k0Var;
    }

    public c(Class cls) {
        this.f35398s = cls;
        try {
            Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Long.TYPE);
            declaredMethod.setAccessible(true);
            this.f35399t = declaredMethod;
            try {
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod2.setAccessible(true);
                this.f35400u = (Long) declaredMethod2.invoke(null, Object.class);
            } catch (IllegalAccessException e10) {
                throw new r2.a(e10);
            } catch (NoSuchMethodException e11) {
                throw new r2.a(e11);
            } catch (RuntimeException e12) {
                throw new r2.a(e12);
            } catch (InvocationTargetException e13) {
                throw new r2.a(e13);
            }
        } catch (NoSuchMethodException e14) {
            throw new r2.a(e14);
        } catch (RuntimeException e15) {
            throw new r2.a(e15);
        }
    }
}
