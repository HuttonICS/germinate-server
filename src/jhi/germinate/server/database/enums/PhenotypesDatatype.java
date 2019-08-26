/*
 * This file is generated by jOOQ.
 */
package jhi.germinate.server.database.enums;


import org.jooq.*;

import javax.annotation.Generated;


/**
 * Defines the data type of the phenotype. This can be of float, int or char 
 * types.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum PhenotypesDatatype implements EnumType {

    float_("float"),

    int_("int"),

    char_("char");

    private final String literal;

    private PhenotypesDatatype(String literal) {
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
        return "phenotypes_datatype";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getLiteral() {
        return literal;
    }
}
