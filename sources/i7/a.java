package i7;

import i7.l;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* compiled from: AbstractIterator.java */
/* loaded from: classes2.dex */
public abstract class a<T> implements Iterator<T> {

    /* renamed from: s, reason: collision with root package name */
    public int f29195s = 2;

    /* renamed from: t, reason: collision with root package name */
    @CheckForNull
    public String f29196t;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        String str;
        int a10;
        CharSequence charSequence;
        b bVar;
        int i10 = this.f29195s;
        if (i10 != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int c10 = s.f.c(i10);
            if (c10 == 0) {
                return true;
            }
            if (c10 == 2) {
                return false;
            }
            this.f29195s = 4;
            l.a aVar = (l.a) this;
            int i11 = aVar.f29215x;
            while (true) {
                int i12 = aVar.f29215x;
                if (i12 != -1) {
                    j jVar = (j) aVar;
                    a10 = jVar.f29207z.f29208a.a(jVar.f29212u, i12);
                    charSequence = aVar.f29212u;
                    if (a10 == -1) {
                        a10 = charSequence.length();
                        aVar.f29215x = -1;
                    } else {
                        aVar.f29215x = a10 + 1;
                    }
                    int i13 = aVar.f29215x;
                    if (i13 == i11) {
                        int i14 = i13 + 1;
                        aVar.f29215x = i14;
                        if (i14 > charSequence.length()) {
                            aVar.f29215x = -1;
                        }
                    } else {
                        while (true) {
                            bVar = aVar.f29213v;
                            if (i11 >= a10 || !bVar.b(charSequence.charAt(i11))) {
                                break;
                            }
                            i11++;
                        }
                        while (a10 > i11) {
                            int i15 = a10 - 1;
                            if (!bVar.b(charSequence.charAt(i15))) {
                                break;
                            }
                            a10 = i15;
                        }
                        if (!aVar.f29214w || i11 != a10) {
                            break;
                        }
                        i11 = aVar.f29215x;
                    }
                } else {
                    aVar.f29195s = 3;
                    str = null;
                    break;
                }
            }
            int i16 = aVar.y;
            if (i16 == 1) {
                a10 = charSequence.length();
                aVar.f29215x = -1;
                while (a10 > i11) {
                    int i17 = a10 - 1;
                    if (!bVar.b(charSequence.charAt(i17))) {
                        break;
                    }
                    a10 = i17;
                }
            } else {
                aVar.y = i16 - 1;
            }
            str = charSequence.subSequence(i11, a10).toString();
            this.f29196t = str;
            if (this.f29195s == 3) {
                return false;
            }
            this.f29195s = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f29195s = 2;
            T t10 = (T) this.f29196t;
            this.f29196t = null;
            return t10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
