package s0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.g0;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public final class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public final a f35047a;

    /* compiled from: CursorFilter.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f35047a = aVar;
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((g0) this.f35047a).c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            s0.b$a r0 = r4.f35047a
            androidx.appcompat.widget.g0 r0 = (androidx.appcompat.widget.g0) r0
            if (r5 != 0) goto L9
            java.lang.String r5 = ""
            goto L10
        L9:
            r0.getClass()
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.C
            int r2 = r1.getVisibility()
            r3 = 0
            if (r2 != 0) goto L34
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L20
            goto L34
        L20:
            android.app.SearchableInfo r1 = r0.D     // Catch: java.lang.RuntimeException -> L2c
            android.database.Cursor r5 = r0.g(r1, r5)     // Catch: java.lang.RuntimeException -> L2c
            if (r5 == 0) goto L34
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2c
            goto L35
        L2c:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L34:
            r5 = r3
        L35:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L45
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L4a
        L45:
            r5 = 0
            r0.count = r5
            r0.values = r3
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f35047a;
        Cursor cursor = ((s0.a) aVar).f35041u;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            ((g0) aVar).b((Cursor) obj);
        }
    }
}
