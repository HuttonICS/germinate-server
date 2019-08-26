/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.enums;


import org.jooq.*;

import javax.annotation.Generated;


/**
 * Defines the datatype which can be FLOAT, INT or CHAR type.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum ClimatesDatatype implements EnumType {

    float_("float"),

    int_("int"),

    char_("char");

    private final String literal;

    private ClimatesDatatype(String literal) {
        this.literal = literal;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return "climates_datatype";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
