package j0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper.java */
/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f29565a;

    public h(Object obj) {
        this.f29565a = (LocaleList) obj;
    }

    @Override // j0.g
    public final String a() {
        return this.f29565a.toLanguageTags();
    }

    @Override // j0.g
    public final Object b() {
        return this.f29565a;
    }

    public final boolean equals(Object obj) {
        return this.f29565a.equals(((g) obj).b());
    }

    @Override // j0.g
    public final Locale get(int i10) {
        return this.f29565a.get(i10);
    }

    public final int hashCode() {
        return this.f29565a.hashCode();
    }

    @Override // j0.g
    public final boolean isEmpty() {
        return this.f29565a.isEmpty();
    }

    @Override // j0.g
    public final int size() {
        return this.f29565a.size();
    }

    public final String toString() {
        return this.f29565a.toString();
    }
}
