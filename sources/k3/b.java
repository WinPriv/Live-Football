package k3;

import a3.x;
import androidx.activity.n;
import java.io.File;

/* compiled from: FileResource.java */
/* loaded from: classes.dex */
public final class b implements x<File> {

    /* renamed from: s, reason: collision with root package name */
    public final File f30312s;

    public b(File file) {
        n.n0(file);
        this.f30312s = file;
    }

    @Override // a3.x
    public final Class<File> c() {
        return this.f30312s.getClass();
    }

    @Override // a3.x
    public final File get() {
        return this.f30312s;
    }

    @Override // a3.x
    public final /* bridge */ /* synthetic */ int getSize() {
        return 1;
    }

    @Override // a3.x
    public final /* bridge */ /* synthetic */ void a() {
    }
}
