package e9;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.hamkho.livefoot.Activities.SoccerLive.ChannelsListActivity;
import com.hamkho.livefoot.R;
import e9.b;
import java.util.ArrayList;
import java.util.List;
import m9.j;
import y1.g;

/* compiled from: CategoriesAdapter.java */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final Activity f27852i;

    /* renamed from: j, reason: collision with root package name */
    public final List<k9.a> f27853j;

    /* compiled from: CategoriesAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements h9.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f27854a;

        public a(int i10) {
            this.f27854a = i10;
        }

        @Override // h9.b
        public final void a() {
            b bVar = b.this;
            bVar.f27852i.startActivity(new Intent(bVar.f27852i, (Class<?>) ChannelsListActivity.class).putExtra("pos", this.f27854a));
        }
    }

    /* compiled from: CategoriesAdapter.java */
    /* renamed from: e9.b$b, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0371b extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f27856b;

        public C0371b(View view) {
            super(view);
            this.f27856b = (TextView) view.findViewById(R.id.CategoryName);
        }
    }

    /* compiled from: CategoriesAdapter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final g f27857b;

        public c(View view) {
            super(view);
            this.f27857b = g.a(view);
        }
    }

    public b(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f27852i = fragmentActivity;
        this.f27853j = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<k9.a> list = this.f27853j;
        if (list.size() > 0) {
            return Math.round(list.size() / 3) + list.size();
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i10) {
        if ((i10 + 1) % 3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        if (c0Var.getItemViewType() == 0) {
            final int round = i10 - Math.round(i10 / 3);
            C0371b c0371b = (C0371b) c0Var;
            c0371b.f27856b.setText(this.f27853j.get(round).f30899a);
            c0371b.itemView.setOnClickListener(new View.OnClickListener() { // from class: e9.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b bVar = b.this;
                    bVar.getClass();
                    t8.a.g(bVar.f27852i, new b.a(round));
                }
            });
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            c cVar = (c) c0Var;
            Activity activity = b.this.f27852i;
            g gVar = cVar.f27857b;
            t8.a.j(activity, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new C0371b(LayoutInflater.from(this.f27852i).inflate(R.layout.cat_item, viewGroup, false));
        }
        if (i10 == 1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
