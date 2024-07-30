package k6;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f30875b;

    /* compiled from: BottomAppBar.java */
    /* loaded from: classes2.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f30875b;
            int i10 = BottomAppBar.D0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f30875b = bottomAppBar;
        this.f30874a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        int i10 = BottomAppBar.D0;
        floatingActionButton.setTranslationX(this.f30875b.y(this.f30874a));
        floatingActionButton.k(new a(), true);
    }
}
