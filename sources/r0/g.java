package r0;

import android.widget.ListView;

/* compiled from: ListViewCompat.java */
/* loaded from: classes.dex */
public final class g {
    public static boolean a(ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    public static void b(ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
