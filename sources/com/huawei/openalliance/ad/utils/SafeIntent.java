package com.huawei.openalliance.ad.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import e0.i;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class SafeIntent extends Intent {
    public SafeIntent(Intent intent) {
        super(intent == null ? new Intent() : intent);
    }

    @Override // android.content.Intent
    public final String getAction() {
        try {
            return super.getAction();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final boolean[] getBooleanArrayExtra(String str) {
        try {
            return super.getBooleanArrayExtra(str);
        } catch (Throwable unused) {
            return new boolean[0];
        }
    }

    @Override // android.content.Intent
    public final boolean getBooleanExtra(String str, boolean z10) {
        try {
            return super.getBooleanExtra(str, z10);
        } catch (Throwable unused) {
            return z10;
        }
    }

    @Override // android.content.Intent
    public final Bundle getBundleExtra(String str) {
        try {
            return super.getBundleExtra(str);
        } catch (Throwable unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final byte[] getByteArrayExtra(String str) {
        try {
            return super.getByteArrayExtra(str);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // android.content.Intent
    public final byte getByteExtra(String str, byte b10) {
        try {
            return super.getByteExtra(str, b10);
        } catch (Throwable unused) {
            return b10;
        }
    }

    @Override // android.content.Intent
    public final char[] getCharArrayExtra(String str) {
        try {
            return super.getCharArrayExtra(str);
        } catch (Throwable unused) {
            return new char[0];
        }
    }

    @Override // android.content.Intent
    public final char getCharExtra(String str, char c10) {
        try {
            return super.getCharExtra(str, c10);
        } catch (Throwable unused) {
            return c10;
        }
    }

    @Override // android.content.Intent
    public final CharSequence[] getCharSequenceArrayExtra(String str) {
        try {
            return super.getCharSequenceArrayExtra(str);
        } catch (Throwable unused) {
            return new CharSequence[0];
        }
    }

    @Override // android.content.Intent
    public final ArrayList<CharSequence> getCharSequenceArrayListExtra(String str) {
        try {
            return super.getCharSequenceArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final CharSequence getCharSequenceExtra(String str) {
        try {
            return super.getCharSequenceExtra(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final double[] getDoubleArrayExtra(String str) {
        try {
            return super.getDoubleArrayExtra(str);
        } catch (Throwable unused) {
            return new double[0];
        }
    }

    @Override // android.content.Intent
    public final double getDoubleExtra(String str, double d10) {
        try {
            return super.getDoubleExtra(str, d10);
        } catch (Throwable unused) {
            return d10;
        }
    }

    @Override // android.content.Intent
    public final Bundle getExtras() {
        try {
            return super.getExtras();
        } catch (Throwable unused) {
            return new Bundle();
        }
    }

    @Override // android.content.Intent
    public final float[] getFloatArrayExtra(String str) {
        try {
            return super.getFloatArrayExtra(str);
        } catch (Throwable unused) {
            return new float[0];
        }
    }

    @Override // android.content.Intent
    public final float getFloatExtra(String str, float f) {
        try {
            return super.getFloatExtra(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    @Override // android.content.Intent
    public final int[] getIntArrayExtra(String str) {
        try {
            return super.getIntArrayExtra(str);
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    @Override // android.content.Intent
    public final int getIntExtra(String str, int i10) {
        try {
            return super.getIntExtra(str, i10);
        } catch (Throwable unused) {
            return i10;
        }
    }

    @Override // android.content.Intent
    public final ArrayList<Integer> getIntegerArrayListExtra(String str) {
        try {
            return super.getIntegerArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final long[] getLongArrayExtra(String str) {
        try {
            return super.getLongArrayExtra(str);
        } catch (Throwable unused) {
            return new long[0];
        }
    }

    @Override // android.content.Intent
    public final long getLongExtra(String str, long j10) {
        try {
            return super.getLongExtra(str, j10);
        } catch (Throwable unused) {
            return j10;
        }
    }

    @Override // android.content.Intent
    public final Parcelable[] getParcelableArrayExtra(String str) {
        try {
            return super.getParcelableArrayExtra(str);
        } catch (Throwable unused) {
            return new Parcelable[0];
        }
    }

    @Override // android.content.Intent
    public final <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String str) {
        try {
            return super.getParcelableArrayListExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final <T extends Parcelable> T getParcelableExtra(String str) {
        try {
            return (T) super.getParcelableExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final Serializable getSerializableExtra(String str) {
        try {
            return super.getSerializableExtra(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.Intent
    public final short[] getShortArrayExtra(String str) {
        try {
            return super.getShortArrayExtra(str);
        } catch (Throwable unused) {
            return new short[0];
        }
    }

    @Override // android.content.Intent
    public final short getShortExtra(String str, short s10) {
        try {
            return super.getShortExtra(str, s10);
        } catch (Throwable unused) {
            return s10;
        }
    }

    @Override // android.content.Intent
    public final String[] getStringArrayExtra(String str) {
        try {
            return super.getStringArrayExtra(str);
        } catch (Throwable unused) {
            return new String[0];
        }
    }

    @Override // android.content.Intent
    public final ArrayList<String> getStringArrayListExtra(String str) {
        try {
            return super.getStringArrayListExtra(str);
        } catch (Throwable unused) {
            return new ArrayList<>();
        }
    }

    @Override // android.content.Intent
    public final String getStringExtra(String str) {
        try {
            return super.getStringExtra(str);
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // android.content.Intent
    public final boolean hasExtra(String str) {
        try {
            return super.hasExtra(str);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Bundle bundle) {
        try {
            return super.putExtra(str, bundle);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtras(Intent intent) {
        try {
            return super.putExtras(intent);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putParcelableArrayListExtra(String str, ArrayList<? extends Parcelable> arrayList) {
        try {
            return super.putParcelableArrayListExtra(str, arrayList);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setAction(String str) {
        try {
            return super.setAction(str);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent setPackage(String str) {
        try {
            return super.setPackage(str);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final void setSelector(Intent intent) {
        try {
            super.setSelector(intent);
        } catch (Throwable th) {
            i.q(th, "setSelector: ", "SafeIntent");
        }
    }

    @Override // android.content.Intent
    @Deprecated
    public final String toURI() {
        try {
            return super.toURI();
        } catch (Throwable th) {
            i.q(th, "toURI: exception ", "SafeIntent");
            return "";
        }
    }

    @Override // android.content.Intent
    public final String toUri(int i10) {
        try {
            return super.toUri(i10);
        } catch (Throwable th) {
            i.q(th, "toUri: ", "SafeIntent");
            return "";
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable parcelable) {
        try {
            return super.putExtra(str, parcelable);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Serializable serializable) {
        try {
            return super.putExtra(str, serializable);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence charSequence) {
        try {
            return super.putExtra(str, charSequence);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String str2) {
        try {
            return super.putExtra(str, str2);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, Parcelable[] parcelableArr) {
        try {
            return super.putExtra(str, parcelableArr);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, CharSequence[] charSequenceArr) {
        try {
            return super.putExtra(str, charSequenceArr);
        } catch (Throwable unused) {
            return this;
        }
    }

    @Override // android.content.Intent
    public final Intent putExtra(String str, String[] strArr) {
        try {
            return super.putExtra(str, strArr);
        } catch (Throwable unused) {
            return this;
        }
    }
}
