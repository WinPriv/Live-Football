package b0;

import android.app.Person;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: Person.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2787a;

    /* renamed from: b, reason: collision with root package name */
    public final IconCompat f2788b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2789c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2790d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2791e;
    public final boolean f;

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class a {
        public static x a(Person person) {
            CharSequence name;
            Icon icon;
            IconCompat iconCompat;
            String uri;
            String key;
            boolean isBot;
            boolean isImportant;
            Icon icon2;
            b bVar = new b();
            name = person.getName();
            bVar.f2792a = name;
            icon = person.getIcon();
            if (icon != null) {
                icon2 = person.getIcon();
                PorterDuff.Mode mode = IconCompat.f1576k;
                icon2.getClass();
                int c10 = IconCompat.a.c(icon2);
                if (c10 != 2) {
                    if (c10 != 4) {
                        if (c10 != 6) {
                            iconCompat = new IconCompat(-1);
                            iconCompat.f1578b = icon2;
                        } else {
                            Uri d10 = IconCompat.a.d(icon2);
                            d10.getClass();
                            String uri2 = d10.toString();
                            uri2.getClass();
                            iconCompat = new IconCompat(6);
                            iconCompat.f1578b = uri2;
                        }
                    } else {
                        Uri d11 = IconCompat.a.d(icon2);
                        d11.getClass();
                        String uri3 = d11.toString();
                        uri3.getClass();
                        iconCompat = new IconCompat(4);
                        iconCompat.f1578b = uri3;
                    }
                } else {
                    iconCompat = IconCompat.b(IconCompat.a.b(icon2), IconCompat.a.a(icon2));
                }
            } else {
                iconCompat = null;
            }
            bVar.f2793b = iconCompat;
            uri = person.getUri();
            bVar.f2794c = uri;
            key = person.getKey();
            bVar.f2795d = key;
            isBot = person.isBot();
            bVar.f2796e = isBot;
            isImportant = person.isImportant();
            bVar.f = isImportant;
            return new x(bVar);
        }

        public static Person b(x xVar) {
            Person.Builder name = new Person.Builder().setName(xVar.f2787a);
            Icon icon = null;
            IconCompat iconCompat = xVar.f2788b;
            if (iconCompat != null) {
                iconCompat.getClass();
                icon = IconCompat.a.f(iconCompat, null);
            }
            return name.setIcon(icon).setUri(xVar.f2789c).setKey(xVar.f2790d).setBot(xVar.f2791e).setImportant(xVar.f).build();
        }
    }

    /* compiled from: Person.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f2792a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f2793b;

        /* renamed from: c, reason: collision with root package name */
        public String f2794c;

        /* renamed from: d, reason: collision with root package name */
        public String f2795d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2796e;
        public boolean f;
    }

    public x(b bVar) {
        this.f2787a = bVar.f2792a;
        this.f2788b = bVar.f2793b;
        this.f2789c = bVar.f2794c;
        this.f2790d = bVar.f2795d;
        this.f2791e = bVar.f2796e;
        this.f = bVar.f;
    }
}
