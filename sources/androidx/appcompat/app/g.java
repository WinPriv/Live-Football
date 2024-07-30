package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.Toolbar;
import i.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: s, reason: collision with root package name */
    public static final q.a f650s = new q.a(new q.b());

    /* renamed from: t, reason: collision with root package name */
    public static final int f651t = -100;

    /* renamed from: u, reason: collision with root package name */
    public static j0.f f652u = null;

    /* renamed from: v, reason: collision with root package name */
    public static j0.f f653v = null;

    /* renamed from: w, reason: collision with root package name */
    public static Boolean f654w = null;

    /* renamed from: x, reason: collision with root package name */
    public static boolean f655x = false;
    public static final q.d<WeakReference<g>> y = new q.d<>();

    /* renamed from: z, reason: collision with root package name */
    public static final Object f656z = new Object();
    public static final Object A = new Object();

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean m(Context context) {
        if (f654w == null) {
            try {
                int i10 = AppLocalesMetadataHolderService.f642s;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.a.a() | 128).metaData;
                if (bundle != null) {
                    f654w = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f654w = Boolean.FALSE;
            }
        }
        return f654w.booleanValue();
    }

    public static void v(g gVar) {
        synchronized (f656z) {
            Iterator<WeakReference<g>> it = y.iterator();
            while (it.hasNext()) {
                g gVar2 = it.next().get();
                if (gVar2 == gVar || gVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void A(Toolbar toolbar);

    public abstract void C(CharSequence charSequence);

    public abstract i.a D(a.InterfaceC0394a interfaceC0394a);

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract <T extends View> T e(int i10);

    public Context f() {
        return null;
    }

    public abstract AppCompatDelegateImpl.b g();

    public int h() {
        return -100;
    }

    public abstract MenuInflater i();

    public abstract androidx.appcompat.app.a j();

    public abstract void k();

    public abstract void l();

    public abstract void n(Configuration configuration);

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void u();

    public abstract boolean w(int i10);

    public abstract void x(int i10);

    public abstract void y(View view);

    public abstract void z(View view, ViewGroup.LayoutParams layoutParams);

    public void B(int i10) {
    }

    public Context d(Context context) {
        return context;
    }
}
