package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.hamkho.livefoot.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import n0.c0;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements i.b {
    public static final o A0;
    public final SearchAutoComplete H;
    public final View I;
    public final View J;
    public final View K;
    public final ImageView L;
    public final ImageView M;
    public final ImageView N;
    public final ImageView O;
    public final View P;
    public p Q;
    public final Rect R;
    public final Rect S;
    public final int[] T;
    public final int[] U;
    public final ImageView V;
    public final Drawable W;

    /* renamed from: c0, reason: collision with root package name */
    public final int f1032c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f1033d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Intent f1034e0;

    /* renamed from: f0, reason: collision with root package name */
    public final Intent f1035f0;

    /* renamed from: g0, reason: collision with root package name */
    public final CharSequence f1036g0;

    /* renamed from: h0, reason: collision with root package name */
    public View.OnFocusChangeListener f1037h0;

    /* renamed from: i0, reason: collision with root package name */
    public View.OnClickListener f1038i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1039j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f1040k0;

    /* renamed from: l0, reason: collision with root package name */
    public s0.a f1041l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f1042m0;

    /* renamed from: n0, reason: collision with root package name */
    public CharSequence f1043n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f1044o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1045p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f1046q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f1047r0;

    /* renamed from: s0, reason: collision with root package name */
    public CharSequence f1048s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1049t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1050u0;

    /* renamed from: v0, reason: collision with root package name */
    public SearchableInfo f1051v0;

    /* renamed from: w0, reason: collision with root package name */
    public Bundle f1052w0;

    /* renamed from: x0, reason: collision with root package name */
    public final b f1053x0;
    public final c y0;

    /* renamed from: z0, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1054z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: u, reason: collision with root package name */
        public boolean f1055u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1055u + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f1595s, i10);
            parcel.writeValue(Boolean.valueOf(this.f1055u));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1055u = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            s0.a aVar = SearchView.this.f1041l0;
            if (aVar instanceof g0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1037h0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18;
            int i19;
            SearchView searchView = SearchView.this;
            View view2 = searchView.P;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.J.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = u0.a(searchView);
                if (searchView.f1039j0) {
                    i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i18 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.H;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i19 = -rect.left;
                } else {
                    i19 = paddingLeft - (rect.left + i18);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i19);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.L;
            SearchAutoComplete searchAutoComplete = searchView.H;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f1038i0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                    return;
                }
                return;
            }
            if (view == searchView.N) {
                searchView.m();
                return;
            }
            if (view == searchView.M) {
                searchView.q();
                return;
            }
            if (view == searchView.O) {
                SearchableInfo searchableInfo = searchView.f1051v0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.f1034e0);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                            return;
                        }
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.f1035f0, searchableInfo));
                            return;
                        }
                        return;
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                        return;
                    }
                }
                return;
            }
            if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
            boolean z10;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f1051v0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.H;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f1051v0 == null || searchView.f1041l0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i10 != 66 && i10 != 84 && i10 != 61) {
                    if (i10 != 21 && i10 != 22) {
                        if (i10 != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i10 == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else {
                    searchView.n(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.n(i10);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        public final Method f1070a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f1071b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f1072c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.f1070a = null;
            this.f1071b = null;
            this.f1072c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1070a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1071b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1072c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f1073a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f1074b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect f1075c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f1076d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1077e;
        public boolean f;

        public p(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1077e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1074b = rect3;
            Rect rect4 = new Rect();
            this.f1076d = rect4;
            Rect rect5 = new Rect();
            this.f1075c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i10 = -scaledTouchSlop;
            rect4.inset(i10, i10);
            rect5.set(rect2);
            this.f1073a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f;
                        this.f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f;
                    if (z11 && !this.f1076d.contains(x10, y)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1074b.contains(x10, y)) {
                    this.f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f1075c;
            View view = this.f1073a;
            if (z10 && !rect.contains(x10, y)) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                motionEvent.setLocation(x10 - rect.left, y - rect.top);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        A0 = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1045p0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1045p0 = false;
    }

    public int getImeOptions() {
        return this.H.getImeOptions();
    }

    public int getInputType() {
        return this.H.getInputType();
    }

    public int getMaxWidth() {
        return this.f1046q0;
    }

    public CharSequence getQuery() {
        return this.H.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1043n0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1051v0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1051v0.getHintId());
            }
            return this.f1036g0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f1033d0;
    }

    public int getSuggestionRowLayout() {
        return this.f1032c0;
    }

    public s0.a getSuggestionsAdapter() {
        return this.f1041l0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1048s0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1052w0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1051v0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1052w0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.H;
        if (i10 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = A0;
        oVar.getClass();
        o.a();
        Method method = oVar.f1070a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f1071b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.H;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f1039j0) {
                clearFocus();
                w(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void n(int i10) {
        int i11;
        Uri parse;
        String h10;
        Cursor cursor = this.f1041l0.f35041u;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = g0.P;
                String h11 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f1051v0.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f1051v0.getSuggestIntentData();
                }
                if (h12 != null && (h10 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + "/" + Uri.encode(h10);
                }
                if (h12 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h12);
                }
                intent = j(h11, parse, g0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), g0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i10) {
        Editable text = this.H.getText();
        Cursor cursor = this.f1041l0.f35041u;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String c10 = this.f1041l0.c(cursor);
                if (c10 != null) {
                    setQuery(c10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // i.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1048s0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f1050u0);
        this.f1049t0 = false;
    }

    @Override // i.b
    public final void onActionViewExpanded() {
        if (this.f1049t0) {
            return;
        }
        this.f1049t0 = true;
        SearchAutoComplete searchAutoComplete = this.H;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1050u0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1053x0);
        post(this.y0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.H;
            int[] iArr = this.T;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.U;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i15;
            int height = searchAutoComplete.getHeight() + i14;
            Rect rect = this.R;
            rect.set(i15, i14, width, height);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.S;
            rect2.set(i16, 0, i17, i18);
            p pVar = this.Q;
            if (pVar == null) {
                p pVar2 = new p(rect2, rect, searchAutoComplete);
                this.Q = pVar2;
                setTouchDelegate(pVar2);
            } else {
                pVar.f1074b.set(rect2);
                Rect rect3 = pVar.f1076d;
                rect3.set(rect2);
                int i19 = -pVar.f1077e;
                rect3.inset(i19, i19);
                pVar.f1075c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f1040k0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f1046q0) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f1046q0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f1046q0;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1595s);
        w(savedState.f1055u);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1055u = this.f1040k0;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1053x0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.H;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1051v0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.H.getText());
        int i10 = 0;
        if (!z11 && (!this.f1039j0 || this.f1049t0)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.N;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f1045p0 || !isFocusable()) {
            return false;
        }
        if (!this.f1040k0) {
            boolean requestFocus = this.H.requestFocus(i10, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.H.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.J.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.K.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1052w0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.H;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1038i0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1039j0 == z10) {
            return;
        }
        this.f1039j0 = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i10) {
        this.H.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.H.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f1046q0 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1037h0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1038i0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1043n0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f1044o0 = z10;
        s0.a aVar = this.f1041l0;
        if (aVar instanceof g0) {
            g0 g0Var = (g0) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            g0Var.H = i10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r3, com.anythink.expressad.exoplayer.b.aX) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.f1051v0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.H
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.f1051v0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.f1051v0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.f1051v0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            s0.a r8 = r7.f1041l0
            if (r8 == 0) goto L3e
            r8.b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.f1051v0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            androidx.appcompat.widget.g0 r8 = new androidx.appcompat.widget.g0
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.f1051v0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.f1054z0
            r8.<init>(r4, r7, r5, r6)
            r7.f1041l0 = r8
            r0.setAdapter(r8)
            s0.a r8 = r7.f1041l0
            androidx.appcompat.widget.g0 r8 = (androidx.appcompat.widget.g0) r8
            boolean r4 = r7.f1044o0
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.H = r4
        L65:
            r7.t()
        L68:
            android.app.SearchableInfo r8 = r7.f1051v0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.f1051v0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.f1034e0
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.f1051v0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.f1035f0
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.f1047r0 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.f1040k0
            r7.w(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1042m0 = z10;
        w(this.f1040k0);
    }

    public void setSuggestionsAdapter(s0.a aVar) {
        this.f1041l0 = aVar;
        this.H.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f1039j0;
        SearchAutoComplete searchAutoComplete = this.H;
        if (z10 && (drawable = this.W) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z10;
        int i10 = 0;
        if ((this.f1042m0 || this.f1047r0) && !this.f1040k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.M.getVisibility() != 0 && this.O.getVisibility() != 0)) {
            i10 = 8;
        }
        this.K.setVisibility(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r2.f1047r0 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.f1042m0
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.f1047r0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.f1040k0
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f1047r0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.M
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.v(boolean):void");
    }

    public final void w(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.f1040k0 = z10;
        int i13 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.H.getText());
        this.L.setVisibility(i10);
        v(z11);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.I.setVisibility(i11);
        ImageView imageView = this.V;
        if (imageView.getDrawable() != null && !this.f1039j0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        r();
        boolean z12 = !z11;
        if (this.f1047r0 && !this.f1040k0 && z12) {
            this.M.setVisibility(8);
        } else {
            i13 = 8;
        }
        this.O.setVisibility(i13);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new int[2];
        this.U = new int[2];
        this.f1053x0 = new b();
        this.y0 = new c();
        this.f1054z0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = a0.a.W;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        m0 m0Var = new m0(context, obtainStyledAttributes);
        n0.c0.k(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        LayoutInflater.from(context).inflate(m0Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.H = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.I = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.J = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.K = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.L = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.M = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.N = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.O = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.V = imageView5;
        c0.d.q(findViewById, m0Var.e(18));
        c0.d.q(findViewById2, m0Var.e(23));
        imageView.setImageDrawable(m0Var.e(21));
        imageView2.setImageDrawable(m0Var.e(13));
        imageView3.setImageDrawable(m0Var.e(10));
        imageView4.setImageDrawable(m0Var.e(26));
        imageView5.setImageDrawable(m0Var.e(21));
        this.W = m0Var.e(20);
        q0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f1032c0 = m0Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1033d0 = m0Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(m0Var.a(16, true));
        int d10 = m0Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.f1036g0 = m0Var.k(12);
        this.f1043n0 = m0Var.k(19);
        int h10 = m0Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = m0Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(m0Var.a(1, true));
        m0Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1034e0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1035f0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.P = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.f1039j0);
        t();
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: w, reason: collision with root package name */
        public int f1056w;

        /* renamed from: x, reason: collision with root package name */
        public SearchView f1057x;
        public boolean y;

        /* renamed from: z, reason: collision with root package name */
        public final a f1058z;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.y) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.y = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.f1058z = new a();
            this.f1056w = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.A0;
            oVar.getClass();
            o.a();
            Method method = oVar.f1072c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f1056w > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.y) {
                a aVar = this.f1058z;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f1057x;
            searchView.w(searchView.f1040k0);
            searchView.post(searchView.f1053x0);
            if (searchView.H.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1057x.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1057x.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.y = true;
                Context context = getContext();
                o oVar = SearchView.A0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.f1058z;
            if (!z10) {
                this.y = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.y = false;
                    removeCallbacks(aVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.y = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1057x = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f1056w = i10;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.H.getText();
            searchView.f1048s0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i13 = 8;
            if (searchView.f1047r0 && !searchView.f1040k0 && z11) {
                searchView.M.setVisibility(8);
                i13 = 0;
            }
            searchView.O.setVisibility(i13);
            searchView.r();
            searchView.u();
            charSequence.toString();
            searchView.getClass();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.o(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
