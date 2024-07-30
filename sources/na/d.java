package na;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hamkho.livefoot.R;
import com.huawei.openalliance.ad.ppskit.db.bean.ContentRecord;
import com.huawei.openalliance.ad.ppskit.utils.y1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ka.Cif;
import ka.p;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33483a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f33484b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentRecord f33485c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f33486d;

    /* renamed from: e, reason: collision with root package name */
    public final List<na.a> f33487e;
    public final p f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f33488g = true;

    /* loaded from: classes2.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public ImageView f33489a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f33490b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f33491c;
    }

    public d(Context context, ArrayList arrayList, ContentRecord contentRecord, Map map) {
        this.f33486d = new HashMap();
        this.f33487e = new ArrayList();
        this.f33483a = context;
        this.f33484b = LayoutInflater.from(context);
        this.f33487e = arrayList;
        this.f33485c = contentRecord;
        this.f33486d = map;
        this.f = new p(context);
    }

    public final View a(int i10, LinearLayout linearLayout) {
        a aVar = new a();
        View inflate = this.f33484b.inflate(R.layout.hiad_ar_item_detail, (ViewGroup) linearLayout, false);
        aVar.f33489a = (ImageView) inflate.findViewById(R.id.hiad_ar_item_prv);
        aVar.f33490b = (TextView) inflate.findViewById(R.id.hiad_ar_item_title);
        aVar.f33491c = (TextView) inflate.findViewById(R.id.hiad_ar_btn_cta);
        Context context = this.f33483a;
        if (Cif.a(context).g()) {
            aVar.f33491c.setBackground(context.getResources().getDrawable(R.drawable.hiad_ar_detail_card_button_hm));
        }
        inflate.setTag(aVar);
        ImageView imageView = aVar.f33489a;
        List<na.a> list = this.f33487e;
        imageView.setImageDrawable(list.get(i10).f33477b);
        aVar.f33490b.setText(list.get(i10).f33479d);
        aVar.f33491c.setText(list.get(i10).f33480e);
        if (y1.h(list.get(i10).f33480e)) {
            aVar.f33491c.setVisibility(8);
        }
        aVar.f33491c.setOnClickListener(new b(this));
        return inflate;
    }
}
