package a3;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: GlideException.java */
/* loaded from: classes.dex */
public final class t extends Exception {

    /* renamed from: x, reason: collision with root package name */
    public static final StackTraceElement[] f208x = new StackTraceElement[0];

    /* renamed from: s, reason: collision with root package name */
    public final List<Throwable> f209s;

    /* renamed from: t, reason: collision with root package name */
    public y2.e f210t;

    /* renamed from: u, reason: collision with root package name */
    public y2.a f211u;

    /* renamed from: v, reason: collision with root package name */
    public Class<?> f212v;

    /* renamed from: w, reason: collision with root package name */
    public final String f213w;

    public t(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th, ArrayList arrayList) {
        if (th instanceof t) {
            Iterator<Throwable> it = ((t) th).f209s.iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) throws IOException {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append("Cause (");
            int i11 = i10 + 1;
            aVar.append(String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th = (Throwable) list.get(i10);
            if (th instanceof t) {
                ((t) th).l(aVar);
            } else {
                d(th, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.f213w);
        String str3 = "";
        if (this.f212v == null) {
            str = "";
        } else {
            str = ", " + this.f212v;
        }
        sb2.append(str);
        if (this.f211u == null) {
            str2 = "";
        } else {
            str2 = ", " + this.f211u;
        }
        sb2.append(str2);
        if (this.f210t != null) {
            str3 = ", " + this.f210t;
        }
        sb2.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb2.toString();
        }
        if (arrayList.size() == 1) {
            sb2.append("\nThere was 1 root cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(arrayList.size());
            sb2.append(" root causes:");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb2.append('\n');
            sb2.append(th.getClass().getName());
            sb2.append('(');
            sb2.append(th.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public final void k() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            StringBuilder sb2 = new StringBuilder("Root cause (");
            int i11 = i10 + 1;
            sb2.append(i11);
            sb2.append(" of ");
            sb2.append(size);
            sb2.append(")");
            Log.i("Glide", sb2.toString(), (Throwable) arrayList.get(i10));
            i10 = i11;
        }
    }

    public final void l(Appendable appendable) {
        d(this, appendable);
        b(this.f209s, new a(appendable));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        l(System.err);
    }

    public t(String str, List<Throwable> list) {
        this.f213w = str;
        setStackTrace(f208x);
        this.f209s = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        l(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        l(printWriter);
    }

    /* compiled from: GlideException.java */
    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: s, reason: collision with root package name */
        public final Appendable f214s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f215t = true;

        public a(Appendable appendable) {
            this.f214s = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c10) throws IOException {
            boolean z10 = this.f215t;
            Appendable appendable = this.f214s;
            if (z10) {
                this.f215t = false;
                appendable.append("  ");
            }
            this.f215t = c10 == '\n';
            appendable.append(c10);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f215t;
            Appendable appendable = this.f214s;
            boolean z11 = false;
            if (z10) {
                this.f215t = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z11 = true;
            }
            this.f215t = z11;
            appendable.append(charSequence, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
