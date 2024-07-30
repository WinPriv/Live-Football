package n0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.hamkho.livefoot.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n0.c0;
import o0.g;
import o0.k;

/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f33036c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f33037a;

    /* renamed from: b, reason: collision with root package name */
    public final C0442a f33038b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: n0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0442a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final a f33039a;

        public C0442a(a aVar) {
            this.f33039a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f33039a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o0.h b10 = this.f33039a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f33537a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f33039a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z10;
            Object tag;
            boolean z11;
            boolean z12;
            Object tag2;
            boolean z13;
            boolean z14;
            Object tag3;
            int i10;
            o0.g gVar = new o0.g(accessibilityNodeInfo);
            WeakHashMap<View, l0> weakHashMap = c0.f33054a;
            boolean z15 = true;
            int i11 = 0;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = true;
            } else {
                z10 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z10) {
                tag = Boolean.valueOf(c0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z11);
            } else {
                gVar.f(1, z11);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                tag2 = Boolean.valueOf(c0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i12 >= 28) {
                accessibilityNodeInfo.setHeading(z13);
            } else {
                gVar.f(2, z13);
            }
            CharSequence d10 = c0.d(view);
            if (i12 >= 28) {
                accessibilityNodeInfo.setPaneTitle(d10);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d10);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                tag3 = c0.o.a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i12 < 30) {
                z15 = false;
            }
            if (z15) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f33039a.d(view, gVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i12 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                        if (((WeakReference) sparseArray.valueAt(i13)).get() == null) {
                            arrayList.add(Integer.valueOf(i13));
                        }
                    }
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        sparseArray.remove(((Integer) arrayList.get(i14)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    gVar.f33521a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i15 = 0;
                    while (i15 < clickableSpanArr.length) {
                        ClickableSpan clickableSpan = clickableSpanArr[i15];
                        int i16 = i11;
                        while (true) {
                            if (i16 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i16)).get())) {
                                    i10 = sparseArray2.keyAt(i16);
                                    break;
                                }
                                i16++;
                            } else {
                                i10 = o0.g.f33520d;
                                o0.g.f33520d = i10 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i10, new WeakReference(clickableSpanArr[i15]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i15];
                        Spanned spanned = (Spanned) text;
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        gVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
                        i15++;
                        i11 = 0;
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i17 = 0; i17 < list.size(); i17++) {
                gVar.b((g.a) list.get(i17));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f33039a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f33039a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f33039a.g(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i10) {
            this.f33039a.h(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f33039a.i(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i10, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i10, bundle);
        }
    }

    public a() {
        this(f33036c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f33037a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public o0.h b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f33037a, view);
        if (a10 != null) {
            return new o0.h(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f33037a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, o0.g gVar) {
        this.f33037a.onInitializeAccessibilityNodeInfo(view, gVar.f33521a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f33037a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f33037a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            g.a aVar = (g.a) list.get(i11);
            if (aVar.a() == i10) {
                o0.k kVar = aVar.f33534d;
                if (kVar != null) {
                    Class<? extends k.a> cls = aVar.f33533c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = kVar.a(view);
                }
            } else {
                i11++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f33037a, view, i10, bundle);
        }
        if (!z10 && i10 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i13 = 0; clickableSpanArr != null && i13 < clickableSpanArr.length; i13++) {
                        if (clickableSpan.equals(clickableSpanArr[i13])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i10) {
        this.f33037a.sendAccessibilityEvent(view, i10);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f33037a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f33037a = accessibilityDelegate;
        this.f33038b = new C0442a(this);
    }
}
