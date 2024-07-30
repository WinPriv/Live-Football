package com.esotericsoftware.kryo;

import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import id.a;

/* loaded from: classes.dex */
public class Registration {

    /* renamed from: id, reason: collision with root package name */
    private final int f19847id;
    private a instantiator;
    private Serializer serializer;
    private final Class type;

    public Registration(Class cls, Serializer serializer, int i10) {
        if (cls != null) {
            if (serializer != null) {
                this.type = cls;
                this.serializer = serializer;
                this.f19847id = i10;
                return;
            }
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public int getId() {
        return this.f19847id;
    }

    public a getInstantiator() {
        return this.instantiator;
    }

    public Serializer getSerializer() {
        return this.serializer;
    }

    public Class getType() {
        return this.type;
    }

    public void setInstantiator(a aVar) {
        if (aVar != null) {
            this.instantiator = aVar;
            return;
        }
        throw new IllegalArgumentException("instantiator cannot be null.");
    }

    public void setSerializer(Serializer serializer) {
        if (serializer != null) {
            this.serializer = serializer;
            if (Log.TRACE) {
                Log.trace("kryo", "Update registered serializer: " + this.type.getName() + " (" + serializer.getClass().getName() + ")");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public String toString() {
        return "[" + this.f19847id + ", " + Util.className(this.type) + "]";
    }
}
