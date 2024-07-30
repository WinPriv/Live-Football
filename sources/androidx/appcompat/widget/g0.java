package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class g0 extends s0.c implements View.OnClickListener {
    public static final /* synthetic */ int P = 0;
    public final SearchView C;
    public final SearchableInfo D;
    public final Context E;
    public final WeakHashMap<String, Drawable.ConstantState> F;
    public final int G;
    public int H;
    public ColorStateList I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f1176a;

        /* renamed from: b, reason: collision with root package name */
        public final TextView f1177b;

        /* renamed from: c, reason: collision with root package name */
        public final ImageView f1178c;

        /* renamed from: d, reason: collision with root package name */
        public final ImageView f1179d;

        /* renamed from: e, reason: collision with root package name */
        public final ImageView f1180e;

        public a(View view) {
            this.f1176a = (TextView) view.findViewById(R.id.text1);
            this.f1177b = (TextView) view.findViewById(R.id.text2);
            this.f1178c = (ImageView) view.findViewById(R.id.icon1);
            this.f1179d = (ImageView) view.findViewById(R.id.icon2);
            this.f1180e = (ImageView) view.findViewById(com.hamkho.livefoot.R.id.edit_query);
        }
    }

    public g0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.H = 1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.C = searchView;
        this.D = searchableInfo;
        this.G = searchView.getSuggestionCommitIconResId();
        this.E = context;
        this.F = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    @Override // s0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // s0.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.J = cursor.getColumnIndex("suggest_text_1");
                this.K = cursor.getColumnIndex("suggest_text_2");
                this.L = cursor.getColumnIndex("suggest_text_2_url");
                this.M = cursor.getColumnIndex("suggest_icon_1");
                this.N = cursor.getColumnIndex("suggest_icon_2");
                this.O = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // s0.a
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.D;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // s0.a
    public final View d(ViewGroup viewGroup) {
        View inflate = this.B.inflate(this.f35048z, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(com.hamkho.livefoot.R.id.edit_query)).setImageResource(this.G);
        return inflate;
    }

    public final Drawable e(Uri uri) throws FileNotFoundException {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.E.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.E.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // s0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.B.inflate(this.A, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1176a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // s0.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(viewGroup);
            ((a) d10.getTag()).f1176a.setText(e10.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f35041u;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f35041u;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.C.p((CharSequence) tag);
        }
    }
}
