package y8;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: TeamsFragment.java */
/* loaded from: classes2.dex */
public final class c extends GridLayoutManager.c {
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i10) {
        if (((i10 + 1) % 7) * 3 != 0) {
            return 1;
        }
        return 3;
    }
}
