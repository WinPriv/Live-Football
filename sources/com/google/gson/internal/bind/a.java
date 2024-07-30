package com.google.gson.internal.bind;

import a3.l;
import com.google.gson.internal.bind.TypeAdapters;
import j7.r;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import m8.a0;
import m8.b0;
import m8.u;
import o8.p;

/* compiled from: DefaultDateTypeAdapter.java */
/* loaded from: classes2.dex */
public final class a<T extends Date> extends a0<T> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0240a<T> f21403a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21404b;

    public a(AbstractC0240a abstractC0240a, int i10, int i11) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f21404b = arrayList;
        Objects.requireNonNull(abstractC0240a);
        this.f21403a = abstractC0240a;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (p.f33749a >= 9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList.add(r.D(i10, i11));
        }
    }

    @Override // m8.a0
    public final Object a(s8.a aVar) throws IOException {
        Date b10;
        if (aVar.f0() == 9) {
            aVar.b0();
            return null;
        }
        String d02 = aVar.d0();
        synchronized (this.f21404b) {
            Iterator it = this.f21404b.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        b10 = ((DateFormat) it.next()).parse(d02);
                        break;
                    } catch (ParseException unused) {
                    }
                } else {
                    try {
                        b10 = p8.a.b(d02, new ParsePosition(0));
                        break;
                    } catch (ParseException e10) {
                        StringBuilder s10 = l.s("Failed parsing '", d02, "' as Date; at path ");
                        s10.append(aVar.k());
                        throw new u(s10.toString(), e10);
                    }
                }
            }
        }
        return this.f21403a.b(b10);
    }

    @Override // m8.a0
    public final void b(s8.b bVar, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.j();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f21404b.get(0);
        synchronized (this.f21404b) {
            format = dateFormat.format(date);
        }
        bVar.X(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f21404b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    /* compiled from: DefaultDateTypeAdapter.java */
    /* renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0240a<T extends Date> {

        /* renamed from: b, reason: collision with root package name */
        public static final C0241a f21405b = new C0241a();

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f21406a;

        public AbstractC0240a(Class<T> cls) {
            this.f21406a = cls;
        }

        public final b0 a(int i10, int i11) {
            a aVar = new a(this, i10, i11);
            b0 b0Var = TypeAdapters.f21364a;
            return new TypeAdapters.AnonymousClass31(this.f21406a, aVar);
        }

        public abstract T b(Date date);

        /* compiled from: DefaultDateTypeAdapter.java */
        /* renamed from: com.google.gson.internal.bind.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0241a extends AbstractC0240a<Date> {
            public C0241a() {
                super(Date.class);
            }

            @Override // com.google.gson.internal.bind.a.AbstractC0240a
            public final Date b(Date date) {
                return date;
            }
        }
    }
}
