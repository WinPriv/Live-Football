package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.minlog.Log;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class GenericsResolver {
    private LinkedList<Generics> stack = new LinkedList<>();

    public Class getConcreteClass(String str) {
        Iterator<Generics> it = this.stack.iterator();
        while (it.hasNext()) {
            Class concreteClass = it.next().getConcreteClass(str);
            if (concreteClass != null) {
                return concreteClass;
            }
        }
        return null;
    }

    public boolean isSet() {
        return !this.stack.isEmpty();
    }

    public void popScope() {
        this.stack.removeFirst();
    }

    public void pushScope(Class cls, Generics generics) {
        if (Log.TRACE) {
            Log.trace("generics", "Settting a new generics scope for class " + cls.getName() + ": " + generics);
        }
        this.stack.addFirst(generics);
    }
}
