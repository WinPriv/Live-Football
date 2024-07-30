package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.activity.n;
import com.anythink.expressad.exoplayer.k.p;
import com.google.android.material.internal.k;
import com.hamkho.livefoot.R;
import com.huawei.hms.ads.gl;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import z6.c;

/* loaded from: classes2.dex */
public final class BadgeState {

    /* renamed from: a, reason: collision with root package name */
    public final State f20470a;

    /* renamed from: b, reason: collision with root package name */
    public final State f20471b = new State();

    /* renamed from: c, reason: collision with root package name */
    public final float f20472c;

    /* renamed from: d, reason: collision with root package name */
    public final float f20473d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20474e;

    public BadgeState(Context context, State state) {
        State state2;
        AttributeSet attributeSet;
        int i10;
        int i11;
        boolean z10;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int next;
        if (state == null) {
            state2 = new State();
        } else {
            state2 = state;
        }
        int i12 = state2.f20475s;
        if (i12 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i12);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i10 = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e10) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i12));
                notFoundException.initCause(e10);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i10 = 0;
        }
        if (i10 == 0) {
            i11 = 2132018267;
        } else {
            i11 = i10;
        }
        TypedArray d10 = k.d(context, attributeSet, n.L, R.attr.badgeStyle, i11, new int[0]);
        Resources resources = context.getResources();
        this.f20472c = d10.getDimensionPixelSize(2, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.f20474e = d10.getDimensionPixelSize(4, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f20473d = d10.getDimensionPixelSize(5, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        State state3 = this.f20471b;
        int i13 = state2.f20478v;
        state3.f20478v = i13 == -2 ? p.f9095b : i13;
        CharSequence charSequence = state2.f20481z;
        state3.f20481z = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        State state4 = this.f20471b;
        int i14 = state2.A;
        state4.A = i14 == 0 ? R.plurals.mtrl_badge_content_description : i14;
        int i15 = state2.B;
        state4.B = i15 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i15;
        Boolean bool = state2.D;
        if (bool != null && !bool.booleanValue()) {
            z10 = false;
        } else {
            z10 = true;
        }
        state4.D = Boolean.valueOf(z10);
        State state5 = this.f20471b;
        int i16 = state2.f20480x;
        state5.f20480x = i16 == -2 ? d10.getInt(8, 4) : i16;
        int i17 = state2.f20479w;
        if (i17 != -2) {
            this.f20471b.f20479w = i17;
        } else if (d10.hasValue(9)) {
            this.f20471b.f20479w = d10.getInt(9, 0);
        } else {
            this.f20471b.f20479w = -1;
        }
        State state6 = this.f20471b;
        Integer num = state2.f20476t;
        if (num == null) {
            intValue = c.a(context, d10, 0).getDefaultColor();
        } else {
            intValue = num.intValue();
        }
        state6.f20476t = Integer.valueOf(intValue);
        Integer num2 = state2.f20477u;
        if (num2 != null) {
            this.f20471b.f20477u = num2;
        } else if (d10.hasValue(3)) {
            this.f20471b.f20477u = Integer.valueOf(c.a(context, d10, 3).getDefaultColor());
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, n.f514v0);
            obtainStyledAttributes.getDimension(0, gl.Code);
            ColorStateList a10 = c.a(context, obtainStyledAttributes, 3);
            c.a(context, obtainStyledAttributes, 4);
            c.a(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i18 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i18, 0);
            obtainStyledAttributes.getString(i18);
            obtainStyledAttributes.getBoolean(14, false);
            c.a(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, gl.Code);
            obtainStyledAttributes.getFloat(8, gl.Code);
            obtainStyledAttributes.getFloat(9, gl.Code);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, n.f498j0);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, gl.Code);
            obtainStyledAttributes2.recycle();
            this.f20471b.f20477u = Integer.valueOf(a10.getDefaultColor());
        }
        State state7 = this.f20471b;
        Integer num3 = state2.C;
        if (num3 == null) {
            intValue2 = d10.getInt(1, 8388661);
        } else {
            intValue2 = num3.intValue();
        }
        state7.C = Integer.valueOf(intValue2);
        State state8 = this.f20471b;
        Integer num4 = state2.E;
        if (num4 == null) {
            intValue3 = d10.getDimensionPixelOffset(6, 0);
        } else {
            intValue3 = num4.intValue();
        }
        state8.E = Integer.valueOf(intValue3);
        State state9 = this.f20471b;
        Integer num5 = state2.F;
        if (num5 == null) {
            intValue4 = d10.getDimensionPixelOffset(10, 0);
        } else {
            intValue4 = num5.intValue();
        }
        state9.F = Integer.valueOf(intValue4);
        State state10 = this.f20471b;
        Integer num6 = state2.G;
        if (num6 == null) {
            intValue5 = d10.getDimensionPixelOffset(7, state10.E.intValue());
        } else {
            intValue5 = num6.intValue();
        }
        state10.G = Integer.valueOf(intValue5);
        State state11 = this.f20471b;
        Integer num7 = state2.H;
        if (num7 == null) {
            intValue6 = d10.getDimensionPixelOffset(11, state11.F.intValue());
        } else {
            intValue6 = num7.intValue();
        }
        state11.H = Integer.valueOf(intValue6);
        State state12 = this.f20471b;
        Integer num8 = state2.I;
        if (num8 == null) {
            intValue7 = 0;
        } else {
            intValue7 = num8.intValue();
        }
        state12.I = Integer.valueOf(intValue7);
        State state13 = this.f20471b;
        Integer num9 = state2.J;
        state13.J = Integer.valueOf(num9 != null ? num9.intValue() : 0);
        d10.recycle();
        Locale locale = state2.y;
        if (locale == null) {
            this.f20471b.y = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.f20471b.y = locale;
        }
        this.f20470a = state2;
    }

    /* loaded from: classes2.dex */
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();
        public int A;
        public int B;
        public Integer C;
        public Boolean D;
        public Integer E;
        public Integer F;
        public Integer G;
        public Integer H;
        public Integer I;
        public Integer J;

        /* renamed from: s, reason: collision with root package name */
        public int f20475s;

        /* renamed from: t, reason: collision with root package name */
        public Integer f20476t;

        /* renamed from: u, reason: collision with root package name */
        public Integer f20477u;

        /* renamed from: v, reason: collision with root package name */
        public int f20478v;

        /* renamed from: w, reason: collision with root package name */
        public int f20479w;

        /* renamed from: x, reason: collision with root package name */
        public int f20480x;
        public Locale y;

        /* renamed from: z, reason: collision with root package name */
        public CharSequence f20481z;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f20478v = p.f9095b;
            this.f20479w = -2;
            this.f20480x = -2;
            this.D = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            String charSequence;
            parcel.writeInt(this.f20475s);
            parcel.writeSerializable(this.f20476t);
            parcel.writeSerializable(this.f20477u);
            parcel.writeInt(this.f20478v);
            parcel.writeInt(this.f20479w);
            parcel.writeInt(this.f20480x);
            CharSequence charSequence2 = this.f20481z;
            if (charSequence2 == null) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            parcel.writeString(charSequence);
            parcel.writeInt(this.A);
            parcel.writeSerializable(this.C);
            parcel.writeSerializable(this.E);
            parcel.writeSerializable(this.F);
            parcel.writeSerializable(this.G);
            parcel.writeSerializable(this.H);
            parcel.writeSerializable(this.I);
            parcel.writeSerializable(this.J);
            parcel.writeSerializable(this.D);
            parcel.writeSerializable(this.y);
        }

        public State(Parcel parcel) {
            this.f20478v = p.f9095b;
            this.f20479w = -2;
            this.f20480x = -2;
            this.D = Boolean.TRUE;
            this.f20475s = parcel.readInt();
            this.f20476t = (Integer) parcel.readSerializable();
            this.f20477u = (Integer) parcel.readSerializable();
            this.f20478v = parcel.readInt();
            this.f20479w = parcel.readInt();
            this.f20480x = parcel.readInt();
            this.f20481z = parcel.readString();
            this.A = parcel.readInt();
            this.C = (Integer) parcel.readSerializable();
            this.E = (Integer) parcel.readSerializable();
            this.F = (Integer) parcel.readSerializable();
            this.G = (Integer) parcel.readSerializable();
            this.H = (Integer) parcel.readSerializable();
            this.I = (Integer) parcel.readSerializable();
            this.J = (Integer) parcel.readSerializable();
            this.D = (Boolean) parcel.readSerializable();
            this.y = (Locale) parcel.readSerializable();
        }
    }
}
