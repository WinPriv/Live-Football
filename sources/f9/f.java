package f9;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.anythink.nativead.api.ATNativeAdView;
import com.bumptech.glide.n;
import com.bumptech.glide.o;
import com.hamkho.livefoot.R;
import java.util.ArrayList;
import java.util.List;
import m9.j;

/* compiled from: TeamsAdapter.java */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.g<RecyclerView.c0> {

    /* renamed from: i, reason: collision with root package name */
    public final List<l9.d> f28194i;

    /* renamed from: j, reason: collision with root package name */
    public final Activity f28195j;

    /* compiled from: TeamsAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements p3.f<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.c0 f28196a;

        public a(RecyclerView.c0 c0Var) {
            this.f28196a = c0Var;
        }

        @Override // p3.f
        public final /* bridge */ /* synthetic */ void a(Object obj) {
        }

        @Override // p3.f
        public final void b() {
            ((c) this.f28196a).f28200c.setImageResource(R.drawable.teamlogoholder);
        }
    }

    /* compiled from: TeamsAdapter.java */
    /* loaded from: classes2.dex */
    public class b extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final y1.g f28197b;

        public b(View view) {
            super(view);
            this.f28197b = y1.g.a(view);
        }
    }

    /* compiled from: TeamsAdapter.java */
    /* loaded from: classes2.dex */
    public class c extends RecyclerView.c0 {

        /* renamed from: b, reason: collision with root package name */
        public final TextView f28199b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f28200c;

        public c(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.TeamName);
            this.f28199b = textView;
            this.f28200c = (ImageView) view.findViewById(R.id.TeamImage);
            textView.setSelected(true);
        }
    }

    public f(FragmentActivity fragmentActivity, ArrayList arrayList) {
        this.f28194i = arrayList;
        this.f28195j = fragmentActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        List<l9.d> list = this.f28194i;
        if (list.size() > 0) {
            return Math.round(list.size() / 7) + list.size();
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i10) {
        if ((i10 + 1) % 7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.c0 c0Var, int i10) {
        if (c0Var.getItemViewType() == 0) {
            int round = i10 - Math.round(i10 / 7);
            o e10 = com.bumptech.glide.b.e(this.f28195j);
            List<l9.d> list = this.f28194i;
            n w10 = e10.k(list.get(round).f32556b).h(R.drawable.teamlogoholder).w(new a(c0Var));
            c cVar = (c) c0Var;
            w10.u(cVar.f28200c);
            cVar.f28199b.setText(list.get(round).f32555a);
            return;
        }
        if (c0Var.getItemViewType() == 1) {
            b bVar = (b) c0Var;
            Activity activity = f.this.f28195j;
            y1.g gVar = bVar.f28197b;
            t8.a.j(activity, (FrameLayout) gVar.f36545u, (j) gVar.f36547w, (ATNativeAdView) gVar.f36546v);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.c0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            return new c(LayoutInflater.from(this.f28195j).inflate(R.layout.teamsitem, viewGroup, false));
        }
        if (i10 == 1) {
            return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.native_list_ad_item, viewGroup, false));
        }
        return null;
    }
}
