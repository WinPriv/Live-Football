package s0;

import a3.l;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import s0.b;

/* compiled from: CursorAdapter.java */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {
    public s0.b y;

    /* renamed from: t, reason: collision with root package name */
    public boolean f35040t = true;

    /* renamed from: u, reason: collision with root package name */
    public Cursor f35041u = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f35039s = false;

    /* renamed from: v, reason: collision with root package name */
    public int f35042v = -1;

    /* renamed from: w, reason: collision with root package name */
    public C0474a f35043w = new C0474a();

    /* renamed from: x, reason: collision with root package name */
    public b f35044x = new b();

    /* compiled from: CursorAdapter.java */
    /* renamed from: s0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0474a extends ContentObserver {
        public C0474a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f35040t && (cursor = aVar.f35041u) != null && !cursor.isClosed()) {
                aVar.f35039s = aVar.f35041u.requery();
            }
        }
    }

    /* compiled from: CursorAdapter.java */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            a aVar = a.this;
            aVar.f35039s = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            a aVar = a.this;
            aVar.f35039s = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f35041u;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0474a c0474a = this.f35043w;
                if (c0474a != null) {
                    cursor2.unregisterContentObserver(c0474a);
                }
                b bVar = this.f35044x;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f35041u = cursor;
            if (cursor != null) {
                C0474a c0474a2 = this.f35043w;
                if (c0474a2 != null) {
                    cursor.registerContentObserver(c0474a2);
                }
                b bVar2 = this.f35044x;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f35042v = cursor.getColumnIndexOrThrow(pa.a.ID);
                this.f35039s = true;
                notifyDataSetChanged();
            } else {
                this.f35042v = -1;
                this.f35039s = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f35039s && (cursor = this.f35041u) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f35039s) {
            this.f35041u.moveToPosition(i10);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.B.inflate(cVar.A, viewGroup, false);
            }
            a(view, this.f35041u);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.y == null) {
            this.y = new s0.b(this);
        }
        return this.y;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (this.f35039s && (cursor = this.f35041u) != null) {
            cursor.moveToPosition(i10);
            return this.f35041u;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (!this.f35039s || (cursor = this.f35041u) == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f35041u.getLong(this.f35042v);
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f35039s) {
            if (this.f35041u.moveToPosition(i10)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f35041u);
                return view;
            }
            throw new IllegalStateException(l.i("couldn't move cursor to position ", i10));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
