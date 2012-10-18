package uk.org.lidalia.lang;

import org.apache.commons.lang3.Validate;

public abstract class WrappedValue<E> extends RichObject {

    @Identity private final E wrappedValue;

    public WrappedValue(E wrappedValue) {
        Validate.notNull(wrappedValue);
        this.wrappedValue = wrappedValue;
    }

    @Override
    public String toString() {
        return wrappedValue.toString();
    }

    protected E getWrappedValue() {
        return wrappedValue;
    }
}
