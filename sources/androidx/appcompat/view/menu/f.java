package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import com.hamkho.livefoot.R;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public final class f implements m, AdapterView.OnItemClickListener {

    /* renamed from: s, reason: collision with root package name */
    public Context f802s;

    /* renamed from: t, reason: collision with root package name */
    public LayoutInflater f803t;

    /* renamed from: u, reason: collision with root package name */
    public h f804u;

    /* renamed from: v, reason: collision with root package name */
    public ExpandedMenuView f805v;

    /* renamed from: w, reason: collision with root package name */
    public m.a f806w;

    /* renamed from: x, reason: collision with root package name */
    public a f807x;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: s, reason: collision with root package name */
        public int f808s = -1;

        public a() {
            a();
        }

        public final void a() {
            h hVar = f.this.f804u;
            j jVar = hVar.f835v;
            if (jVar != null) {
                hVar.i();
                ArrayList<j> arrayList = hVar.f824j;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (arrayList.get(i10) == jVar) {
                        this.f808s = i10;
                        return;
                    }
                }
            }
            this.f808s = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j getItem(int i10) {
            f fVar = f.this;
            h hVar = fVar.f804u;
            hVar.i();
            ArrayList<j> arrayList = hVar.f824j;
            fVar.getClass();
            int i11 = i10 + 0;
            int i12 = this.f808s;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return arrayList.get(i11);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            f fVar = f.this;
            h hVar = fVar.f804u;
            hVar.i();
            int size = hVar.f824j.size();
            fVar.getClass();
            int i10 = size + 0;
            if (this.f808s < 0) {
                return i10;
            }
            return i10 - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = f.this.f803t.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((n.a) view).c(getItem(i10));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context) {
        this.f802s = context;
        this.f803t = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public final void b(h hVar, boolean z10) {
        m.a aVar = this.f806w;
        if (aVar != null) {
            aVar.b(hVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final void c(boolean z10) {
        a aVar = this.f807x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void e(m.a aVar) {
        this.f806w = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean f(j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void g(Context context, h hVar) {
        if (this.f802s != null) {
            this.f802s = context;
            if (this.f803t == null) {
                this.f803t = LayoutInflater.from(context);
            }
        }
        this.f804u = hVar;
        a aVar = this.f807x;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.m
    public final void h(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f805v.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean j(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        i iVar = new i(rVar);
        Context context = rVar.f816a;
        d.a aVar = new d.a(context);
        f fVar = new f(aVar.getContext());
        iVar.f840u = fVar;
        fVar.f806w = iVar;
        rVar.b(fVar, context);
        f fVar2 = iVar.f840u;
        if (fVar2.f807x == null) {
            fVar2.f807x = new a();
        }
        a aVar2 = fVar2.f807x;
        AlertController.b bVar = aVar.f647a;
        bVar.f581l = aVar2;
        bVar.f582m = iVar;
        View view = rVar.o;
        if (view != null) {
            bVar.f575e = view;
        } else {
            bVar.f573c = rVar.f828n;
            aVar.setTitle(rVar.f827m);
        }
        bVar.f580k = iVar;
        androidx.appcompat.app.d create = aVar.create();
        iVar.f839t = create;
        create.setOnDismissListener(iVar);
        WindowManager.LayoutParams attributes = iVar.f839t.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        iVar.f839t.show();
        m.a aVar3 = this.f806w;
        if (aVar3 != null) {
            aVar3.c(rVar);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public final Parcelable k() {
        if (this.f805v == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f805v;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public final boolean l(j jVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f804u.q(this.f807x.getItem(i10), this, 0);
    }
}
