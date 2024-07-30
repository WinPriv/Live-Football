package i1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.savedstate.Recreator;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.Map;
import k.b;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public boolean f29029b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f29030c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29031d;

    /* renamed from: e, reason: collision with root package name */
    public Recreator.a f29032e;

    /* renamed from: a, reason: collision with root package name */
    public final k.b<String, InterfaceC0395b> f29028a = new k.b<>();
    public boolean f = true;

    /* compiled from: SavedStateRegistry.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(d dVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    /* renamed from: i1.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0395b {
        Bundle a();
    }

    public final Bundle a(String str) {
        boolean z10;
        if (this.f29031d) {
            Bundle bundle = this.f29030c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f29030c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f29030c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f29030c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final InterfaceC0395b b() {
        String str;
        InterfaceC0395b interfaceC0395b;
        Iterator<Map.Entry<String, InterfaceC0395b>> it = this.f29028a.iterator();
        do {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                zc.d.c(entry, "components");
                str = (String) entry.getKey();
                interfaceC0395b = (InterfaceC0395b) entry.getValue();
            } else {
                return null;
            }
        } while (!zc.d.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return interfaceC0395b;
    }

    public final void c(String str, InterfaceC0395b interfaceC0395b) {
        boolean z10;
        zc.d.d(str, "key");
        zc.d.d(interfaceC0395b, IronSourceConstants.EVENTS_PROVIDER);
        if (this.f29028a.b(str, interfaceC0395b) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f) {
            Recreator.a aVar = this.f29032e;
            if (aVar == null) {
                aVar = new Recreator.a(this);
            }
            this.f29032e = aVar;
            try {
                h.a.class.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar2 = this.f29032e;
                if (aVar2 != null) {
                    aVar2.f2406a.add(h.a.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + h.a.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
